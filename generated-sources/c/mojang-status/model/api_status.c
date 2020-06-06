#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "api_status.h"


api_status_t *api_status_create(
    ) {
	api_status_t *api_status = malloc(sizeof(api_status_t));

	return api_status;
}


void api_status_free(api_status_t *api_status) {
    listEntry_t *listEntry;

	free(api_status);
}

cJSON *api_status_convertToJSON(api_status_t *api_status) {
	cJSON *item = cJSON_CreateObject();
	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

api_status_t *api_status_parseFromJSON(char *jsonString){

    api_status_t *api_status = NULL;
    cJSON *api_statusJSON = cJSON_Parse(jsonString);
    if(api_statusJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }


    api_status = api_status_create (
        );
 cJSON_Delete(api_statusJSON);
    return api_status;
end:
    cJSON_Delete(api_statusJSON);
    return NULL;

}

