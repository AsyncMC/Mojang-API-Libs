#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "order_statistics_request.h"
#include "list.h"
#include "order_statistic.h"


order_statistics_request_t *order_statistics_request_create(
    list_t *metricKeys
    ) {
	order_statistics_request_t *order_statistics_request = malloc(sizeof(order_statistics_request_t));
	order_statistics_request->metricKeys = metricKeys;

	return order_statistics_request;
}


void order_statistics_request_free(order_statistics_request_t *order_statistics_request) {
    listEntry_t *listEntry;
		list_ForEach(listEntry, order_statistics_request->metricKeys) {
		order_statistic_free(listEntry->data);
	}
	list_free(order_statistics_request->metricKeys);

	free(order_statistics_request);
}

cJSON *order_statistics_request_convertToJSON(order_statistics_request_t *order_statistics_request) {
	cJSON *item = cJSON_CreateObject();
	// order_statistics_request->metricKeys
    cJSON *metricKeys = cJSON_AddArrayToObject(item, "metricKeys");
	if(metricKeys == NULL) {
		goto fail; //nonprimitive container
	}

	listEntry_t *metricKeysListEntry;
	list_ForEach(metricKeysListEntry, order_statistics_request->metricKeys) {
		cJSON *item = order_statistic_convertToJSON(metricKeysListEntry->data);
		if(item == NULL) {
			goto fail;
		}
		cJSON_AddItemToArray(metricKeys, item);
	}

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

order_statistics_request_t *order_statistics_request_parseFromJSON(char *jsonString){

    order_statistics_request_t *order_statistics_request = NULL;
    cJSON *order_statistics_requestJSON = cJSON_Parse(jsonString);
    if(order_statistics_requestJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // order_statistics_request->metricKeys
    cJSON *metricKeys;
    cJSON *metricKeysJSON = cJSON_GetObjectItemCaseSensitive(order_statistics_requestJSON,"metricKeys");
    if(!cJSON_IsArray(metricKeysJSON)){
        goto end; //nonprimitive container
    }

    list_t *metricKeysList = list_create();

    cJSON_ArrayForEach(metricKeys,metricKeysJSON )
    {
        if(!cJSON_IsObject(metricKeys)){
            goto end;
        }
		char *JSONData = cJSON_Print(metricKeys);
        order_statistic_t *metricKeysItem = order_statistic_parseFromJSON(JSONData);

        list_addElement(metricKeysList, metricKeysItem);
        free(JSONData);
    }


    order_statistics_request = order_statistics_request_create (
        metricKeysList
        );
 cJSON_Delete(order_statistics_requestJSON);
    return order_statistics_request;
end:
    cJSON_Delete(order_statistics_requestJSON);
    return NULL;

}

