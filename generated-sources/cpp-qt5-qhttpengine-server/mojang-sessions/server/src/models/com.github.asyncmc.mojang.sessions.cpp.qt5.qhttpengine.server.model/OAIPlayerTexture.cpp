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


#include "OAIPlayerTexture.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIPlayerTexture::OAIPlayerTexture(QString json) {
    this->fromJson(json);
}

OAIPlayerTexture::OAIPlayerTexture() {
    this->init();
}

OAIPlayerTexture::~OAIPlayerTexture() {

}

void
OAIPlayerTexture::init() {
    m_skin_isSet = false;
    m_cape_isSet = false;
}

void
OAIPlayerTexture::fromJson(QString jsonString) {
    QByteArray array (jsonString.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
}

void
OAIPlayerTexture::fromJsonObject(QJsonObject json) {
    ::OpenAPI::fromJsonValue(skin, json[QString("SKIN")]);
    
    ::OpenAPI::fromJsonValue(cape, json[QString("CAPE")]);
    
}

QString
OAIPlayerTexture::asJson () const {
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIPlayerTexture::asJsonObject() const {
    QJsonObject obj;
	if(skin.isSet()){
        obj.insert(QString("SKIN"), ::OpenAPI::toJsonValue(skin));
    }
	if(cape.isSet()){
        obj.insert(QString("CAPE"), ::OpenAPI::toJsonValue(cape));
    }
    return obj;
}

OAIPlayerSkinURL
OAIPlayerTexture::getSkin() const {
    return skin;
}
void
OAIPlayerTexture::setSkin(const OAIPlayerSkinURL &skin) {
    this->skin = skin;
    this->m_skin_isSet = true;
}

OAIPlayerTextureURL
OAIPlayerTexture::getCape() const {
    return cape;
}
void
OAIPlayerTexture::setCape(const OAIPlayerTextureURL &cape) {
    this->cape = cape;
    this->m_cape_isSet = true;
}


bool
OAIPlayerTexture::isSet() const {
    bool isObjectUpdated = false;
    do{ 
        if(skin.isSet()){ isObjectUpdated = true; break;}
    
        if(cape.isSet()){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}

}
