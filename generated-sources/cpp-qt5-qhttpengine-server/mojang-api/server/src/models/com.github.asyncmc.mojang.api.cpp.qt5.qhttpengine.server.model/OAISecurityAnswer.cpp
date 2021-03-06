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


#include "OAISecurityAnswer.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAISecurityAnswer::OAISecurityAnswer(QString json) {
    this->fromJson(json);
}

OAISecurityAnswer::OAISecurityAnswer() {
    this->init();
}

OAISecurityAnswer::~OAISecurityAnswer() {

}

void
OAISecurityAnswer::init() {
    m_id_isSet = false;
}

void
OAISecurityAnswer::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAISecurityAnswer::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
}

QString
OAISecurityAnswer::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAISecurityAnswer::asJsonObject() const {
    QJsonObject obj;
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    return obj;
}

qint32
OAISecurityAnswer::getId() const {
    return id;
}
void
OAISecurityAnswer::setId(const qint32 &id) {
    this->id = id;
    this->m_id_isSet = true;
}


bool
OAISecurityAnswer::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

