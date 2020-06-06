# Mojang API
#
# No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
#
# OpenAPI spec version: 2020-06-05
# 
# Generated by: https://openapi-generator.tech


#' SecurityChallenge Class
#'
#' @field question 
#' @field answer 
#'
#' @importFrom R6 R6Class
#' @importFrom jsonlite fromJSON toJSON
#' @export
SecurityChallenge <- R6::R6Class(
  'SecurityChallenge',
  public = list(
    `question` = NULL,
    `answer` = NULL,
    initialize = function(`question`, `answer`){
      if (!missing(`question`)) {
        stopifnot(R6::is.R6(`question`))
        self$`question` <- `question`
      }
      if (!missing(`answer`)) {
        stopifnot(R6::is.R6(`answer`))
        self$`answer` <- `answer`
      }
    },
    toJSON = function() {
      SecurityChallengeObject <- list()
      if (!is.null(self$`question`)) {
        SecurityChallengeObject[['question']] <- self$`question`$toJSON()
      }
      if (!is.null(self$`answer`)) {
        SecurityChallengeObject[['answer']] <- self$`answer`$toJSON()
      }

      SecurityChallengeObject
    },
    fromJSON = function(SecurityChallengeJson) {
      SecurityChallengeObject <- jsonlite::fromJSON(SecurityChallengeJson)
      if (!is.null(SecurityChallengeObject$`question`)) {
        questionObject <- SecurityQuestion$new()
        questionObject$fromJSON(jsonlite::toJSON(SecurityChallengeObject$question, auto_unbox = TRUE))
        self$`question` <- questionObject
      }
      if (!is.null(SecurityChallengeObject$`answer`)) {
        answerObject <- SecurityAnswerId$new()
        answerObject$fromJSON(jsonlite::toJSON(SecurityChallengeObject$answer, auto_unbox = TRUE))
        self$`answer` <- answerObject
      }
    },
    toJSONString = function() {
       sprintf(
        '{
           "question": %s,
           "answer": %s
        }',
        self$`question`$toJSON(),
        self$`answer`$toJSON()
      )
    },
    fromJSONString = function(SecurityChallengeJson) {
      SecurityChallengeObject <- jsonlite::fromJSON(SecurityChallengeJson)
      SecurityQuestionObject <- SecurityQuestion$new()
      self$`question` <- SecurityQuestionObject$fromJSON(jsonlite::toJSON(SecurityChallengeObject$question, auto_unbox = TRUE))
      SecurityAnswerIdObject <- SecurityAnswerId$new()
      self$`answer` <- SecurityAnswerIdObject$fromJSON(jsonlite::toJSON(SecurityChallengeObject$answer, auto_unbox = TRUE))
    }
  )
)