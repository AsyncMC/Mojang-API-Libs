window.swaggerSpec={
  "openapi" : "3.0.1",
  "info" : {
    "title" : "Mojang Authentication API",
    "version" : "2020-06-05"
  },
  "servers" : [ {
    "url" : "https://authserver.mojang.com"
  } ],
  "paths" : {
    "/authenticate" : {
      "post" : {
        "operationId" : "authenticate",
        "requestBody" : {
          "required" : true,
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/AuthenticationRequest"
              }
            }
          }
        },
        "responses" : {
          "200" : {
            "description" : "Successfully authenticated",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/Authentication"
                }
              }
            }
          },
          "400" : {
            "description" : "Could not authenticate",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "mojang-api.yaml#/components/schemas/Error"
                }
              }
            }
          }
        }
      }
    },
    "/refresh" : {
      "post" : {
        "operationId" : "refresh",
        "requestBody" : {
          "required" : true,
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/RefreshRequest"
              }
            }
          }
        },
        "responses" : {
          "200" : {
            "description" : "Session refreshed successfully. Note: The old access token gets invalidated.",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/RefreshResponse"
                }
              }
            }
          },
          "400" : {
            "description" : "Could not refresh the session",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "mojang-api.yaml#/components/schemas/Error"
                }
              }
            }
          }
        }
      }
    },
    "/validate" : {
      "post" : {
        "operationId" : "validate",
        "requestBody" : {
          "required" : true,
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/AccessKeys"
              }
            }
          }
        },
        "responses" : {
          "204" : {
            "description" : "The token is valid"
          },
          "403" : {
            "description" : "The token is not valid",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "mojang-api.yaml#/components/schemas/Error"
                }
              }
            }
          }
        }
      }
    },
    "/signout" : {
      "post" : {
        "operationId" : "siginout",
        "requestBody" : {
          "required" : true,
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/UsernamePassword"
              }
            }
          }
        },
        "responses" : {
          "204" : {
            "description" : "All tokens have been invalidated"
          },
          "400" : {
            "description" : "Invalid username/password",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "mojang-api.yaml#/components/schemas/Error"
                }
              }
            }
          }
        }
      }
    },
    "/invalidate" : {
      "post" : {
        "operationId" : "invalidate",
        "requestBody" : {
          "required" : true,
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/AccessKeys"
              }
            }
          }
        },
        "responses" : {
          "204" : {
            "description" : "The token have been invalidated"
          },
          "400" : {
            "description" : "Could not invalidate the token",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "mojang-api.yaml#/components/schemas/Error"
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
      "AccessKeys" : {
        "type" : "object",
        "required" : [ "accessToken" ],
        "properties" : {
          "accessToken" : {
            "type" : "string",
            "format" : "Mojang Token"
          },
          "clientToken" : {
            "type" : "string"
          }
        }
      },
      "UsernamePassword" : {
        "type" : "object",
        "required" : [ "username", "password" ],
        "properties" : {
          "username" : {
            "type" : "string",
            "format" : "username",
            "description" : "The Mojang account e-mail or username. Never store it."
          },
          "password" : {
            "type" : "string",
            "format" : "password",
            "description" : "The Mojang account password, never store it."
          }
        }
      },
      "RefreshRequest" : {
        "type" : "object",
        "allOf" : [ {
          "$ref" : "#/components/schemas/AccessKeys"
        } ],
        "properties" : {
          "requestUser" : {
            "type" : "boolean",
            "default" : false
          }
        }
      },
      "RefreshResponse" : {
        "type" : "object",
        "allOf" : [ {
          "$ref" : "#/components/schemas/RefreshRequest"
        } ],
        "required" : [ "selectedProfile" ],
        "properties" : {
          "selectedProfile" : {
            "$ref" : "#/components/schemas/ProfileId"
          },
          "user" : {
            "$ref" : "#/components/schemas/ReducedUserData"
          }
        }
      },
      "ProfileId" : {
        "type" : "object",
        "required" : [ "name", "id" ],
        "properties" : {
          "id" : {
            "type" : "string"
          },
          "name" : {
            "type" : "string",
            "description" : "The player name"
          }
        }
      },
      "AuthenticationRequest" : {
        "type" : "object",
        "description" : "Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.",
        "allOf" : [ {
          "$ref" : "#/components/schemas/UsernamePassword"
        } ],
        "required" : [ "agent" ],
        "properties" : {
          "agent" : {
            "$ref" : "#/components/schemas/Agent"
          },
          "clientToken" : {
            "type" : "string",
            "description" : "Should be a randomly generated identifier and must be identical for each request. The vanilla launcher generates a random (version 4) UUID on first run and saves it, reusing it for every subsequent request. In case it is omitted the server will generate a random token based on Java's UUID.toString() which should then be stored by the client. This will however also invalidate all previously acquired accessTokens for this user across all clients."
          },
          "requestUser" : {
            "type" : "boolean",
            "default" : false,
            "description" : "True adds the user object to the response"
          }
        }
      },
      "Agent" : {
        "type" : "object",
        "description" : "Identifies the software doing the request",
        "properties" : {
          "name" : {
            "type" : "string",
            "enum" : [ "Minecraft", "Scrolls" ],
            "default" : "Minecraft",
            "description" : "The name of the game"
          },
          "version" : {
            "type" : "integer",
            "default" : 1,
            "description" : "The agent version, usually 1."
          }
        }
      },
      "Authentication" : {
        "type" : "object",
        "allOf" : [ {
          "$ref" : "#/components/schemas/AccessKeys"
        } ],
        "properties" : {
          "availableProfiles" : {
            "type" : "array",
            "items" : {
              "$ref" : "#/components/schemas/GameProfile"
            }
          },
          "selectedProfile" : {
            "$ref" : "#/components/schemas/GameProfile"
          },
          "user" : {
            "$ref" : "#/components/schemas/PrivateUserData"
          }
        }
      },
      "ReducedUserData" : {
        "type" : "object",
        "properties" : {
          "id" : {
            "type" : "string"
          },
          "properties" : {
            "type" : "array",
            "items" : {
              "$ref" : "#/components/schemas/GameProfileProperty"
            }
          }
        }
      },
      "PrivateUserData" : {
        "type" : "object",
        "allOf" : [ {
          "$ref" : "#/components/schemas/ReducedUserData"
        } ],
        "properties" : {
          "email" : {
            "type" : "string",
            "format" : "email"
          },
          "username" : {
            "type" : "string"
          },
          "registerIp" : {
            "type" : "string",
            "format" : "ip"
          },
          "migratedFrom" : {
            "type" : "string"
          },
          "migratedAt" : {
            "type" : "integer",
            "format" : "int64"
          },
          "registeredAt" : {
            "type" : "integer",
            "format" : "int64"
          },
          "passwordChangedAt" : {
            "type" : "integer",
            "format" : "int64"
          },
          "dateOfBirth" : {
            "type" : "integer",
            "format" : "int64"
          },
          "suspended" : {
            "type" : "boolean"
          },
          "blocked" : {
            "type" : "boolean"
          },
          "secured" : {
            "type" : "boolean"
          },
          "migrated" : {
            "type" : "boolean",
            "deprecated" : true
          },
          "emailVerified" : {
            "type" : "boolean"
          },
          "legacyUser" : {
            "type" : "boolean"
          },
          "verifiedByParent" : {
            "type" : "boolean"
          }
        }
      },
      "GameProfileProperty" : {
        "type" : "object",
        "properties" : {
          "name" : {
            "type" : "string"
          },
          "value" : {
            "type" : "string"
          }
        }
      },
      "GameProfile" : {
        "type" : "object",
        "properties" : {
          "agent" : {
            "type" : "string"
          },
          "id" : {
            "type" : "string"
          },
          "name" : {
            "type" : "string"
          },
          "userId" : {
            "type" : "string"
          },
          "createdAt" : {
            "type" : "integer",
            "format" : "int64",
            "description" : "Unix timestamp in milliseconds"
          },
          "legacyProfile" : {
            "type" : "boolean"
          },
          "suspended" : {
            "type" : "boolean"
          },
          "paid" : {
            "type" : "boolean"
          },
          "migrated" : {
            "type" : "boolean"
          },
          "legacy" : {
            "type" : "boolean"
          }
        }
      }
    }
  }
}