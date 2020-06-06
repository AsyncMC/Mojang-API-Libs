/*
 * reduced_user_data.h
 *
 * 
 */

#ifndef _reduced_user_data_H_
#define _reduced_user_data_H_

#include <string.h>
#include "cJSON.h"
#include "game_profile_property.h"
#include "list.h"




typedef struct reduced_user_data_t {
        char *id; //no enum string
        list_t *properties; //nonprimitive container

} reduced_user_data_t;

reduced_user_data_t *reduced_user_data_create(
        char *id,
        list_t *properties
);

void reduced_user_data_free(reduced_user_data_t *reduced_user_data);

reduced_user_data_t *reduced_user_data_parseFromJSON(char *jsonString);

cJSON *reduced_user_data_convertToJSON(reduced_user_data_t *reduced_user_data);

#endif /* _reduced_user_data_H_ */

