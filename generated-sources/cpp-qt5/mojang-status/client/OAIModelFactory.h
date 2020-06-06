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

#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "OAIObject.h"

#include "OAIApiStatus.h"

namespace OpenAPI {

  inline void* create(QString type) {
    if(QString("OAIApiStatus").compare(type) == 0) {
      return new OAIApiStatus();
    }
    
    return nullptr;
  }

  inline void* create(QString json, QString type) {
    if(type.startsWith("QString")) {
      return new QString();
    }    
    auto val = static_cast<OAIObject*>(create(type));
    if(val != nullptr) {
      return val->fromJson(json);
    }
    return nullptr;
  }

}

#endif /* ModelFactory_H_ */