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
 * OAISecurityAnswerId.h
 *
 * A security question answer id given by Mojang
 */

#ifndef OAISecurityAnswerId_H
#define OAISecurityAnswerId_H

#include <QJsonObject>



#include "OAIObject.h"

namespace OpenAPI {

class OAISecurityAnswerId: public OAIObject {
public:
    OAISecurityAnswerId();
    OAISecurityAnswerId(QString json);
    ~OAISecurityAnswerId() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    qint32 getId() const;
    void setId(const qint32 &id);

    virtual bool isSet() const override;

private:
    qint32 id;
    bool m_id_isSet;

};

}

#endif // OAISecurityAnswerId_H
