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
 * OAIUsernamePassword.h
 *
 * 
 */

#ifndef OAIUsernamePassword_H_
#define OAIUsernamePassword_H_

#include <QJsonObject>


#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIUsernamePassword: public OAIObject {
public:
    OAIUsernamePassword();
    OAIUsernamePassword(QString json);
    ~OAIUsernamePassword();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIUsernamePassword* fromJson(QString jsonString) override;

    QString* getUsername();
    void setUsername(QString* username);

    QString* getPassword();
    void setPassword(QString* password);


    virtual bool isSet() override;

private:
    QString* username;
    bool m_username_isSet;

    QString* password;
    bool m_password_isSet;

};

}

#endif /* OAIUsernamePassword_H_ */
