/*
 * refresh_response.h
 *
 * 
 */

#ifndef _refresh_response_H_
#define _refresh_response_H_

#include <string.h>
#include "cJSON.h"
#include "refresh_request.h"




typedef struct refresh_response_t {
        char *accessToken; //no enum string
        char *clientToken; //no enum string

} refresh_response_t;

refresh_response_t *refresh_response_create(
        char *accessToken,
        char *clientToken
);

void refresh_response_free(refresh_response_t *refresh_response);

refresh_response_t *refresh_response_parseFromJSON(char *jsonString);

cJSON *refresh_response_convertToJSON(refresh_response_t *refresh_response);

#endif /* _refresh_response_H_ */

