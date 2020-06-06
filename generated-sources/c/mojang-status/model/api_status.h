/*
 * api_status.h
 *
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 */

#ifndef _api_status_H_
#define _api_status_H_

#include <string.h>
#include "cJSON.h"




typedef struct api_status_t {

} api_status_t;

api_status_t *api_status_create(
);

void api_status_free(api_status_t *api_status);

api_status_t *api_status_parseFromJSON(char *jsonString);

cJSON *api_status_convertToJSON(api_status_t *api_status);

#endif /* _api_status_H_ */

