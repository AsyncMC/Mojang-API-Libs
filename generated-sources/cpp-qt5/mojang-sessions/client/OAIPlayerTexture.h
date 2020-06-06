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
 * OAIPlayerTexture.h
 *
 * Provide links to the player&#39;s skin and cape
 */

#ifndef OAIPlayerTexture_H_
#define OAIPlayerTexture_H_

#include <QJsonObject>


#include "OAIPlayerSkinURL.h"
#include "OAIPlayerTextureURL.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIPlayerTexture: public OAIObject {
public:
    OAIPlayerTexture();
    OAIPlayerTexture(QString json);
    ~OAIPlayerTexture();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIPlayerTexture* fromJson(QString jsonString) override;

    OAIPlayerSkinURL* getSkin();
    void setSkin(OAIPlayerSkinURL* skin);

    OAIPlayerTextureURL* getCape();
    void setCape(OAIPlayerTextureURL* cape);


    virtual bool isSet() override;

private:
    OAIPlayerSkinURL* skin;
    bool m_skin_isSet;

    OAIPlayerTextureURL* cape;
    bool m_cape_isSet;

};

}

#endif /* OAIPlayerTexture_H_ */
