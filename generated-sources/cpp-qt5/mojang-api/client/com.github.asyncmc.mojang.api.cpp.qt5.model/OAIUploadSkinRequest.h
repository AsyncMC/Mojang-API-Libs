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
 * OAIUploadSkinRequest.h
 *
 * 
 */

#ifndef OAIUploadSkinRequest_H_
#define OAIUploadSkinRequest_H_

#include <QJsonObject>


#include "OAIHttpRequest.h"
#include "com.github.asyncmc.mojang.api.cpp.qt5.model\OAISkinModel.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIUploadSkinRequest: public OAIObject {
public:
    OAIUploadSkinRequest();
    OAIUploadSkinRequest(QString json);
    ~OAIUploadSkinRequest();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIUploadSkinRequest* fromJson(QString jsonString) override;

    OAISkinModel* getModel();
    void setModel(OAISkinModel* model);

    OAIHttpRequestInputFileElement* getFile();
    void setFile(OAIHttpRequestInputFileElement* file);


    virtual bool isSet() override;

private:
    OAISkinModel* model;
    bool m_model_isSet;

    OAIHttpRequestInputFileElement* file;
    bool m_file_isSet;

};

}

#endif /* OAIUploadSkinRequest_H_ */
