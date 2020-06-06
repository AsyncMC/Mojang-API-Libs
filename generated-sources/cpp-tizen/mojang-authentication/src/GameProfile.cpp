#include <map>
#include <cstdlib>
#include <glib-object.h>
#include <json-glib/json-glib.h>
#include "Helpers.h"


#include "GameProfile.h"

using namespace std;
using namespace Tizen::ArtikCloud;

GameProfile::GameProfile()
{
	//__init();
}

GameProfile::~GameProfile()
{
	//__cleanup();
}

void
GameProfile::__init()
{
	//agent = std::string();
	//id = std::string();
	//name = std::string();
	//userId = std::string();
	//createdAt = long(0);
	//legacyProfile = bool(false);
	//suspended = bool(false);
	//paid = bool(false);
	//migrated = bool(false);
	//legacy = bool(false);
}

void
GameProfile::__cleanup()
{
	//if(agent != NULL) {
	//
	//delete agent;
	//agent = NULL;
	//}
	//if(id != NULL) {
	//
	//delete id;
	//id = NULL;
	//}
	//if(name != NULL) {
	//
	//delete name;
	//name = NULL;
	//}
	//if(userId != NULL) {
	//
	//delete userId;
	//userId = NULL;
	//}
	//if(createdAt != NULL) {
	//
	//delete createdAt;
	//createdAt = NULL;
	//}
	//if(legacyProfile != NULL) {
	//
	//delete legacyProfile;
	//legacyProfile = NULL;
	//}
	//if(suspended != NULL) {
	//
	//delete suspended;
	//suspended = NULL;
	//}
	//if(paid != NULL) {
	//
	//delete paid;
	//paid = NULL;
	//}
	//if(migrated != NULL) {
	//
	//delete migrated;
	//migrated = NULL;
	//}
	//if(legacy != NULL) {
	//
	//delete legacy;
	//legacy = NULL;
	//}
	//
}

void
GameProfile::fromJson(char* jsonStr)
{
	JsonObject *pJsonObject = json_node_get_object(json_from_string(jsonStr,NULL));
	JsonNode *node;
	const gchar *agentKey = "agent";
	node = json_object_get_member(pJsonObject, agentKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&agent, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *idKey = "id";
	node = json_object_get_member(pJsonObject, idKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&id, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *nameKey = "name";
	node = json_object_get_member(pJsonObject, nameKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&name, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *userIdKey = "userId";
	node = json_object_get_member(pJsonObject, userIdKey);
	if (node !=NULL) {
	

		if (isprimitive("std::string")) {
			jsonToValue(&userId, node, "std::string", "");
		} else {
			
		}
	}
	const gchar *createdAtKey = "createdAt";
	node = json_object_get_member(pJsonObject, createdAtKey);
	if (node !=NULL) {
	

		if (isprimitive("long long")) {
			jsonToValue(&createdAt, node, "long long", "");
		} else {
			
		}
	}
	const gchar *legacyProfileKey = "legacyProfile";
	node = json_object_get_member(pJsonObject, legacyProfileKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&legacyProfile, node, "bool", "");
		} else {
			
		}
	}
	const gchar *suspendedKey = "suspended";
	node = json_object_get_member(pJsonObject, suspendedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&suspended, node, "bool", "");
		} else {
			
		}
	}
	const gchar *paidKey = "paid";
	node = json_object_get_member(pJsonObject, paidKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&paid, node, "bool", "");
		} else {
			
		}
	}
	const gchar *migratedKey = "migrated";
	node = json_object_get_member(pJsonObject, migratedKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&migrated, node, "bool", "");
		} else {
			
		}
	}
	const gchar *legacyKey = "legacy";
	node = json_object_get_member(pJsonObject, legacyKey);
	if (node !=NULL) {
	

		if (isprimitive("bool")) {
			jsonToValue(&legacy, node, "bool", "");
		} else {
			
		}
	}
}

GameProfile::GameProfile(char* json)
{
	this->fromJson(json);
}

char*
GameProfile::toJson()
{
	JsonObject *pJsonObject = json_object_new();
	JsonNode *node;
	if (isprimitive("std::string")) {
		std::string obj = getAgent();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *agentKey = "agent";
	json_object_set_member(pJsonObject, agentKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *idKey = "id";
	json_object_set_member(pJsonObject, idKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getName();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *nameKey = "name";
	json_object_set_member(pJsonObject, nameKey, node);
	if (isprimitive("std::string")) {
		std::string obj = getUserId();
		node = converttoJson(&obj, "std::string", "");
	}
	else {
		
	}
	const gchar *userIdKey = "userId";
	json_object_set_member(pJsonObject, userIdKey, node);
	if (isprimitive("long long")) {
		long long obj = getCreatedAt();
		node = converttoJson(&obj, "long long", "");
	}
	else {
		
	}
	const gchar *createdAtKey = "createdAt";
	json_object_set_member(pJsonObject, createdAtKey, node);
	if (isprimitive("bool")) {
		bool obj = getLegacyProfile();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *legacyProfileKey = "legacyProfile";
	json_object_set_member(pJsonObject, legacyProfileKey, node);
	if (isprimitive("bool")) {
		bool obj = getSuspended();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *suspendedKey = "suspended";
	json_object_set_member(pJsonObject, suspendedKey, node);
	if (isprimitive("bool")) {
		bool obj = getPaid();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *paidKey = "paid";
	json_object_set_member(pJsonObject, paidKey, node);
	if (isprimitive("bool")) {
		bool obj = getMigrated();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *migratedKey = "migrated";
	json_object_set_member(pJsonObject, migratedKey, node);
	if (isprimitive("bool")) {
		bool obj = getLegacy();
		node = converttoJson(&obj, "bool", "");
	}
	else {
		
	}
	const gchar *legacyKey = "legacy";
	json_object_set_member(pJsonObject, legacyKey, node);
	node = json_node_alloc();
	json_node_init(node, JSON_NODE_OBJECT);
	json_node_take_object(node, pJsonObject);
	char * ret = json_to_string(node, false);
	json_node_free(node);
	return ret;
}

std::string
GameProfile::getAgent()
{
	return agent;
}

void
GameProfile::setAgent(std::string  agent)
{
	this->agent = agent;
}

std::string
GameProfile::getId()
{
	return id;
}

void
GameProfile::setId(std::string  id)
{
	this->id = id;
}

std::string
GameProfile::getName()
{
	return name;
}

void
GameProfile::setName(std::string  name)
{
	this->name = name;
}

std::string
GameProfile::getUserId()
{
	return userId;
}

void
GameProfile::setUserId(std::string  userId)
{
	this->userId = userId;
}

long long
GameProfile::getCreatedAt()
{
	return createdAt;
}

void
GameProfile::setCreatedAt(long long  createdAt)
{
	this->createdAt = createdAt;
}

bool
GameProfile::getLegacyProfile()
{
	return legacyProfile;
}

void
GameProfile::setLegacyProfile(bool  legacyProfile)
{
	this->legacyProfile = legacyProfile;
}

bool
GameProfile::getSuspended()
{
	return suspended;
}

void
GameProfile::setSuspended(bool  suspended)
{
	this->suspended = suspended;
}

bool
GameProfile::getPaid()
{
	return paid;
}

void
GameProfile::setPaid(bool  paid)
{
	this->paid = paid;
}

bool
GameProfile::getMigrated()
{
	return migrated;
}

void
GameProfile::setMigrated(bool  migrated)
{
	this->migrated = migrated;
}

bool
GameProfile::getLegacy()
{
	return legacy;
}

void
GameProfile::setLegacy(bool  legacy)
{
	this->legacy = legacy;
}


