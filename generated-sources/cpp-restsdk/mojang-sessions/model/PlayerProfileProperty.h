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
 * PlayerProfileProperty.h
 *
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_MODEL_PlayerProfileProperty_H_
#define COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_MODEL_PlayerProfileProperty_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace model {

/// <summary>
/// A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
/// </summary>
class  PlayerProfileProperty
    : public ModelBase
{
public:
    PlayerProfileProperty();
    virtual ~PlayerProfileProperty();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PlayerProfileProperty members

    /// <summary>
    /// The property name
    /// </summary>
    utility::string_t getName() const;
    
    void setName(const utility::string_t& value);

    /// <summary>
    /// The serialized property value in base64.
    /// </summary>
    utility::string_t getValue() const;
    
    void setValue(const utility::string_t& value);

    /// <summary>
    /// signed data using Yggdrasil&#39;s private key
    /// </summary>
    utility::string_t getSignature() const;
    bool signatureIsSet() const;
    void unsetSignature();

    void setSignature(const utility::string_t& value);


protected:
    utility::string_t m_Name;
        utility::string_t m_Value;
        utility::string_t m_Signature;
    bool m_SignatureIsSet;
};

}
}
}
}
}
}
}
}

#endif /* COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_MODEL_PlayerProfileProperty_H_ */
