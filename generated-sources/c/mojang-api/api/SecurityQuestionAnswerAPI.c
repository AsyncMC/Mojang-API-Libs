#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "error.h"
#include "list.h"
#include "security_answer.h"
#include "security_challenge.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Check if security questions are needed
//
void
SecurityQuestionAnswerAPI_checkSecurityStatus(apiClient_t *apiClient) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/security/location")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/security/location");

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

    if (apiClient->response_code == 204) {
        printf("%s\n","No check is needed.");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","A security check is needed or there is an other issue");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);

}

// Get list of questions
//
list_t*
SecurityQuestionAnswerAPI_listPendingSecurityQuestions(apiClient_t *apiClient) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/security/challenges")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/security/challenges");

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
        printf("%s\n","A list of security questions to be answered");
    }
    cJSON *SecurityQuestionAnswerAPIlocalVarJSON = cJSON_Parse(apiClient->dataReceived);
    if(!cJSON_IsArray(SecurityQuestionAnswerAPIlocalVarJSON)) {
        return 0;//nonprimitive container
    }
    list_t *elementToReturn = list_create();
    cJSON *VarJSON;
    cJSON_ArrayForEach(VarJSON, SecurityQuestionAnswerAPIlocalVarJSON)
    {
        if(!cJSON_IsObject(VarJSON))
        {
           // return 0;
        }
        char *localVarJSONToChar = cJSON_Print(VarJSON);
        list_addElement(elementToReturn , localVarJSONToChar);
    }

    cJSON_Delete( SecurityQuestionAnswerAPIlocalVarJSON);
    cJSON_Delete( VarJSON);
    //return type
    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    return elementToReturn;
end:
    return NULL;

}

// Send back the answers
//
void
SecurityQuestionAnswerAPI_sendSecurityQuestionAnswers(apiClient_t *apiClient, list_t* security_answer) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/security/location")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/security/location");


    // Body Param
    //notstring
    cJSON *localVar_security_answer;
    cJSON *localVarItemJSON_security_answer;
    cJSON *localVarSingleItemJSON_security_answer;
    if (security_answer != NULL) {
        localVarItemJSON_security_answer = cJSON_CreateObject();
        localVarSingleItemJSON_security_answer = cJSON_AddArrayToObject(localVarItemJSON_security_answer, "security_answer");
        if (localVarSingleItemJSON_security_answer == NULL) {
            // nonprimitive container
            const char *error_ptr = cJSON_GetErrorPtr();
            if(error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
            }
        }
        listEntry_t *security_answerBodyListEntry;

        list_ForEach(security_answerBodyListEntry, security_answer) {
            localVar_security_answer = security_answer_convertToJSON(security_answerBodyListEntry->data);
            if(localVar_security_answer == NULL) {
                const char *error_ptr = cJSON_GetErrorPtr();
                if(error_ptr != NULL) {
                    fprintf(stderr, "Error Before: %s\n", error_ptr);
                    goto end;
                }
            }
            cJSON_AddItemToArray(localVarSingleItemJSON_security_answer, localVar_security_answer);
        }

        localVarBodyParameters = cJSON_Print(localVarItemJSON_security_answer);
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
        printf("%s\n","The answers were accepted");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","At least one answer we not accepted");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    cJSON_Delete(localVarItemJSON_security_answer);
    cJSON_Delete(localVarSingleItemJSON_security_answer);
    cJSON_Delete(localVar_security_answer);
    free(localVarBodyParameters);

}

