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

#ifndef OAI_OAIMiscellaneousApiRequest_H
#define OAI_OAIMiscellaneousApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "com.github.asyncmc.mojang.api.cpp.qt5.qhttpengine.server.model\OAIOrderStatisticsRequest.h"
#include "com.github.asyncmc.mojang.api.cpp.qt5.qhttpengine.server.model\OAIOrderStatisticsResponse.h"
#include <QString>
#include "OAIMiscellaneousApiHandler.h"

namespace OpenAPI {

class OAIMiscellaneousApiRequest : public QObject
{
    Q_OBJECT

public:
    OAIMiscellaneousApiRequest(QHttpEngine::Socket *s, OAIMiscellaneousApiHandler* handler);
    virtual ~OAIMiscellaneousApiRequest();

    void getOrdersStatisticsRequest();
    

    void getOrdersStatisticsResponse(const OAIOrderStatisticsResponse& res);
    

    void getOrdersStatisticsError(const OAIOrderStatisticsResponse& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void getOrdersStatistics(OAIOrderStatisticsRequest oai_order_statistics_request);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAIMiscellaneousApiHandler *handler;

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

#endif // OAI_OAIMiscellaneousApiRequest_H
