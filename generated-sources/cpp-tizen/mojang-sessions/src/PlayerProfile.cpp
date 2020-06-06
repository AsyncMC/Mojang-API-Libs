#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PlayerProfile.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PlayerProfile::PlayerProfile()
{
	//__init();
}

PlayerProfile::~PlayerProfile()
{
	//__cleanup();
}

void
PlayerProfile::__init()
{
	//id = std::string();
	//name = std::string();
	//legacy = bool(false);
	//new std::list()std::list> properties;
}

void
PlayerProfile::__cleanup()
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
	//if(properties != NULL) {
	//properties.RemoveAll(true);
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
PlayerProfile::fromJson(char* jsonStr)
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
	const gchar *propertiesKey = "properties";
	node = json_object_get_member(pJsonObject, propertiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<PlayerProfileProperty> new_list;
			PlayerProfileProperty inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("PlayerProfileProperty")) {
					jsonToValue(&inst, temp_json, "PlayerProfileProperty", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			properties = new_list;
		}
		
	}
}

PlayerProfile::PlayerProfile(char* json)
{
	this->fromJson(json);
}

char*
PlayerProfile::toJson()
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
	if (isprimitive("PlayerProfileProperty")) {
		list<PlayerProfileProperty> new_list = static_cast<list <PlayerProfileProperty> > (getProperties());
		node = converttoJson(&new_list, "PlayerProfileProperty", "array");
	} else {
		node = json_node_alloc();
		list<PlayerProfileProperty> new_list = static_cast<list <PlayerProfileProperty> > (getProperties());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<PlayerProfileProperty>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			PlayerProfileProperty obj = *it;
			JsonNode *node_temp = json_from_string(obj.toJson(), &mygerror);
			json_array_add_element(json_array, node_temp);
			g_clear_error(&mygerror);
		}
		json_node_init_array(node, json_array);
		json_array_unref(json_array);
		
	}


	
	const gchar *propertiesKey = "properties";
	json_object_set_member(pJsonObject, propertiesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PlayerProfile::getId()
{
	return id;
}

void
PlayerProfile::setId(std::string  id)
{
	this->id = id;
}

std::string
PlayerProfile::getName()
{
	return name;
}

void
PlayerProfile::setName(std::string  name)
{
	this->name = name;
}

bool
PlayerProfile::getLegacy()
{
	return legacy;
}

void
PlayerProfile::setLegacy(bool  legacy)
{
	this->legacy = legacy;
}

std::list<PlayerProfileProperty>
PlayerProfile::getProperties()
{
	return properties;
}

void
PlayerProfile::setProperties(std::list <PlayerProfileProperty> properties)
{
	this->properties = properties;
}


