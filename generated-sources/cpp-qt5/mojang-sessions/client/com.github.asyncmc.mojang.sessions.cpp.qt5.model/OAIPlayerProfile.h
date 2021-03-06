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
 * OAIPlayerProfile.h
 *
 * 
 */

#ifndef OAIPlayerProfile_H_
#define OAIPlayerProfile_H_

#include <QJsonObject>


#include "com.github.asyncmc.mojang.sessions.cpp.qt5.model\OAIPlayerProfileProperty.h"
#include <QList>
#include <QString>

#include "OAIObject.h"

namespace OpenAPI {

class OAIPlayerProfile: public OAIObject {
public:
    OAIPlayerProfile();
    OAIPlayerProfile(QString json);
    ~OAIPlayerProfile();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIPlayerProfile* fromJson(QString jsonString) override;

    QString* getId();
    void setId(QString* id);

    QString* getName();
    void setName(QString* name);

    bool isLegacy();
    void setLegacy(bool legacy);

    QList<OAIPlayerProfileProperty*>* getProperties();
    void setProperties(QList<OAIPlayerProfileProperty*>* properties);


    virtual bool isSet() override;

private:
    QString* id;
    bool m_id_isSet;

    QString* name;
    bool m_name_isSet;

    bool legacy;
    bool m_legacy_isSet;

    QList<OAIPlayerProfileProperty*>* properties;
    bool m_properties_isSet;

};

}

#endif /* OAIPlayerProfile_H_ */
