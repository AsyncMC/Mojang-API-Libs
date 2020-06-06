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


#include "OAIUsernamePassword.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIUsernamePassword::OAIUsernamePassword(QString json) {
    this->fromJson(json);
}

OAIUsernamePassword::OAIUsernamePassword() {
    this->init();
}

OAIUsernamePassword::~OAIUsernamePassword() {

}

void
OAIUsernamePassword::init() {
    m_username_isSet = false;
    m_password_isSet = false;
}

void
OAIUsernamePassword::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIUsernamePassword::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(username, json[QString("username")]);
    
    ::OpenAPI::fromJsonValue(password, json[QString("password")]);
    
}

QString
OAIUsernamePassword::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIUsernamePassword::asJsonObject() const {
    QJsonObject obj;
	if(m_username_isSet){
        obj.insert(QString("username"), ::OpenAPI::toJsonValue(username));
    }
	if(m_password_isSet){
        obj.insert(QString("password"), ::OpenAPI::toJsonValue(password));
    }
    return obj;
}

QString
OAIUsernamePassword::getUsername() const {
    return username;
}
void
OAIUsernamePassword::setUsername(const QString &username) {
    this->username = username;
    this->m_username_isSet = true;
}

QString
OAIUsernamePassword::getPassword() const {
    return password;
}
void
OAIUsernamePassword::setPassword(const QString &password) {
    this->password = password;
    this->m_password_isSet = true;
}


bool
OAIUsernamePassword::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(m_username_isSet){ isObjectUpdated = true; break;}
    
        if(m_password_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

