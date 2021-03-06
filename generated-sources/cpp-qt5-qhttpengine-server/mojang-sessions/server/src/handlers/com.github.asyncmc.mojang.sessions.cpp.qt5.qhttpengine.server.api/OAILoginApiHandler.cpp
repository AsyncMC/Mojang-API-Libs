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

#include <QJsonArray>
#include <QJsonDocument>
#include <QJsonObject>
#include <QVariantMap>
#include <QDebug>

#include "OAILoginApiHandler.h"
#include "OAILoginApiRequest.h"

namespace OpenAPI {

OAILoginApiHandler::OAILoginApiHandler(){

}

OAILoginApiHandler::~OAILoginApiHandler(){

}

void OAILoginApiHandler::getPlayerProfile(QString stripped_uuid, bool _unsigned) {
    Q_UNUSED(stripped_uuid);
    Q_UNUSED(_unsigned);
    auto reqObj = qobject_cast<OAILoginApiRequest*>(sender());
    if( reqObj != nullptr ) 
    { 
        OAIPlayerProfile res;
        reqObj->getPlayerProfileResponse(res);
    }    
}


}
