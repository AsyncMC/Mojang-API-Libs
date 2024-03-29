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
 * PlayerProfile.h
 *
 * 
 */

#ifndef PlayerProfile_H_
#define PlayerProfile_H_



#include "PlayerProfileProperty.h"
#include <string>
#include <vector>
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
/// 
/// </summary>
class  PlayerProfile
{
public:
    PlayerProfile();
    virtual ~PlayerProfile();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// PlayerProfile members
    
    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    std::string getId() const;
    void setId(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);
    /// <summary>
    /// Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
    /// </summary>
    bool isLegacy() const;
    void setLegacy(bool value);
    /// <summary>
    /// An array with all player properties, like skin and cape
    /// </summary>
    std::vector<std::shared_ptr<PlayerProfileProperty>> getProperties() const;
    void setProperties(std::vector<std::shared_ptr<PlayerProfileProperty>> value);

protected:
    std::string m_Id;
    std::string m_Name;
    bool m_Legacy;
    std::vector<std::shared_ptr<PlayerProfileProperty>> m_Properties;
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

#endif /* PlayerProfile_H_ */
