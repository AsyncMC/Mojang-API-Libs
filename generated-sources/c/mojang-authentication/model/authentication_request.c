#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "authentication_request.h"
#include "username_password.h"


authentication_request_t *authentication_request_create(
    char *username,
    char *password
    ) {
	authentication_request_t *authentication_request = malloc(sizeof(authentication_request_t));
	authentication_request->username = username;
	authentication_request->password = password;

	return authentication_request;
}


void authentication_request_free(authentication_request_t *authentication_request) {
    listEntry_t *listEntry;
    free(authentication_request->username);
    free(authentication_request->password);

	free(authentication_request);
}

cJSON *authentication_request_convertToJSON(authentication_request_t *authentication_request) {
	cJSON *item = cJSON_CreateObject();
	// authentication_request->username
    if(cJSON_AddStringToObject(item, "username", authentication_request->username) == NULL) {
    goto fail; //String
    }

	// authentication_request->password
    if(cJSON_AddStringToObject(item, "password", authentication_request->password) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

authentication_request_t *authentication_request_parseFromJSON(char *jsonString){

    authentication_request_t *authentication_request = NULL;
    cJSON *authentication_requestJSON = cJSON_Parse(jsonString);
    if(authentication_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // authentication_request->username
    cJSON *username = cJSON_GetObjectItemCaseSensitive(authentication_requestJSON, "username");
    if(!cJSON_IsString(username) || (username->valuestring == NULL)){
    goto end; //String
    }

    // authentication_request->password
    cJSON *password = cJSON_GetObjectItemCaseSensitive(authentication_requestJSON, "password");
    if(!cJSON_IsString(password) || (password->valuestring == NULL)){
    goto end; //String
    }


    authentication_request = authentication_request_create (
        strdup(username->valuestring),
        strdup(password->valuestring)
        );
 cJSON_Delete(authentication_requestJSON);
    return authentication_request;
end:
    cJSON_Delete(authentication_requestJSON);
    return NULL;

}

