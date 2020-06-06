#include <stdlib.h>
#include <stdio.h>
#include "apiClient.h"
#include "cJSON.h"
#include "error.h"
#include "list.h"
#include "security_answer.h"
#include "security_challenge.h"


// Check if security questions are needed
//
void
SecurityQuestionAnswerAPI_checkSecurityStatus(apiClient_t *apiClient);



// Get list of questions
//
list_t*
SecurityQuestionAnswerAPI_listPendingSecurityQuestions(apiClient_t *apiClient);



// Send back the answers
//
void
SecurityQuestionAnswerAPI_sendSecurityQuestionAnswers(apiClient_t *apiClient,list_t* security_answer );



