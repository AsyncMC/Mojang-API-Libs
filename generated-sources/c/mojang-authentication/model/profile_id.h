/*
 * profile_id.h
 *
 * 
 */

#ifndef _profile_id_H_
#define _profile_id_H_

#include <string.h>
#include "cJSON.h"




typedef struct profile_id_t {
        char *id; //no enum string
        char *name; //no enum string

} profile_id_t;

profile_id_t *profile_id_create(
        char *id,
        char *name
);

void profile_id_free(profile_id_t *profile_id);

profile_id_t *profile_id_parseFromJSON(char *jsonString);

cJSON *profile_id_convertToJSON(profile_id_t *profile_id);

#endif /* _profile_id_H_ */

