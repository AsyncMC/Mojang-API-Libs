/*
 * error.h
 *
 * This is returned when the request fails
 */

#ifndef _error_H_
#define _error_H_

#include <string.h>
#include "cJSON.h"




typedef struct error_t {
        char *error; //no enum string
        char *errorMessage; //no enum string

} error_t;

error_t *error_create(
        char *error,
        char *errorMessage
);

void error_free(error_t *error);

error_t *error_parseFromJSON(char *jsonString);

cJSON *error_convertToJSON(error_t *error);

#endif /* _error_H_ */

