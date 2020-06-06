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
 * Inline_object_1.h
 *
 * Request Mojang to download a skin from an URL and apply to the player
 */

#ifndef Inline_object_1_H_
#define Inline_object_1_H_


#include "ModelBase.h"

#include "SkinModel.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Request Mojang to download a skin from an URL and apply to the player
/// </summary>
class  Inline_object_1
    : public ModelBase
{
public:
    Inline_object_1();
    virtual ~Inline_object_1();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// Inline_object_1 members

    /// <summary>
    /// 
    /// </summary>
    SkinModel getModel() const;
    void setModel(SkinModel const& value);
    bool modelIsSet() const;
    void unsetModel();
    /// <summary>
    /// The URL which Mojang servers will download and apply the skin
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string const& value);
    
protected:
    SkinModel m_Model;
    bool m_ModelIsSet;
    std::string m_Url;

};

}
}
}
}

#endif /* Inline_object_1_H_ */
