#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "ChangeSkinRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

ChangeSkinRequest::ChangeSkinRequest()
{
	//__init();
}

ChangeSkinRequest::~ChangeSkinRequest()
{
	//__cleanup();
}

void
ChangeSkinRequest::__init()
{
	//model = new SkinModel();
	//url = std::string();
}

void
ChangeSkinRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(url != NULL) {
	//
	//delete url;
	//url = NULL;
	//}
	//
}

void
ChangeSkinRequest::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *modelKey = "model";
	node = json_object_get_member(pJsonObject, modelKey);
	if (node !=NULL) {
	

		if (isprimitive("SkinModel")) {
			jsonToValue(&model, node, "SkinModel", "SkinModel");
		} else {
			
			SkinModel* obj = static_cast<SkinModel*> (&model);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *urlKey = "url";
	node = json_object_get_member(pJsonObject, urlKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&url, node, "std::string", "");
		} else {
			
		}
	}
}

ChangeSkinRequest::ChangeSkinRequest(char* json)
{
	this->fromJson(json);
}

char*
ChangeSkinRequest::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("SkinModel")) {
		SkinModel obj = getModel();
		node = converttoJson(&obj, "SkinModel", "");
	}
	else {
		
		SkinModel obj = static_cast<SkinModel> (getModel());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *modelKey = "model";
	json_object_set_member(pJsonObject, modelKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUrl();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *urlKey = "url";
	json_object_set_member(pJsonObject, urlKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

SkinModel
ChangeSkinRequest::getModel()
{
	return model;
}

void
ChangeSkinRequest::setModel(SkinModel  model)
{
	this->model = model;
}

std::string
ChangeSkinRequest::getUrl()
{
	return url;
}

void
ChangeSkinRequest::setUrl(std::string  url)
{
	this->url = url;
}


