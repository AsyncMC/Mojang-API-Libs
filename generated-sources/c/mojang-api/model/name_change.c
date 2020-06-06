#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "name_change.h"


name_change_t *name_change_create(
    char *name,
    long changedToAt
    ) {
	name_change_t *name_change = malloc(sizeof(name_change_t));
	name_change->name = name;
	name_change->changedToAt = changedToAt;

	return name_change;
}


void name_change_free(name_change_t *name_change) {
    listEntry_t *listEntry;
    free(name_change->name);

	free(name_change);
}

cJSON *name_change_convertToJSON(name_change_t *name_change) {
	cJSON *item = cJSON_CreateObject();
	// name_change->name
    if(cJSON_AddStringToObject(item, "name", name_change->name) == NULL) {
    goto fail; //String
    }

	// name_change->changedToAt
    if(cJSON_AddNumberToObject(item, "changedToAt", name_change->changedToAt) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

name_change_t *name_change_parseFromJSON(char *jsonString){

    name_change_t *name_change = NULL;
    cJSON *name_changeJSON = cJSON_Parse(jsonString);
    if(name_changeJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // name_change->name
    cJSON *name = cJSON_GetObjectItemCaseSensitive(name_changeJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    // name_change->changedToAt
    cJSON *changedToAt = cJSON_GetObjectItemCaseSensitive(name_changeJSON, "changedToAt");
    if(!cJSON_IsNumber(changedToAt))
    {
    goto end; //Numeric
    }


    name_change = name_change_create (
        strdup(name->valuestring),
        changedToAt->valuedouble
        );
 cJSON_Delete(name_changeJSON);
    return name_change;
end:
    cJSON_Delete(name_changeJSON);
    return NULL;

}

