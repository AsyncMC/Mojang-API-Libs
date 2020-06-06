/*
 * player_profile.h
 *
 * 
 */

#ifndef _player_profile_H_
#define _player_profile_H_

#include <string.h>
#include "cJSON.h"
#include "list.h"
#include "player_profile_property.h"

typedef int bool;
#define true 1
#define false 0



typedef struct player_profile_t {
        char *id; //no enum string
        char *name; //no enum string
        bool legacy; //boolean
        list_t *properties; //nonprimitive container

} player_profile_t;

player_profile_t *player_profile_create(
        char *id,
        char *name,
        bool legacy,
        list_t *properties
);

void player_profile_free(player_profile_t *player_profile);

player_profile_t *player_profile_parseFromJSON(char *jsonString);

cJSON *player_profile_convertToJSON(player_profile_t *player_profile);

#endif /* _player_profile_H_ */

