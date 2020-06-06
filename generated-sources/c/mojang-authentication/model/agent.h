/*
 * agent.h
 *
 * Identifies the software doing the request
 */

#ifndef _agent_H_
#define _agent_H_

#include <string.h>
#include "cJSON.h"


typedef enum  {  Minecraft, Scrolls } name_e;

char* nameagent_ToString(name_e name);

name_e nameagent_FromString(char* name);

typedef struct agent_t {
        name_e name; //enum string
        int version; //numeric

} agent_t;

agent_t *agent_create(
        name_e name,
        int version
);

void agent_free(agent_t *agent);

agent_t *agent_parseFromJSON(char *jsonString);

cJSON *agent_convertToJSON(agent_t *agent);

#endif /* _agent_H_ */

