#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_profile.h"
#include "list.h"
#include "player_profile_property.h"


player_profile_t *player_profile_create(
    char *id,
    char *name,
    bool legacy,
    list_t *properties
    ) {
	player_profile_t *player_profile = malloc(sizeof(player_profile_t));
	player_profile->id = id;
	player_profile->name = name;
	player_profile->legacy = legacy;
	player_profile->properties = properties;

	return player_profile;
}


void player_profile_free(player_profile_t *player_profile) {
    listEntry_t *listEntry;
    free(player_profile->id);
    free(player_profile->name);
		list_ForEach(listEntry, player_profile->properties) {
		player_profile_property_free(listEntry->data);
	}
	list_free(player_profile->properties);

	free(player_profile);
}

cJSON *player_profile_convertToJSON(player_profile_t *player_profile) {
	cJSON *item = cJSON_CreateObject();
	// player_profile->id
    if(cJSON_AddStringToObject(item, "id", player_profile->id) == NULL) {
    goto fail; //String
    }

	// player_profile->name
    if(cJSON_AddStringToObject(item, "name", player_profile->name) == NULL) {
    goto fail; //String
    }

	// player_profile->legacy
    if(cJSON_AddBoolToObject(item, "legacy", player_profile->legacy) == NULL) {
    goto fail; //Numeric
    }

	// player_profile->properties
    cJSON *properties = cJSON_AddArrayToObject(item, "properties");
	if(properties == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *propertiesListEntry;
	list_ForEach(propertiesListEntry, player_profile->properties) {
		cJSON *item = player_profile_property_convertToJSON(propertiesListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(properties, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_profile_t *player_profile_parseFromJSON(char *jsonString){

    player_profile_t *player_profile = NULL;
    cJSON *player_profileJSON = cJSON_Parse(jsonString);
    if(player_profileJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_profile->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(player_profileJSON, "id");
    if(!cJSON_IsString(id) || (id->valuestring == NULL)){
    goto end; //String
    }

    // player_profile->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(player_profileJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // player_profile->legacy
    cJSON *legacy = cJSON_GetObjectItemCaseSensitive(player_profileJSON, "legacy");
    if(!cJSON_IsBool(legacy))
    {
    goto end; //Numeric
    }

    // player_profile->properties
    cJSON *properties;
    cJSON *propertiesJSON = cJSON_GetObjectItemCaseSensitive(player_profileJSON,"properties");
    if(!cJSON_IsArray(propertiesJSON)){
        goto end; //nonprimitive container
    }

    list_t *propertiesList = list_create();

    cJSON_ArrayForEach(properties,propertiesJSON )
    {
        if(!cJSON_IsObject(properties)){
            goto end;
        }
		char *JSONData = cJSON_Print(properties);
        player_profile_property_t *propertiesItem = player_profile_property_parseFromJSON(JSONData);

        list_addElement(propertiesList, propertiesItem);
        free(JSONData);
    }


    player_profile = player_profile_create (
        strdup(id->valuestring),
        strdup(name->valuestring),
        legacy->valueint,
        propertiesList
        );
 cJSON_Delete(player_profileJSON);
    return player_profile;
end:
    cJSON_Delete(player_profileJSON);
    return NULL;

}

