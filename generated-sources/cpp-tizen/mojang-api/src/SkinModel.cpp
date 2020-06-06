#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "SkinModel.h"

using namespace std;
using namespace Tizen::ArtikCloud;

SkinModel::SkinModel()
{
	//__init();
}

SkinModel::~SkinModel()
{
	//__cleanup();
}

void
SkinModel::__init()
{
}

void
SkinModel::__cleanup()
{
	//
}

void
SkinModel::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
}

SkinModel::SkinModel(char* json)
{
	this->fromJson(json);
}

char*
SkinModel::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}


