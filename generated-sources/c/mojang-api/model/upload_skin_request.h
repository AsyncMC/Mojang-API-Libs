/*
 * upload_skin_request.h
 *
 * 
 */

#ifndef _upload_skin_request_H_
#define _upload_skin_request_H_

#include <string.h>
#include "cJSON.h"
#include "skin_model.h"




typedef struct upload_skin_request_t {
        skin_model_t *model; //nonprimitive

} upload_skin_request_t;

upload_skin_request_t *upload_skin_request_create(
        skin_model_t *model,
);

void upload_skin_request_free(upload_skin_request_t *upload_skin_request);

upload_skin_request_t *upload_skin_request_parseFromJSON(char *jsonString);

cJSON *upload_skin_request_convertToJSON(upload_skin_request_t *upload_skin_request);

#endif /* _upload_skin_request_H_ */

