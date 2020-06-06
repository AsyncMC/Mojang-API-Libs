/*
 * username_password.h
 *
 * 
 */

#ifndef _username_password_H_
#define _username_password_H_

#include <string.h>
#include "cJSON.h"




typedef struct username_password_t {
        char *username; //no enum string
        char *password; //no enum string

} username_password_t;

username_password_t *username_password_create(
        char *username,
        char *password
);

void username_password_free(username_password_t *username_password);

username_password_t *username_password_parseFromJSON(char *jsonString);

cJSON *username_password_convertToJSON(username_password_t *username_password);

#endif /* _username_password_H_ */

