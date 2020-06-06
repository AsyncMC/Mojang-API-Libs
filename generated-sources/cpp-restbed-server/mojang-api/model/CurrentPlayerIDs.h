/**
 * Mojang API
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
 * CurrentPlayerIDs.h
 *
 * The current player, demo and legacy status of a player identified by the id
 */

#ifndef CurrentPlayerIDs_H_
#define CurrentPlayerIDs_H_



#include <string>
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// The current player, demo and legacy status of a player identified by the id
/// </summary>
class  CurrentPlayerIDs
{
public:
    CurrentPlayerIDs();
    virtual ~CurrentPlayerIDs();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// CurrentPlayerIDs members
    
    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    std::string getId() const;
    void setId(std::string value);
    /// <summary>
    /// The current name being used by this player
    /// </summary>
    std::string getName() const;
    void setName(std::string value);
    /// <summary>
    /// If account has not been converted
    /// </summary>
    bool isLegacy() const;
    void setLegacy(bool value);
    /// <summary>
    /// If the player has not puchased the game
    /// </summary>
    bool isDemo() const;
    void setDemo(bool value);

protected:
    std::string m_Id;
    std::string m_Name;
    bool m_Legacy;
    bool m_Demo;
};

}
}
}
}

#endif /* CurrentPlayerIDs_H_ */
