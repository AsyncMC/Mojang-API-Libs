window.swaggerSpec={
  "openapi" : "3.0.1",
  "info" : {
    "title" : "Mojang API",
    "version" : "2020-06-05"
  },
  "servers" : [ {
    "url" : "https://api.mojang.com"
  } ],
  "tags" : [ {
    "name" : "Name History"
  }, {
    "name" : "Skin Operations"
  }, {
    "name" : "Security question-answer"
  }, {
    "name" : "Miscellaneous"
  } ],
  "paths" : {
    "/users/profiles/minecraft/{username}" : {
      "parameters" : [ {
        "name" : "username",
        "in" : "path",
        "required" : true,
        "description" : "The username in a given time, or in present if \"at\" is not sent",
        "example" : "LordofMC_Playerz",
        "schema" : {
          "type" : "string",
          "format" : "username"
        }
      }, {
        "name" : "at",
        "in" : "query",
        "description" : "Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)",
        "example" : 1448533942,
        "schema" : {
          "type" : "integer",
          "format" : "int64"
        }
      } ],
      "get" : {
        "operationId" : "getUniqueIdByName",
        "summary" : "Find the UUID by name",
        "tags" : [ "Name History" ],
        "description" : "Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.",
        "responses" : {
          "200" : {
            "description" : "The user was found",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/CurrentPlayerIDs"
                }
              }
            }
          },
          "204" : {
            "description" : "User not found"
          },
          "400" : {
            "description" : "If the timestamp is invalid",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/Error"
                }
              }
            }
          }
        }
      }
    },
    "/user/profiles/{stripped_uuid}/names" : {
      "parameters" : [ {
        "name" : "stripped_uuid",
        "in" : "path",
        "required" : true,
        "description" : "The player UUID without hyphens",
        "example" : "38ba542eb5924231a54cca0f2eac2b54",
        "schema" : {
          "type" : "string",
          "format" : "stripped-uuid"
        }
      } ],
      "get" : {
        "summary" : "Gets the full player's name history",
        "operationId" : "getNameHistory",
        "tags" : [ "Name History" ],
        "responses" : {
          "200" : {
            "description" : "A list of name changes, the first entry usually don't have a change time",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/NameChange"
                  },
                  "example" : "[ { \"name\": \"firelordwill\" }, { \"name\": \"LordofMC_Playerz\", \"changedToAt\": 1448677333000 }, { \"name\": \"Alonlord\", \"changedToAt\": 1460944203000 }, { \"name\": \"Alonelord\", \"changedToAt\": 1477533727000 }, { \"name\": \"Alonelordz\", \"changedToAt\": 1585545654000 }, { \"name\": \"Alonelord\", \"changedToAt\": 1588184987000 } ]"
                }
              }
            }
          },
          "204" : {
            "description" : "Username not found at the given time"
          }
        }
      }
    },
    "/profiles/minecraft" : {
      "post" : {
        "operationId" : "findUniqueIdsByName",
        "summary" : "Find the current UUID of multiple players at once",
        "description" : "Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.",
        "tags" : [ "Name History" ],
        "requestBody" : {
          "required" : true,
          "description" : "Array with the player names",
          "content" : {
            "application/json" : {
              "example" : "[ \"joserobjr\", \"nonExistingPlayer\", \"maksimkurb\" ]",
              "schema" : {
                "type" : "array",
                "items" : {
                  "type" : "string",
                  "format" : "username"
                }
              }
            }
          }
        },
        "responses" : {
          "200" : {
            "description" : "An array containing all players found",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/CurrentPlayerIDs"
                  }
                },
                "example" : "[ { \"id\": \"185e217600954ff8a2016f2aed9a032a\", \"name\": \"joserobjr\" }, { \"id\": \"0d252b7218b648bfb86c2ae476954d32\", \"name\": \"maksimkurb\", \"legacy\": true, \"demo\": true } ]"
              }
            }
          }
        }
      }
    },
    "/user/profile/{stripped_uuid}/skin" : {
      "parameters" : [ {
        "name" : "stripped_uuid",
        "in" : "path",
        "required" : true,
        "description" : "The player UUID without hyphens",
        "example" : "38ba542eb5924231a54cca0f2eac2b54",
        "schema" : {
          "type" : "string",
          "format" : "stripped-uuid"
        }
      } ],
      "post" : {
        "operationId" : "changePlayerSkin",
        "summary" : "Changes the player skin by URL",
        "description" : "This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.",
        "tags" : [ "Skin Operations" ],
        "security" : [ {
          "PlayerAccessToken" : [ ]
        } ],
        "requestBody" : {
          "required" : true,
          "content" : {
            "application/x-www-form-urlencoded" : {
              "schema" : {
                "$ref" : "#/components/schemas/ChangeSkinRequest"
              }
            }
          }
        },
        "responses" : {
          "204" : {
            "description" : "The skin has been changed. The response has no body"
          },
          "400" : {
            "description" : "Upon error the server will send back a JSON with the error. (Success is a blank payload)",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/Error"
                }
              }
            }
          }
        }
      },
      "put" : {
        "operationId" : "uploadPlayerSkin",
        "summary" : "Changes the player skin by upload",
        "description" : "This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.",
        "tags" : [ "Skin Operations" ],
        "security" : [ {
          "PlayerAccessToken" : [ ]
        } ],
        "requestBody" : {
          "required" : true,
          "content" : {
            "multipart/form-data" : {
              "schema" : {
                "$ref" : "#/components/schemas/UploadSkinRequest"
              }
            }
          }
        },
        "responses" : {
          "204" : {
            "description" : "The skin has been changed. The response has no body"
          },
          "400" : {
            "description" : "Upon error the server will send back a JSON with the error. (Success is a blank payload)",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/Error"
                }
              }
            }
          }
        }
      },
      "delete" : {
        "operationId" : "resetPlayerSkin",
        "summary" : "Resets the player skin to default",
        "tags" : [ "Skin Operations" ],
        "security" : [ {
          "PlayerAccessToken" : [ ]
        } ],
        "responses" : {
          "204" : {
            "description" : "The skin has been changed. The response has no body"
          },
          "400" : {
            "description" : "Upon error the server will send back a JSON with the error. (Success is a blank payload)",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/Error"
                }
              }
            }
          }
        }
      }
    },
    "/user/security/location" : {
      "get" : {
        "operationId" : "checkSecurityStatus",
        "summary" : "Check if security questions are needed",
        "tags" : [ "Security question-answer" ],
        "security" : [ {
          "PlayerAccessToken" : [ ]
        } ],
        "responses" : {
          "204" : {
            "description" : "No check is needed."
          },
          "400" : {
            "description" : "A security check is needed or there is an other issue",
            "content" : {
              "application/json" : {
                "schema" : {
                  "allOf" : [ {
                    "$ref" : "#/components/schemas/Error"
                  } ],
                  "example" : "{ \"error\": \"ForbiddenOperationException\", \"errorMessage\": \"Current IP is not secured\" }"
                }
              }
            }
          }
        }
      },
      "post" : {
        "operationId" : "sendSecurityQuestionAnswers",
        "summary" : "Send back the answers",
        "tags" : [ "Security question-answer" ],
        "security" : [ {
          "PlayerAccessToken" : [ ]
        } ],
        "requestBody" : {
          "required" : true,
          "description" : "An array with all the answers",
          "content" : {
            "application/json" : {
              "schema" : {
                "type" : "array",
                "items" : {
                  "$ref" : "#/components/schemas/SecurityAnswer"
                }
              }
            }
          }
        },
        "responses" : {
          "204" : {
            "description" : "The answers were accepted"
          },
          "400" : {
            "description" : "At least one answer we not accepted",
            "content" : {
              "application/json" : {
                "schema" : {
                  "allOf" : [ {
                    "$ref" : "#/components/schemas/Error"
                  } ],
                  "example" : "{\n  \"error\": \"ForbiddenOperationException\",\n  \"errorMessage\": \"At least one answer was incorrect\"\n}"
                }
              }
            }
          }
        }
      }
    },
    "/user/security/challenges" : {
      "get" : {
        "operationId" : "listPendingSecurityQuestions",
        "summary" : "Get list of questions",
        "tags" : [ "Security question-answer" ],
        "security" : [ {
          "PlayerAccessToken" : [ ]
        } ],
        "responses" : {
          "200" : {
            "description" : "A list of security questions to be answered",
            "content" : {
              "application/json" : {
                "schema" : {
                  "type" : "array",
                  "items" : {
                    "$ref" : "#/components/schemas/SecurityChallenge"
                  }
                }
              }
            }
          }
        }
      }
    },
    "/orders/statistics" : {
      "post" : {
        "operationId" : "getOrdersStatistics",
        "summary" : "Get statistics on the sales of Minecraft.",
        "tags" : [ "Miscellaneous" ],
        "security" : [ {
          "MojangStatisticsToken" : [ ]
        } ],
        "requestBody" : {
          "description" : "The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/",
          "required" : true,
          "content" : {
            "application/json" : {
              "schema" : {
                "$ref" : "#/components/schemas/OrderStatisticsRequest"
              }
            }
          }
        },
        "responses" : {
          "200" : {
            "description" : "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.",
            "content" : {
              "application/json" : {
                "schema" : {
                  "$ref" : "#/components/schemas/OrderStatisticsResponse"
                }
              }
            }
          }
        }
      }
    }
  },
  "components" : {
    "securitySchemes" : {
      "PlayerAccessToken" : {
        "description" : "Token obtained by the Mojang Authentication API",
        "type" : "http",
        "scheme" : "bearer"
      },
      "MojangStatisticsToken" : {
        "description" : "Token needed to access the sales statistics",
        "type" : "http",
        "scheme" : "bearer"
      }
    },
    "schemas" : {
      "CurrentPlayerIDs" : {
        "type" : "object",
        "description" : "The current player, demo and legacy status of a player identified by the id",
        "properties" : {
          "id" : {
            "type" : "string",
            "format" : "stripped-uuid",
            "description" : "The player UUID without hyphens",
            "example" : "38ba542eb5924231a54cca0f2eac2b54"
          },
          "name" : {
            "type" : "string",
            "format" : "username",
            "description" : "The current name being used by this player",
            "example" : "Alonelord"
          },
          "legacy" : {
            "type" : "boolean",
            "description" : "If account has not been converted",
            "default" : false
          },
          "demo" : {
            "type" : "boolean",
            "description" : "If the player has not puchased the game",
            "default" : false
          }
        },
        "required" : [ "name", "id" ]
      },
      "NameChange" : {
        "type" : "object",
        "description" : "A registered name change.",
        "required" : [ "name" ],
        "properties" : {
          "name" : {
            "type" : "string",
            "description" : "The new player name",
            "format" : "username",
            "example" : "LordofMC_Playerz"
          },
          "changedToAt" : {
            "type" : "integer",
            "format" : "int64",
            "description" : "Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.",
            "example" : 1448677333000
          }
        }
      },
      "Error" : {
        "type" : "object",
        "description" : "This is returned when the request fails",
        "properties" : {
          "error" : {
            "type" : "string",
            "example" : "IllegalArgumentException"
          },
          "errorMessage" : {
            "type" : "string",
            "example" : "Invalid timestamp."
          }
        }
      },
      "SkinModel" : {
        "type" : "string",
        "enum" : [ "", "slim" ],
        "description" : "Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)"
      },
      "SecurityChallenge" : {
        "type" : "object",
        "description" : "Binds a question to an answer id, the answer must respect the answer id.",
        "required" : [ "question", "answer" ],
        "properties" : {
          "question" : {
            "$ref" : "#/components/schemas/SecurityQuestion"
          },
          "answer" : {
            "$ref" : "#/components/schemas/SecurityAnswerId"
          }
        }
      },
      "SecurityAnswer" : {
        "type" : "object",
        "allOf" : [ {
          "$ref" : "#/components/schemas/SecurityAnswerId"
        } ],
        "required" : [ "answer" ],
        "description" : "A security question answer given by the player using the id given by Mojang",
        "properties" : {
          "answer" : {
            "type" : "string",
            "description" : "The answer given by the user",
            "example" : "Be an astronaut"
          }
        }
      },
      "SecurityAnswerId" : {
        "type" : "object",
        "description" : "A security question answer id given by Mojang",
        "required" : [ "id" ],
        "properties" : {
          "id" : {
            "type" : "integer",
            "description" : "A number giver by Mojang to reply a question",
            "example" : 593
          }
        }
      },
      "OrderStatisticsResponse" : {
        "type" : "object",
        "description" : "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.",
        "required" : [ "last24h", "saleVelocityPerSeconds", "total" ],
        "properties" : {
          "total" : {
            "type" : "integer",
            "format" : "int64",
            "description" : "total amount sold"
          },
          "last24h" : {
            "type" : "integer",
            "format" : "int64",
            "description" : "total sold in last 24 hours"
          },
          "saleVelocityPerSeconds" : {
            "type" : "number",
            "format" : "double",
            "description" : "decimal average sales per second"
          }
        }
      },
      "UploadSkinRequest" : {
        "type" : "object",
        "required" : [ "file" ],
        "properties" : {
          "model" : {
            "$ref" : "#/components/schemas/SkinModel"
          },
          "file" : {
            "type" : "string",
            "format" : "binary",
            "description" : "The skin image in PNG format"
          }
        }
      },
      "ChangeSkinRequest" : {
        "type" : "object",
        "description" : "Request Mojang to download a skin from an URL and apply to the player",
        "required" : [ "url" ],
        "properties" : {
          "model" : {
            "$ref" : "#/components/schemas/SkinModel"
          },
          "url" : {
            "type" : "string",
            "format" : "url",
            "example" : "http://assets.mojang.com/SkinTemplates/steve.png",
            "description" : "The URL which Mojang servers will download and apply the skin"
          }
        }
      },
      "OrderStatisticsRequest" : {
        "type" : "object",
        "description" : "The body of the request to get the order statistics",
        "required" : [ "metricKeys" ],
        "properties" : {
          "metricKeys" : {
            "type" : "array",
            "items" : {
              "$ref" : "#/components/schemas/OrderStatistic"
            }
          }
        }
      },
      "OrderStatistic" : {
        "type" : "string",
        "description" : "Valid options to query the order statistics",
        "enum" : [ "item_sold_minecraft", "prepaid_card_redeemed_minecraft", "item_sold_cobalt", "item_sold_scrolls", "prepaid_card_redeemed_cobalt", "item_sold_dungeons" ]
      },
      "SecurityQuestion" : {
        "type" : "object",
        "description" : "A security question requested by Mojang",
        "required" : [ "id", "question" ],
        "properties" : {
          "id" : {
            "type" : "integer",
            "example" : 37,
            "description" : "The possible IDs are these:\n  1  What is your favorite pet's name?\n  2  What is your favorite movie?\n  3  What is your favorite author's last name?\n  4  What is your favorite artist's last name?\n  5  What is your favorite actor's last name?\n  6  What is your favorite activity?\n  7  What is your favorite restaurant?\n  8  What is the name of your favorite cartoon?\n  9  What is the name of the first school you attended?\n  10 What is the last name of your favorite teacher?\n  11 What is your best friend's first name?\n  12 What is your favorite cousin's name?\n  13 What was the first name of your first girl/boyfriend?\n  14 What was the name of your first stuffed animal?\n  15 What is your mother's middle name?\n  16 What is your father's middle name?\n  17 What is your oldest sibling's middle name?\n  18 In what city did your parents meet?\n  19 In what hospital were you born?\n  20 What is your favorite team?\n  21 How old were you when you got your first computer?\n  22 How old were you when you got your first gaming console?\n  23 What was your first video game?\n  24 What is your favorite card game?\n  25 What is your favorite board game?\n  26 What was your first gaming console?\n  27 What was the first book you ever read?\n  28 Where did you go on your first holiday?\n  29 In what city does your grandmother live?\n  30 In what city does your grandfather live?\n  31 What is your grandmother's first name?\n  32 What is your grandfather's first name?\n  33 What is your least favorite food?\n  34 What is your favorite ice cream flavor?\n  35 What is your favorite ice cream flavor?\n  36 What is your favorite place to visit?\n  37 What is your dream job?\n  38 What color was your first pet?\n  39 What is your lucky number?"
          },
          "question" : {
            "type" : "string",
            "description" : "The question itself",
            "example" : "What is your dream job?"
          }
        }
      }
    }
  }
}