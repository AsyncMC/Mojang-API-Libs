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

#ifndef OAI_HELPERS_H
#define OAI_HELPERS_H

#include <QJsonObject>
#include <QJsonValue>
#include <QList>
#include <QMap>

namespace OpenAPI {

    void setValue(void* value, QJsonValue obj, QString type, QString complexType);
    void toJsonArray(QList<void*>* value, QJsonObject& output, QString innerName, QString innerType);
    void toJsonValue(QString name, void* value, QJsonObject& output, QString type);
    void toJsonMap(QMap<QString, void*>* value, QJsonObject& output, QString innerName, QString innerType);
    bool isCompatibleJsonValue(QString type);
    QString stringValue(QString* value);
    QString stringValue(qint32 value);
    QString stringValue(qint64 value);
    QString stringValue(bool value);

}

#endif // OAI_HELPERS_H
