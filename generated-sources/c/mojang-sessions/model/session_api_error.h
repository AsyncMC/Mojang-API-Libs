/*
 * session_api_error.h
 *
 * An object describing giving a bit of information about the error
 */

#ifndef _session_api_error_H_
#define _session_api_error_H_

#include <string.h>
#include "cJSON.h"




typedef struct session_api_error_t {
        char *error; //no enum string
        char *path; //no enum string

} session_api_error_t;

session_api_error_t *session_api_error_create(
        char *error,
        char *path
);

void session_api_error_free(session_api_error_t *session_api_error);

session_api_error_t *session_api_error_parseFromJSON(char *jsonString);

cJSON *session_api_error_convertToJSON(session_api_error_t *session_api_error);

#endif /* _session_api_error_H_ */

