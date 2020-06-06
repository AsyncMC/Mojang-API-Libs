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
 * OAIPlayerSkinURL.h
 *
 * Wraps the URL to the texture and configures the player&#39;s model
 */

#ifndef OAIPlayerSkinURL_H_
#define OAIPlayerSkinURL_H_

#include <QJsonObject>


#include "OAIPlayerTextureURL.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIPlayerSkinURL: public OAIObject {
public:
    OAIPlayerSkinURL();
    OAIPlayerSkinURL(QString json);
    ~OAIPlayerSkinURL();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIPlayerSkinURL* fromJson(QString jsonString) override;

    QString* getUrl();
    void setUrl(QString* url);


    virtual bool isSet() override;

private:
    QString* url;
    bool m_url_isSet;

};

}

#endif /* OAIPlayerSkinURL_H_ */
