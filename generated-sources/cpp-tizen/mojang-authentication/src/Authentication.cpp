#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "Authentication.h"

using namespace std;
using namespace Tizen::ArtikCloud;

Authentication::Authentication()
{
	//__init();
}

Authentication::~Authentication()
{
	//__cleanup();
}

void
Authentication::__init()
{
	//accessToken = std::string();
	//clientToken = std::string();
}

void
Authentication::__cleanup()
{
	//if(accessToken != NULL) {
	//
	//delete accessToken;
	//accessToken = NULL;
	//}
	//if(clientToken != NULL) {
	//
	//delete clientToken;
	//clientToken = NULL;
	//}
	//
}

void
Authentication::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *accessTokenKey = "accessToken";
	node = json_object_get_member(pJsonObject, accessTokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&accessToken, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *clientTokenKey = "clientToken";
	node = json_object_get_member(pJsonObject, clientTokenKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&clientToken, node, "std::string", "");
		} else {
			
		}
	}
}

Authentication::Authentication(char* json)
{
	this->fromJson(json);
}

char*
Authentication::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAccessToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *accessTokenKey = "accessToken";
	json_object_set_member(pJsonObject, accessTokenKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getClientToken();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *clientTokenKey = "clientToken";
	json_object_set_member(pJsonObject, clientTokenKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
Authentication::getAccessToken()
{
	return accessToken;
}

void
Authentication::setAccessToken(std::string  accessToken)
{
	this->accessToken = accessToken;
}

std::string
Authentication::getClientToken()
{
	return clientToken;
}

void
Authentication::setClientToken(std::string  clientToken)
{
	this->clientToken = clientToken;
}


