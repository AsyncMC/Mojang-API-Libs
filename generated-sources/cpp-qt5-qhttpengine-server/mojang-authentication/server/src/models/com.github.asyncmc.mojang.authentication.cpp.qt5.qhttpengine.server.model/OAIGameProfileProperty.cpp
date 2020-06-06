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
    this->fromJson(json);
}

OAIGameProfileProperty::OAIGameProfileProperty() {
    this->init();
}

OAIGameProfileProperty::~OAIGameProfileProperty() {

}

void
OAIGameProfileProperty::init() {
    m_name_isSet = false;
    m_value_isSet = false;
}

void
OAIGameProfileProperty::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIGameProfileProperty::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(name, json[QString("name")]);
    
    ::OpenAPI::fromJsonValue(value, json[QString("value")]);
    
}

QString
OAIGameProfileProperty::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIGameProfileProperty::asJsonObject() const {
    QJsonObject obj;
	if(m_name_isSet){
        obj.insert(QString("name"), ::OpenAPI::toJsonValue(name));
    }
	if(m_value_isSet){
        obj.insert(QString("value"), ::OpenAPI::toJsonValue(value));
    }
    return obj;
}

QString
OAIGameProfileProperty::getName() const {
    return name;
}
void
OAIGameProfileProperty::setName(const QString &name) {
    this->name = name;
    this->m_name_isSet = true;
}

QString
OAIGameProfileProperty::getValue() const {
    return value;
}
void
OAIGameProfileProperty::setValue(const QString &value) {
    this->value = value;
    this->m_value_isSet = true;
}


bool
OAIGameProfileProperty::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_name_isSet){ isObjectUpdated = true; break;}
    
        if(m_value_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
