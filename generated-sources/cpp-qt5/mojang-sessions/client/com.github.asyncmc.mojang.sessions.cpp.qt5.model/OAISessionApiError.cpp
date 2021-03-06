/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


#include "OAISessionApiError.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAISessionApiError::OAISessionApiError(QString json) {
    init();
    this->fromJson(json);
}

OAISessionApiError::OAISessionApiError() {
    init();
}

OAISessionApiError::~OAISessionApiError() {
    this->cleanup();
}

void
OAISessionApiError::init() {
    error = new QString("");
    m_error_isSet = false;
    path = new QString("");
    m_path_isSet = false;
}

void
OAISessionApiError::cleanup() {
    if(error != nullptr) { 
        delete error;
    }
    if(path != nullptr) { 
        delete path;
    }
}

OAISessionApiError*
OAISessionApiError::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAISessionApiError::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&error, pJson["error"], "QString", "QString");
    
    ::OpenAPI::setValue(&path, pJson["path"], "QString", "QString");
    
}

QString
OAISessionApiError::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAISessionApiError::asJsonObject() {
    QJsonObject obj;
    if(error != nullptr && *error != QString("")){
        toJsonValue(QString("error"), error, obj, QString("QString"));
    }
    if(path != nullptr && *path != QString("")){
        toJsonValue(QString("path"), path, obj, QString("QString"));
    }

    return obj;
}

QString*
OAISessionApiError::getError() {
    return error;
}
void
OAISessionApiError::setError(QString* error) {
    this->error = error;
    this->m_error_isSet = true;
}

QString*
OAISessionApiError::getPath() {
    return path;
}
void
OAISessionApiError::setPath(QString* path) {
    this->path = path;
    this->m_path_isSet = true;
}


bool
OAISessionApiError::isSet(){
    bool isObjectUpdated = false;
    do{
        if(error != nullptr && *error != QString("")){ isObjectUpdated = true; break;}
        if(path != nullptr && *path != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

