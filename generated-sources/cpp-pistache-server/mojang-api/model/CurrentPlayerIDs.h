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
/*
 * CurrentPlayerIDs.h
 *
 * The current player, demo and legacy status of a player identified by the id
 */

#ifndef CurrentPlayerIDs_H_
#define CurrentPlayerIDs_H_


#include "ModelBase.h"

#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The current player, demo and legacy status of a player identified by the id
/// </summary>
class  CurrentPlayerIDs
    : public ModelBase
{
public:
    CurrentPlayerIDs();
    virtual ~CurrentPlayerIDs();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// CurrentPlayerIDs members

    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
        /// <summary>
    /// The current name being used by this player
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
        /// <summary>
    /// If account has not been converted
    /// </summary>
    bool isLegacy() const;
    void setLegacy(bool const value);
    bool legacyIsSet() const;
    void unsetLegacy();
    /// <summary>
    /// If the player has not puchased the game
    /// </summary>
    bool isDemo() const;
    void setDemo(bool const value);
    bool demoIsSet() const;
    void unsetDemo();

protected:
    std::string m_Id;

    std::string m_Name;

    bool m_Legacy;
    bool m_LegacyIsSet;
    bool m_Demo;
    bool m_DemoIsSet;
};

}
}
}
}

#endif /* CurrentPlayerIDs_H_ */
