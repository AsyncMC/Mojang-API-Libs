#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "error.h"


error_t *error_create(
    char *error,
    char *errorMessage
    ) {
	error_t *error = malloc(sizeof(error_t));
	error->error = error;
	error->errorMessage = errorMessage;

	return error;
}


void error_free(error_t *error) {
    listEntry_t *listEntry;
    free(error->error);
    free(error->errorMessage);

	free(error);
}

cJSON *error_convertToJSON(error_t *error) {
	cJSON *item = cJSON_CreateObject();
	// error->error
    if(cJSON_AddStringToObject(item, "error", error->error) == NULL) {
    goto fail; //String
    }

	// error->errorMessage
    if(cJSON_AddStringToObject(item, "errorMessage", error->errorMessage) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

error_t *error_parseFromJSON(char *jsonString){

    error_t *error = NULL;
    cJSON *errorJSON = cJSON_Parse(jsonString);
    if(errorJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // error->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(errorJSON, "error");
    if(!cJSON_IsString(error) || (error->valuestring == NULL)){
    goto end; //String
    }

    // error->errorMessage
    cJSON *errorMessage = cJSON_GetObjectItemCaseSensitive(errorJSON, "errorMessage");
    if(!cJSON_IsString(errorMessage) || (errorMessage->valuestring == NULL)){
    goto end; //String
    }


    error = error_create (
        strdup(error->valuestring),
        strdup(errorMessage->valuestring)
        );
 cJSON_Delete(errorJSON);
    return error;
end:
    cJSON_Delete(errorJSON);
    return NULL;

}

