/**
* Mojang Authentication API
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
 * ReducedUserData.h
 *
 * 
 */

#ifndef ReducedUserData_H_
#define ReducedUserData_H_


#include "ModelBase.h"

#include <string>
#include <vector>
#include "GameProfileProperty.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  ReducedUserData
    : public ModelBase
{
public:
    ReducedUserData();
    virtual ~ReducedUserData();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// ReducedUserData members

    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    std::vector<GameProfileProperty>& getProperties();
    bool propertiesIsSet() const;
    void unsetProperties();

protected:
    std::string m_Id;
    bool m_IdIsSet;
    std::vector<GameProfileProperty> m_Properties;
    bool m_PropertiesIsSet;
};

}
}
}
}

#endif /* ReducedUserData_H_ */
