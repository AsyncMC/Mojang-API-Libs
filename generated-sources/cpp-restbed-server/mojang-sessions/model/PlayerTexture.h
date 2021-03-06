/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
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

#ifndef PlayerTexture_H_
#define PlayerTexture_H_



#include "PlayerSkinURL.h"
#include "PlayerTextureURL.h"
#include <memory>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

/// <summary>
/// Provide links to the player&#39;s skin and cape
/// </summary>
class  PlayerTexture
{
public:
    PlayerTexture();
    virtual ~PlayerTexture();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// PlayerTexture members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PlayerSkinURL> getSKIN() const;
    void setSKIN(std::shared_ptr<PlayerSkinURL> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<PlayerTextureURL> getCAPE() const;
    void setCAPE(std::shared_ptr<PlayerTextureURL> value);

protected:
    std::shared_ptr<PlayerSkinURL> m_SKIN;
    std::shared_ptr<PlayerTextureURL> m_CAPE;
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

#endif /* PlayerTexture_H_ */
