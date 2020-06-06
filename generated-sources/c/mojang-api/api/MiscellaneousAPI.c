#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "order_statistics_request.h"
#include "order_statistics_response.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Get statistics on the sales of Minecraft.
//
order_statistics_response_t*
MiscellaneousAPI_getOrdersStatistics(apiClient_t *apiClient, order_statistics_request_t* order_statistics_request) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/orders/statistics")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/orders/statistics");


    // Body Param
    cJSON *localVarSingleItemJSON_order_statistics_request;
    if (order_statistics_request != NULL) {
        //string
        localVarSingleItemJSON_order_statistics_request = order_statistics_request_convertToJSON(order_statistics_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_order_statistics_request);
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
        printf("%s\n","A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.");
    }
    //nonprimitive not container
    order_statistics_response_t *elementToReturn = order_statistics_response_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_order_statistics_request);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

