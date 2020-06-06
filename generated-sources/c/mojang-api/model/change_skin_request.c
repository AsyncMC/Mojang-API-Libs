#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "change_skin_request.h"
#include "skin_model.h"


change_skin_request_t *change_skin_request_create(
    skin_model_t *model,
    char *url
    ) {
	change_skin_request_t *change_skin_request = malloc(sizeof(change_skin_request_t));
	change_skin_request->model = model;
	change_skin_request->url = url;

	return change_skin_request;
}


void change_skin_request_free(change_skin_request_t *change_skin_request) {
    listEntry_t *listEntry;
	skin_model_free(change_skin_request->model);
    free(change_skin_request->url);

	free(change_skin_request);
}

cJSON *change_skin_request_convertToJSON(change_skin_request_t *change_skin_request) {
	cJSON *item = cJSON_CreateObject();
	// change_skin_request->model
	cJSON *model = skin_model_convertToJSON(change_skin_request->model);
	if(model == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "model", model);
	if(item->child == NULL) {
		goto fail;
	}

	// change_skin_request->url
    if(cJSON_AddStringToObject(item, "url", change_skin_request->url) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

change_skin_request_t *change_skin_request_parseFromJSON(char *jsonString){

    change_skin_request_t *change_skin_request = NULL;
    cJSON *change_skin_requestJSON = cJSON_Parse(jsonString);
    if(change_skin_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // change_skin_request->model
    skin_model_t *model;
    cJSON *modelJSON = cJSON_GetObjectItemCaseSensitive(change_skin_requestJSON, "model");
    if(change_skin_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *modelJSONData = cJSON_Print(modelJSON);
    model = skin_model_parseFromJSON(modelJSONData);

    // change_skin_request->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(change_skin_requestJSON, "url");
    if(!cJSON_IsString(url) || (url->valuestring == NULL)){
    goto end; //String
    }


    change_skin_request = change_skin_request_create (
        model,
        strdup(url->valuestring)
        );
        free(modelJSONData);
 cJSON_Delete(change_skin_requestJSON);
    return change_skin_request;
end:
    cJSON_Delete(change_skin_requestJSON);
    return NULL;

}

