/*
 * inline_object_1.h
 *
 * Request Mojang to download a skin from an URL and apply to the player
 */

#ifndef _inline_object_1_H_
#define _inline_object_1_H_

#include <string.h>
#include "cJSON.h"
#include "skin_model.h"




typedef struct inline_object_1_t {
        skin_model_t *model; //nonprimitive
        char *url; //no enum string

} inline_object_1_t;

inline_object_1_t *inline_object_1_create(
        skin_model_t *model,
        char *url
);

void inline_object_1_free(inline_object_1_t *inline_object_1);

inline_object_1_t *inline_object_1_parseFromJSON(char *jsonString);

cJSON *inline_object_1_convertToJSON(inline_object_1_t *inline_object_1);

#endif /* _inline_object_1_H_ */

