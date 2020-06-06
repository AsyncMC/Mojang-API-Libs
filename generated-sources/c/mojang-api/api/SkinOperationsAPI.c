#include <stdlib.h>
#include <stdio.h>
#include <ctype.h>
#include "apiClient.h"
#include "cJSON.h"
#include "keyValuePair.h"
#include "error.h"
#include "skin_model.h"

#define MAX_BUFFER_LENGTH 4096
#define intToStr(dst, src) \
    do {\
    char dst[256];\
    snprintf(dst, 256, "%ld", (long int)(src));\
}while(0)

// Changes the player skin by URL
//
// This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
//
void
SkinOperationsAPI_changePlayerSkin(apiClient_t *apiClient, char* stripped_uuid, char* url, skin_model_t* model) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_create();
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/profile/{stripped_uuid}/skin")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/profile/{stripped_uuid}/skin");


    // Path Params
    long sizeOfPathParams_stripped_uuid = strlen(stripped_uuid)+3 + strlen("{ stripped_uuid }");

    if(stripped_uuid == NULL) {
        goto end;
    }
    char* localVarToReplace_stripped_uuid = malloc(sizeOfPathParams_stripped_uuid);
    sprintf(localVarToReplace_stripped_uuid, "%s%s%s", "{", "stripped_uuid", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_stripped_uuid, stripped_uuid);

    // form parameters
    char *keyForm_model;
    skin_model valueForm_model;
    keyValuePair_t *keyPairForm_model = 0;
    if (model)
    {
        keyForm_model = strdup("model");
        valueForm_model = model;
        keyPairForm_model = keyValuePair_create(keyForm_model,&valueForm_model);
        list_addElement(localVarFormParameters,keyPairForm_model); // not String
    }

    // form parameters
    char *keyForm_url;
    char *valueForm_url;
    keyValuePair_t *keyPairForm_url = 0;
    if (url)
    {
        keyForm_url = strdup("url");
        valueForm_url = strdup(url);
        keyPairForm_url = keyValuePair_create(keyForm_url,valueForm_url);
        list_addElement(localVarFormParameters,keyPairForm_url); //String
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"application/x-www-form-urlencoded"); //consumes
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
        printf("%s\n","The skin has been changed. The response has no body");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    list_free(localVarFormParameters);
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_stripped_uuid);
    free(keyForm_model);
    free(keyPairForm_model);
    free(keyForm_url);
    free(valueForm_url);
    keyValuePair_free(keyPairForm_url);

}

// Resets the player skin to default
//
void
SkinOperationsAPI_resetPlayerSkin(apiClient_t *apiClient, char* stripped_uuid) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = NULL;
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = NULL;
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/profile/{stripped_uuid}/skin")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/profile/{stripped_uuid}/skin");


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
                    "DELETE");

    if (apiClient->response_code == 204) {
        printf("%s\n","The skin has been changed. The response has no body");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    
    list_free(localVarHeaderType);
    
    free(localVarPath);
    free(localVarToReplace_stripped_uuid);

}

// Changes the player skin by upload
//
// This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
//
void
SkinOperationsAPI_uploadPlayerSkin(apiClient_t *apiClient, char* stripped_uuid, FILE* file, skin_model_t* model) {
    list_t    *localVarQueryParameters = NULL;
    list_t    *localVarHeaderParameters = NULL;
    list_t    *localVarFormParameters = list_create();
    list_t *localVarHeaderType = list_create();
    list_t *localVarContentType = list_create();
    char      *localVarBodyParameters = NULL;

    // create the path
    long sizeOfPath = strlen("/user/profile/{stripped_uuid}/skin")+1;
    char *localVarPath = malloc(sizeOfPath);
    snprintf(localVarPath, sizeOfPath, "/user/profile/{stripped_uuid}/skin");


    // Path Params
    long sizeOfPathParams_stripped_uuid = strlen(stripped_uuid)+3 + strlen("{ stripped_uuid }");

    if(stripped_uuid == NULL) {
        goto end;
    }
    char* localVarToReplace_stripped_uuid = malloc(sizeOfPathParams_stripped_uuid);
    sprintf(localVarToReplace_stripped_uuid, "%s%s%s", "{", "stripped_uuid", "}");

    localVarPath = strReplace(localVarPath, localVarToReplace_stripped_uuid, stripped_uuid);

    // form parameters
    char *keyForm_model;
    skin_model valueForm_model;
    keyValuePair_t *keyPairForm_model = 0;
    if (model)
    {
        keyForm_model = strdup("model");
        valueForm_model = model;
        keyPairForm_model = keyValuePair_create(keyForm_model,&valueForm_model);
        list_addElement(localVarFormParameters,keyPairForm_model); // not String
    }

    // form parameters

    char *keyForm_file;
    FileStruct *fileVar_file;
    keyValuePair_t *keyPairForm_file = 0;
    if (file != NULL)
    {
        fseek(file, 0, SEEK_END);
        long f_size = ftell(file);
        fseek(file, 0, SEEK_SET);
        fileVar_file = malloc(sizeof(FileStruct));
        keyForm_file = strdup("file");
        fileVar_file->fileData = malloc((f_size)* sizeof(char*));

        fread(fileVar_file->fileData, f_size, 1, file);
        fileVar_file->fileData[f_size] = '\0';

        fileVar_file->fileSize = f_size;
        char valueFile_file[sizeof(fileVar_file)];

        memcpy(valueFile_file,&fileVar_file, sizeof(fileVar_file));

        keyPairForm_file = keyValuePair_create(keyForm_file,valueFile_file);
        list_addElement(localVarFormParameters,keyPairForm_file); //file adding
    }
    list_addElement(localVarHeaderType,"application/json"); //produces
    list_addElement(localVarContentType,"multipart/form-data"); //consumes
    apiClient_invoke(apiClient,
                    localVarPath,
                    localVarQueryParameters,
                    localVarHeaderParameters,
                    localVarFormParameters,
                    localVarHeaderType,
                    localVarContentType,
                    localVarBodyParameters,
                    "PUT");

    if (apiClient->response_code == 204) {
        printf("%s\n","The skin has been changed. The response has no body");
    }
    if (apiClient->response_code == 400) {
        printf("%s\n","Upon error the server will send back a JSON with the error. (Success is a blank payload)");
    }
    //No return type
end:    apiClient_free(apiClient);
    
    
    list_free(localVarFormParameters);
    list_free(localVarHeaderType);
    list_free(localVarContentType);
    free(localVarPath);
    free(localVarToReplace_stripped_uuid);
    free(keyForm_model);
    free(keyPairForm_model);
    free(keyForm_file);
    free(fileVar_file->fileData);
    free(fileVar_file);

}

