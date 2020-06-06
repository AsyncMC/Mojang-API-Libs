#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "order_statistics_response.h"


order_statistics_response_t *order_statistics_response_create(
    long total,
    long last24h,
    double saleVelocityPerSeconds
    ) {
	order_statistics_response_t *order_statistics_response = malloc(sizeof(order_statistics_response_t));
	order_statistics_response->total = total;
	order_statistics_response->last24h = last24h;
	order_statistics_response->saleVelocityPerSeconds = saleVelocityPerSeconds;

	return order_statistics_response;
}


void order_statistics_response_free(order_statistics_response_t *order_statistics_response) {
    listEntry_t *listEntry;

	free(order_statistics_response);
}

cJSON *order_statistics_response_convertToJSON(order_statistics_response_t *order_statistics_response) {
	cJSON *item = cJSON_CreateObject();
	// order_statistics_response->total
    if(cJSON_AddNumberToObject(item, "total", order_statistics_response->total) == NULL) {
    goto fail; //Numeric
    }

	// order_statistics_response->last24h
    if(cJSON_AddNumberToObject(item, "last24h", order_statistics_response->last24h) == NULL) {
    goto fail; //Numeric
    }

	// order_statistics_response->saleVelocityPerSeconds
    if(cJSON_AddNumberToObject(item, "saleVelocityPerSeconds", order_statistics_response->saleVelocityPerSeconds) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

order_statistics_response_t *order_statistics_response_parseFromJSON(char *jsonString){

    order_statistics_response_t *order_statistics_response = NULL;
    cJSON *order_statistics_responseJSON = cJSON_Parse(jsonString);
    if(order_statistics_responseJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // order_statistics_response->total
    cJSON *total = cJSON_GetObjectItemCaseSensitive(order_statistics_responseJSON, "total");
    if(!cJSON_IsNumber(total))
    {
    goto end; //Numeric
    }

    // order_statistics_response->last24h
    cJSON *last24h = cJSON_GetObjectItemCaseSensitive(order_statistics_responseJSON, "last24h");
    if(!cJSON_IsNumber(last24h))
    {
    goto end; //Numeric
    }

    // order_statistics_response->saleVelocityPerSeconds
    cJSON *saleVelocityPerSeconds = cJSON_GetObjectItemCaseSensitive(order_statistics_responseJSON, "saleVelocityPerSeconds");
    if(!cJSON_IsNumber(saleVelocityPerSeconds))
    {
    goto end; //Numeric
    }


    order_statistics_response = order_statistics_response_create (
        total->valuedouble,
        last24h->valuedouble,
        saleVelocityPerSeconds->valuedouble
        );
 cJSON_Delete(order_statistics_responseJSON);
    return order_statistics_response;
end:
    cJSON_Delete(order_statistics_responseJSON);
    return NULL;

}

