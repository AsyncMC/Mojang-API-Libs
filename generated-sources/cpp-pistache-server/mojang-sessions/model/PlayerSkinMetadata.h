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
 * PlayerSkinMetadata.h
 *
 * Contains details about the skin
 */

#ifndef PlayerSkinMetadata_H_
#define PlayerSkinMetadata_H_


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
/// Contains details about the skin
/// </summary>
class  PlayerSkinMetadata
    : public ModelBase
{
public:
    PlayerSkinMetadata();
    virtual ~PlayerSkinMetadata();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// PlayerSkinMetadata members

    /// <summary>
    /// The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent.
    /// </summary>
    std::string getModel() const;
    void setModel(std::string const& value);
    bool modelIsSet() const;
    void unsetModel();

protected:
    std::string m_Model;
    bool m_ModelIsSet;
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

#endif /* PlayerSkinMetadata_H_ */
