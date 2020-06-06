#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ReducedUserData.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ReducedUserData::ReducedUserData()
{
	//__init();
}

ReducedUserData::~ReducedUserData()
{
	//__cleanup();
}

void
ReducedUserData::__init()
{
	//id = std::string();
	//new std::list()std::list> properties;
}

void
ReducedUserData::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(properties != NULL) {
	//properties.RemoveAll(true);
	//delete properties;
	//properties = NULL;
	//}
	//
}

void
ReducedUserData::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&id);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *propertiesKey = "properties";
	node = json_object_get_member(pJsonObject, propertiesKey);
	if (node !=NULL) {
	
		{
			JsonArray* arr = json_node_get_array(node);
			JsonNode*  temp_json;
			list<GameProfileProperty> new_list;
			GameProfileProperty inst;
			for (guint i=0;i<json_array_get_length(arr);i++) {
				temp_json = json_array_get_element(arr,i);
				if (isprimitive("GameProfileProperty")) {
					jsonToValue(&inst, temp_json, "GameProfileProperty", "");
				} else {
					
					inst.fromJson(json_to_string(temp_json, false));
					
				}
				new_list.push_back(inst);
			}
			properties = new_list;
		}
		
	}
}

ReducedUserData::ReducedUserData(char* json)
{
	this->fromJson(json);
}

char*
ReducedUserData::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getId());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("GameProfileProperty")) {
		list<GameProfileProperty> new_list = static_cast<list <GameProfileProperty> > (getProperties());
		node = converttoJson(&new_list, "GameProfileProperty", "array");
	} else {
		node = json_node_alloc();
		list<GameProfileProperty> new_list = static_cast<list <GameProfileProperty> > (getProperties());
		JsonArray* json_array = json_array_new();
		GError *mygerror;
		
		for (list<GameProfileProperty>::iterator it = new_list.begin(); it != new_list.end(); it++) {
			mygerror = NULL;
			GameProfileProperty obj = *it;
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
ReducedUserData::getId()
{
	return id;
}

void
ReducedUserData::setId(std::string  id)
{
	this->id = id;
}

std::list<GameProfileProperty>
ReducedUserData::getProperties()
{
	return properties;
}

void
ReducedUserData::setProperties(std::list <GameProfileProperty> properties)
{
	this->properties = properties;
}


