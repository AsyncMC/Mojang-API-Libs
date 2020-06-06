#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "reduced_user_data.h"
#include "game_profile_property.h"
#include "list.h"


reduced_user_data_t *reduced_user_data_create(
    list_t *properties
    ) {
	reduced_user_data_t *reduced_user_data = malloc(sizeof(reduced_user_data_t));
	reduced_user_data->id = id;
	reduced_user_data->properties = properties;

	return reduced_user_data;
}


void reduced_user_data_free(reduced_user_data_t *reduced_user_data) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, reduced_user_data->properties) {
		game_profile_property_free(listEntry->data);
	}
	list_free(reduced_user_data->properties);

	free(reduced_user_data);
}

cJSON *reduced_user_data_convertToJSON(reduced_user_data_t *reduced_user_data) {
	cJSON *item = cJSON_CreateObject();
	// reduced_user_data->id

	// reduced_user_data->properties
    cJSON *properties = cJSON_AddArrayToObject(item, "properties");
	if(properties == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *propertiesListEntry;
	list_ForEach(propertiesListEntry, reduced_user_data->properties) {
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

reduced_user_data_t *reduced_user_data_parseFromJSON(char *jsonString){

    reduced_user_data_t *reduced_user_data = NULL;
    cJSON *reduced_user_dataJSON = cJSON_Parse(jsonString);
    if(reduced_user_dataJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // reduced_user_data->id

    // reduced_user_data->properties
    cJSON *properties;
    cJSON *propertiesJSON = cJSON_GetObjectItemCaseSensitive(reduced_user_dataJSON,"properties");
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


    reduced_user_data = reduced_user_data_create (
        propertiesList
        );
 cJSON_Delete(reduced_user_dataJSON);
    return reduced_user_data;
end:
    cJSON_Delete(reduced_user_dataJSON);
    return NULL;

}

