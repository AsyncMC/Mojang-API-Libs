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

#ifndef OAI_OAILoginApiHandler_H
#define OAI_OAILoginApiHandler_H

#include <QObject>

#include "com.github.asyncmc.mojang.sessions.cpp.qt5.qhttpengine.server.model\OAIPlayerProfile.h"
#include "com.github.asyncmc.mojang.sessions.cpp.qt5.qhttpengine.server.model\OAISessionApiError.h"
#include <QString>

namespace OpenAPI {

class OAILoginApiHandler : public QObject
{
    Q_OBJECT
    
public:
    OAILoginApiHandler();
    virtual ~OAILoginApiHandler();


public slots:
    virtual void getPlayerProfile(QString stripped_uuid, bool _unsigned);
    

};

}

#endif // OAI_OAILoginApiHandler_H
