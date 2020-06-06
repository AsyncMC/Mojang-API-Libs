#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "access_keys.h"
#include "authentication.h"
#include "authentication_request.h"
#include "error.h"
#include "refresh_request.h"
#include "refresh_response.h"
#include "username_password.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

authentication_t*
DefaultAPI_authenticate(apiClient_t *apiClient, authentication_request_t* authentication_request) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/authenticate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/authenticate");


    // Body Param
    cJSON *localVarSingleItemJSON_authentication_request;
    if (authentication_request != NULL) {
        //string
        localVarSingleItemJSON_authentication_request = authentication_request_convertToJSON(authentication_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_authentication_request);
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
        printf("%s\n","Successfully authenticated");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Could not authenticate");
    }
    //nonprimitive not container
    authentication_t *elementToReturn = authentication_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_authentication_request);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

void
DefaultAPI_invalidate(apiClient_t *apiClient, access_keys_t* access_keys) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/invalidate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/invalidate");


    // Body Param
    cJSON *localVarSingleItemJSON_access_keys;
    if (access_keys != NULL) {
        //string
        localVarSingleItemJSON_access_keys = access_keys_convertToJSON(access_keys);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_access_keys);
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

    if (apiClient->response_code == 204) {
        printf("%s\n","The token have been invalidated");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Could not invalidate the token");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_access_keys);
    free(localVarBodyParameters);

}

refresh_response_t*
DefaultAPI_refresh(apiClient_t *apiClient, refresh_request_t* refresh_request) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/refresh")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/refresh");


    // Body Param
    cJSON *localVarSingleItemJSON_refresh_request;
    if (refresh_request != NULL) {
        //string
        localVarSingleItemJSON_refresh_request = refresh_request_convertToJSON(refresh_request);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_refresh_request);
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
        printf("%s\n","Session refreshed successfully. Note: The old access token gets invalidated.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Could not refresh the session");
    }
    //nonprimitive not container
    refresh_response_t *elementToReturn = refresh_response_parseFromJSON(apiClient->dataReceived);
    if(elementToReturn == NULL) {
        // return 0;
    }

    //return type
    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_refresh_request);
    free(localVarBodyParameters);
    return elementToReturn;
end:
    return NULL;

}

void
DefaultAPI_siginout(apiClient_t *apiClient, username_password_t* username_password) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/signout")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/signout");


    // Body Param
    cJSON *localVarSingleItemJSON_username_password;
    if (username_password != NULL) {
        //string
        localVarSingleItemJSON_username_password = username_password_convertToJSON(username_password);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_username_password);
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

    if (apiClient->response_code == 204) {
        printf("%s\n","All tokens have been invalidated");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Invalid username/password");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_username_password);
    free(localVarBodyParameters);

}

void
DefaultAPI_validate(apiClient_t *apiClient, access_keys_t* access_keys) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/validate")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/validate");


    // Body Param
    cJSON *localVarSingleItemJSON_access_keys;
    if (access_keys != NULL) {
        //string
        localVarSingleItemJSON_access_keys = access_keys_convertToJSON(access_keys);
        localVarBodyParameters = cJSON_Print(localVarSingleItemJSON_access_keys);
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

    if (apiClient->response_code == 204) {
        printf("%s\n","The token is valid");
    }
    if (apiClient->response_code == 403) {
        printf("%s\n","The token is not valid");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarSingleItemJSON_access_keys);
    free(localVarBodyParameters);

}

