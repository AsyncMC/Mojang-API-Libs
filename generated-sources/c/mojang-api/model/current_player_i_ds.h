/*
 * current_player_i_ds.h
 *
 * The current player, demo and legacy status of a player identified by the id
 */

#ifndef _current_player_i_ds_H_
#define _current_player_i_ds_H_

#include <string.h>
#include "cJSON.h"

typedef int bool;
#define true 1
#define false 0
typedef int bool;
#define true 1
#define false 0



typedef struct current_player_i_ds_t {
        char *id; //no enum string
        char *name; //no enum string
        bool legacy; //boolean
        bool demo; //boolean

} current_player_i_ds_t;

current_player_i_ds_t *current_player_i_ds_create(
        char *id,
        char *name,
        bool legacy,
        bool demo
);

void current_player_i_ds_free(current_player_i_ds_t *current_player_i_ds);

current_player_i_ds_t *current_player_i_ds_parseFromJSON(char *jsonString);

cJSON *current_player_i_ds_convertToJSON(current_player_i_ds_t *current_player_i_ds);

#endif /* _current_player_i_ds_H_ */

