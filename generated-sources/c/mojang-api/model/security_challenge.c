#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "security_challenge.h"
#include "security_answer_id.h"
#include "security_question.h"


security_challenge_t *security_challenge_create(
    security_question_t *question,
    security_answer_id_t *answer
    ) {
	security_challenge_t *security_challenge = malloc(sizeof(security_challenge_t));
	security_challenge->question = question;
	security_challenge->answer = answer;

	return security_challenge;
}


void security_challenge_free(security_challenge_t *security_challenge) {
    listEntry_t *listEntry;
	security_question_free(security_challenge->question);
	security_answer_id_free(security_challenge->answer);

	free(security_challenge);
}

cJSON *security_challenge_convertToJSON(security_challenge_t *security_challenge) {
	cJSON *item = cJSON_CreateObject();
	// security_challenge->question
	cJSON *question = security_question_convertToJSON(security_challenge->question);
	if(question == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "question", question);
	if(item->child == NULL) {
		goto fail;
	}

	// security_challenge->answer
	cJSON *answer = security_answer_id_convertToJSON(security_challenge->answer);
	if(answer == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "answer", answer);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

security_challenge_t *security_challenge_parseFromJSON(char *jsonString){

    security_challenge_t *security_challenge = NULL;
    cJSON *security_challengeJSON = cJSON_Parse(jsonString);
    if(security_challengeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // security_challenge->question
    security_question_t *question;
    cJSON *questionJSON = cJSON_GetObjectItemCaseSensitive(security_challengeJSON, "question");
    if(security_challengeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *questionJSONData = cJSON_Print(questionJSON);
    question = security_question_parseFromJSON(questionJSONData);

    // security_challenge->answer
    security_answer_id_t *answer;
    cJSON *answerJSON = cJSON_GetObjectItemCaseSensitive(security_challengeJSON, "answer");
    if(security_challengeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *answerJSONData = cJSON_Print(answerJSON);
    answer = security_answer_id_parseFromJSON(answerJSONData);


    security_challenge = security_challenge_create (
        question,
        answer
        );
        free(questionJSONData);
        free(answerJSONData);
 cJSON_Delete(security_challengeJSON);
    return security_challenge;
end:
    cJSON_Delete(security_challengeJSON);
    return NULL;

}

