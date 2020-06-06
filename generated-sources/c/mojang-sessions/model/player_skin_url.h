/*
 * player_skin_url.h
 *
 * Wraps the URL to the texture and configures the player&#39;s model
 */

#ifndef _player_skin_url_H_
#define _player_skin_url_H_

#include <string.h>
#include "cJSON.h"
#include "player_texture_url.h"




typedef struct player_skin_url_t {
        char *url; //no enum string

} player_skin_url_t;

player_skin_url_t *player_skin_url_create(
        char *url
);

void player_skin_url_free(player_skin_url_t *player_skin_url);

player_skin_url_t *player_skin_url_parseFromJSON(char *jsonString);

cJSON *player_skin_url_convertToJSON(player_skin_url_t *player_skin_url);

#endif /* _player_skin_url_H_ */

