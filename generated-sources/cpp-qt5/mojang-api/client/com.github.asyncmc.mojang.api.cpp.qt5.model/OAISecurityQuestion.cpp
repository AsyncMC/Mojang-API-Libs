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


#include "OAISecurityQuestion.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAISecurityQuestion::OAISecurityQuestion(QString json) {
    init();
    this->fromJson(json);
}

OAISecurityQuestion::OAISecurityQuestion() {
    init();
}

OAISecurityQuestion::~OAISecurityQuestion() {
    this->cleanup();
}

void
OAISecurityQuestion::init() {
    id = 0;
    m_id_isSet = false;
    question = new QString("");
    m_question_isSet = false;
}

void
OAISecurityQuestion::cleanup() {

    if(question != nullptr) { 
        delete question;
    }
}

OAISecurityQuestion*
OAISecurityQuestion::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAISecurityQuestion::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&id, pJson["id"], "qint32", "");
    
    ::OpenAPI::setValue(&question, pJson["question"], "QString", "QString");
    
}

QString
OAISecurityQuestion::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAISecurityQuestion::asJsonObject() {
    QJsonObject obj;
    if(m_id_isSet){
        obj.insert("id", QJsonValue(id));
    }
    if(question != nullptr && *question != QString("")){
        toJsonValue(QString("question"), question, obj, QString("QString"));
    }

    return obj;
}

qint32
OAISecurityQuestion::getId() {
    return id;
}
void
OAISecurityQuestion::setId(qint32 id) {
    this->id = id;
    this->m_id_isSet = true;
}

QString*
OAISecurityQuestion::getQuestion() {
    return question;
}
void
OAISecurityQuestion::setQuestion(QString* question) {
    this->question = question;
    this->m_question_isSet = true;
}


bool
OAISecurityQuestion::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_id_isSet){ isObjectUpdated = true; break;}
        if(question != nullptr && *question != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
