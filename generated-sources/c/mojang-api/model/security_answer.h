/*
 * security_answer.h
 *
 * A security question answer given by the player using the id given by Mojang
 */

#ifndef _security_answer_H_
#define _security_answer_H_

#include <string.h>
#include "cJSON.h"
#include "security_answer_id.h"




typedef struct security_answer_t {
        int id; //numeric

} security_answer_t;

security_answer_t *security_answer_create(
        int id
);

void security_answer_free(security_answer_t *security_answer);

security_answer_t *security_answer_parseFromJSON(char *jsonString);

cJSON *security_answer_convertToJSON(security_answer_t *security_answer);

#endif /* _security_answer_H_ */

