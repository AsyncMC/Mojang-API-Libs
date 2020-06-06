#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "session_api_error.h"


session_api_error_t *session_api_error_create(
    char *error,
    char *path
    ) {
	session_api_error_t *session_api_error = malloc(sizeof(session_api_error_t));
	session_api_error->error = error;
	session_api_error->path = path;

	return session_api_error;
}


void session_api_error_free(session_api_error_t *session_api_error) {
    listEntry_t *listEntry;
    free(session_api_error->error);
    free(session_api_error->path);

	free(session_api_error);
}

cJSON *session_api_error_convertToJSON(session_api_error_t *session_api_error) {
	cJSON *item = cJSON_CreateObject();
	// session_api_error->error
    if(cJSON_AddStringToObject(item, "error", session_api_error->error) == NULL) {
    goto fail; //String
    }

	// session_api_error->path
    if(cJSON_AddStringToObject(item, "path", session_api_error->path) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

session_api_error_t *session_api_error_parseFromJSON(char *jsonString){

    session_api_error_t *session_api_error = NULL;
    cJSON *session_api_errorJSON = cJSON_Parse(jsonString);
    if(session_api_errorJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // session_api_error->error
    cJSON *error = cJSON_GetObjectItemCaseSensitive(session_api_errorJSON, "error");
    if(!cJSON_IsString(error) || (error->valuestring == NULL)){
    goto end; //String
    }

    // session_api_error->path
    cJSON *path = cJSON_GetObjectItemCaseSensitive(session_api_errorJSON, "path");
    if(!cJSON_IsString(path) || (path->valuestring == NULL)){
    goto end; //String
    }


    session_api_error = session_api_error_create (
        strdup(error->valuestring),
        strdup(path->valuestring)
        );
 cJSON_Delete(session_api_errorJSON);
    return session_api_error;
end:
    cJSON_Delete(session_api_errorJSON);
    return NULL;

}

