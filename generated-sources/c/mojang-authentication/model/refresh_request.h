/*
 * refresh_request.h
 *
 * 
 */

#ifndef _refresh_request_H_
#define _refresh_request_H_

#include <string.h>
#include "cJSON.h"
#include "access_keys.h"




typedef struct refresh_request_t {
        char *accessToken; //no enum string
        char *clientToken; //no enum string

} refresh_request_t;

refresh_request_t *refresh_request_create(
        char *accessToken,
        char *clientToken
);

void refresh_request_free(refresh_request_t *refresh_request);

refresh_request_t *refresh_request_parseFromJSON(char *jsonString);

cJSON *refresh_request_convertToJSON(refresh_request_t *refresh_request);

#endif /* _refresh_request_H_ */

