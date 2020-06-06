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


#include "OAISecurityAnswerId.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAISecurityAnswerId::OAISecurityAnswerId(QString json) {
    this->fromJson(json);
}

OAISecurityAnswerId::OAISecurityAnswerId() {
    this->init();
}

OAISecurityAnswerId::~OAISecurityAnswerId() {

}

void
OAISecurityAnswerId::init() {
    m_id_isSet = false;
}

void
OAISecurityAnswerId::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAISecurityAnswerId::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(id, json[QString("id")]);
    
}

QString
OAISecurityAnswerId::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAISecurityAnswerId::asJsonObject() const {
    QJsonObject obj;
	if(m_id_isSet){
        obj.insert(QString("id"), ::OpenAPI::toJsonValue(id));
    }
    return obj;
}

qint32
OAISecurityAnswerId::getId() const {
    return id;
}
void
OAISecurityAnswerId::setId(const qint32 &id) {
    this->id = id;
    this->m_id_isSet = true;
}


bool
OAISecurityAnswerId::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
