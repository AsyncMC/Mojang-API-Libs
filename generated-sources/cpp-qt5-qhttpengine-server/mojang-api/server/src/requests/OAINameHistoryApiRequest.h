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

#ifndef OAI_OAINameHistoryApiRequest_H
#define OAI_OAINameHistoryApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAICurrentPlayerIDs.h"
#include "OAIError.h"
#include "OAINameChange.h"
#include <QList>
#include <QString>
#include "OAINameHistoryApiHandler.h"

namespace OpenAPI {

class OAINameHistoryApiRequest : public QObject
{
    Q_OBJECT

public:
    OAINameHistoryApiRequest(QHttpEngine::Socket *s, OAINameHistoryApiHandler* handler);
    virtual ~OAINameHistoryApiRequest();

    void findUniqueIdsByNameRequest();
    void getNameHistoryRequest(const QString& stripped_uuid);
    void getUniqueIdByNameRequest(const QString& username);
    

    void findUniqueIdsByNameResponse(const QList<OAICurrentPlayerIDs>& res);
    void getNameHistoryResponse(const QList<OAINameChange>& res);
    void getUniqueIdByNameResponse(const OAICurrentPlayerIDs& res);
    

    void findUniqueIdsByNameError(const QList<OAICurrentPlayerIDs>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getNameHistoryError(const QList<OAINameChange>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void getUniqueIdByNameError(const OAICurrentPlayerIDs& res, QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void findUniqueIdsByName(QList<QString> request_body);
    void getNameHistory(QString stripped_uuid);
    void getUniqueIdByName(QString username, qint64 at);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAINameHistoryApiHandler *handler;

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

#endif // OAI_OAINameHistoryApiRequest_H
