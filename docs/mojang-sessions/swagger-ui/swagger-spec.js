window.swaggerSpec={
  "openapi" : "3.0.1",
  "info" : {
    "title" : "Mojang Session API",
    "version" : "2020-06-05"
  },
  "servers" : [ {
    "url" : "https://sessionserver.mojang.com"
  } ],
  "tags" : [ {
    "name" : "Login"
  }, {
    "name" : "Bans"
  } ],
  "paths" : {
    "/blockedservers" : {
      "get" : {
        "operationId" : "getBlockedServerHashes",
        "tags" : [ "Bans" ],
        "summary" : "A list of SHA1 hashes of banned servers",
        "description" : "Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect.\nClients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*.\nThis check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)",
        "responses" : {
          "200" : {
            "description" : "A list of SHA1 hashes, one hash per line",
            "content" : {
              "text/plain" : {
                "schema" : {
                  "type" : "string",
                  "example" : "6f2520f8bd70a718c568ab5274c56bdbbfc14ef4 7ea72de5f8e70a2ac45f1aa17d43f0ca3cddeedd c005ad34245a8f2105658da2d6d6e8545ef0f0de c645d6c6430db3069abd291ec13afebdb320714b 8bf58811e6ebca16a01b842ff0c012db1171d7d6 8789800277882d1989d384e7941b6ad3dadab430 e40c3456fb05687b8eeb17213a47b263d566f179 278b24ffff7f9f46cf71212a4c0948d07fb3bc35 c78697e385bfa58d6bd2a013f543cdfbdc297c4f b13009db1e2fbe05465716f67c8d58b9c0503520 3e560742576af9413fca72e70f75d7ddc9416020 986204c70d368d50ffead9031e86f2b9e70bb6d0"
                }
              }
            }
          }
        }
      }
    },
    "/session/minecraft/profile/{stripped_uuid}" : {
      "parameters" : [ {
        "name" : "stripped_uuid",
        "in" : "path",
        "required" : true,
        "description" : "The player UUID without hyphens",
        "example" : "853c80ef3c3749fdaa49938b674adae6",
        "schema" : {
          "type" : "string",
          "format" : "stripped-uuid"
        }
      }, {
        "name" : "unsigned",
        "in" : "query",
        "required" : false,
        "description" : "When set to false, the signature data are sent",
        "schema" : {
          "type" : "boolean"
        }
      } ],
      "get" : {
        "operationId" : "getPlayerProfile",
        "tags" : [ "Login" ],
        "summary" : "Gets the player's game profile",
        "description" : "This will return the player's username plus any additional information about them (e.g. skins).\nThis has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.",
        "responses" : {
          "200" : {
            "description" : "The player profile and all properties",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/PlayerProfile"
                }
              }
            }
          },
          "400" : {
            "description" : "UUID is invalid",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/SessionApiError"
                }
              }
            }
          }
        }
      }
    }
  },
  "components" : {
    "schemas" : {
      "PlayerProfile" : {
        "type" : "object",
        "required" : [ "id", "name", "properties" ],
        "properties" : {
          "id" : {
            "type" : "string",
            "format" : "stripped-uuid",
            "description" : "The player UUID without hyphens",
            "example" : "853c80ef3c3749fdaa49938b674adae6"
          },
          "name" : {
            "type" : "string",
            "format" : "username",
            "example" : "jeb_"
          },
          "legacy" : {
            "type" : "boolean",
            "default" : false,
            "description" : "Will appear in the response if the user has not migrated their minecraft.net account to Mojang."
          },
          "properties" : {
            "type" : "array",
            "description" : "An array with all player properties, like skin and cape",
            "items" : {
              "$ref" : "#/components/schemas/PlayerProfileProperty"
            }
          }
        }
      },
      "PlayerProfileProperty" : {
        "type" : "object",
        "description" : "A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue",
        "required" : [ "name", "value" ],
        "properties" : {
          "name" : {
            "type" : "string",
            "description" : "The property name",
            "example" : "textures"
          },
          "value" : {
            "type" : "string",
            "format" : "byte",
            "description" : "The serialized property value in base64.",
            "example" : "ewogICJ0aW1lc3RhbXAiIDogMTU5MTM5NzQ2OTg2NywKICAicHJvZmlsZUlkIiA6ICI4NTNjODBlZjNjMzc0OWZkYWE0OTkzOGI2NzRhZGFlNiIsCiAgInByb2ZpbGVOYW1lIiA6ICJqZWJfIiwKICAic2lnbmF0dXJlUmVxdWlyZWQiIDogdHJ1ZSwKICAidGV4dHVyZXMiIDogewogICAgIlNLSU4iIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzdmZDliYTQyYTdjODFlZWVhMjJmMTUyNDI3MWFlODVhOGUwNDVjZTBhZjVhNmFlMTZjNjQwNmFlOTE3ZTY4YjUiCiAgICB9LAogICAgIkNBUEUiIDogewogICAgICAidXJsIiA6ICJodHRwOi8vdGV4dHVyZXMubWluZWNyYWZ0Lm5ldC90ZXh0dXJlLzU3ODZmZTk5YmUzNzdkZmI2ODU4ODU5ZjkyNmM0ZGJjOTk1NzUxZTkxY2VlMzczNDY4YzVmYmY0ODY1ZTcxNTEiCiAgICB9CiAgfQp9"
          },
          "signature" : {
            "type" : "string",
            "format" : "byte",
            "description" : "signed data using Yggdrasil's private key",
            "example" : "psuQ4D5XEAyT/1QQg80cmaEGRcOw6Vvdja3owPq53uVc10VSrCuzN6qVmDsMBE+DlfjStjnIaKtNZhU464bPwdB5fYGNF1akwnT2v8EBu1tNJsStzPbbZHNWSd/XKPyhjVi3+WjhTb3D3YTsK3MY8lny1Vn2T/LbgLIh46eAr6OLuPH/Su3itznnJtqfxfjOuRYZfe2DBdHydcTzwuBU+rtEERP9p9eUo7jMvNE4W3xPQiGo8t/oJhjuoNjSko9yMBTlK1cLrfezh0vBfCEZHL2uX6/sQxlsMZF+qAb3IR+fJBV1EInn6XxdlQRUTv2hzWAs5hdMQC3jqUbFiieL7pYWa3oYXkcdUKbuLvWenX6u8yNxT7zNL1GSZu2zmAdjzqpqg0CgJjxyenWyWg13LqjtTozhQssD1paN1T58l13DTWPZBs6h0XCT7As2FW1qjg3AP94YHo2gcYXsoKMRHjdDgNvaUcTRRc4rL0bx0cWVzZ5+8nItCkwGKBBRKobAkEdn/zo6Yy3bq2XeMii0+5YwKxcKrRlDI61BMoaJuQb4Ve8HDX10e7Ao+EuOBLo1uZ1PnWeUNt06DVr3XQA+2hHsEQCDRSOeiWN+xeJkGMkuWh9e3zgWgIqMcEUiPVbVyb9EGh+gRWYS+wZQv9Ppa/ywLcPkMF2yL6HoMdMpjXo="
          }
        }
      },
      "PlayerProfileTexturePropertyValue" : {
        "type" : "object",
        "description" : "This is obtained by decoding the \"textures\" property",
        "required" : [ "timestamp", "profileId", "profileName" ],
        "properties" : {
          "timestamp" : {
            "type" : "integer",
            "format" : "int64",
            "description" : "UNIX timestamp in milliseconds",
            "example" : 1591397469867
          },
          "profileId" : {
            "type" : "string",
            "format" : "stripped-uuid",
            "description" : "The player UUID without hyphens",
            "example" : "853c80ef3c3749fdaa49938b674adae6"
          },
          "profileName" : {
            "type" : "string",
            "format" : "username",
            "description" : "The player's name",
            "example" : "jeb_"
          },
          "signatureRequired" : {
            "type" : "boolean",
            "default" : false,
            "description" : "Only present if unsigned was set to false in the request",
            "example" : true
          },
          "textures" : {
            "$ref" : "#/components/schemas/PlayerTexture"
          }
        }
      },
      "PlayerTexture" : {
        "type" : "object",
        "description" : "Provide links to the player's skin and cape",
        "properties" : {
          "SKIN" : {
            "$ref" : "#/components/schemas/PlayerSkinURL"
          },
          "CAPE" : {
            "$ref" : "#/components/schemas/PlayerTextureURL"
          }
        }
      },
      "PlayerTextureURL" : {
        "type" : "object",
        "description" : "Wraps the URL to the texture",
        "required" : [ "url" ],
        "properties" : {
          "url" : {
            "type" : "string",
            "format" : "url",
            "description" : "The URL to the texture, must be in Mojang's domains.",
            "example" : "http://textures.minecraft.net/texture/5786fe99be377dfb6858859f926c4dbc995751e91cee373468c5fbf4865e7151"
          }
        }
      },
      "PlayerSkinURL" : {
        "type" : "object",
        "allOf" : [ {
          "$ref" : "#/components/schemas/PlayerTextureURL"
        } ],
        "description" : "Wraps the URL to the texture and configures the player's model",
        "properties" : {
          "metadata" : {
            "$ref" : "#/components/schemas/PlayerSkinMetadata"
          },
          "url" : {
            "example" : "http://textures.minecraft.net/texture/7fd9ba42a7c81eeea22f1524271ae85a8e045ce0af5a6ae16c6406ae917e68b5"
          }
        }
      },
      "PlayerSkinMetadata" : {
        "type" : "object",
        "description" : "Contains details about the skin",
        "properties" : {
          "model" : {
            "type" : "string",
            "enum" : [ "slim" ],
            "description" : "The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent."
          }
        }
      },
      "SessionApiError" : {
        "type" : "object",
        "description" : "An object describing giving a bit of information about the error",
        "properties" : {
          "error" : {
            "type" : "string",
            "example" : "Bad Request",
            "description" : "A message describing the error"
          },
          "path" : {
            "type" : "string",
            "example" : "/session/minecraft/profile/asdadsda",
            "description" : "The request path"
          }
        }
      }
    }
  }
}