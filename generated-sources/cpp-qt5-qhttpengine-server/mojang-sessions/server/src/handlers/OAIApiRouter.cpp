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


#include "OAIApiRouter.h"
#include "OAIBansApiRequest.h"
#include "OAILoginApiRequest.h"


namespace OpenAPI {

OAIApiRouter::OAIApiRouter() {
    createApiHandlers();
}

OAIApiRouter::~OAIApiRouter(){
    
    delete OAIBansApiApiHandler;
    delete OAILoginApiApiHandler;
}

void OAIApiRouter::createApiHandlers() { 
    OAIBansApiApiHandler = new OAIBansApiHandler();
    OAILoginApiApiHandler = new OAILoginApiHandler();
}

void OAIApiRouter::setUpRoutes() {
    
    Routes.insert(QString("%1 %2").arg("GET").arg("/blockedservers").toLower(), [this](QHttpEngine::Socket *socket) {
            auto reqObj = new OAIBansApiRequest(socket, OAIBansApiApiHandler);
            reqObj->getBlockedServerHashesRequest();
    });
}

void OAIApiRouter::processRequest(QHttpEngine::Socket *socket){
    if( handleRequest(socket) ){
        return;
    }
    if( handleRequestAndExtractPathParam(socket) ){
        return;
    }
    socket->setStatusCode(QHttpEngine::Socket::NotFound);
    if(socket->isOpen()){
        socket->writeHeaders();
        socket->close();
    }
}

bool OAIApiRouter::handleRequest(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    if ( Routes.contains(reqPath) ) {
        Routes.value(reqPath).operator()(socket);
        return true;
    }
    return false;
}

bool OAIApiRouter::handleRequestAndExtractPathParam(QHttpEngine::Socket *socket){
    auto reqPath = QString("%1 %2").arg(fromQHttpEngineMethod(socket->method())).arg(socket->path()).toLower();
    {
        auto completePath = QString("%1 %2").arg("GET").arg("/session/minecraft/profile/{stripped_uuid}").toLower();
        if ( reqPath.startsWith(completePath.leftRef( completePath.indexOf(QString("/{")))) ) {
            QRegularExpressionMatch match = getRequestMatch( completePath, reqPath );
            if ( match.hasMatch() ){
                QString stripped_uuid = match.captured(QString("stripped_uuid").toLower());
                auto reqObj = new OAILoginApiRequest(socket, OAILoginApiApiHandler);
                reqObj->getPlayerProfileRequest(stripped_uuid);
                return true;
            }
        }
    }
    return false;
}

}
