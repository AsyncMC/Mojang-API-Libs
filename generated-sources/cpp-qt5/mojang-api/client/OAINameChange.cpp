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
    init();
    this->fromJson(json);
}

OAINameChange::OAINameChange() {
    init();
}

OAINameChange::~OAINameChange() {
    this->cleanup();
}

void
OAINameChange::init() {
    name = new QString("");
    m_name_isSet = false;
    changed_to_at = 0L;
    m_changed_to_at_isSet = false;
}

void
OAINameChange::cleanup() {
    if(name != nullptr) { 
        delete name;
    }

}

OAINameChange*
OAINameChange::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAINameChange::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&name, pJson["name"], "QString", "QString");
    
    ::OpenAPI::setValue(&changed_to_at, pJson["changedToAt"], "qint64", "");
    
}

QString
OAINameChange::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAINameChange::asJsonObject() {
    QJsonObject obj;
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }
    if(m_changed_to_at_isSet){
        obj.insert("changedToAt", QJsonValue(changed_to_at));
    }

    return obj;
}

QString*
OAINameChange::getName() {
    return name;
}
void
OAINameChange::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}

qint64
OAINameChange::getChangedToAt() {
    return changed_to_at;
}
void
OAINameChange::setChangedToAt(qint64 changed_to_at) {
    this->changed_to_at = changed_to_at;
    this->m_changed_to_at_isSet = true;
}


bool
OAINameChange::isSet(){
    bool isObjectUpdated = false;
    do{
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
        if(m_changed_to_at_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

