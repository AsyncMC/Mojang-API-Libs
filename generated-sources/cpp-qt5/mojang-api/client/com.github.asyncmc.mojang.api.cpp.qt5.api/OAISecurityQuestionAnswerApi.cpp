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

#include "OAISecurityQuestionAnswerApi.h"
#include "OAIHelpers.h"
#include "OAIModelFactory.h"
#include "OAIQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAISecurityQuestionAnswerApi::OAISecurityQuestionAnswerApi() {}

OAISecurityQuestionAnswerApi::~OAISecurityQuestionAnswerApi() {}

OAISecurityQuestionAnswerApi::OAISecurityQuestionAnswerApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
OAISecurityQuestionAnswerApi::checkSecurityStatus() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/security/location");



    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAISecurityQuestionAnswerApi::checkSecurityStatusCallback);

    worker->execute(&input);
}

void
OAISecurityQuestionAnswerApi::checkSecurityStatusCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit checkSecurityStatusSignal();
    } else {
        emit checkSecurityStatusSignalE(error_type, error_str);
        emit checkSecurityStatusSignalEFull(worker, error_type, error_str);
    }
}

void
OAISecurityQuestionAnswerApi::listPendingSecurityQuestions() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/security/challenges");



    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAISecurityQuestionAnswerApi::listPendingSecurityQuestionsCallback);

    worker->execute(&input);
}

void
OAISecurityQuestionAnswerApi::listPendingSecurityQuestionsCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QList<OAISecurityChallenge*>* output = new QList<OAISecurityChallenge*>();
    QString json(worker->response);
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonArray jsonArray = doc.array();
    auto wrapper = new OAIQObjectWrapper<QList<OAISecurityChallenge*>*> (output);
    wrapper->deleteLater();
    foreach(QJsonValue obj, jsonArray) {
        OAISecurityChallenge* o = new OAISecurityChallenge();
        QJsonObject jv = obj.toObject();
        QJsonObject * ptr = (QJsonObject*)&jv;
        o->fromJsonObject(*ptr);
        auto objwrapper = new OAIQObjectWrapper<OAISecurityChallenge*> (o);
        objwrapper->deleteLater();
        output->append(o);
    }
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit listPendingSecurityQuestionsSignal(output);
    } else {
        emit listPendingSecurityQuestionsSignalE(output, error_type, error_str);
        emit listPendingSecurityQuestionsSignalEFull(worker, error_type, error_str);
    }
}

void
OAISecurityQuestionAnswerApi::sendSecurityQuestionAnswers(QList<OAISecurityAnswer*>*& oai_security_answer) {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/user/security/location");



    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "POST");


    QJsonObject oai_security_answer_jobj;
    toJsonArray((QList<void*>*)oai_security_answer, oai_security_answer_jobj, QString("body"), QString("OAIUser*"));

    QJsonDocument doc(oai_security_answer_jobj);
    QByteArray bytes = doc.toJson();

    input.request_body.append(bytes);
    


    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAISecurityQuestionAnswerApi::sendSecurityQuestionAnswersCallback);

    worker->execute(&input);
}

void
OAISecurityQuestionAnswerApi::sendSecurityQuestionAnswersCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit sendSecurityQuestionAnswersSignal();
    } else {
        emit sendSecurityQuestionAnswersSignalE(error_type, error_str);
        emit sendSecurityQuestionAnswersSignalEFull(worker, error_type, error_str);
    }
}


}