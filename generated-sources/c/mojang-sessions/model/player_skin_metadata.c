#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_skin_metadata.h"

char* modelplayer_skin_metadata_ToString(model_e model){
    char *modelArray[] =  { "slim" };
    return modelArray[model];

}

model_e modelplayer_skin_metadata_FromString(char* model){
    int stringToReturn = 0;
    char *modelArray[] =  { "slim" };
    size_t sizeofArray = sizeof(modelArray) / sizeof(modelArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(model, modelArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

player_skin_metadata_t *player_skin_metadata_create(
    model_e model
    ) {
	player_skin_metadata_t *player_skin_metadata = malloc(sizeof(player_skin_metadata_t));
	player_skin_metadata->model = model;

	return player_skin_metadata;
}


void player_skin_metadata_free(player_skin_metadata_t *player_skin_metadata) {
    listEntry_t *listEntry;

	free(player_skin_metadata);
}

cJSON *player_skin_metadata_convertToJSON(player_skin_metadata_t *player_skin_metadata) {
	cJSON *item = cJSON_CreateObject();
	// player_skin_metadata->model
    if(cJSON_AddStringToObject(item, "model", modelplayer_skin_metadata_ToString(player_skin_metadata->model)) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_skin_metadata_t *player_skin_metadata_parseFromJSON(char *jsonString){

    player_skin_metadata_t *player_skin_metadata = NULL;
    cJSON *player_skin_metadataJSON = cJSON_Parse(jsonString);
    if(player_skin_metadataJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_skin_metadata->model
    model_e modelVariable;
    cJSON *model = cJSON_GetObjectItemCaseSensitive(player_skin_metadataJSON, "model");
    if(!cJSON_IsString(model) || (model->valuestring == NULL)){
    goto end; //String
    }

    modelVariable = modelplayer_skin_metadata_FromString(model->valuestring);


    player_skin_metadata = player_skin_metadata_create (
        modelVariable
        );
 cJSON_Delete(player_skin_metadataJSON);
    return player_skin_metadata;
end:
    cJSON_Delete(player_skin_metadataJSON);
    return NULL;

}

