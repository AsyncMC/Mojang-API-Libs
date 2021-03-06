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

#ifndef OAI_OAIDefaultApiRequest_H
#define OAI_OAIDefaultApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIAccessKeys.h"
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIAuthentication.h"
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIAuthenticationRequest.h"
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIError.h"
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIRefreshRequest.h"
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIRefreshResponse.h"
#include "com.github.asyncmc.mojang.authentication.cpp.qt5.qhttpengine.server.model\OAIUsernamePassword.h"
#include <QString>
#include "OAIDefaultApiHandler.h"

namespace OpenAPI {

class OAIDefaultApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIDefaultApiRequest(QHttpEngine::Socket *s, OAIDefaultApiHandler* handler);
    virtual ~OAIDefaultApiRequest();

    void authenticateRequest();
    void invalidateRequest();
    void refreshRequest();
    void siginoutRequest();
    void validateRequest();
    

    void authenticateResponse(const OAIAuthentication& res);
    void invalidateResponse();
    void refreshResponse(const OAIRefreshResponse& res);
    void siginoutResponse();
    void validateResponse();
    

    void authenticateError(const OAIAuthentication& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void invalidateError(QNetworkReply::NetworkError error_type, QString& error_str);
    void refreshError(const OAIRefreshResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void siginoutError(QNetworkReply::NetworkError error_type, QString& error_str);
    void validateError(QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void authenticate(OAIAuthenticationRequest oai_authentication_request);
    void invalidate(OAIAccessKeys oai_access_keys);
    void refresh(OAIRefreshRequest oai_refresh_request);
    void siginout(OAIUsernamePassword oai_username_password);
    void validate(OAIAccessKeys oai_access_keys);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAIDefaultApiHandler *handler;

    inline void writeResponseHeaders(){
        QHttpEngine::Socket::HeaderMap resHeaders;
        for(auto itr = responseHeaders.begin(); itr != responseHeaders.end(); ++itr) {
            resHeaders.insert(itr.key().toUtf8(), itr.value().toUtf8());
        }
        socket->setHeaders(resHeaders);
        socket->writeHeaders();
    }
};

}

#endif // OAI_OAIDefaultApiRequest_H
