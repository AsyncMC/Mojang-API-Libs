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
 * OAIInline_object.h
 *
 * 
 */

#ifndef OAIInline_object_H_
#define OAIInline_object_H_

#include <QJsonObject>


#include "OAIHttpRequest.h"
#include "OAISkinModel.h"

#include "OAIObject.h"

namespace OpenAPI {

class OAIInline_object: public OAIObject {
public:
    OAIInline_object();
    OAIInline_object(QString json);
    ~OAIInline_object();
    void init();
    void cleanup();

    QString asJson () override;
    QJsonObject asJsonObject() override;
    void fromJsonObject(QJsonObject json) override;
    OAIInline_object* fromJson(QString jsonString) override;

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

#endif /* OAIInline_object_H_ */
