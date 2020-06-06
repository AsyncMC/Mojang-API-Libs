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
 * OAIAuthentication.h
 *
 * 
 */

#ifndef OAIAuthentication_H
#define OAIAuthentication_H

#include <QJsonObject>


#include "OAIAccessKeys.h"
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIAuthentication: public OAIObject {
public:
    OAIAuthentication();
    OAIAuthentication(QString json);
    ~OAIAuthentication() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAccessToken() const;
    void setAccessToken(const QString &access_token);

    QString getClientToken() const;
    void setClientToken(const QString &client_token);

    virtual bool isSet() const override;

private:
    QString access_token;
    bool m_access_token_isSet;

    QString client_token;
    bool m_client_token_isSet;

};

}

#endif // OAIAuthentication_H
