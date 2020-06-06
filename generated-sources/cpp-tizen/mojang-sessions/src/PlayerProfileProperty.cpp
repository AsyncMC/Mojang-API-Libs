#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PlayerProfileProperty.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PlayerProfileProperty::PlayerProfileProperty()
{
	//__init();
}

PlayerProfileProperty::~PlayerProfileProperty()
{
	//__cleanup();
}

void
PlayerProfileProperty::__init()
{
	//name = std::string();
	//value = std::string();
	//signature = std::string();
}

void
PlayerProfileProperty::__cleanup()
{
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(value != NULL) {
	//
	//delete value;
	//value = NULL;
	//}
	//if(signature != NULL) {
	//
	//delete signature;
	//signature = NULL;
	//}
	//
}

void
PlayerProfileProperty::fromJson(char* jsonStr)
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
	const gchar *valueKey = "value";
	node = json_object_get_member(pJsonObject, valueKey);
	if (node !=NULL) {
	

		if (isprimitive("ByteArray")) {
			jsonToValue(&value, node, "ByteArray", "ByteArray");
		} else {
			
			ByteArray* obj = static_cast<ByteArray*> (&value);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *signatureKey = "signature";
	node = json_object_get_member(pJsonObject, signatureKey);
	if (node !=NULL) {
	

		if (isprimitive("ByteArray")) {
			jsonToValue(&signature, node, "ByteArray", "ByteArray");
		} else {
			
			ByteArray* obj = static_cast<ByteArray*> (&signature);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PlayerProfileProperty::PlayerProfileProperty(char* json)
{
	this->fromJson(json);
}

char*
PlayerProfileProperty::toJson()
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
	if (isprimitive("ByteArray")) {
		ByteArray obj = getValue();
		node = converttoJson(&obj, "ByteArray", "");
	}
	else {
		
		ByteArray obj = static_cast<ByteArray> (getValue());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *valueKey = "value";
	json_object_set_member(pJsonObject, valueKey, node);
	if (isprimitive("ByteArray")) {
		ByteArray obj = getSignature();
		node = converttoJson(&obj, "ByteArray", "");
	}
	else {
		
		ByteArray obj = static_cast<ByteArray> (getSignature());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *signatureKey = "signature";
	json_object_set_member(pJsonObject, signatureKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
PlayerProfileProperty::getName()
{
	return name;
}

void
PlayerProfileProperty::setName(std::string  name)
{
	this->name = name;
}

ByteArray
PlayerProfileProperty::getValue()
{
	return value;
}

void
PlayerProfileProperty::setValue(ByteArray  value)
{
	this->value = value;
}

ByteArray
PlayerProfileProperty::getSignature()
{
	return signature;
}

void
PlayerProfileProperty::setSignature(ByteArray  signature)
{
	this->signature = signature;
}


