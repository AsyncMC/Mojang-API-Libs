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


#include "OAIGameProfileProperty.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIGameProfileProperty::OAIGameProfileProperty(QString json) {
    init();
    this->fromJson(json);
}

OAIGameProfileProperty::OAIGameProfileProperty() {
    init();
}

OAIGameProfileProperty::~OAIGameProfileProperty() {
    this->cleanup();
}

void
OAIGameProfileProperty::init() {
    name = new QString("");
    m_name_isSet = false;
    value = new QString("");
    m_value_isSet = false;
}

void
OAIGameProfileProperty::cleanup() {
    if(name != nullptr) { 
        delete name;
    }
    if(value != nullptr) { 
        delete value;
    }
}

OAIGameProfileProperty*
OAIGameProfileProperty::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIGameProfileProperty::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&name, pJson["name"], "QString", "QString");
    
    ::OpenAPI::setValue(&value, pJson["value"], "QString", "QString");
    
}

QString
OAIGameProfileProperty::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIGameProfileProperty::asJsonObject() {
    QJsonObject obj;
    if(name != nullptr && *name != QString("")){
        toJsonValue(QString("name"), name, obj, QString("QString"));
    }
    if(value != nullptr && *value != QString("")){
        toJsonValue(QString("value"), value, obj, QString("QString"));
    }

    return obj;
}

QString*
OAIGameProfileProperty::getName() {
    return name;
}
void
OAIGameProfileProperty::setName(QString* name) {
    this->name = name;
    this->m_name_isSet = true;
}

QString*
OAIGameProfileProperty::getValue() {
    return value;
}
void
OAIGameProfileProperty::setValue(QString* value) {
    this->value = value;
    this->m_value_isSet = true;
}


bool
OAIGameProfileProperty::isSet(){
    bool isObjectUpdated = false;
    do{
        if(name != nullptr && *name != QString("")){ isObjectUpdated = true; break;}
        if(value != nullptr && *value != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
