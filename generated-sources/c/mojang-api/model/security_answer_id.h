/*
 * security_answer_id.h
 *
 * A security question answer id given by Mojang
 */

#ifndef _security_answer_id_H_
#define _security_answer_id_H_

#include <string.h>
#include "cJSON.h"




typedef struct security_answer_id_t {
        int id; //numeric

} security_answer_id_t;

security_answer_id_t *security_answer_id_create(
        int id
);

void security_answer_id_free(security_answer_id_t *security_answer_id);

security_answer_id_t *security_answer_id_parseFromJSON(char *jsonString);

cJSON *security_answer_id_convertToJSON(security_answer_id_t *security_answer_id);

#endif /* _security_answer_id_H_ */

