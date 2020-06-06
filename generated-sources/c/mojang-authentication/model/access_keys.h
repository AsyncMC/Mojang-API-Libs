/*
 * access_keys.h
 *
 * 
 */

#ifndef _access_keys_H_
#define _access_keys_H_

#include <string.h>
#include "cJSON.h"




typedef struct access_keys_t {
        char *accessToken; //no enum string
        char *clientToken; //no enum string

} access_keys_t;

access_keys_t *access_keys_create(
        char *accessToken,
        char *clientToken
);

void access_keys_free(access_keys_t *access_keys);

access_keys_t *access_keys_parseFromJSON(char *jsonString);

cJSON *access_keys_convertToJSON(access_keys_t *access_keys);

#endif /* _access_keys_H_ */

