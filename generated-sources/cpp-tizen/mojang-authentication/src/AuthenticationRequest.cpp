#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "AuthenticationRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

AuthenticationRequest::AuthenticationRequest()
{
	//__init();
}

AuthenticationRequest::~AuthenticationRequest()
{
	//__cleanup();
}

void
AuthenticationRequest::__init()
{
	//username = std::string();
	//password = std::string();
}

void
AuthenticationRequest::__cleanup()
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
AuthenticationRequest::fromJson(char* jsonStr)
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

AuthenticationRequest::AuthenticationRequest(char* json)
{
	this->fromJson(json);
}

char*
AuthenticationRequest::toJson()
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
AuthenticationRequest::getUsername()
{
	return username;
}

void
AuthenticationRequest::setUsername(std::string  username)
{
	this->username = username;
}

std::string
AuthenticationRequest::getPassword()
{
	return password;
}

void
AuthenticationRequest::setPassword(std::string  password)
{
	this->password = password;
}


