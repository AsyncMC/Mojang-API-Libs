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
    init();
    this->fromJson(json);
}

OAIInline_object::OAIInline_object() {
    init();
}

OAIInline_object::~OAIInline_object() {
    this->cleanup();
}

void
OAIInline_object::init() {
    model = new OAISkinModel();
    m_model_isSet = false;
    file = new QString("");
    m_file_isSet = false;
}

void
OAIInline_object::cleanup() {
    if(model != nullptr) { 
        delete model;
    }
    if(file != nullptr) { 
        delete file;
    }
}

OAIInline_object*
OAIInline_object::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIInline_object::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&model, pJson["model"], "OAISkinModel", "OAISkinModel");
    
    ::OpenAPI::setValue(&file, pJson["file"], "OAIHttpRequestInputFileElement", "OAIHttpRequestInputFileElement");
    
}

QString
OAIInline_object::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIInline_object::asJsonObject() {
    QJsonObject obj;
    if((model != nullptr) && (model->isSet())){
        toJsonValue(QString("model"), model, obj, QString("OAISkinModel"));
    }
    if((file != nullptr) && (file->isSet())){
        toJsonValue(QString("file"), file, obj, QString("OAIHttpRequestInputFileElement"));
    }

    return obj;
}

OAISkinModel*
OAIInline_object::getModel() {
    return model;
}
void
OAIInline_object::setModel(OAISkinModel* model) {
    this->model = model;
    this->m_model_isSet = true;
}

OAIHttpRequestInputFileElement*
OAIInline_object::getFile() {
    return file;
}
void
OAIInline_object::setFile(OAIHttpRequestInputFileElement* file) {
    this->file = file;
    this->m_file_isSet = true;
}


bool
OAIInline_object::isSet(){
    bool isObjectUpdated = false;
    do{
        if(model != nullptr && model->isSet()){ isObjectUpdated = true; break;}
        if(file != nullptr && file->isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

