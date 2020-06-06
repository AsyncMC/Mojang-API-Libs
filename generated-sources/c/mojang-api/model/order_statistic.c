#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "order_statistic.h"


order_statistic_t *order_statistic_create(
    ) {
	order_statistic_t *order_statistic = malloc(sizeof(order_statistic_t));

	return order_statistic;
}


void order_statistic_free(order_statistic_t *order_statistic) {
    listEntry_t *listEntry;

	free(order_statistic);
}

cJSON *order_statistic_convertToJSON(order_statistic_t *order_statistic) {
	cJSON *item = cJSON_CreateObject();
	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

order_statistic_t *order_statistic_parseFromJSON(char *jsonString){

    order_statistic_t *order_statistic = NULL;
    cJSON *order_statisticJSON = cJSON_Parse(jsonString);
    if(order_statisticJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }


    order_statistic = order_statistic_create (
        );
 cJSON_Delete(order_statisticJSON);
    return order_statistic;
end:
    cJSON_Delete(order_statisticJSON);
    return NULL;

}

