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

/*
 * OAIPlayerProfileTexturePropertyValue.h
 *
 * This is obtained by decoding the \&quot;textures\&quot; property
 */

#ifndef OAIPlayerProfileTexturePropertyValue_H_
#define OAIPlayerProfileTexturePropertyValue_H_

#include <QJsonObject>


#include "com.github.asyncmc.mojang.sessions.cpp.qt5.model\OAIPlayerTexture.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIPlayerProfileTexturePropertyValue: public OAIObject {
public:
    OAIPlayerProfileTexturePropertyValue();
    OAIPlayerProfileTexturePropertyValue(QString json);
    ~OAIPlayerProfileTexturePropertyValue();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIPlayerProfileTexturePropertyValue* fromJson(QString jsonString) override;

    qint64 getTimestamp();
    void setTimestamp(qint64 timestamp);

    QString* getProfileId();
    void setProfileId(QString* profile_id);

    QString* getProfileName();
    void setProfileName(QString* profile_name);

    bool isSignatureRequired();
    void setSignatureRequired(bool signature_required);

    OAIPlayerTexture* getTextures();
    void setTextures(OAIPlayerTexture* textures);


    virtual bool isSet() override;

private:
    qint64 timestamp;
    bool m_timestamp_isSet;

    QString* profile_id;
    bool m_profile_id_isSet;

    QString* profile_name;
    bool m_profile_name_isSet;

    bool signature_required;
    bool m_signature_required_isSet;

    OAIPlayerTexture* textures;
    bool m_textures_isSet;

};

}

#endif /* OAIPlayerProfileTexturePropertyValue_H_ */
