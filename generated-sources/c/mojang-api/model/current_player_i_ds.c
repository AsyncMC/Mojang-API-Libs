#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "current_player_i_ds.h"


current_player_i_ds_t *current_player_i_ds_create(
    char *id,
    char *name,
    bool legacy,
    bool demo
    ) {
	current_player_i_ds_t *current_player_i_ds = malloc(sizeof(current_player_i_ds_t));
	current_player_i_ds->id = id;
	current_player_i_ds->name = name;
	current_player_i_ds->legacy = legacy;
	current_player_i_ds->demo = demo;

	return current_player_i_ds;
}


void current_player_i_ds_free(current_player_i_ds_t *current_player_i_ds) {
    listEntry_t *listEntry;
    free(current_player_i_ds->id);
    free(current_player_i_ds->name);

	free(current_player_i_ds);
}

cJSON *current_player_i_ds_convertToJSON(current_player_i_ds_t *current_player_i_ds) {
	cJSON *item = cJSON_CreateObject();
	// current_player_i_ds->id
    if(cJSON_AddStringToObject(item, "id", current_player_i_ds->id) == NULL) {
    goto fail; //String
    }

	// current_player_i_ds->name
    if(cJSON_AddStringToObject(item, "name", current_player_i_ds->name) == NULL) {
    goto fail; //String
    }

	// current_player_i_ds->legacy
    if(cJSON_AddBoolToObject(item, "legacy", current_player_i_ds->legacy) == NULL) {
    goto fail; //Numeric
    }

	// current_player_i_ds->demo
    if(cJSON_AddBoolToObject(item, "demo", current_player_i_ds->demo) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

current_player_i_ds_t *current_player_i_ds_parseFromJSON(char *jsonString){

    current_player_i_ds_t *current_player_i_ds = NULL;
    cJSON *current_player_i_dsJSON = cJSON_Parse(jsonString);
    if(current_player_i_dsJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // current_player_i_ds->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(current_player_i_dsJSON, "id");
    if(!cJSON_IsString(id) || (id->valuestring == NULL)){
    goto end; //String
    }

    // current_player_i_ds->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(current_player_i_dsJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // current_player_i_ds->legacy
    cJSON *legacy = cJSON_GetObjectItemCaseSensitive(current_player_i_dsJSON, "legacy");
    if(!cJSON_IsBool(legacy))
    {
    goto end; //Numeric
    }

    // current_player_i_ds->demo
    cJSON *demo = cJSON_GetObjectItemCaseSensitive(current_player_i_dsJSON, "demo");
    if(!cJSON_IsBool(demo))
    {
    goto end; //Numeric
    }


    current_player_i_ds = current_player_i_ds_create (
        strdup(id->valuestring),
        strdup(name->valuestring),
        legacy->valueint,
        demo->valueint
        );
 cJSON_Delete(current_player_i_dsJSON);
    return current_player_i_ds;
end:
    cJSON_Delete(current_player_i_dsJSON);
    return NULL;

}

