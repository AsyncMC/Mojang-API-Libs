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
/*
 * PlayerProfileTexturePropertyValue.h
 *
 * This is obtained by decoding the \&quot;textures\&quot; property
 */

#ifndef PlayerProfileTexturePropertyValue_H_
#define PlayerProfileTexturePropertyValue_H_


#include "ModelBase.h"

#include <string>
#include "PlayerTexture.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace pistache {
namespace server {
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

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// PlayerProfileTexturePropertyValue members

    /// <summary>
    /// UNIX timestamp in milliseconds
    /// </summary>
    int64_t getTimestamp() const;
    void setTimestamp(int64_t const value);
        /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    std::string getProfileId() const;
    void setProfileId(std::string const& value);
        /// <summary>
    /// The player&#39;s name
    /// </summary>
    std::string getProfileName() const;
    void setProfileName(std::string const& value);
        /// <summary>
    /// Only present if unsigned was set to false in the request
    /// </summary>
    bool isSignatureRequired() const;
    void setSignatureRequired(bool const value);
    bool signatureRequiredIsSet() const;
    void unsetSignatureRequired();
    /// <summary>
    /// 
    /// </summary>
    PlayerTexture getTextures() const;
    void setTextures(PlayerTexture const& value);
    bool texturesIsSet() const;
    void unsetTextures();

protected:
    int64_t m_Timestamp;

    std::string m_ProfileId;

    std::string m_ProfileName;

    bool m_SignatureRequired;
    bool m_SignatureRequiredIsSet;
    PlayerTexture m_Textures;
    bool m_TexturesIsSet;
};

}
}
}
}
}
}
}
}
}

#endif /* PlayerProfileTexturePropertyValue_H_ */
