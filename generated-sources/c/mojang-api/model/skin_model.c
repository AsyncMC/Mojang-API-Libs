#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "skin_model.h"


skin_model_t *skin_model_create(
    ) {
	skin_model_t *skin_model = malloc(sizeof(skin_model_t));

	return skin_model;
}


void skin_model_free(skin_model_t *skin_model) {
    listEntry_t *listEntry;

	free(skin_model);
}

cJSON *skin_model_convertToJSON(skin_model_t *skin_model) {
	cJSON *item = cJSON_CreateObject();
	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

skin_model_t *skin_model_parseFromJSON(char *jsonString){

    skin_model_t *skin_model = NULL;
    cJSON *skin_modelJSON = cJSON_Parse(jsonString);
    if(skin_modelJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }


    skin_model = skin_model_create (
        );
 cJSON_Delete(skin_modelJSON);
    return skin_model;
end:
    cJSON_Delete(skin_modelJSON);
    return NULL;

}

