/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * PlayerSkinURL.h
 *
 * Wraps the URL to the texture and configures the player&#39;s model
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PlayerSkinURL_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PlayerSkinURL_H_


#include <cpprest/details/basic_types.h>
#include "PlayerTextureURL.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// Wraps the URL to the texture and configures the player&#39;s model
/// </summary>
class  PlayerSkinURL
    : public PlayerTextureURL
{
public:
    PlayerSkinURL();
    virtual ~PlayerSkinURL();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PlayerSkinURL members


protected:
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PlayerSkinURL_H_ */
