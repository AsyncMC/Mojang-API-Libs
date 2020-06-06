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

#ifndef OAI_OAISecurityQuestionAnswerApiRequest_H
#define OAI_OAISecurityQuestionAnswerApiRequest_H

#include <QObject>
#include <QStringList>
#include <QMultiMap>
#include <QNetworkReply>
#include <QSharedPointer>

#include <qhttpengine/socket.h>
#include "OAIError.h"
#include "OAISecurityAnswer.h"
#include "OAISecurityChallenge.h"
#include <QList>
#include <QString>
#include "OAISecurityQuestionAnswerApiHandler.h"

namespace OpenAPI {

class OAISecurityQuestionAnswerApiRequest : public QObject
{
    Q_OBJECT

public:
    OAISecurityQuestionAnswerApiRequest(QHttpEngine::Socket *s, OAISecurityQuestionAnswerApiHandler* handler);
    virtual ~OAISecurityQuestionAnswerApiRequest();

    void checkSecurityStatusRequest();
    void listPendingSecurityQuestionsRequest();
    void sendSecurityQuestionAnswersRequest();
    

    void checkSecurityStatusResponse();
    void listPendingSecurityQuestionsResponse(const QList<OAISecurityChallenge>& res);
    void sendSecurityQuestionAnswersResponse();
    

    void checkSecurityStatusError(QNetworkReply::NetworkError error_type, QString& error_str);
    void listPendingSecurityQuestionsError(const QList<OAISecurityChallenge>& res, QNetworkReply::NetworkError error_type, QString& error_str);
    void sendSecurityQuestionAnswersError(QNetworkReply::NetworkError error_type, QString& error_str);
    

    void sendCustomResponse(QByteArray & res, QNetworkReply::NetworkError error_type);

    void sendCustomResponse(QIODevice *res, QNetworkReply::NetworkError error_type);

    QMap<QString, QString> getRequestHeaders() const;

    QHttpEngine::Socket* getRawSocket();

    void setResponseHeaders(const QMultiMap<QString,QString>& headers);

signals:
    void checkSecurityStatus();
    void listPendingSecurityQuestions();
    void sendSecurityQuestionAnswers(QList<OAISecurityAnswer> oai_security_answer);
    

private:
    QMap<QString, QString> requestHeaders;
    QMap<QString, QString> responseHeaders;
    QHttpEngine::Socket  *socket;
    OAISecurityQuestionAnswerApiHandler *handler;

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

#endif // OAI_OAISecurityQuestionAnswerApiRequest_H
