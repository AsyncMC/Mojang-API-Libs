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

#ifndef _OAI_OAIMiscellaneousApi_H_
#define _OAI_OAIMiscellaneousApi_H_

#include "OAIHttpRequest.h"

#include "com.github.asyncmc.mojang.api.cpp.qt5.model\OAIOrderStatisticsRequest.h"
#include "com.github.asyncmc.mojang.api.cpp.qt5.model\OAIOrderStatisticsResponse.h"

#include <QObject>

namespace OpenAPI {

class OAIMiscellaneousApi: public QObject {
    Q_OBJECT

public:
    OAIMiscellaneousApi();
    OAIMiscellaneousApi(QString host, QString basePath);
    ~OAIMiscellaneousApi();

    QString host;
    QString basePath;
    QMap<QString, QString> defaultHeaders;

    void getOrdersStatistics(OAIOrderStatisticsRequest& oai_order_statistics_request);
    
private:
    void getOrdersStatisticsCallback (OAIHttpRequestWorker * worker);
    
signals:
    void getOrdersStatisticsSignal(OAIOrderStatisticsResponse* summary);
    
    void getOrdersStatisticsSignalE(OAIOrderStatisticsResponse* summary, QNetworkReply::NetworkError error_type, QString& error_str);
    
    void getOrdersStatisticsSignalEFull(OAIHttpRequestWorker* worker, QNetworkReply::NetworkError error_type, QString& error_str);
    
};

}
#endif