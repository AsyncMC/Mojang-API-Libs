#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "player_profile.h"
#include "session_api_error.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Gets the player's game profile
//
// This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
//
player_profile_t*
LoginAPI_getPlayerProfile(apiClient_t *apiClient, char* stripped_uuid, int unsigned) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/session/minecraft/profile/{stripped_uuid}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/session/minecraft/profile/{stripped_uuid}");


    // Path Params
    long sizeOfPathParams_stripped_uuid = strlen(stripped_uuid)+3 + strlen("{ stripped_uuid }");

    if(stripped_uuid == NULL) {
        goto end;
    }
    char* localVarToReplace_stripped_uuid = malloc(sizeOfPathParams_stripped_uuid);
    sprintf(localVarToReplace_stripped_uuid, "%s%s%s", "{", "stripped_uuid", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_stripped_uuid, stripped_uuid);

    // query parameters
    char *keyQuery_unsigned;
    int valueQuery_unsigned;
    keyValuePair_t *keyPairQuery_unsigned = 0;
    if (unsigned)
    {
    //not string
    keyQuery_unsigned = strdup("unsigned");
    valueQuery_unsigned = unsigned;
    keyPairQuery_unsigned = keyValuePair_create(keyQuery_unsigned, &valueQuery_unsigned);
    list_addElement(localVarQueryParameters,keyPairQuery_unsigned);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "GET");

    if (apiClient->response_code == 200) {
        printf("%s\n","The player profile and all properties");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","UUID is invalid");
    }
    //nonprimitive not container
    player_profile_t *elementToReturn = player_profile_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    apiClient_free(apiClient);
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_stripped_uuid);
    free(keyQuery_unsigned);
    keyValuePair_free(keyPairQuery_unsigned);
    return elementToReturn;
end:
    return NULL;

}

