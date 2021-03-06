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
    init();
    this->fromJson(json);
}

OAISecurityAnswer::OAISecurityAnswer() {
    init();
}

OAISecurityAnswer::~OAISecurityAnswer() {
    this->cleanup();
}

void
OAISecurityAnswer::init() {
    id = 0;
    m_id_isSet = false;
}

void
OAISecurityAnswer::cleanup() {

}

OAISecurityAnswer*
OAISecurityAnswer::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAISecurityAnswer::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&id, pJson["id"], "qint32", "");
    
}

QString
OAISecurityAnswer::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAISecurityAnswer::asJsonObject() {
    QJsonObject obj;
    if(m_id_isSet){
        obj.insert("id", QJsonValue(id));
    }

    return obj;
}

qint32
OAISecurityAnswer::getId() {
    return id;
}
void
OAISecurityAnswer::setId(qint32 id) {
    this->id = id;
    this->m_id_isSet = true;
}


bool
OAISecurityAnswer::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_id_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

