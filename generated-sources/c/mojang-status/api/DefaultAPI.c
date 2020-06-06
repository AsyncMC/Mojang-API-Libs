#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "api_status.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Checks the Mojang service statuses
//
list
DefaultAPI_checkStatuses(apiClient_t *apiClient) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/check")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/check");

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
        printf("%s\n","An array with service status key/pairs");
    }
    //primitive reutrn type not simple
    cJSON *localVarJSON = cJSON_Parse(apiClient->dataReceived);
    cJSON *VarJSON;
    list_t *elementToReturn = list_create();
    cJSON_ArrayForEach(VarJSON, localVarJSON){
        keyValuePair_t *keyPair = keyValuePair_create(strdup(VarJSON->string), cJSON_Print(VarJSON));
        list_addElement(elementToReturn, keyPair);
    }
    cJSON_Delete(localVarJSON);

    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    return NULL;

}

