#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "PlayerProfileTexturePropertyValue.h"

using namespace std;
using namespace Tizen::ArtikCloud;

PlayerProfileTexturePropertyValue::PlayerProfileTexturePropertyValue()
{
	//__init();
}

PlayerProfileTexturePropertyValue::~PlayerProfileTexturePropertyValue()
{
	//__cleanup();
}

void
PlayerProfileTexturePropertyValue::__init()
{
	//timestamp = long(0);
	//profileId = std::string();
	//profileName = std::string();
	//signatureRequired = bool(false);
	//textures = new PlayerTexture();
}

void
PlayerProfileTexturePropertyValue::__cleanup()
{
	//if(timestamp != NULL) {
	//
	//delete timestamp;
	//timestamp = NULL;
	//}
	//if(profileId != NULL) {
	//
	//delete profileId;
	//profileId = NULL;
	//}
	//if(profileName != NULL) {
	//
	//delete profileName;
	//profileName = NULL;
	//}
	//if(signatureRequired != NULL) {
	//
	//delete signatureRequired;
	//signatureRequired = NULL;
	//}
	//if(textures != NULL) {
	//
	//delete textures;
	//textures = NULL;
	//}
	//
}

void
PlayerProfileTexturePropertyValue::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *timestampKey = "timestamp";
	node = json_object_get_member(pJsonObject, timestampKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&timestamp, node, "long long", "");
		} else {
			
		}
	}
	const gchar *profileIdKey = "profileId";
	node = json_object_get_member(pJsonObject, profileIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&profileId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *profileNameKey = "profileName";
	node = json_object_get_member(pJsonObject, profileNameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&profileName, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *signatureRequiredKey = "signatureRequired";
	node = json_object_get_member(pJsonObject, signatureRequiredKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&signatureRequired, node, "bool", "");
		} else {
			
		}
	}
	const gchar *texturesKey = "textures";
	node = json_object_get_member(pJsonObject, texturesKey);
	if (node !=NULL) {
	

		if (isprimitive("PlayerTexture")) {
			jsonToValue(&textures, node, "PlayerTexture", "PlayerTexture");
		} else {
			
			PlayerTexture* obj = static_cast<PlayerTexture*> (&textures);
			obj->fromJson(json_to_string(node, false));
			
		}
	}
}

PlayerProfileTexturePropertyValue::PlayerProfileTexturePropertyValue(char* json)
{
	this->fromJson(json);
}

char*
PlayerProfileTexturePropertyValue::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("long long")) {
		long long obj = getTimestamp();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *timestampKey = "timestamp";
	json_object_set_member(pJsonObject, timestampKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProfileId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *profileIdKey = "profileId";
	json_object_set_member(pJsonObject, profileIdKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getProfileName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *profileNameKey = "profileName";
	json_object_set_member(pJsonObject, profileNameKey, node);
	if (isprimitive("bool")) {
		bool obj = getSignatureRequired();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *signatureRequiredKey = "signatureRequired";
	json_object_set_member(pJsonObject, signatureRequiredKey, node);
	if (isprimitive("PlayerTexture")) {
		PlayerTexture obj = getTextures();
		node = converttoJson(&obj, "PlayerTexture", "");
	}
	else {
		
		PlayerTexture obj = static_cast<PlayerTexture> (getTextures());
		GError *mygerror;
		mygerror = NULL;
		node = json_from_string(obj.toJson(), &mygerror);
		
	}
	const gchar *texturesKey = "textures";
	json_object_set_member(pJsonObject, texturesKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

long long
PlayerProfileTexturePropertyValue::getTimestamp()
{
	return timestamp;
}

void
PlayerProfileTexturePropertyValue::setTimestamp(long long  timestamp)
{
	this->timestamp = timestamp;
}

std::string
PlayerProfileTexturePropertyValue::getProfileId()
{
	return profileId;
}

void
PlayerProfileTexturePropertyValue::setProfileId(std::string  profileId)
{
	this->profileId = profileId;
}

std::string
PlayerProfileTexturePropertyValue::getProfileName()
{
	return profileName;
}

void
PlayerProfileTexturePropertyValue::setProfileName(std::string  profileName)
{
	this->profileName = profileName;
}

bool
PlayerProfileTexturePropertyValue::getSignatureRequired()
{
	return signatureRequired;
}

void
PlayerProfileTexturePropertyValue::setSignatureRequired(bool  signatureRequired)
{
	this->signatureRequired = signatureRequired;
}

PlayerTexture
PlayerProfileTexturePropertyValue::getTextures()
{
	return textures;
}

void
PlayerProfileTexturePropertyValue::setTextures(PlayerTexture  textures)
{
	this->textures = textures;
}


