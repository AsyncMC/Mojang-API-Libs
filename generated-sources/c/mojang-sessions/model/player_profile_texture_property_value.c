#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "player_profile_texture_property_value.h"
#include "player_texture.h"


player_profile_texture_property_value_t *player_profile_texture_property_value_create(
    long timestamp,
    char *profileId,
    char *profileName,
    bool signatureRequired,
    player_texture_t *textures
    ) {
	player_profile_texture_property_value_t *player_profile_texture_property_value = malloc(sizeof(player_profile_texture_property_value_t));
	player_profile_texture_property_value->timestamp = timestamp;
	player_profile_texture_property_value->profileId = profileId;
	player_profile_texture_property_value->profileName = profileName;
	player_profile_texture_property_value->signatureRequired = signatureRequired;
	player_profile_texture_property_value->textures = textures;

	return player_profile_texture_property_value;
}


void player_profile_texture_property_value_free(player_profile_texture_property_value_t *player_profile_texture_property_value) {
    listEntry_t *listEntry;
    free(player_profile_texture_property_value->profileId);
    free(player_profile_texture_property_value->profileName);
	player_texture_free(player_profile_texture_property_value->textures);

	free(player_profile_texture_property_value);
}

cJSON *player_profile_texture_property_value_convertToJSON(player_profile_texture_property_value_t *player_profile_texture_property_value) {
	cJSON *item = cJSON_CreateObject();
	// player_profile_texture_property_value->timestamp
    if(cJSON_AddNumberToObject(item, "timestamp", player_profile_texture_property_value->timestamp) == NULL) {
    goto fail; //Numeric
    }

	// player_profile_texture_property_value->profileId
    if(cJSON_AddStringToObject(item, "profileId", player_profile_texture_property_value->profileId) == NULL) {
    goto fail; //String
    }

	// player_profile_texture_property_value->profileName
    if(cJSON_AddStringToObject(item, "profileName", player_profile_texture_property_value->profileName) == NULL) {
    goto fail; //String
    }

	// player_profile_texture_property_value->signatureRequired
    if(cJSON_AddBoolToObject(item, "signatureRequired", player_profile_texture_property_value->signatureRequired) == NULL) {
    goto fail; //Numeric
    }

	// player_profile_texture_property_value->textures
	cJSON *textures = player_texture_convertToJSON(player_profile_texture_property_value->textures);
	if(textures == NULL) {
		goto fail; //nonprimitive
	}
	cJSON_AddItemToObject(item, "textures", textures);
	if(item->child == NULL) {
		goto fail;
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

player_profile_texture_property_value_t *player_profile_texture_property_value_parseFromJSON(char *jsonString){

    player_profile_texture_property_value_t *player_profile_texture_property_value = NULL;
    cJSON *player_profile_texture_property_valueJSON = cJSON_Parse(jsonString);
    if(player_profile_texture_property_valueJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // player_profile_texture_property_value->timestamp
    cJSON *timestamp = cJSON_GetObjectItemCaseSensitive(player_profile_texture_property_valueJSON, "timestamp");
    if(!cJSON_IsNumber(timestamp))
    {
    goto end; //Numeric
    }

    // player_profile_texture_property_value->profileId
    cJSON *profileId = cJSON_GetObjectItemCaseSensitive(player_profile_texture_property_valueJSON, "profileId");
    if(!cJSON_IsString(profileId) || (profileId->valuestring == NULL)){
    goto end; //String
    }

    // player_profile_texture_property_value->profileName
    cJSON *profileName = cJSON_GetObjectItemCaseSensitive(player_profile_texture_property_valueJSON, "profileName");
    if(!cJSON_IsString(profileName) || (profileName->valuestring == NULL)){
    goto end; //String
    }

    // player_profile_texture_property_value->signatureRequired
    cJSON *signatureRequired = cJSON_GetObjectItemCaseSensitive(player_profile_texture_property_valueJSON, "signatureRequired");
    if(!cJSON_IsBool(signatureRequired))
    {
    goto end; //Numeric
    }

    // player_profile_texture_property_value->textures
    player_texture_t *textures;
    cJSON *texturesJSON = cJSON_GetObjectItemCaseSensitive(player_profile_texture_property_valueJSON, "textures");
    if(player_profile_texture_property_valueJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL)
            fprintf(stderr, "Error Before: %s\n", error_ptr);
        goto end; //nonprimitive
    }
    char *texturesJSONData = cJSON_Print(texturesJSON);
    textures = player_texture_parseFromJSON(texturesJSONData);


    player_profile_texture_property_value = player_profile_texture_property_value_create (
        timestamp->valuedouble,
        strdup(profileId->valuestring),
        strdup(profileName->valuestring),
        signatureRequired->valueint,
        textures
        );
        free(texturesJSONData);
 cJSON_Delete(player_profile_texture_property_valueJSON);
    return player_profile_texture_property_value;
end:
    cJSON_Delete(player_profile_texture_property_valueJSON);
    return NULL;

}

