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


#include "OAIProfileId.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIProfileId::OAIProfileId(QString json) {
    this->fromJson(json);
}

OAIProfileId::OAIProfileId() {
    this->init();
}

OAIProfileId::~OAIProfileId() {

}

void
OAIProfileId::init() {
    m_id_isSet = false;
    m_name_isSet = false;
}

void
OAIProfileId::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIProfileId::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
    ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
}

QString
OAIProfileId::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIProfileId::asJsonObject() const {
    QJsonObject obj;
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
    return obj;
}

QString
OAIProfileId::getId() const {
    return id;
}
void
OAIProfileId::setId(const QString &id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString
OAIProfileId::getName() const {
    return name;
}
void
OAIProfileId::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}


bool
OAIProfileId::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_id_isSet){ isObjectUpdated = true; break;}
    
        if(m_name_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

