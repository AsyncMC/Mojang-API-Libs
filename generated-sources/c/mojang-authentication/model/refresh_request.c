#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "refresh_request.h"
#include "access_keys.h"


refresh_request_t *refresh_request_create(
    char *accessToken,
    char *clientToken
    ) {
	refresh_request_t *refresh_request = malloc(sizeof(refresh_request_t));
	refresh_request->accessToken = accessToken;
	refresh_request->clientToken = clientToken;

	return refresh_request;
}


void refresh_request_free(refresh_request_t *refresh_request) {
    listEntry_t *listEntry;
    free(refresh_request->accessToken);
    free(refresh_request->clientToken);

	free(refresh_request);
}

cJSON *refresh_request_convertToJSON(refresh_request_t *refresh_request) {
	cJSON *item = cJSON_CreateObject();
	// refresh_request->accessToken
    if(cJSON_AddStringToObject(item, "accessToken", refresh_request->accessToken) == NULL) {
    goto fail; //String
    }

	// refresh_request->clientToken
    if(cJSON_AddStringToObject(item, "clientToken", refresh_request->clientToken) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

refresh_request_t *refresh_request_parseFromJSON(char *jsonString){

    refresh_request_t *refresh_request = NULL;
    cJSON *refresh_requestJSON = cJSON_Parse(jsonString);
    if(refresh_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // refresh_request->accessToken
    cJSON *accessToken = cJSON_GetObjectItemCaseSensitive(refresh_requestJSON, "accessToken");
    if(!cJSON_IsString(accessToken) || (accessToken->valuestring == NULL)){
    goto end; //String
    }

    // refresh_request->clientToken
    cJSON *clientToken = cJSON_GetObjectItemCaseSensitive(refresh_requestJSON, "clientToken");
    if(!cJSON_IsString(clientToken) || (clientToken->valuestring == NULL)){
    goto end; //String
    }


    refresh_request = refresh_request_create (
        strdup(accessToken->valuestring),
        strdup(clientToken->valuestring)
        );
 cJSON_Delete(refresh_requestJSON);
    return refresh_request;
end:
    cJSON_Delete(refresh_requestJSON);
    return NULL;

}

