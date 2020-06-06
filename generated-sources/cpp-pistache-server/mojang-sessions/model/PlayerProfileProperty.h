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
 * PlayerProfileProperty.h
 *
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */

#ifndef PlayerProfileProperty_H_
#define PlayerProfileProperty_H_


#include "ModelBase.h"

#include <string>

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

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// PlayerProfileProperty members

    /// <summary>
    /// The property name
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
        /// <summary>
    /// The serialized property value in base64.
    /// </summary>
    std::string getValue() const;
    void setValue(std::string const& value);
        /// <summary>
    /// signed data using Yggdrasil&#39;s private key
    /// </summary>
    std::string getSignature() const;
    void setSignature(std::string const& value);
    bool signatureIsSet() const;
    void unsetSignature();

protected:
    std::string m_Name;

    std::string m_Value;

    std::string m_Signature;
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
}

#endif /* PlayerProfileProperty_H_ */
