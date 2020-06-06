/*
 * skin_model.h
 *
 * Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
 */

#ifndef _skin_model_H_
#define _skin_model_H_

#include <string.h>
#include "cJSON.h"




typedef struct skin_model_t {

} skin_model_t;

skin_model_t *skin_model_create(
);

void skin_model_free(skin_model_t *skin_model);

skin_model_t *skin_model_parseFromJSON(char *jsonString);

cJSON *skin_model_convertToJSON(skin_model_t *skin_model);

#endif /* _skin_model_H_ */

