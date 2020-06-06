window.swaggerSpec={
  "openapi" : "3.0.1",
  "info" : {
    "title" : "Mojang API",
    "version" : "2020-06-05"
  },
  "servers" : [ {
    "url" : "https://status.mojang.com"
  } ],
  "paths" : {
    "/check" : {
      "get" : {
        "operationId" : "checkStatuses",
        "summary" : "Checks the Mojang service statuses",
        "responses" : {
          "200" : {
            "description" : "An array with service status key/pairs",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "type" : "object",
                    "description" : "An associative array of the Mojang service status",
                    "example" : "{\"minecraft.net\": \"yellow\"}",
                    "additionalProperties" : {
                      "$ref" : "#/components/schemas/ApiStatus"
                    }
                  },
                  "example" : "[ {\"minecraft.net\": \"yellow\"}, {\"session.minecraft.net\": \"green\"}, {\"account.mojang.com\": \"green\"}, {\"auth.mojang.com\": \"green\"}, {\"skins.minecraft.net\": \"green\"}, {\"authserver.mojang.com\": \"green\"}, {\"sessionserver.mojang.com\": \"yellow\"}, {\"api.mojang.com\": \"green\"}, {\"textures.minecraft.net\": \"red\"}, {\"mojang.com\": \"green\"} ]"
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
      "ApiStatus" : {
        "type" : "string",
        "enum" : [ "green", "yellow", "red" ],
        "description" : "The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable)."
      }
    }
  }
}