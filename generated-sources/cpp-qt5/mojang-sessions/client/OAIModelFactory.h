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

#ifndef ModelFactory_H_
#define ModelFactory_H_

#include "OAIObject.h"

#include "OAIPlayerProfile.h"
#include "OAIPlayerProfileProperty.h"
#include "OAIPlayerProfileTexturePropertyValue.h"
#include "OAIPlayerSkinMetadata.h"
#include "OAIPlayerSkinURL.h"
#include "OAIPlayerTexture.h"
#include "OAIPlayerTextureURL.h"
#include "OAISessionApiError.h"

namespace OpenAPI {

  inline void* create(QString type) {
    if(QString("OAIPlayerProfile").compare(type) == 0) {
      return new OAIPlayerProfile();
    }
    if(QString("OAIPlayerProfileProperty").compare(type) == 0) {
      return new OAIPlayerProfileProperty();
    }
    if(QString("OAIPlayerProfileTexturePropertyValue").compare(type) == 0) {
      return new OAIPlayerProfileTexturePropertyValue();
    }
    if(QString("OAIPlayerSkinMetadata").compare(type) == 0) {
      return new OAIPlayerSkinMetadata();
    }
    if(QString("OAIPlayerSkinURL").compare(type) == 0) {
      return new OAIPlayerSkinURL();
    }
    if(QString("OAIPlayerTexture").compare(type) == 0) {
      return new OAIPlayerTexture();
    }
    if(QString("OAIPlayerTextureURL").compare(type) == 0) {
      return new OAIPlayerTextureURL();
    }
    if(QString("OAISessionApiError").compare(type) == 0) {
      return new OAISessionApiError();
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
