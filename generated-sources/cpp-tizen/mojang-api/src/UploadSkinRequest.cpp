#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "UploadSkinRequest.h"

using namespace std;
using namespace Tizen::ArtikCloud;

UploadSkinRequest::UploadSkinRequest()
{
	//__init();
}

UploadSkinRequest::~UploadSkinRequest()
{
	//__cleanup();
}

void
UploadSkinRequest::__init()
{
	//model = new SkinModel();
	//file = std::string();
}

void
UploadSkinRequest::__cleanup()
{
	//if(model != NULL) {
	//
	//delete model;
	//model = NULL;
	//}
	//if(file != NULL) {
	//
	//delete file;
	//file = NULL;
	//}
	//
}

void
UploadSkinRequest::fromJson(char* jsonStr)
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
	const gchar *fileKey = "file";
	node = json_object_get_member(pJsonObject, fileKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&file, node, "std::string", "");
		} else {
			
			std::string* obj = static_cast<std::string*> (&file);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

UploadSkinRequest::UploadSkinRequest(char* json)
{
	this->fromJson(json);
}

char*
UploadSkinRequest::toJson()
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
		std::string obj = getFile();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
		std::string obj = static_cast<std::string> (getFile());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *fileKey = "file";
	json_object_set_member(pJsonObject, fileKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

SkinModel
UploadSkinRequest::getModel()
{
	return model;
}

void
UploadSkinRequest::setModel(SkinModel  model)
{
	this->model = model;
}

std::string
UploadSkinRequest::getFile()
{
	return file;
}

void
UploadSkinRequest::setFile(std::string  file)
{
	this->file = file;
}


