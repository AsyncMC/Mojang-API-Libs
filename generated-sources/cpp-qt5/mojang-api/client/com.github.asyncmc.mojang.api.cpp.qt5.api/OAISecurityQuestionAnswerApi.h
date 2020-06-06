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

#ifndef _OAI_OAISecurityQuestionAnswerApi_H_
#define _OAI_OAISecurityQuestionAnswerApi_H_

#include "OAIHttpRequest.h"

#include "com.github.asyncmc.mojang.api.cpp.qt5.model\OAIError.h"
#include "com.github.asyncmc.mojang.api.cpp.qt5.model\OAISecurityAnswer.h"
#include "com.github.asyncmc.mojang.api.cpp.qt5.model\OAISecurityChallenge.h"
#include <QList>

#include <QObject>

namespace OpenAPI {

class OAISecurityQuestionAnswerApi: public QObject {
    Q_OBJECT

public:
    OAISecurityQuestionAnswerApi();
    OAISecurityQuestionAnswerApi(QString host, QString basePath);
    ~OAISecurityQuestionAnswerApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void checkSecurityStatus();
    void listPendingSecurityQuestions();
    void sendSecurityQuestionAnswers(QList<OAISecurityAnswer*>*& oai_security_answer);
    
private:
    void checkSecurityStatusCallback (OAIHttpRequestWorker * worker);
    void listPendingSecurityQuestionsCallback (OAIHttpRequestWorker * worker);
    void sendSecurityQuestionAnswersCallback (OAIHttpRequestWorker * worker);
    
signals:
    void checkSecurityStatusSignal();
    void listPendingSecurityQuestionsSignal(QList<OAISecurityChallenge*>* summary);
    void sendSecurityQuestionAnswersSignal();
    
    void checkSecurityStatusSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    void listPendingSecurityQuestionsSignalE(QList<OAISecurityChallenge*>* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    void sendSecurityQuestionAnswersSignalE(QNetworkReply::NetworkError error_type, QString& error_str);
    
    void checkSecurityStatusSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void listPendingSecurityQuestionsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    void sendSecurityQuestionAnswersSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif