#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_profile_property.h"


player_profile_property_t *player_profile_property_create(
    char *name,
    ) {
	player_profile_property_t *player_profile_property = malloc(sizeof(player_profile_property_t));
	player_profile_property->name = name;
	player_profile_property->value = value;
	player_profile_property->signature = signature;

	return player_profile_property;
}


void player_profile_property_free(player_profile_property_t *player_profile_property) {
    listEntry_t *listEntry;
    free(player_profile_property->name);

	free(player_profile_property);
}

cJSON *player_profile_property_convertToJSON(player_profile_property_t *player_profile_property) {
	cJSON *item = cJSON_CreateObject();
	// player_profile_property->name
    if(cJSON_AddStringToObject(item, "name", player_profile_property->name) == NULL) {
    goto fail; //String
    }

	// player_profile_property->value

	// player_profile_property->signature

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_profile_property_t *player_profile_property_parseFromJSON(char *jsonString){

    player_profile_property_t *player_profile_property = NULL;
    cJSON *player_profile_propertyJSON = cJSON_Parse(jsonString);
    if(player_profile_propertyJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_profile_property->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(player_profile_propertyJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // player_profile_property->value

    // player_profile_property->signature


    player_profile_property = player_profile_property_create (
        strdup(name->valuestring),
        );
 cJSON_Delete(player_profile_propertyJSON);
    return player_profile_property;
end:
    cJSON_Delete(player_profile_propertyJSON);
    return NULL;

}

