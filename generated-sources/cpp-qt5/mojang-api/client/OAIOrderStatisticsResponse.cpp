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


#include "OAIOrderStatisticsResponse.h"

#include "OAIHelpers.h"

#include <QJsonDocument>
#include <QJsonArray>
#include <QObject>
#include <QDebug>

namespace OpenAPI {

OAIOrderStatisticsResponse::OAIOrderStatisticsResponse(QString json) {
    init();
    this->fromJson(json);
}

OAIOrderStatisticsResponse::OAIOrderStatisticsResponse() {
    init();
}

OAIOrderStatisticsResponse::~OAIOrderStatisticsResponse() {
    this->cleanup();
}

void
OAIOrderStatisticsResponse::init() {
    total = 0L;
    m_total_isSet = false;
    last24h = 0L;
    m_last24h_isSet = false;
    sale_velocity_per_seconds = 0.0;
    m_sale_velocity_per_seconds_isSet = false;
}

void
OAIOrderStatisticsResponse::cleanup() {



}

OAIOrderStatisticsResponse*
OAIOrderStatisticsResponse::fromJson(QString json) {
    QByteArray array (json.toStdString().c_str());
    QJsonDocument doc = QJsonDocument::fromJson(array);
    QJsonObject jsonObject = doc.object();
    this->fromJsonObject(jsonObject);
    return this;
}

void
OAIOrderStatisticsResponse::fromJsonObject(QJsonObject pJson) {
    ::OpenAPI::setValue(&total, pJson["total"], "qint64", "");
    
    ::OpenAPI::setValue(&last24h, pJson["last24h"], "qint64", "");
    
    ::OpenAPI::setValue(&sale_velocity_per_seconds, pJson["saleVelocityPerSeconds"], "double", "");
    
}

QString
OAIOrderStatisticsResponse::asJson ()
{
    QJsonObject obj = this->asJsonObject();
    QJsonDocument doc(obj);
    QByteArray bytes = doc.toJson();
    return QString(bytes);
}

QJsonObject
OAIOrderStatisticsResponse::asJsonObject() {
    QJsonObject obj;
    if(m_total_isSet){
        obj.insert("total", QJsonValue(total));
    }
    if(m_last24h_isSet){
        obj.insert("last24h", QJsonValue(last24h));
    }
    if(m_sale_velocity_per_seconds_isSet){
        obj.insert("saleVelocityPerSeconds", QJsonValue(sale_velocity_per_seconds));
    }

    return obj;
}

qint64
OAIOrderStatisticsResponse::getTotal() {
    return total;
}
void
OAIOrderStatisticsResponse::setTotal(qint64 total) {
    this->total = total;
    this->m_total_isSet = true;
}

qint64
OAIOrderStatisticsResponse::getLast24h() {
    return last24h;
}
void
OAIOrderStatisticsResponse::setLast24h(qint64 last24h) {
    this->last24h = last24h;
    this->m_last24h_isSet = true;
}

double
OAIOrderStatisticsResponse::getSaleVelocityPerSeconds() {
    return sale_velocity_per_seconds;
}
void
OAIOrderStatisticsResponse::setSaleVelocityPerSeconds(double sale_velocity_per_seconds) {
    this->sale_velocity_per_seconds = sale_velocity_per_seconds;
    this->m_sale_velocity_per_seconds_isSet = true;
}


bool
OAIOrderStatisticsResponse::isSet(){
    bool isObjectUpdated = false;
    do{
        if(m_total_isSet){ isObjectUpdated = true; break;}
        if(m_last24h_isSet){ isObjectUpdated = true; break;}
        if(m_sale_velocity_per_seconds_isSet){ isObjectUpdated = true; break;}
    }while(false);
    return isObjectUpdated;
}
}

