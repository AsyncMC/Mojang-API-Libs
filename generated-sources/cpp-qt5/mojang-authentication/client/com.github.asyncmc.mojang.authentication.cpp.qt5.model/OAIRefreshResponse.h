/**
 * Mojang Authentication API
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
 * OAIRefreshResponse.h
 *
 * 
 */

#ifndef OAIRefreshResponse_H_
#define OAIRefreshResponse_H_

#include <QJsonObject>


#include "com.github.asyncmc.mojang.authentication.cpp.qt5.model\OAIRefreshRequest.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIRefreshResponse: public OAIObject {
public:
    OAIRefreshResponse();
    OAIRefreshResponse(QString json);
    ~OAIRefreshResponse();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIRefreshResponse* fromJson(QString jsonString) override;

    QString* getAccessToken();
    void setAccessToken(QString* access_token);

    QString* getClientToken();
    void setClientToken(QString* client_token);


    virtual bool isSet() override;

private:
    QString* access_token;
    bool m_access_token_isSet;

    QString* client_token;
    bool m_client_token_isSet;

};

}

#endif /* OAIRefreshResponse_H_ */
