/*
 * player_texture_url.h
 *
 * Wraps the URL to the texture
 */

#ifndef _player_texture_url_H_
#define _player_texture_url_H_

#include <string.h>
#include "cJSON.h"




typedef struct player_texture_url_t {
        char *url; //no enum string

} player_texture_url_t;

player_texture_url_t *player_texture_url_create(
        char *url
);

void player_texture_url_free(player_texture_url_t *player_texture_url);

player_texture_url_t *player_texture_url_parseFromJSON(char *jsonString);

cJSON *player_texture_url_convertToJSON(player_texture_url_t *player_texture_url);

#endif /* _player_texture_url_H_ */

