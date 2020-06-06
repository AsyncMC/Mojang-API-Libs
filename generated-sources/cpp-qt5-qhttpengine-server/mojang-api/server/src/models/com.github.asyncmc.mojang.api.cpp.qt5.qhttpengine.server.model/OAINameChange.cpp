/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAINameChange.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAINameChange::OAINameChange(QString json) {
    this->fromJson(json);
}

OAINameChange::OAINameChange() {
    this->init();
}

OAINameChange::~OAINameChange() {

}

void
OAINameChange::init() {
    m_name_isSet = false;
    m_changed_to_at_isSet = false;
}

void
OAINameChange::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAINameChange::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    ::OpenAPI::fromJsonValue(changed_to_at, json[QString("changedToAt")]);
    
}

QString
OAINameChange::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAINameChange::asJsonObject() const {
    QJsonObject obj;
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_changed_to_at_isSet){
        obj.insert(QString("changedToAt"), ::OpenAPI::toJsonValue(changed_to_at));
    }
    return obj;
}

QString
OAINameChange::getName() const {
    return name;
}
void
OAINameChange::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

qint64
OAINameChange::getChangedToAt() const {
    return changed_to_at;
}
void
OAINameChange::setChangedToAt(const qint64 &changed_to_at) {
    this->changed_to_at = changed_to_at;
    this->m_changed_to_at_isSet = true;
}


bool
OAINameChange::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_changed_to_at_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
