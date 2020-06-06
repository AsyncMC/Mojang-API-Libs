/*
 * name_change.h
 *
 * A registered name change.
 */

#ifndef _name_change_H_
#define _name_change_H_

#include <string.h>
#include "cJSON.h"




typedef struct name_change_t {
        char *name; //no enum string
        long changedToAt; //numeric

} name_change_t;

name_change_t *name_change_create(
        char *name,
        long changedToAt
);

void name_change_free(name_change_t *name_change);

name_change_t *name_change_parseFromJSON(char *jsonString);

cJSON *name_change_convertToJSON(name_change_t *name_change);

#endif /* _name_change_H_ */

