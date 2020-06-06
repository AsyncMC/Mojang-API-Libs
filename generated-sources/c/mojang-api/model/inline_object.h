/*
 * inline_object.h
 *
 * 
 */

#ifndef _inline_object_H_
#define _inline_object_H_

#include <string.h>
#include "cJSON.h"
#include "skin_model.h"




typedef struct inline_object_t {
        skin_model_t *model; //nonprimitive

} inline_object_t;

inline_object_t *inline_object_create(
        skin_model_t *model,
);

void inline_object_free(inline_object_t *inline_object);

inline_object_t *inline_object_parseFromJSON(char *jsonString);

cJSON *inline_object_convertToJSON(inline_object_t *inline_object);

#endif /* _inline_object_H_ */

