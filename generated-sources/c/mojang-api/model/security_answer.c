#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "security_answer.h"
#include "security_answer_id.h"


security_answer_t *security_answer_create(
    int id
    ) {
	security_answer_t *security_answer = malloc(sizeof(security_answer_t));
	security_answer->id = id;

	return security_answer;
}


void security_answer_free(security_answer_t *security_answer) {
    listEntry_t *listEntry;

	free(security_answer);
}

cJSON *security_answer_convertToJSON(security_answer_t *security_answer) {
	cJSON *item = cJSON_CreateObject();
	// security_answer->id
    if(cJSON_AddNumberToObject(item, "id", security_answer->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

security_answer_t *security_answer_parseFromJSON(char *jsonString){

    security_answer_t *security_answer = NULL;
    cJSON *security_answerJSON = cJSON_Parse(jsonString);
    if(security_answerJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // security_answer->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(security_answerJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    security_answer = security_answer_create (
        id->valuedouble
        );
 cJSON_Delete(security_answerJSON);
    return security_answer;
end:
    cJSON_Delete(security_answerJSON);
    return NULL;

}

