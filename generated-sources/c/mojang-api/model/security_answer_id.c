#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "security_answer_id.h"


security_answer_id_t *security_answer_id_create(
    int id
    ) {
	security_answer_id_t *security_answer_id = malloc(sizeof(security_answer_id_t));
	security_answer_id->id = id;

	return security_answer_id;
}


void security_answer_id_free(security_answer_id_t *security_answer_id) {
    listEntry_t *listEntry;

	free(security_answer_id);
}

cJSON *security_answer_id_convertToJSON(security_answer_id_t *security_answer_id) {
	cJSON *item = cJSON_CreateObject();
	// security_answer_id->id
    if(cJSON_AddNumberToObject(item, "id", security_answer_id->id) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

security_answer_id_t *security_answer_id_parseFromJSON(char *jsonString){

    security_answer_id_t *security_answer_id = NULL;
    cJSON *security_answer_idJSON = cJSON_Parse(jsonString);
    if(security_answer_idJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // security_answer_id->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(security_answer_idJSON, "id");
    if(!cJSON_IsNumber(id))
    {
    goto end; //Numeric
    }


    security_answer_id = security_answer_id_create (
        id->valuedouble
        );
 cJSON_Delete(security_answer_idJSON);
    return security_answer_id;
end:
    cJSON_Delete(security_answer_idJSON);
    return NULL;

}

