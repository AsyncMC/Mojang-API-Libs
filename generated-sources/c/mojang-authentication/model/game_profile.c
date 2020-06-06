#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "game_profile.h"


game_profile_t *game_profile_create(
    char *agent,
    char *id,
    char *name,
    char *userId,
    long createdAt,
    bool legacyProfile,
    bool suspended,
    bool paid,
    bool migrated,
    bool legacy
    ) {
	game_profile_t *game_profile = malloc(sizeof(game_profile_t));
	game_profile->agent = agent;
	game_profile->id = id;
	game_profile->name = name;
	game_profile->userId = userId;
	game_profile->createdAt = createdAt;
	game_profile->legacyProfile = legacyProfile;
	game_profile->suspended = suspended;
	game_profile->paid = paid;
	game_profile->migrated = migrated;
	game_profile->legacy = legacy;

	return game_profile;
}


void game_profile_free(game_profile_t *game_profile) {
    listEntry_t *listEntry;
    free(game_profile->agent);
    free(game_profile->id);
    free(game_profile->name);
    free(game_profile->userId);

	free(game_profile);
}

cJSON *game_profile_convertToJSON(game_profile_t *game_profile) {
	cJSON *item = cJSON_CreateObject();
	// game_profile->agent
    if(cJSON_AddStringToObject(item, "agent", game_profile->agent) == NULL) {
    goto fail; //String
    }

	// game_profile->id
    if(cJSON_AddStringToObject(item, "id", game_profile->id) == NULL) {
    goto fail; //String
    }

	// game_profile->name
    if(cJSON_AddStringToObject(item, "name", game_profile->name) == NULL) {
    goto fail; //String
    }

	// game_profile->userId
    if(cJSON_AddStringToObject(item, "userId", game_profile->userId) == NULL) {
    goto fail; //String
    }

	// game_profile->createdAt
    if(cJSON_AddNumberToObject(item, "createdAt", game_profile->createdAt) == NULL) {
    goto fail; //Numeric
    }

	// game_profile->legacyProfile
    if(cJSON_AddBoolToObject(item, "legacyProfile", game_profile->legacyProfile) == NULL) {
    goto fail; //Numeric
    }

	// game_profile->suspended
    if(cJSON_AddBoolToObject(item, "suspended", game_profile->suspended) == NULL) {
    goto fail; //Numeric
    }

	// game_profile->paid
    if(cJSON_AddBoolToObject(item, "paid", game_profile->paid) == NULL) {
    goto fail; //Numeric
    }

	// game_profile->migrated
    if(cJSON_AddBoolToObject(item, "migrated", game_profile->migrated) == NULL) {
    goto fail; //Numeric
    }

	// game_profile->legacy
    if(cJSON_AddBoolToObject(item, "legacy", game_profile->legacy) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

game_profile_t *game_profile_parseFromJSON(char *jsonString){

    game_profile_t *game_profile = NULL;
    cJSON *game_profileJSON = cJSON_Parse(jsonString);
    if(game_profileJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // game_profile->agent
    cJSON *agent = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "agent");
    if(!cJSON_IsString(agent) || (agent->valuestring == NULL)){
    goto end; //String
    }

    // game_profile->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "id");
    if(!cJSON_IsString(id) || (id->valuestring == NULL)){
    goto end; //String
    }

    // game_profile->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // game_profile->userId
    cJSON *userId = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "userId");
    if(!cJSON_IsString(userId) || (userId->valuestring == NULL)){
    goto end; //String
    }

    // game_profile->createdAt
    cJSON *createdAt = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "createdAt");
    if(!cJSON_IsNumber(createdAt))
    {
    goto end; //Numeric
    }

    // game_profile->legacyProfile
    cJSON *legacyProfile = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "legacyProfile");
    if(!cJSON_IsBool(legacyProfile))
    {
    goto end; //Numeric
    }

    // game_profile->suspended
    cJSON *suspended = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "suspended");
    if(!cJSON_IsBool(suspended))
    {
    goto end; //Numeric
    }

    // game_profile->paid
    cJSON *paid = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "paid");
    if(!cJSON_IsBool(paid))
    {
    goto end; //Numeric
    }

    // game_profile->migrated
    cJSON *migrated = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "migrated");
    if(!cJSON_IsBool(migrated))
    {
    goto end; //Numeric
    }

    // game_profile->legacy
    cJSON *legacy = cJSON_GetObjectItemCaseSensitive(game_profileJSON, "legacy");
    if(!cJSON_IsBool(legacy))
    {
    goto end; //Numeric
    }


    game_profile = game_profile_create (
        strdup(agent->valuestring),
        strdup(id->valuestring),
        strdup(name->valuestring),
        strdup(userId->valuestring),
        createdAt->valuedouble,
        legacyProfile->valueint,
        suspended->valueint,
        paid->valueint,
        migrated->valueint,
        legacy->valueint
        );
 cJSON_Delete(game_profileJSON);
    return game_profile;
end:
    cJSON_Delete(game_profileJSON);
    return NULL;

}

