#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "CurrentPlayerIDs.h"

using namespace std;
using namespace Tizen::ArtikCloud;

CurrentPlayerIDs::CurrentPlayerIDs()
{
	//__init();
}

CurrentPlayerIDs::~CurrentPlayerIDs()
{
	//__cleanup();
}

void
CurrentPlayerIDs::__init()
{
	//id = std::string();
	//name = std::string();
	//legacy = bool(false);
	//demo = bool(false);
}

void
CurrentPlayerIDs::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(legacy != NULL) {
	//
	//delete legacy;
	//legacy = NULL;
	//}
	//if(demo != NULL) {
	//
	//delete demo;
	//demo = NULL;
	//}
	//
}

void
CurrentPlayerIDs::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *legacyKey = "legacy";
	node = json_object_get_member(pJsonObject, legacyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&legacy, node, "bool", "");
		} else {
			
		}
	}
	const gchar *demoKey = "demo";
	node = json_object_get_member(pJsonObject, demoKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&demo, node, "bool", "");
		} else {
			
		}
	}
}

CurrentPlayerIDs::CurrentPlayerIDs(char* json)
{
	this->fromJson(json);
}

char*
CurrentPlayerIDs::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("bool")) {
		bool obj = getLegacy();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *legacyKey = "legacy";
	json_object_set_member(pJsonObject, legacyKey, node);
	if (isprimitive("bool")) {
		bool obj = getDemo();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *demoKey = "demo";
	json_object_set_member(pJsonObject, demoKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
CurrentPlayerIDs::getId()
{
	return id;
}

void
CurrentPlayerIDs::setId(std::string  id)
{
	this->id = id;
}

std::string
CurrentPlayerIDs::getName()
{
	return name;
}

void
CurrentPlayerIDs::setName(std::string  name)
{
	this->name = name;
}

bool
CurrentPlayerIDs::getLegacy()
{
	return legacy;
}

void
CurrentPlayerIDs::setLegacy(bool  legacy)
{
	this->legacy = legacy;
}

bool
CurrentPlayerIDs::getDemo()
{
	return demo;
}

void
CurrentPlayerIDs::setDemo(bool  demo)
{
	this->demo = demo;
}


