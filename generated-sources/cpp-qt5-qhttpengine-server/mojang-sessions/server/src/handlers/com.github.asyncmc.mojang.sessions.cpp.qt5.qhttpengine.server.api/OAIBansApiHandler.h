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

#ifndef OAI_OAIBansApiHandler_H
#define OAI_OAIBansApiHandler_H

#include <QObject>

#include <QString>

namespace OpenAPI {

class OAIBansApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAIBansApiHandler();
    virtual ~OAIBansApiHandler();


public slots:
    virtual void getBlockedServerHashes();
    

};

}

#endif // OAI_OAIBansApiHandler_H