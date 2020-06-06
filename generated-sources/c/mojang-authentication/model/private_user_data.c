#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "private_user_data.h"
#include "game_profile_property.h"
#include "list.h"
#include "reduced_user_data.h"


private_user_data_t *private_user_data_create(
    char *id,
    list_t *properties
    ) {
	private_user_data_t *private_user_data = malloc(sizeof(private_user_data_t));
	private_user_data->id = id;
	private_user_data->properties = properties;

	return private_user_data;
}


void private_user_data_free(private_user_data_t *private_user_data) {
    listEntry_t *listEntry;
    free(private_user_data->id);
		list_ForEach(listEntry, private_user_data->properties) {
		game_profile_property_free(listEntry->data);
	}
	list_free(private_user_data->properties);

	free(private_user_data);
}

cJSON *private_user_data_convertToJSON(private_user_data_t *private_user_data) {
	cJSON *item = cJSON_CreateObject();
	// private_user_data->id
    if(cJSON_AddStringToObject(item, "id", private_user_data->id) == NULL) {
    goto fail; //String
    }

	// private_user_data->properties
    cJSON *properties = cJSON_AddArrayToObject(item, "properties");
	if(properties == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *propertiesListEntry;
	list_ForEach(propertiesListEntry, private_user_data->properties) {
		cJSON *item = game_profile_property_convertToJSON(propertiesListEntry->data);
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

private_user_data_t *private_user_data_parseFromJSON(char *jsonString){

    private_user_data_t *private_user_data = NULL;
    cJSON *private_user_dataJSON = cJSON_Parse(jsonString);
    if(private_user_dataJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // private_user_data->id
    cJSON *id = cJSON_GetObjectItemCaseSensitive(private_user_dataJSON, "id");
    if(!cJSON_IsString(id) || (id->valuestring == NULL)){
    goto end; //String
    }

    // private_user_data->properties
    cJSON *properties;
    cJSON *propertiesJSON = cJSON_GetObjectItemCaseSensitive(private_user_dataJSON,"properties");
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
        game_profile_property_t *propertiesItem = game_profile_property_parseFromJSON(JSONData);

        list_addElement(propertiesList, propertiesItem);
        free(JSONData);
    }


    private_user_data = private_user_data_create (
        strdup(id->valuestring),
        propertiesList
        );
 cJSON_Delete(private_user_dataJSON);
    return private_user_data;
end:
    cJSON_Delete(private_user_dataJSON);
    return NULL;

}

