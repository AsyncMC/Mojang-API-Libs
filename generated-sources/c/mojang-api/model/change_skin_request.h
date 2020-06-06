/*
 * change_skin_request.h
 *
 * Request Mojang to download a skin from an URL and apply to the player
 */

#ifndef _change_skin_request_H_
#define _change_skin_request_H_

#include <string.h>
#include "cJSON.h"
#include "skin_model.h"




typedef struct change_skin_request_t {
        skin_model_t *model; //nonprimitive
        char *url; //no enum string

} change_skin_request_t;

change_skin_request_t *change_skin_request_create(
        skin_model_t *model,
        char *url
);

void change_skin_request_free(change_skin_request_t *change_skin_request);

change_skin_request_t *change_skin_request_parseFromJSON(char *jsonString);

cJSON *change_skin_request_convertToJSON(change_skin_request_t *change_skin_request);

#endif /* _change_skin_request_H_ */

