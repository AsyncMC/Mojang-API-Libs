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


#include "Agent.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

Agent::Agent()
{
    m_Name = "";
    m_NameIsSet = false;
    m_Version = 0;
    m_VersionIsSet = false;
    
}

Agent::~Agent()
{
}

void Agent::validate()
{
    // TODO: implement validation
}

nlohmann::json Agent::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_NameIsSet)
    {
        val["name"] = ModelBase::toJson(m_Name);
    }
    if(m_VersionIsSet)
    {
        val["version"] = m_Version;
    }
    

    return val;
}

void Agent::fromJson(const nlohmann::json& val)
{
    if(val.find("name") != val.end())
    {
        setName(val.at("name"));
    }
    if(val.find("version") != val.end())
    {
        setVersion(val.at("version"));
    }
    
}


std::string Agent::getName() const
{
    return m_Name;
}
void Agent::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool Agent::nameIsSet() const
{
    return m_NameIsSet;
}
void Agent::unsetName()
{
    m_NameIsSet = false;
}
int32_t Agent::getVersion() const
{
    return m_Version;
}
void Agent::setVersion(int32_t const value)
{
    m_Version = value;
    m_VersionIsSet = true;
}
bool Agent::versionIsSet() const
{
    return m_VersionIsSet;
}
void Agent::unsetVersion()
{
    m_VersionIsSet = false;
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

