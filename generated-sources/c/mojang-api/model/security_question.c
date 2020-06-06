#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "security_question.h"


security_question_t *security_question_create(
    int id,
    char *question
    ) {
	security_question_t *security_question = malloc(sizeof(security_question_t));
	security_question->id = id;
	security_question->question = question;

	return security_question;
}


void security_question_free(security_question_t *security_question) {
    listEntry_t *listEntry;
    free(security_question->question);

	free(security_question);
}

cJSON *security_question_convertToJSON(security_question_t *security_question) {
	cJSON *item = cJSON_CreateObject();
	// security_question->id
    if(cJSON_AddNumberToObject(item, "id", security_question->id) == NULL) {
    goto fail; //Numeric
    }

	// security_question->question
    if(cJSON_AddStringToObject(item, "question", security_question->question) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

security_question_t *security_question_parseFromJSON(char *jsonString){

    security_question_t *security_question = NULL;
    cJSON *security_questionJSON = cJSON_Parse(jsonString);
    if(security_questionJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // security_question->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(security_questionJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }

    // security_question->question
    cJSON *question = cJSON_GetObjectItemCaseSensitive(security_questionJSON, "question");
    if(!cJSON_IsString(question) || (question->valuestring == NULL)){
    goto end; //String
    }


    security_question = security_question_create (
        id->valuedouble,
        strdup(question->valuestring)
        );
 cJSON_Delete(security_questionJSON);
    return security_question;
end:
    cJSON_Delete(security_questionJSON);
    return NULL;

}

