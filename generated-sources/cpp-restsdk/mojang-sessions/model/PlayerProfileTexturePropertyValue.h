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
 * PlayerProfileTexturePropertyValue.h
 *
 * This is obtained by decoding the \&quot;textures\&quot; property
 */

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_PlayerProfileTexturePropertyValue_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_PlayerProfileTexturePropertyValue_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>
#include "PlayerTexture.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// This is obtained by decoding the \&quot;textures\&quot; property
/// </summary>
class  PlayerProfileTexturePropertyValue
    : public ModelBase
{
public:
    PlayerProfileTexturePropertyValue();
    virtual ~PlayerProfileTexturePropertyValue();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PlayerProfileTexturePropertyValue members

    /// <summary>
    /// UNIX timestamp in milliseconds
    /// </summary>
    int64_t getTimestamp() const;
    
    void setTimestamp(int64_t value);

    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    utility::string_t getProfileId() const;
    
    void setProfileId(const utility::string_t& value);

    /// <summary>
    /// The player&#39;s name
    /// </summary>
    utility::string_t getProfileName() const;
    
    void setProfileName(const utility::string_t& value);

    /// <summary>
    /// Only present if unsigned was set to false in the request
    /// </summary>
    bool isSignatureRequired() const;
    bool signatureRequiredIsSet() const;
    void unsetSignatureRequired();

    void setSignatureRequired(bool value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PlayerTexture> getTextures() const;
    bool texturesIsSet() const;
    void unsetTextures();

    void setTextures(const std::shared_ptr<PlayerTexture>& value);


protected:
    int64_t m_Timestamp;
        utility::string_t m_ProfileId;
        utility::string_t m_ProfileName;
        bool m_SignatureRequired;
    bool m_SignatureRequiredIsSet;
    std::shared_ptr<PlayerTexture> m_Textures;
    bool m_TexturesIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_PlayerProfileTexturePropertyValue_H_ */
