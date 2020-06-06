/*
 * order_statistic.h
 *
 * Valid options to query the order statistics
 */

#ifndef _order_statistic_H_
#define _order_statistic_H_

#include <string.h>
#include "cJSON.h"




typedef struct order_statistic_t {

} order_statistic_t;

order_statistic_t *order_statistic_create(
);

void order_statistic_free(order_statistic_t *order_statistic);

order_statistic_t *order_statistic_parseFromJSON(char *jsonString);

cJSON *order_statistic_convertToJSON(order_statistic_t *order_statistic);

#endif /* _order_statistic_H_ */

