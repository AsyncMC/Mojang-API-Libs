/*
 * authentication_request.h
 *
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 */

#ifndef _authentication_request_H_
#define _authentication_request_H_

#include <string.h>
#include "cJSON.h"
#include "username_password.h"




typedef struct authentication_request_t {
        char *username; //no enum string
        char *password; //no enum string

} authentication_request_t;

authentication_request_t *authentication_request_create(
        char *username,
        char *password
);

void authentication_request_free(authentication_request_t *authentication_request);

authentication_request_t *authentication_request_parseFromJSON(char *jsonString);

cJSON *authentication_request_convertToJSON(authentication_request_t *authentication_request);

#endif /* _authentication_request_H_ */

