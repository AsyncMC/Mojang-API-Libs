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


#include "OAIInline_object.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIInline_object::OAIInline_object(QString json) {
    this->fromJson(json);
}

OAIInline_object::OAIInline_object() {
    this->init();
}

OAIInline_object::~OAIInline_object() {

}

void
OAIInline_object::init() {
    m_model_isSet = false;
    m_file_isSet = false;
}

void
OAIInline_object::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIInline_object::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(model, json[QString("model")]);
    
    ::OpenAPI::fromJsonValue(file, json[QString("file")]);
    
}

QString
OAIInline_object::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIInline_object::asJsonObject() const {
    QJsonObject obj;
	if(model.isSet()){
        obj.insert(QString("model"), ::OpenAPI::toJsonValue(model));
    }
	if(file.isSet()){
        obj.insert(QString("file"), ::OpenAPI::toJsonValue(file));
    }
    return obj;
}

OAISkinModel
OAIInline_object::getModel() const {
    return model;
}
void
OAIInline_object::setModel(const OAISkinModel &model) {
    this->model = model;
    this->m_model_isSet = true;
}

QIODevice*
OAIInline_object::getFile() const {
    return file;
}
void
OAIInline_object::setFile(const QIODevice* &file) {
    this->file = file;
    this->m_file_isSet = true;
}


bool
OAIInline_object::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(model.isSet()){ isObjectUpdated = true; break;}
    
        if(file.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}

