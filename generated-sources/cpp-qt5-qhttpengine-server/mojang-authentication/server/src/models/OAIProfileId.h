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
 * OAIProfileId.h
 *
 * 
 */

#ifndef OAIProfileId_H
#define OAIProfileId_H

#include <QJsonObject>


#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIProfileId: public OAIObject {
public:
    OAIProfileId();
    OAIProfileId(QString json);
    ~OAIProfileId() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getId() const;
    void setId(const QString &id);

    QString getName() const;
    void setName(const QString &name);

    virtual bool isSet() const override;

private:
    QString id;
    bool m_id_isSet;

    QString name;
    bool m_name_isSet;

};

}

#endif // OAIProfileId_H
