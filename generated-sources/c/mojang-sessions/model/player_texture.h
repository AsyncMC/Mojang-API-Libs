/*
 * player_texture.h
 *
 * Provide links to the player&#39;s skin and cape
 */

#ifndef _player_texture_H_
#define _player_texture_H_

#include <string.h>
#include "cJSON.h"
#include "player_skin_url.h"
#include "player_texture_url.h"




typedef struct player_texture_t {
        player_skin_url_t *SKIN; //nonprimitive
        player_texture_url_t *CAPE; //nonprimitive

} player_texture_t;

player_texture_t *player_texture_create(
        player_skin_url_t *SKIN,
        player_texture_url_t *CAPE
);

void player_texture_free(player_texture_t *player_texture);

player_texture_t *player_texture_parseFromJSON(char *jsonString);

cJSON *player_texture_convertToJSON(player_texture_t *player_texture);

#endif /* _player_texture_H_ */

