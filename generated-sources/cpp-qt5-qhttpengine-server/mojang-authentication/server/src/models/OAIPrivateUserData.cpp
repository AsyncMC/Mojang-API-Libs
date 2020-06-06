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


#include "OAIPrivateUserData.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIPrivateUserData::OAIPrivateUserData(QString json) {
    this->fromJson(json);
}

OAIPrivateUserData::OAIPrivateUserData() {
    this->init();
}

OAIPrivateUserData::~OAIPrivateUserData() {

}

void
OAIPrivateUserData::init() {
    m_id_isSet = false;
    m_properties_isSet = false;
}

void
OAIPrivateUserData::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIPrivateUserData::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    
    ::OpenAPI::fromJsonValue(properties, json[QString("properties")]);
}

QString
OAIPrivateUserData::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIPrivateUserData::asJsonObject() const {
    QJsonObject obj;
	if(id.isSet()){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	
    if(properties.size() > 0){
        obj.insert(QString("properties"), ::OpenAPI::toJsonValue(properties));
    } 
    return obj;
}

QIODevice*
OAIPrivateUserData::getId() const {
    return id;
}
void
OAIPrivateUserData::setId(const QIODevice* &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QList<OAIGameProfileProperty>
OAIPrivateUserData::getProperties() const {
    return properties;
}
void
OAIPrivateUserData::setProperties(const QList<OAIGameProfileProperty> &properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIPrivateUserData::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(id.isSet()){ isObjectUpdated = true; break;}
    
        if(properties.size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

