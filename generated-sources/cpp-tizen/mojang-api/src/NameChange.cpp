#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "NameChange.h"

using namespace std;
using namespace Tizen::ArtikCloud;

NameChange::NameChange()
{
	//__init();
}

NameChange::~NameChange()
{
	//__cleanup();
}

void
NameChange::__init()
{
	//name = std::string();
	//changedToAt = long(0);
}

void
NameChange::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(changedToAt != NULL) {
	//
	//delete changedToAt;
	//changedToAt = NULL;
	//}
	//
}

void
NameChange::fromJson(char* jsonStr)
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
	const gchar *changedToAtKey = "changedToAt";
	node = json_object_get_member(pJsonObject, changedToAtKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&changedToAt, node, "long long", "");
		} else {
			
		}
	}
}

NameChange::NameChange(char* json)
{
	this->fromJson(json);
}

char*
NameChange::toJson()
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
	if (isprimitive("long long")) {
		long long obj = getChangedToAt();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *changedToAtKey = "changedToAt";
	json_object_set_member(pJsonObject, changedToAtKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
NameChange::getName()
{
	return name;
}

void
NameChange::setName(std::string  name)
{
	this->name = name;
}

long long
NameChange::getChangedToAt()
{
	return changedToAt;
}

void
NameChange::setChangedToAt(long long  changedToAt)
{
	this->changedToAt = changedToAt;
}


