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


#include "Authentication.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

Authentication::Authentication()
{
    m_AccessToken = "";
    m_ClientToken = "";
    m_ClientTokenIsSet = false;
    
}

Authentication::~Authentication()
{
}

void Authentication::validate()
{
    // TODO: implement validation
}

nlohmann::json Authentication::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    val["accessToken"] = ModelBase::toJson(m_AccessToken);
    if(m_ClientTokenIsSet)
    {
        val["clientToken"] = ModelBase::toJson(m_ClientToken);
    }
    

    return val;
}

void Authentication::fromJson(const nlohmann::json& val)
{
    setAccessToken(val.at("accessToken"));
    if(val.find("clientToken") != val.end())
    {
        setClientToken(val.at("clientToken"));
    }
    
}


std::string Authentication::getAccessToken() const
{
    return m_AccessToken;
}
void Authentication::setAccessToken(std::string const& value)
{
    m_AccessToken = value;
    
}
std::string Authentication::getClientToken() const
{
    return m_ClientToken;
}
void Authentication::setClientToken(std::string const& value)
{
    m_ClientToken = value;
    m_ClientTokenIsSet = true;
}
bool Authentication::clientTokenIsSet() const
{
    return m_ClientTokenIsSet;
}
void Authentication::unsetClientToken()
{
    m_ClientTokenIsSet = false;
}

}
}
}
}
}
}
}
}
}

