/*
 * player_profile_texture_property_value.h
 *
 * This is obtained by decoding the \&quot;textures\&quot; property
 */

#ifndef _player_profile_texture_property_value_H_
#define _player_profile_texture_property_value_H_

#include <string.h>
#include "cJSON.h"
#include "player_texture.h"

typedef int bool;
#define true 1
#define false 0



typedef struct player_profile_texture_property_value_t {
        long timestamp; //numeric
        char *profileId; //no enum string
        char *profileName; //no enum string
        bool signatureRequired; //boolean
        player_texture_t *textures; //nonprimitive

} player_profile_texture_property_value_t;

player_profile_texture_property_value_t *player_profile_texture_property_value_create(
        long timestamp,
        char *profileId,
        char *profileName,
        bool signatureRequired,
        player_texture_t *textures
);

void player_profile_texture_property_value_free(player_profile_texture_property_value_t *player_profile_texture_property_value);

player_profile_texture_property_value_t *player_profile_texture_property_value_parseFromJSON(char *jsonString);

cJSON *player_profile_texture_property_value_convertToJSON(player_profile_texture_property_value_t *player_profile_texture_property_value);

#endif /* _player_profile_texture_property_value_H_ */

