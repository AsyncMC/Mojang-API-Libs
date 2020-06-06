/*
 * game_profile.h
 *
 * 
 */

#ifndef _game_profile_H_
#define _game_profile_H_

#include <string.h>
#include "cJSON.h"

typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0



typedef struct game_profile_t {
        char *agent; //no enum string
        char *id; //no enum string
        char *name; //no enum string
        char *userId; //no enum string
        long createdAt; //numeric
        bool legacyProfile; //boolean
        bool suspended; //boolean
        bool paid; //boolean
        bool migrated; //boolean
        bool legacy; //boolean

} game_profile_t;

game_profile_t *game_profile_create(
        char *agent,
        char *id,
        char *name,
        char *userId,
        long createdAt,
        bool legacyProfile,
        bool suspended,
        bool paid,
        bool migrated,
        bool legacy
);

void game_profile_free(game_profile_t *game_profile);

game_profile_t *game_profile_parseFromJSON(char *jsonString);

cJSON *game_profile_convertToJSON(game_profile_t *game_profile);

#endif /* _game_profile_H_ */

