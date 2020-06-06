/*
 * security_challenge.h
 *
 * Binds a question to an answer id, the answer must respect the answer id.
 */

#ifndef _security_challenge_H_
#define _security_challenge_H_

#include <string.h>
#include "cJSON.h"
#include "security_answer_id.h"
#include "security_question.h"




typedef struct security_challenge_t {
        security_question_t *question; //nonprimitive
        security_answer_id_t *answer; //nonprimitive

} security_challenge_t;

security_challenge_t *security_challenge_create(
        security_question_t *question,
        security_answer_id_t *answer
);

void security_challenge_free(security_challenge_t *security_challenge);

security_challenge_t *security_challenge_parseFromJSON(char *jsonString);

cJSON *security_challenge_convertToJSON(security_challenge_t *security_challenge);

#endif /* _security_challenge_H_ */

