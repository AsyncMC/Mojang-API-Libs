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


#include "OAIAuthentication.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIAuthentication::OAIAuthentication(QString json) {
    init();
    this->fromJson(json);
}

OAIAuthentication::OAIAuthentication() {
    init();
}

OAIAuthentication::~OAIAuthentication() {
    this->cleanup();
}

void
OAIAuthentication::init() {
    access_token = new QString("");
    m_access_token_isSet = false;
    client_token = new QString("");
    m_client_token_isSet = false;
}

void
OAIAuthentication::cleanup() {
    if(access_token != nullptr) { 
        delete access_token;
    }
    if(client_token != nullptr) { 
        delete client_token;
    }
}

OAIAuthentication*
OAIAuthentication::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIAuthentication::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&access_token, pJson["accessToken"], "QString", "QString");
    
    ::OpenAPI::setValue(&client_token, pJson["clientToken"], "QString", "QString");
    
}

QString
OAIAuthentication::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIAuthentication::asJsonObject() {
    QJsonObject obj;
    if(access_token != nullptr && *access_token != QString("")){
        toJsonValue(QString("accessToken"), access_token, obj, QString("QString"));
    }
    if(client_token != nullptr && *client_token != QString("")){
        toJsonValue(QString("clientToken"), client_token, obj, QString("QString"));
    }

    return obj;
}

QString*
OAIAuthentication::getAccessToken() {
    return access_token;
}
void
OAIAuthentication::setAccessToken(QString* access_token) {
    this->access_token = access_token;
    this->m_access_token_isSet = true;
}

QString*
OAIAuthentication::getClientToken() {
    return client_token;
}
void
OAIAuthentication::setClientToken(QString* client_token) {
    this->client_token = client_token;
    this->m_client_token_isSet = true;
}


bool
OAIAuthentication::isSet(){
    bool isObjectUpdated = false;
    do{
        if(access_token != nullptr && *access_token != QString("")){ isObjectUpdated = true; break;}
        if(client_token != nullptr && *client_token != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

