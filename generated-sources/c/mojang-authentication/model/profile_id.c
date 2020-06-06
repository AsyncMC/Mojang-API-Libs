#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "profile_id.h"


profile_id_t *profile_id_create(
    char *id,
    char *name
    ) {
	profile_id_t *profile_id = malloc(sizeof(profile_id_t));
	profile_id->id = id;
	profile_id->name = name;

	return profile_id;
}


void profile_id_free(profile_id_t *profile_id) {
    listEntry_t *listEntry;
    free(profile_id->id);
    free(profile_id->name);

	free(profile_id);
}

cJSON *profile_id_convertToJSON(profile_id_t *profile_id) {
	cJSON *item = cJSON_CreateObject();
	// profile_id->id
    if(cJSON_AddStringToObject(item, "id", profile_id->id) == NULL) {
    goto fail; //String
    }

	// profile_id->name
    if(cJSON_AddStringToObject(item, "name", profile_id->name) == NULL) {
    goto fail; //String
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

profile_id_t *profile_id_parseFromJSON(char *jsonString){

    profile_id_t *profile_id = NULL;
    cJSON *profile_idJSON = cJSON_Parse(jsonString);
    if(profile_idJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // profile_id->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(profile_idJSON, "id");
    if(!cJSON_IsString(id) || (id->valuestring == NULL)){
    goto end; //String
    }

    // profile_id->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(profile_idJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }


    profile_id = profile_id_create (
        strdup(id->valuestring),
        strdup(name->valuestring)
        );
 cJSON_Delete(profile_idJSON);
    return profile_id;
end:
    cJSON_Delete(profile_idJSON);
    return NULL;

}

