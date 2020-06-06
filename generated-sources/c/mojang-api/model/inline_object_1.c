#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "inline_object_1.h"
#include "skin_model.h"


inline_object_1_t *inline_object_1_create(
    skin_model_t *model,
    char *url
    ) {
	inline_object_1_t *inline_object_1 = malloc(sizeof(inline_object_1_t));
	inline_object_1->model = model;
	inline_object_1->url = url;

	return inline_object_1;
}


void inline_object_1_free(inline_object_1_t *inline_object_1) {
    listEntry_t *listEntry;
	skin_model_free(inline_object_1->model);
    free(inline_object_1->url);

	free(inline_object_1);
}

cJSON *inline_object_1_convertToJSON(inline_object_1_t *inline_object_1) {
	cJSON *item = cJSON_CreateObject();
	// inline_object_1->model
	cJSON *model = skin_model_convertToJSON(inline_object_1->model);
	if(model == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "model", model);
	if(item->child == NULL) {
		goto fail;
	}

	// inline_object_1->url
    if(cJSON_AddStringToObject(item, "url", inline_object_1->url) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_1_t *inline_object_1_parseFromJSON(char *jsonString){

    inline_object_1_t *inline_object_1 = NULL;
    cJSON *inline_object_1JSON = cJSON_Parse(jsonString);
    if(inline_object_1JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object_1->model
    skin_model_t *model;
    cJSON *modelJSON = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "model");
    if(inline_object_1JSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *modelJSONData = cJSON_Print(modelJSON);
    model = skin_model_parseFromJSON(modelJSONData);

    // inline_object_1->url
    cJSON *url = cJSON_GetObjectItemCaseSensitive(inline_object_1JSON, "url");
    if(!cJSON_IsString(url) || (url->valuestring == NULL)){
    goto end; //String
    }


    inline_object_1 = inline_object_1_create (
        model,
        strdup(url->valuestring)
        );
        free(modelJSONData);
 cJSON_Delete(inline_object_1JSON);
    return inline_object_1;
end:
    cJSON_Delete(inline_object_1JSON);
    return NULL;

}

