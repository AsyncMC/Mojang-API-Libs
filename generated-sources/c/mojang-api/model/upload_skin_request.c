#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "upload_skin_request.h"
#include "skin_model.h"


upload_skin_request_t *upload_skin_request_create(
    skin_model_t *model,
    ) {
	upload_skin_request_t *upload_skin_request = malloc(sizeof(upload_skin_request_t));
	upload_skin_request->model = model;
	upload_skin_request->file = file;

	return upload_skin_request;
}


void upload_skin_request_free(upload_skin_request_t *upload_skin_request) {
    listEntry_t *listEntry;
	skin_model_free(upload_skin_request->model);

	free(upload_skin_request);
}

cJSON *upload_skin_request_convertToJSON(upload_skin_request_t *upload_skin_request) {
	cJSON *item = cJSON_CreateObject();
	// upload_skin_request->model
	cJSON *model = skin_model_convertToJSON(upload_skin_request->model);
	if(model == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "model", model);
	if(item->child == NULL) {
		goto fail;
	}

	// upload_skin_request->file

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

upload_skin_request_t *upload_skin_request_parseFromJSON(char *jsonString){

    upload_skin_request_t *upload_skin_request = NULL;
    cJSON *upload_skin_requestJSON = cJSON_Parse(jsonString);
    if(upload_skin_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // upload_skin_request->model
    skin_model_t *model;
    cJSON *modelJSON = cJSON_GetObjectItemCaseSensitive(upload_skin_requestJSON, "model");
    if(upload_skin_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *modelJSONData = cJSON_Print(modelJSON);
    model = skin_model_parseFromJSON(modelJSONData);

    // upload_skin_request->file


    upload_skin_request = upload_skin_request_create (
        model,
        );
        free(modelJSONData);
 cJSON_Delete(upload_skin_requestJSON);
    return upload_skin_request;
end:
    cJSON_Delete(upload_skin_requestJSON);
    return NULL;

}

