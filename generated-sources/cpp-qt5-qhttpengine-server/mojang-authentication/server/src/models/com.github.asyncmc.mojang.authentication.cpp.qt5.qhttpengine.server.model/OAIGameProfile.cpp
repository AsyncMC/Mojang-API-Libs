/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIGameProfile.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIGameProfile::OAIGameProfile(QString json) {
    this->fromJson(json);
}

OAIGameProfile::OAIGameProfile() {
    this->init();
}

OAIGameProfile::~OAIGameProfile() {

}

void
OAIGameProfile::init() {
    m_agent_isSet = false;
    m_id_isSet = false;
    m_name_isSet = false;
    m_user_id_isSet = false;
    m_created_at_isSet = false;
    m_legacy_profile_isSet = false;
    m_suspended_isSet = false;
    m_paid_isSet = false;
    m_migrated_isSet = false;
    m_legacy_isSet = false;
}

void
OAIGameProfile::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIGameProfile::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(agent, json[QString("agent")]);
    
    ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    ::OpenAPI::fromJsonValue(user_id, json[QString("userId")]);
    
    ::OpenAPI::fromJsonValue(created_at, json[QString("createdAt")]);
    
    ::OpenAPI::fromJsonValue(legacy_profile, json[QString("legacyProfile")]);
    
    ::OpenAPI::fromJsonValue(suspended, json[QString("suspended")]);
    
    ::OpenAPI::fromJsonValue(paid, json[QString("paid")]);
    
    ::OpenAPI::fromJsonValue(migrated, json[QString("migrated")]);
    
    ::OpenAPI::fromJsonValue(legacy, json[QString("legacy")]);
    
}

QString
OAIGameProfile::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIGameProfile::asJsonObject() const {
    QJsonObject obj;
	if(m_agent_isSet){
        obj.insert(QString("agent"), ::OpenAPI::toJsonValue(agent));
    }
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_user_id_isSet){
        obj.insert(QString("userId"), ::OpenAPI::toJsonValue(user_id));
    }
	if(m_created_at_isSet){
        obj.insert(QString("createdAt"), ::OpenAPI::toJsonValue(created_at));
    }
	if(m_legacy_profile_isSet){
        obj.insert(QString("legacyProfile"), ::OpenAPI::toJsonValue(legacy_profile));
    }
	if(m_suspended_isSet){
        obj.insert(QString("suspended"), ::OpenAPI::toJsonValue(suspended));
    }
	if(m_paid_isSet){
        obj.insert(QString("paid"), ::OpenAPI::toJsonValue(paid));
    }
	if(m_migrated_isSet){
        obj.insert(QString("migrated"), ::OpenAPI::toJsonValue(migrated));
    }
	if(m_legacy_isSet){
        obj.insert(QString("legacy"), ::OpenAPI::toJsonValue(legacy));
    }
    return obj;
}

QString
OAIGameProfile::getAgent() const {
    return agent;
}
void
OAIGameProfile::setAgent(const QString &agent) {
    this->agent = agent;
    this->m_agent_isSet = true;
}

QString
OAIGameProfile::getId() const {
    return id;
}
void
OAIGameProfile::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString
OAIGameProfile::getName() const {
    return name;
}
void
OAIGameProfile::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

QString
OAIGameProfile::getUserId() const {
    return user_id;
}
void
OAIGameProfile::setUserId(const QString &user_id) {
    this->user_id = user_id;
    this->m_user_id_isSet = true;
}

qint64
OAIGameProfile::getCreatedAt() const {
    return created_at;
}
void
OAIGameProfile::setCreatedAt(const qint64 &created_at) {
    this->created_at = created_at;
    this->m_created_at_isSet = true;
}

bool
OAIGameProfile::isLegacyProfile() const {
    return legacy_profile;
}
void
OAIGameProfile::setLegacyProfile(const bool &legacy_profile) {
    this->legacy_profile = legacy_profile;
    this->m_legacy_profile_isSet = true;
}

bool
OAIGameProfile::isSuspended() const {
    return suspended;
}
void
OAIGameProfile::setSuspended(const bool &suspended) {
    this->suspended = suspended;
    this->m_suspended_isSet = true;
}

bool
OAIGameProfile::isPaid() const {
    return paid;
}
void
OAIGameProfile::setPaid(const bool &paid) {
    this->paid = paid;
    this->m_paid_isSet = true;
}

bool
OAIGameProfile::isMigrated() const {
    return migrated;
}
void
OAIGameProfile::setMigrated(const bool &migrated) {
    this->migrated = migrated;
    this->m_migrated_isSet = true;
}

bool
OAIGameProfile::isLegacy() const {
    return legacy;
}
void
OAIGameProfile::setLegacy(const bool &legacy) {
    this->legacy = legacy;
    this->m_legacy_isSet = true;
}


bool
OAIGameProfile::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_agent_isSet){ isObjectUpdated = true; break;}
    
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_user_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_created_at_isSet){ isObjectUpdated = true; break;}
    
        if(m_legacy_profile_isSet){ isObjectUpdated = true; break;}
    
        if(m_suspended_isSet){ isObjectUpdated = true; break;}
    
        if(m_paid_isSet){ isObjectUpdated = true; break;}
    
        if(m_migrated_isSet){ isObjectUpdated = true; break;}
    
        if(m_legacy_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

