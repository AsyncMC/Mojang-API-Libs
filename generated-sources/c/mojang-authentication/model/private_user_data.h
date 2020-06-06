/*
 * private_user_data.h
 *
 * 
 */

#ifndef _private_user_data_H_
#define _private_user_data_H_

#include <string.h>
#include "cJSON.h"
#include "game_profile_property.h"
#include "list.h"
#include "reduced_user_data.h"




typedef struct private_user_data_t {
        char *id; //no enum string
        list_t *properties; //nonprimitive container

} private_user_data_t;

private_user_data_t *private_user_data_create(
        char *id,
        list_t *properties
);

void private_user_data_free(private_user_data_t *private_user_data);

private_user_data_t *private_user_data_parseFromJSON(char *jsonString);

cJSON *private_user_data_convertToJSON(private_user_data_t *private_user_data);

#endif /* _private_user_data_H_ */

