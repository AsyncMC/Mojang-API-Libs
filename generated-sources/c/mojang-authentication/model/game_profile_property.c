#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "game_profile_property.h"


game_profile_property_t *game_profile_property_create(
    char *name,
    char *value
    ) {
	game_profile_property_t *game_profile_property = malloc(sizeof(game_profile_property_t));
	game_profile_property->name = name;
	game_profile_property->value = value;

	return game_profile_property;
}


void game_profile_property_free(game_profile_property_t *game_profile_property) {
    listEntry_t *listEntry;
    free(game_profile_property->name);
    free(game_profile_property->value);

	free(game_profile_property);
}

cJSON *game_profile_property_convertToJSON(game_profile_property_t *game_profile_property) {
	cJSON *item = cJSON_CreateObject();
	// game_profile_property->name
    if(cJSON_AddStringToObject(item, "name", game_profile_property->name) == NULL) {
    goto fail; //String
    }

	// game_profile_property->value
    if(cJSON_AddStringToObject(item, "value", game_profile_property->value) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

game_profile_property_t *game_profile_property_parseFromJSON(char *jsonString){

    game_profile_property_t *game_profile_property = NULL;
    cJSON *game_profile_propertyJSON = cJSON_Parse(jsonString);
    if(game_profile_propertyJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // game_profile_property->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(game_profile_propertyJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // game_profile_property->value
    cJSON *value = cJSON_GetObjectItemCaseSensitive(game_profile_propertyJSON, "value");
    if(!cJSON_IsString(value) || (value->valuestring == NULL)){
    goto end; //String
    }


    game_profile_property = game_profile_property_create (
        strdup(name->valuestring),
        strdup(value->valuestring)
        );
 cJSON_Delete(game_profile_propertyJSON);
    return game_profile_property;
end:
    cJSON_Delete(game_profile_propertyJSON);
    return NULL;

}

