#include <stdlib.h>
#include <string.h>
#include <stdio.h>
#include "cJSON.h"
#include "list.h"
#include "keyValuePair.h"
#include "agent.h"

char* nameagent_ToString(name_e name){
    char *nameArray[] =  { "Minecraft","Scrolls" };
    return nameArray[name];

}

name_e nameagent_FromString(char* name){
    int stringToReturn = 0;
    char *nameArray[] =  { "Minecraft","Scrolls" };
    size_t sizeofArray = sizeof(nameArray) / sizeof(nameArray[0]);
    while(stringToReturn < sizeofArray) {
        if(strcmp(name, nameArray[stringToReturn]) == 0) {
            return stringToReturn;
        }
        stringToReturn++;
    }
}

agent_t *agent_create(
    name_e name,
    int version
    ) {
	agent_t *agent = malloc(sizeof(agent_t));
	agent->name = name;
	agent->version = version;

	return agent;
}


void agent_free(agent_t *agent) {
    listEntry_t *listEntry;

	free(agent);
}

cJSON *agent_convertToJSON(agent_t *agent) {
	cJSON *item = cJSON_CreateObject();
	// agent->name
    if(cJSON_AddStringToObject(item, "name", nameagent_ToString(agent->name)) == NULL) {
    goto fail; //String
    }

	// agent->version
    if(cJSON_AddNumberToObject(item, "version", agent->version) == NULL) {
    goto fail; //Numeric
    }

	return item;
fail:
	cJSON_Delete(item);
	return NULL;
}

agent_t *agent_parseFromJSON(char *jsonString){

    agent_t *agent = NULL;
    cJSON *agentJSON = cJSON_Parse(jsonString);
    if(agentJSON == NULL){
        const char *error_ptr = cJSON_GetErrorPtr();
        if (error_ptr != NULL) {
            fprintf(stderr, "Error Before: %s\n", error_ptr);
            goto end;
        }
    }

    // agent->name
    name_e nameVariable;
    cJSON *name = cJSON_GetObjectItemCaseSensitive(agentJSON, "name");
    if(!cJSON_IsString(name) || (name->valuestring == NULL)){
    goto end; //String
    }

    nameVariable = nameagent_FromString(name->valuestring);

    // agent->version
    cJSON *version = cJSON_GetObjectItemCaseSensitive(agentJSON, "version");
    if(!cJSON_IsNumber(version))
    {
    goto end; //Numeric
    }


    agent = agent_create (
        nameVariable,
        version->valuedouble
        );
 cJSON_Delete(agentJSON);
    return agent;
end:
    cJSON_Delete(agentJSON);
    return NULL;

}

