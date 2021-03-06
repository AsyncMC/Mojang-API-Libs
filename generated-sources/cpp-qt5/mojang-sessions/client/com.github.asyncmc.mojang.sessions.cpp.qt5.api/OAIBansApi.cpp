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

#include "OAIBansApi.h"
#include "OAIHelpers.h"
#include "OAIModelFactory.h"
#include "OAIQObjectWrapper.h"

#include <QJsonArray>
#include <QJsonDocument>

namespace OpenAPI {

OAIBansApi::OAIBansApi() {}

OAIBansApi::~OAIBansApi() {}

OAIBansApi::OAIBansApi(QString host, QString basePath) {
    this->host = host;
    this->basePath = basePath;
}

void
OAIBansApi::getBlockedServerHashes() {
    QString fullPath;
    fullPath.append(this->host).append(this->basePath).append("/blockedservers");



    OAIHttpRequestWorker *worker = new OAIHttpRequestWorker();
    OAIHttpRequestInput input(fullPath, "GET");





    foreach(QString key, this->defaultHeaders.keys()) {
        input.headers.insert(key, this->defaultHeaders.value(key));
    }

    connect(worker,
            &OAIHttpRequestWorker::on_execution_finished,
            this,
            &OAIBansApi::getBlockedServerHashesCallback);

    worker->execute(&input);
}

void
OAIBansApi::getBlockedServerHashesCallback(OAIHttpRequestWorker * worker) {
    QString msg;
    QString error_str = worker->error_str;
    QNetworkReply::NetworkError error_type = worker->error_type;

    if (worker->error_type == QNetworkReply::NoError) {
        msg = QString("Success! %1 bytes").arg(worker->response.length());
    }
    else {
        msg = "Error: " + worker->error_str;
    }

    QString json(worker->response);
    QString* output = static_cast<QString*>(create(json, QString("QString")));
    auto wrapper = new OAIQObjectWrapper<QString*> (output);
    wrapper->deleteLater();
    worker->deleteLater();

    if (worker->error_type == QNetworkReply::NoError) {
        emit getBlockedServerHashesSignal(output);
    } else {
        emit getBlockedServerHashesSignalE(output, error_type, error_str);
        emit getBlockedServerHashesSignalEFull(worker, error_type, error_str);
    }
}


}
