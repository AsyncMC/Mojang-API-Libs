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

/*
 * OAIError.h
 *
 * This is returned when the request fails
 */

#ifndef OAIError_H
#define OAIError_H

#include <QJsonObject>


#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIError: public OAIObject {
public:
    OAIError();
    OAIError(QString json);
    ~OAIError() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getError() const;
    void setError(const QString &error);

    QString getErrorMessage() const;
    void setErrorMessage(const QString &error_message);

    virtual bool isSet() const override;

private:
    QString error;
    bool m_error_isSet;

    QString error_message;
    bool m_error_message_isSet;

};

}

#endif // OAIError_H
