/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_CurrentPlayerIDs_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_CurrentPlayerIDs_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace org {
namespace openapitools {
namespace client {
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

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// CurrentPlayerIDs members

    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    utility::string_t getId() const;
    
    void setId(const utility::string_t& value);

    /// <summary>
    /// The current name being used by this player
    /// </summary>
    utility::string_t getName() const;
    
    void setName(const utility::string_t& value);

    /// <summary>
    /// If account has not been converted
    /// </summary>
    bool isLegacy() const;
    bool legacyIsSet() const;
    void unsetLegacy();

    void setLegacy(bool value);

    /// <summary>
    /// If the player has not puchased the game
    /// </summary>
    bool isDemo() const;
    bool demoIsSet() const;
    void unsetDemo();

    void setDemo(bool value);


protected:
    utility::string_t m_Id;
        utility::string_t m_Name;
        bool m_Legacy;
    bool m_LegacyIsSet;
    bool m_Demo;
    bool m_DemoIsSet;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_CurrentPlayerIDs_H_ */
