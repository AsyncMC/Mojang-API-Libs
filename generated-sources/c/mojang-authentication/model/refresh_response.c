#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "refresh_response.h"
#include "refresh_request.h"


refresh_response_t *refresh_response_create(
    char *accessToken,
    char *clientToken
    ) {
	refresh_response_t *refresh_response = malloc(sizeof(refresh_response_t));
	refresh_response->accessToken = accessToken;
	refresh_response->clientToken = clientToken;

	return refresh_response;
}


void refresh_response_free(refresh_response_t *refresh_response) {
    listEntry_t *listEntry;
    free(refresh_response->accessToken);
    free(refresh_response->clientToken);

	free(refresh_response);
}

cJSON *refresh_response_convertToJSON(refresh_response_t *refresh_response) {
	cJSON *item = cJSON_CreateObject();
	// refresh_response->accessToken
    if(cJSON_AddStringToObject(item, "accessToken", refresh_response->accessToken) == NULL) {
    goto fail; //String
    }

	// refresh_response->clientToken
    if(cJSON_AddStringToObject(item, "clientToken", refresh_response->clientToken) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

refresh_response_t *refresh_response_parseFromJSON(char *jsonString){

    refresh_response_t *refresh_response = NULL;
    cJSON *refresh_responseJSON = cJSON_Parse(jsonString);
    if(refresh_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // refresh_response->accessToken
    cJSON *accessToken = cJSON_GetObjectItemCaseSensitive(refresh_responseJSON, "accessToken");
    if(!cJSON_IsString(accessToken) || (accessToken->valuestring == NULL)){
    goto end; //String
    }

    // refresh_response->clientToken
    cJSON *clientToken = cJSON_GetObjectItemCaseSensitive(refresh_responseJSON, "clientToken");
    if(!cJSON_IsString(clientToken) || (clientToken->valuestring == NULL)){
    goto end; //String
    }


    refresh_response = refresh_response_create (
        strdup(accessToken->valuestring),
        strdup(clientToken->valuestring)
        );
 cJSON_Delete(refresh_responseJSON);
    return refresh_response;
end:
    cJSON_Delete(refresh_responseJSON);
    return NULL;

}

