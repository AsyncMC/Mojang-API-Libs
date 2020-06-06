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


#include "GameProfileProperty.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

GameProfileProperty::GameProfileProperty()
{
    m_Name = "";
    m_NameIsSet = false;
    m_Value = "";
    m_ValueIsSet = false;
    
}

GameProfileProperty::~GameProfileProperty()
{
}

void GameProfileProperty::validate()
{
    // TODO: implement validation
}

nlohmann::json GameProfileProperty::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_NameIsSet)
    {
        val["name"] = ModelBase::toJson(m_Name);
    }
    if(m_ValueIsSet)
    {
        val["value"] = ModelBase::toJson(m_Value);
    }
    

    return val;
}

void GameProfileProperty::fromJson(const nlohmann::json& val)
{
    if(val.find("name") != val.end())
    {
        setName(val.at("name"));
    }
    if(val.find("value") != val.end())
    {
        setValue(val.at("value"));
    }
    
}


std::string GameProfileProperty::getName() const
{
    return m_Name;
}
void GameProfileProperty::setName(std::string const& value)
{
    m_Name = value;
    m_NameIsSet = true;
}
bool GameProfileProperty::nameIsSet() const
{
    return m_NameIsSet;
}
void GameProfileProperty::unsetName()
{
    m_NameIsSet = false;
}
std::string GameProfileProperty::getValue() const
{
    return m_Value;
}
void GameProfileProperty::setValue(std::string const& value)
{
    m_Value = value;
    m_ValueIsSet = true;
}
bool GameProfileProperty::valueIsSet() const
{
    return m_ValueIsSet;
}
void GameProfileProperty::unsetValue()
{
    m_ValueIsSet = false;
}

}
}
}
}

