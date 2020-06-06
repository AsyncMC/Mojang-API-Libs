#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "current_player_i_ds.h"
#include "error.h"
#include "list.h"
#include "name_change.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Find the current UUID of multiple players at once
//
// Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
//
list_t*
NameHistoryAPI_findUniqueIdsByName(apiClient_t *apiClient, list_t* request_body) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/profiles/minecraft")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/profiles/minecraft");


    // Body Param
    //notstring
    cJSON *localVar_request_body;
    cJSON *localVarItemJSON_request_body;
    cJSON *localVarSingleItemJSON_request_body;
    if (request_body != NULL) {
        localVarItemJSON_request_body = cJSON_CreateObject();
        localVarSingleItemJSON_request_body = cJSON_AddArrayToObject(localVarItemJSON_request_body, "request_body");
        if (localVarSingleItemJSON_request_body == NULL) {
            // nonprimitive container
            const char *error_ptr = cJSON_GetErrorPtr();
            if(error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
            }
        }
        listEntry_t *request_bodyBodyListEntry;

        list_ForEach(request_bodyBodyListEntry, request_body) {
            localVar_request_body = request_body_convertToJSON(request_bodyBodyListEntry->data);
            if(localVar_request_body == NULL) {
                const char *error_ptr = cJSON_GetErrorPtr();
                if(error_ptr != NULL) {
                    fprintf(stderr, "Error Before: %s\n", error_ptr);
                    goto end;
                }
            }
            cJSON_AddItemToArray(localVarSingleItemJSON_request_body, localVar_request_body);
        }

        localVarBodyParameters = cJSON_Print(localVarItemJSON_request_body);
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/json"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "POST");

    if (apiClient->response_code == 200) {
        printf("%s\n","An array containing all players found");
    }
    cJSON *NameHistoryAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(NameHistoryAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, NameHistoryAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( NameHistoryAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarItemJSON_request_body);
    cJSON_Delete(localVarSingleItemJSON_request_body);
    cJSON_Delete(localVar_request_body);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

// Gets the full player's name history
//
list_t*
NameHistoryAPI_getNameHistory(apiClient_t *apiClient, char* stripped_uuid) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/profiles/{stripped_uuid}/names")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/profiles/{stripped_uuid}/names");


    // Path Params
    long sizeOfPathParams_stripped_uuid = strlen(stripped_uuid)+3 + strlen("{ stripped_uuid }");

    if(stripped_uuid == NULL) {
        goto end;
    }
    char* localVarToReplace_stripped_uuid = malloc(sizeOfPathParams_stripped_uuid);
    sprintf(localVarToReplace_stripped_uuid, "%s%s%s", "{", "stripped_uuid", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_stripped_uuid, stripped_uuid);
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
        printf("%s\n","A list of name changes, the first entry usually don&#39;t have a change time");
    }
    if (apiClient->response_code == 204) {
        printf("%s\n","Username not found at the given time");
    }
    cJSON *NameHistoryAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(NameHistoryAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, NameHistoryAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( NameHistoryAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_stripped_uuid);
    return elementToReturn;
end:
    return NULL;

}

// Find the UUID by name
//
// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
//
current_player_i_ds_t*
NameHistoryAPI_getUniqueIdByName(apiClient_t *apiClient, char* username, long at) {
    list_t    *localVarQueryParameters = list_create();
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/users/profiles/minecraft/{username}")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/users/profiles/minecraft/{username}");


    // Path Params
    long sizeOfPathParams_username = strlen(username)+3 + strlen("{ username }");

    if(username == NULL) {
        goto end;
    }
    char* localVarToReplace_username = malloc(sizeOfPathParams_username);
    sprintf(localVarToReplace_username, "%s%s%s", "{", "username", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_username, username);

    // query parameters
    char *keyQuery_at;
    long valueQuery_at;
    keyValuePair_t *keyPairQuery_at = 0;
    if (at)
    {
    //not string
    keyQuery_at = strdup("at");
    valueQuery_at = at;
    keyPairQuery_at = keyValuePair_create(keyQuery_at, &valueQuery_at);
    list_addElement(localVarQueryParameters,keyPairQuery_at);
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
        printf("%s\n","The user was found");
    }
    if (apiClient->response_code == 204) {
        printf("%s\n","User not found");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","If the timestamp is invalid");
    }
    //nonprimitive not container
    current_player_i_ds_t *elementToReturn = current_player_i_ds_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    apiClient_free(apiClient);
    list_free(localVarQueryParameters);
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_username);
    free(keyQuery_at);
    keyValuePair_free(keyPairQuery_at);
    return elementToReturn;
end:
    return NULL;

}

