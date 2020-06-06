#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "authentication.h"
#include "access_keys.h"


authentication_t *authentication_create(
    char *accessToken,
    char *clientToken
    ) {
	authentication_t *authentication = malloc(sizeof(authentication_t));
	authentication->accessToken = accessToken;
	authentication->clientToken = clientToken;

	return authentication;
}


void authentication_free(authentication_t *authentication) {
    listEntry_t *listEntry;
    free(authentication->accessToken);
    free(authentication->clientToken);

	free(authentication);
}

cJSON *authentication_convertToJSON(authentication_t *authentication) {
	cJSON *item = cJSON_CreateObject();
	// authentication->accessToken
    if(cJSON_AddStringToObject(item, "accessToken", authentication->accessToken) == NULL) {
    goto fail; //String
    }

	// authentication->clientToken
    if(cJSON_AddStringToObject(item, "clientToken", authentication->clientToken) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

authentication_t *authentication_parseFromJSON(char *jsonString){

    authentication_t *authentication = NULL;
    cJSON *authenticationJSON = cJSON_Parse(jsonString);
    if(authenticationJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // authentication->accessToken
    cJSON *accessToken = cJSON_GetObjectItemCaseSensitive(authenticationJSON, "accessToken");
    if(!cJSON_IsString(accessToken) || (accessToken->valuestring == NULL)){
    goto end; //String
    }

    // authentication->clientToken
    cJSON *clientToken = cJSON_GetObjectItemCaseSensitive(authenticationJSON, "clientToken");
    if(!cJSON_IsString(clientToken) || (clientToken->valuestring == NULL)){
    goto end; //String
    }


    authentication = authentication_create (
        strdup(accessToken->valuestring),
        strdup(clientToken->valuestring)
        );
 cJSON_Delete(authenticationJSON);
    return authentication;
end:
    cJSON_Delete(authenticationJSON);
    return NULL;

}

