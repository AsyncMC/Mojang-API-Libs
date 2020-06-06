#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UsernamePassword.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UsernamePassword::UsernamePassword()
{
	//__init();
}

UsernamePassword::~UsernamePassword()
{
	//__cleanup();
}

void
UsernamePassword::__init()
{
	//username = std::string();
	//password = std::string();
}

void
UsernamePassword::__cleanup()
{
	//if(username != NULL) {
	//
	//delete username;
	//username = NULL;
	//}
	//if(password != NULL) {
	//
	//delete password;
	//password = NULL;
	//}
	//
}

void
UsernamePassword::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *usernameKey = "username";
	node = json_object_get_member(pJsonObject, usernameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&username, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *passwordKey = "password";
	node = json_object_get_member(pJsonObject, passwordKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&password, node, "std::string", "");
		} else {
			
		}
	}
}

UsernamePassword::UsernamePassword(char* json)
{
	this->fromJson(json);
}

char*
UsernamePassword::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getUsername();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *usernameKey = "username";
	json_object_set_member(pJsonObject, usernameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPassword();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *passwordKey = "password";
	json_object_set_member(pJsonObject, passwordKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
UsernamePassword::getUsername()
{
	return username;
}

void
UsernamePassword::setUsername(std::string  username)
{
	this->username = username;
}

std::string
UsernamePassword::getPassword()
{
	return password;
}

void
UsernamePassword::setPassword(std::string  password)
{
	this->password = password;
}


