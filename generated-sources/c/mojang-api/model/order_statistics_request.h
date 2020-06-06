/*
 * order_statistics_request.h
 *
 * The body of the request to get the order statistics
 */

#ifndef _order_statistics_request_H_
#define _order_statistics_request_H_

#include <string.h>
#include "cJSON.h"
#include "list.h"
#include "order_statistic.h"




typedef struct order_statistics_request_t {
        list_t *metricKeys; //nonprimitive container

} order_statistics_request_t;

order_statistics_request_t *order_statistics_request_create(
        list_t *metricKeys
);

void order_statistics_request_free(order_statistics_request_t *order_statistics_request);

order_statistics_request_t *order_statistics_request_parseFromJSON(char *jsonString);

cJSON *order_statistics_request_convertToJSON(order_statistics_request_t *order_statistics_request);

#endif /* _order_statistics_request_H_ */

