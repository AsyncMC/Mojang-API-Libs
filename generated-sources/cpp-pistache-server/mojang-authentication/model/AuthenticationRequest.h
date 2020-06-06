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
 * AuthenticationRequest.h
 *
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 */

#ifndef AuthenticationRequest_H_
#define AuthenticationRequest_H_


#include "ModelBase.h"

#include <string>
#include "UsernamePassword.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
/// </summary>
class  AuthenticationRequest
    : public ModelBase
{
public:
    AuthenticationRequest();
    virtual ~AuthenticationRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// AuthenticationRequest members

    /// <summary>
    /// The Mojang account e-mail or username. Never store it.
    /// </summary>
    std::string getUsername() const;
    void setUsername(std::string const& value);
        /// <summary>
    /// The Mojang account password, never store it.
    /// </summary>
    std::string getPassword() const;
    void setPassword(std::string const& value);
    
protected:
    std::string m_Username;

    std::string m_Password;

};

}
}
}
}

#endif /* AuthenticationRequest_H_ */
