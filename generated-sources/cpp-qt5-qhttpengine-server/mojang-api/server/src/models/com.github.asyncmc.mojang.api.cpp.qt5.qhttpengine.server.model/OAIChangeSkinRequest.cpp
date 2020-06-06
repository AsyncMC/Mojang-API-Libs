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


#include "OAIChangeSkinRequest.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIChangeSkinRequest::OAIChangeSkinRequest(QString json) {
    this->fromJson(json);
}

OAIChangeSkinRequest::OAIChangeSkinRequest() {
    this->init();
}

OAIChangeSkinRequest::~OAIChangeSkinRequest() {

}

void
OAIChangeSkinRequest::init() {
    m_model_isSet = false;
    m_url_isSet = false;
}

void
OAIChangeSkinRequest::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIChangeSkinRequest::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    
    ::OpenAPI::fromJsonValue(url, json[QString("url")]);
    
}

QString
OAIChangeSkinRequest::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIChangeSkinRequest::asJsonObject() const {
    QJsonObject obj;
	if(model.isSet()){
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
	if(m_url_isSet){
        obj.insert(QString("url"), ::OpenAPI::toJsonValue(url));
    }
    return obj;
}

OAISkinModel
OAIChangeSkinRequest::getModel() const {
    return model;
}
void
OAIChangeSkinRequest::setModel(const OAISkinModel &model) {
    this->model = model;
    this->m_model_isSet = true;
}

QString
OAIChangeSkinRequest::getUrl() const {
    return url;
}
void
OAIChangeSkinRequest::setUrl(const QString &url) {
    this->url = url;
    this->m_url_isSet = true;
}


bool
OAIChangeSkinRequest::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(model.isSet()){ isObjectUpdated = true; break;}
    
        if(m_url_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

