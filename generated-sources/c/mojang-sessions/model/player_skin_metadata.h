/*
 * player_skin_metadata.h
 *
 * Contains details about the skin
 */

#ifndef _player_skin_metadata_H_
#define _player_skin_metadata_H_

#include <string.h>
#include "cJSON.h"


typedef enum  {  slim } model_e;

char* modelplayer_skin_metadata_ToString(model_e model);

model_e modelplayer_skin_metadata_FromString(char* model);

typedef struct player_skin_metadata_t {
        model_e model; //enum string

} player_skin_metadata_t;

player_skin_metadata_t *player_skin_metadata_create(
        model_e model
);

void player_skin_metadata_free(player_skin_metadata_t *player_skin_metadata);

player_skin_metadata_t *player_skin_metadata_parseFromJSON(char *jsonString);

cJSON *player_skin_metadata_convertToJSON(player_skin_metadata_t *player_skin_metadata);

#endif /* _player_skin_metadata_H_ */

