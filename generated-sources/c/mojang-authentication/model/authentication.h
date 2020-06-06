/*
 * authentication.h
 *
 * 
 */

#ifndef _authentication_H_
#define _authentication_H_

#include <string.h>
#include "cJSON.h"
#include "access_keys.h"




typedef struct authentication_t {
        char *accessToken; //no enum string
        char *clientToken; //no enum string

} authentication_t;

authentication_t *authentication_create(
        char *accessToken,
        char *clientToken
);

void authentication_free(authentication_t *authentication);

authentication_t *authentication_parseFromJSON(char *jsonString);

cJSON *authentication_convertToJSON(authentication_t *authentication);

#endif /* _authentication_H_ */

