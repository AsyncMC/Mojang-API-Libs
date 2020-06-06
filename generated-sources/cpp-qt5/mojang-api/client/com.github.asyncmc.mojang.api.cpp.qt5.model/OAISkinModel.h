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
 * OAISkinModel.h
 *
 * Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
 */

#ifndef OAISkinModel_H_
#define OAISkinModel_H_

#include <QJsonObject>



#include "OAIObject.h"

namespace OpenAPI {

class OAISkinModel: public OAIObject {
public:
    OAISkinModel();
    OAISkinModel(QString json);
    ~OAISkinModel();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAISkinModel* fromJson(QString jsonString) override;


    virtual bool isSet() override;

private:
};

}

#endif /* OAISkinModel_H_ */