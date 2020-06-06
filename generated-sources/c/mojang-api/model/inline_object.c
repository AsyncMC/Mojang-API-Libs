#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "inline_object.h"
#include "skin_model.h"


inline_object_t *inline_object_create(
    skin_model_t *model,
    ) {
	inline_object_t *inline_object = malloc(sizeof(inline_object_t));
	inline_object->model = model;
	inline_object->file = file;

	return inline_object;
}


void inline_object_free(inline_object_t *inline_object) {
    listEntry_t *listEntry;
	skin_model_free(inline_object->model);

	free(inline_object);
}

cJSON *inline_object_convertToJSON(inline_object_t *inline_object) {
	cJSON *item = cJSON_CreateObject();
	// inline_object->model
	cJSON *model = skin_model_convertToJSON(inline_object->model);
	if(model == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "model", model);
	if(item->child == NULL) {
		goto fail;
	}

	// inline_object->file

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

inline_object_t *inline_object_parseFromJSON(char *jsonString){

    inline_object_t *inline_object = NULL;
    cJSON *inline_objectJSON = cJSON_Parse(jsonString);
    if(inline_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // inline_object->model
    skin_model_t *model;
    cJSON *modelJSON = cJSON_GetObjectItemCaseSensitive(inline_objectJSON, "model");
    if(inline_objectJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *modelJSONData = cJSON_Print(modelJSON);
    model = skin_model_parseFromJSON(modelJSONData);

    // inline_object->file


    inline_object = inline_object_create (
        model,
        );
        free(modelJSONData);
 cJSON_Delete(inline_objectJSON);
    return inline_object;
end:
    cJSON_Delete(inline_objectJSON);
    return NULL;

}

