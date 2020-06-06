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


#include "OAIError.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIError::OAIError(QString json) {
    init();
    this->fromJson(json);
}

OAIError::OAIError() {
    init();
}

OAIError::~OAIError() {
    this->cleanup();
}

void
OAIError::init() {
    error = new QString("");
    m_error_isSet = false;
    error_message = new QString("");
    m_error_message_isSet = false;
}

void
OAIError::cleanup() {
    if(error != nullptr) { 
        delete error;
    }
    if(error_message != nullptr) { 
        delete error_message;
    }
}

OAIError*
OAIError::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIError::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&error, pJson["error"], "QString", "QString");
    
    ::OpenAPI::setValue(&error_message, pJson["errorMessage"], "QString", "QString");
    
}

QString
OAIError::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIError::asJsonObject() {
    QJsonObject obj;
    if(error != nullptr && *error != QString("")){
        toJsonValue(QString("error"), error, obj, QString("QString"));
    }
    if(error_message != nullptr && *error_message != QString("")){
        toJsonValue(QString("errorMessage"), error_message, obj, QString("QString"));
    }

    return obj;
}

QString*
OAIError::getError() {
    return error;
}
void
OAIError::setError(QString* error) {
    this->error = error;
    this->m_error_isSet = true;
}

QString*
OAIError::getErrorMessage() {
    return error_message;
}
void
OAIError::setErrorMessage(QString* error_message) {
    this->error_message = error_message;
    this->m_error_message_isSet = true;
}


bool
OAIError::isSet(){
    bool isObjectUpdated = false;
    do{
        if(error != nullptr && *error != QString("")){ isObjectUpdated = true; break;}
        if(error_message != nullptr && *error_message != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}
