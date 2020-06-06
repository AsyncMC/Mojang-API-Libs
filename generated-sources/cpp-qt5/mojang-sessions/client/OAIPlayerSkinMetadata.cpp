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


#include "OAIPlayerSkinMetadata.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIPlayerSkinMetadata::OAIPlayerSkinMetadata(QString json) {
    init();
    this->fromJson(json);
}

OAIPlayerSkinMetadata::OAIPlayerSkinMetadata() {
    init();
}

OAIPlayerSkinMetadata::~OAIPlayerSkinMetadata() {
    this->cleanup();
}

void
OAIPlayerSkinMetadata::init() {
    model = new QString("");
    m_model_isSet = false;
}

void
OAIPlayerSkinMetadata::cleanup() {
    if(model != nullptr) { 
        delete model;
    }
}

OAIPlayerSkinMetadata*
OAIPlayerSkinMetadata::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIPlayerSkinMetadata::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&model, pJson["model"], "QString", "QString");
    
}

QString
OAIPlayerSkinMetadata::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIPlayerSkinMetadata::asJsonObject() {
    QJsonObject obj;
    if(model != nullptr && *model != QString("")){
        toJsonValue(QString("model"), model, obj, QString("QString"));
    }

    return obj;
}

QString*
OAIPlayerSkinMetadata::getModel() {
    return model;
}
void
OAIPlayerSkinMetadata::setModel(QString* model) {
    this->model = model;
    this->m_model_isSet = true;
}


bool
OAIPlayerSkinMetadata::isSet(){
    bool isObjectUpdated = false;
    do{
        if(model != nullptr && *model != QString("")){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

