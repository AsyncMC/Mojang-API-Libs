/*
 * security_question.h
 *
 * A security question requested by Mojang
 */

#ifndef _security_question_H_
#define _security_question_H_

#include <string.h>
#include "cJSON.h"




typedef struct security_question_t {
        int id; //numeric
        char *question; //no enum string

} security_question_t;

security_question_t *security_question_create(
        int id,
        char *question
);

void security_question_free(security_question_t *security_question);

security_question_t *security_question_parseFromJSON(char *jsonString);

cJSON *security_question_convertToJSON(security_question_t *security_question);

#endif /* _security_question_H_ */

