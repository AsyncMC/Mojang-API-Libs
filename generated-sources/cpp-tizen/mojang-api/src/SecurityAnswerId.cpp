#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SecurityAnswerId.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SecurityAnswerId::SecurityAnswerId()
{
	//__init();
}

SecurityAnswerId::~SecurityAnswerId()
{
	//__cleanup();
}

void
SecurityAnswerId::__init()
{
	//id = int(0);
}

void
SecurityAnswerId::__cleanup()
{
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//
}

void
SecurityAnswerId::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("int")) {
			jsonToValue(&id, node, "int", "");
		} else {
			
		}
	}
}

SecurityAnswerId::SecurityAnswerId(char* json)
{
	this->fromJson(json);
}

char*
SecurityAnswerId::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("int")) {
		int obj = getId();
		node = converttoJson(&obj, "int", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

int
SecurityAnswerId::getId()
{
	return id;
}

void
SecurityAnswerId::setId(int  id)
{
	this->id = id;
}


