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
 * RefreshResponse.h
 *
 * 
 */

#ifndef RefreshResponse_H_
#define RefreshResponse_H_


#include "ModelBase.h"

#include "RefreshRequest.h"
#include <string>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RefreshResponse
    : public ModelBase
{
public:
    RefreshResponse();
    virtual ~RefreshResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// RefreshResponse members

    /// <summary>
    /// 
    /// </summary>
    std::string getAccessToken() const;
    void setAccessToken(std::string const& value);
        /// <summary>
    /// 
    /// </summary>
    std::string getClientToken() const;
    void setClientToken(std::string const& value);
    bool clientTokenIsSet() const;
    void unsetClientToken();

protected:
    std::string m_AccessToken;

    std::string m_ClientToken;
    bool m_ClientTokenIsSet;
};

}
}
}
}

#endif /* RefreshResponse_H_ */
