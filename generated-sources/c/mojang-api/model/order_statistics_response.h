/*
 * order_statistics_response.h
 *
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 */

#ifndef _order_statistics_response_H_
#define _order_statistics_response_H_

#include <string.h>
#include "cJSON.h"




typedef struct order_statistics_response_t {
        long total; //numeric
        long last24h; //numeric
        double saleVelocityPerSeconds; //numeric

} order_statistics_response_t;

order_statistics_response_t *order_statistics_response_create(
        long total,
        long last24h,
        double saleVelocityPerSeconds
);

void order_statistics_response_free(order_statistics_response_t *order_statistics_response);

order_statistics_response_t *order_statistics_response_parseFromJSON(char *jsonString);

cJSON *order_statistics_response_convertToJSON(order_statistics_response_t *order_statistics_response);

#endif /* _order_statistics_response_H_ */

