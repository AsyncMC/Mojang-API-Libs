#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "access_keys.h"


access_keys_t *access_keys_create(
    char *accessToken,
    char *clientToken
    ) {
	access_keys_t *access_keys = malloc(sizeof(access_keys_t));
	access_keys->accessToken = accessToken;
	access_keys->clientToken = clientToken;

	return access_keys;
}


void access_keys_free(access_keys_t *access_keys) {
    listEntry_t *listEntry;
    free(access_keys->accessToken);
    free(access_keys->clientToken);

	free(access_keys);
}

cJSON *access_keys_convertToJSON(access_keys_t *access_keys) {
	cJSON *item = cJSON_CreateObject();
	// access_keys->accessToken
    if(cJSON_AddStringToObject(item, "accessToken", access_keys->accessToken) == NULL) {
    goto fail; //String
    }

	// access_keys->clientToken
    if(cJSON_AddStringToObject(item, "clientToken", access_keys->clientToken) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

access_keys_t *access_keys_parseFromJSON(char *jsonString){

    access_keys_t *access_keys = NULL;
    cJSON *access_keysJSON = cJSON_Parse(jsonString);
    if(access_keysJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // access_keys->accessToken
    cJSON *accessToken = cJSON_GetObjectItemCaseSensitive(access_keysJSON, "accessToken");
    if(!cJSON_IsString(accessToken) || (accessToken->valuestring == NULL)){
    goto end; //String
    }

    // access_keys->clientToken
    cJSON *clientToken = cJSON_GetObjectItemCaseSensitive(access_keysJSON, "clientToken");
    if(!cJSON_IsString(clientToken) || (clientToken->valuestring == NULL)){
    goto end; //String
    }


    access_keys = access_keys_create (
        strdup(accessToken->valuestring),
        strdup(clientToken->valuestring)
        );
 cJSON_Delete(access_keysJSON);
    return access_keys;
end:
    cJSON_Delete(access_keysJSON);
    return NULL;

}

