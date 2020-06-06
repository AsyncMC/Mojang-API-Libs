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
 * PlayerTexture.h
 *
 * Provide links to the player&#39;s skin and cape
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_MODEL_PlayerTexture_H_
#define COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_MODEL_PlayerTexture_H_


#include "../ModelBase.h"

#include "PlayerSkinURL.h"
#include "PlayerTextureURL.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace model {

/// <summary>
/// Provide links to the player&#39;s skin and cape
/// </summary>
class  PlayerTexture
    : public ModelBase
{
public:
    PlayerTexture();
    virtual ~PlayerTexture();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// PlayerTexture members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PlayerSkinURL> getSKIN() const;
    bool sKINIsSet() const;
    void unsetSKIN();

    void setSKIN(const std::shared_ptr<PlayerSkinURL>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PlayerTextureURL> getCAPE() const;
    bool cAPEIsSet() const;
    void unsetCAPE();

    void setCAPE(const std::shared_ptr<PlayerTextureURL>& value);


protected:
    std::shared_ptr<PlayerSkinURL> m_SKIN;
    bool m_SKINIsSet;
    std::shared_ptr<PlayerTextureURL> m_CAPE;
    bool m_CAPEIsSet;
};

}
}
}
}
}
}
}
}

#endif /* COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_MODEL_PlayerTexture_H_ */
