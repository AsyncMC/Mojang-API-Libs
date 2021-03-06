/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAIPlayerProfile.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIPlayerProfile::OAIPlayerProfile(QString json) {
    init();
    this->fromJson(json);
}

OAIPlayerProfile::OAIPlayerProfile() {
    init();
}

OAIPlayerProfile::~OAIPlayerProfile() {
    this->cleanup();
}

void
OAIPlayerProfile::init() {
    id = new QString("");
    m_id_isSet = false;
    name = new QString("");
    m_name_isSet = false;
    legacy = false;
    m_legacy_isSet = false;
    properties = new QList<OAIPlayerProfileProperty*>();
    m_properties_isSet = false;
}

void
OAIPlayerProfile::cleanup() {
    if(id != nullptr) { 
        delete id;
    }
    if(name != nullptr) { 
        delete name;
    }

    if(properties != nullptr) { 
        auto arr = properties;
        for(auto o: *arr) { 
            delete o;
        }
        delete properties;
    }
}

OAIPlayerProfile*
OAIPlayerProfile::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIPlayerProfile::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&id, pJson["id"], "QString", "QString");
    
    ::OpenAPI::setValue(&name, pJson["name"], "QString", "QString");
    
    ::OpenAPI::setValue(&legacy, pJson["legacy"], "bool", "");
    
    
    ::OpenAPI::setValue(&properties, pJson["properties"], "QList", "OAIPlayerProfileProperty");
}

QString
OAIPlayerProfile::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIPlayerProfile::asJsonObject() {
    QJsonObject obj;
    if(id != nullptr && *id != QString("")){
        toJsonValue(QString("id"), id, obj, QString("QString"));
    }
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }
    if(m_legacy_isSet){
        obj.insert("legacy", QJsonValue(legacy));
    }
    if(properties->size() > 0){
        toJsonArray((QList<void*>*)properties, obj, "properties", "OAIPlayerProfileProperty");
    }

    return obj;
}

QString*
OAIPlayerProfile::getId() {
    return id;
}
void
OAIPlayerProfile::setId(QString* id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString*
OAIPlayerProfile::getName() {
    return name;
}
void
OAIPlayerProfile::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}

bool
OAIPlayerProfile::isLegacy() {
    return legacy;
}
void
OAIPlayerProfile::setLegacy(bool legacy) {
    this->legacy = legacy;
    this->m_legacy_isSet = true;
}

QList<OAIPlayerProfileProperty*>*
OAIPlayerProfile::getProperties() {
    return properties;
}
void
OAIPlayerProfile::setProperties(QList<OAIPlayerProfileProperty*>* properties) {
    this->properties = properties;
    this->m_properties_isSet = true;
}


bool
OAIPlayerProfile::isSet(){
    bool isObjectUpdated = false;
    do{
        if(id != nullptr && *id != QString("")){ isObjectUpdated = true; break;}
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
        if(m_legacy_isSet){ isObjectUpdated = true; break;}
        if(properties->size() > 0){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

