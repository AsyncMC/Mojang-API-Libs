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
    init();
    this->fromJson(json);
}

OAIPrivateUserData::OAIPrivateUserData() {
    init();
}

OAIPrivateUserData::~OAIPrivateUserData() {
    this->cleanup();
}

void
OAIPrivateUserData::init() {
    id = new QString("");
    m_id_isSet = false;
    properties = new QList<OAIGameProfileProperty*>();
    m_properties_isSet = false;
}

void
OAIPrivateUserData::cleanup() {
    if(id != nullptr) { 
        delete id;
    }
    if(properties != nullptr) { 
        auto arr = properties;
        for(auto o: *arr) { 
            delete o;
        }
        delete properties;
    }
}

OAIPrivateUserData*
OAIPrivateUserData::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIPrivateUserData::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&id, pJson["id"], "QString", "QString");
    
    
    ::OpenAPI::setValue(&properties, pJson["properties"], "QList", "OAIGameProfileProperty");
}

QString
OAIPrivateUserData::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIPrivateUserData::asJsonObject() {
    QJsonObject obj;
    if(id != nullptr && *id != QString("")){
        toJsonValue(QString("id"), id, obj, QString("QString"));
    }
    if(properties->size() > 0){
        toJsonArray((QList<void*>*)properties, obj, "properties", "OAIGameProfileProperty");
    }

    return obj;
}

QString*
OAIPrivateUserData::getId() {
    return id;
}
void
OAIPrivateUserData::setId(QString* id) {
    this->id = id;
    this->m_id_isSet = true;
}

QList<OAIGameProfileProperty*>*
OAIPrivateUserData::getProperties() {
    return properties;
}
void
OAIPrivateUserData::setProperties(QList<OAIGameProfileProperty*>* properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIPrivateUserData::isSet(){
    bool isObjectUpdated = false;
    do{
        if(id != nullptr && *id != QString("")){ isObjectUpdated = true; break;}
        if(properties->size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

