#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Agent.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Agent::Agent()
{
	//__init();
}

Agent::~Agent()
{
	//__cleanup();
}

void
Agent::__init()
{
	//name = std::string();
	//version = int(0);
}

void
Agent::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(version != NULL) {
	//
	//delete version;
	//version = NULL;
	//}
	//
}

void
Agent::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *versionKey = "version";
	node = json_object_get_member(pJsonObject, versionKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&version, node, "int", "");
		} else {
			
		}
	}
}

Agent::Agent(char* json)
{
	this->fromJson(json);
}

char*
Agent::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("int")) {
		int obj = getVersion();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *versionKey = "version";
	json_object_set_member(pJsonObject, versionKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Agent::getName()
{
	return name;
}

void
Agent::setName(std::string  name)
{
	this->name = name;
}

int
Agent::getVersion()
{
	return version;
}

void
Agent::setVersion(int  version)
{
	this->version = version;
}


