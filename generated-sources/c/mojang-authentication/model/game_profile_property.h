/*
 * game_profile_property.h
 *
 * 
 */

#ifndef _game_profile_property_H_
#define _game_profile_property_H_

#include <string.h>
#include "cJSON.h"




typedef struct game_profile_property_t {
        char *name; //no enum string
        char *value; //no enum string

} game_profile_property_t;

game_profile_property_t *game_profile_property_create(
        char *name,
        char *value
);

void game_profile_property_free(game_profile_property_t *game_profile_property);

game_profile_property_t *game_profile_property_parseFromJSON(char *jsonString);

cJSON *game_profile_property_convertToJSON(game_profile_property_t *game_profile_property);

#endif /* _game_profile_property_H_ */

