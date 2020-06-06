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
 * OAIGameProfile.h
 *
 * 
 */

#ifndef OAIGameProfile_H
#define OAIGameProfile_H

#include <QJsonObject>


#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIGameProfile: public OAIObject {
public:
    OAIGameProfile();
    OAIGameProfile(QString json);
    ~OAIGameProfile() override;
    void init();

    QString asJson () const override;
    QJsonObject asJsonObject() const override;
    void fromJsonObject(QJsonObject json) override;
    void fromJson(QString jsonString) override;

    QString getAgent() const;
    void setAgent(const QString &agent);

    QString getId() const;
    void setId(const QString &id);

    QString getName() const;
    void setName(const QString &name);

    QString getUserId() const;
    void setUserId(const QString &user_id);

    qint64 getCreatedAt() const;
    void setCreatedAt(const qint64 &created_at);

    bool isLegacyProfile() const;
    void setLegacyProfile(const bool &legacy_profile);

    bool isSuspended() const;
    void setSuspended(const bool &suspended);

    bool isPaid() const;
    void setPaid(const bool &paid);

    bool isMigrated() const;
    void setMigrated(const bool &migrated);

    bool isLegacy() const;
    void setLegacy(const bool &legacy);

    virtual bool isSet() const override;

private:
    QString agent;
    bool m_agent_isSet;

    QString id;
    bool m_id_isSet;

    QString name;
    bool m_name_isSet;

    QString user_id;
    bool m_user_id_isSet;

    qint64 created_at;
    bool m_created_at_isSet;

    bool legacy_profile;
    bool m_legacy_profile_isSet;

    bool suspended;
    bool m_suspended_isSet;

    bool paid;
    bool m_paid_isSet;

    bool migrated;
    bool m_migrated_isSet;

    bool legacy;
    bool m_legacy_isSet;

};

}

#endif // OAIGameProfile_H