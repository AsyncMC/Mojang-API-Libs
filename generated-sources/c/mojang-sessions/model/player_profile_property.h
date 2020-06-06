/*
 * player_profile_property.h
 *
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */

#ifndef _player_profile_property_H_
#define _player_profile_property_H_

#include <string.h>
#include "cJSON.h"




typedef struct player_profile_property_t {
        char *name; //no enum string

} player_profile_property_t;

player_profile_property_t *player_profile_property_create(
        char *name,
);

void player_profile_property_free(player_profile_property_t *player_profile_property);

player_profile_property_t *player_profile_property_parseFromJSON(char *jsonString);

cJSON *player_profile_property_convertToJSON(player_profile_property_t *player_profile_property);

#endif /* _player_profile_property_H_ */

