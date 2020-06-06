#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PlayerTexture.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PlayerTexture::PlayerTexture()
{
	//__init();
}

PlayerTexture::~PlayerTexture()
{
	//__cleanup();
}

void
PlayerTexture::__init()
{
	//sKIN = new PlayerSkinURL();
	//cAPE = new PlayerTextureURL();
}

void
PlayerTexture::__cleanup()
{
	//if(sKIN != NULL) {
	//
	//delete sKIN;
	//sKIN = NULL;
	//}
	//if(cAPE != NULL) {
	//
	//delete cAPE;
	//cAPE = NULL;
	//}
	//
}

void
PlayerTexture::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *sKINKey = "SKIN";
	node = json_object_get_member(pJsonObject, sKINKey);
	if (node !=NULL) {
	

		if (isprimitive("PlayerSkinURL")) {
			jsonToValue(&sKIN, node, "PlayerSkinURL", "PlayerSkinURL");
		} else {
			
			PlayerSkinURL* obj = static_cast<PlayerSkinURL*> (&sKIN);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
	const gchar *cAPEKey = "CAPE";
	node = json_object_get_member(pJsonObject, cAPEKey);
	if (node !=NULL) {
	

		if (isprimitive("PlayerTextureURL")) {
			jsonToValue(&cAPE, node, "PlayerTextureURL", "PlayerTextureURL");
		} else {
			
			PlayerTextureURL* obj = static_cast<PlayerTextureURL*> (&cAPE);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PlayerTexture::PlayerTexture(char* json)
{
	this->fromJson(json);
}

char*
PlayerTexture::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("PlayerSkinURL")) {
		PlayerSkinURL obj = getSKIN();
		node = converttoJson(&obj, "PlayerSkinURL", "");
	}
	else {
		
		PlayerSkinURL obj = static_cast<PlayerSkinURL> (getSKIN());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *sKINKey = "SKIN";
	json_object_set_member(pJsonObject, sKINKey, node);
	if (isprimitive("PlayerTextureURL")) {
		PlayerTextureURL obj = getCAPE();
		node = converttoJson(&obj, "PlayerTextureURL", "");
	}
	else {
		
		PlayerTextureURL obj = static_cast<PlayerTextureURL> (getCAPE());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *cAPEKey = "CAPE";
	json_object_set_member(pJsonObject, cAPEKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

PlayerSkinURL
PlayerTexture::getSKIN()
{
	return sKIN;
}

void
PlayerTexture::setSKIN(PlayerSkinURL  sKIN)
{
	this->sKIN = sKIN;
}

PlayerTextureURL
PlayerTexture::getCAPE()
{
	return cAPE;
}

void
PlayerTexture::setCAPE(PlayerTextureURL  cAPE)
{
	this->cAPE = cAPE;
}


