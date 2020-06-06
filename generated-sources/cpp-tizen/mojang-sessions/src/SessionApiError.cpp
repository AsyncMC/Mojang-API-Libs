#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SessionApiError.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SessionApiError::SessionApiError()
{
	//__init();
}

SessionApiError::~SessionApiError()
{
	//__cleanup();
}

void
SessionApiError::__init()
{
	//error = std::string();
	//path = std::string();
}

void
SessionApiError::__cleanup()
{
	//if(error != NULL) {
	//
	//delete error;
	//error = NULL;
	//}
	//if(path != NULL) {
	//
	//delete path;
	//path = NULL;
	//}
	//
}

void
SessionApiError::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *errorKey = "error";
	node = json_object_get_member(pJsonObject, errorKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&error, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *pathKey = "path";
	node = json_object_get_member(pJsonObject, pathKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&path, node, "std::string", "");
		} else {
			
		}
	}
}

SessionApiError::SessionApiError(char* json)
{
	this->fromJson(json);
}

char*
SessionApiError::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getError();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *errorKey = "error";
	json_object_set_member(pJsonObject, errorKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getPath();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *pathKey = "path";
	json_object_set_member(pJsonObject, pathKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
SessionApiError::getError()
{
	return error;
}

void
SessionApiError::setError(std::string  error)
{
	this->error = error;
}

std::string
SessionApiError::getPath()
{
	return path;
}

void
SessionApiError::setPath(std::string  path)
{
	this->path = path;
}


