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


#include "PlayerSkinMetadata.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

PlayerSkinMetadata::PlayerSkinMetadata()
{
    m_Model = "";
    m_ModelIsSet = false;
    
}

PlayerSkinMetadata::~PlayerSkinMetadata()
{
}

void PlayerSkinMetadata::validate()
{
    // TODO: implement validation
}

nlohmann::json PlayerSkinMetadata::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_ModelIsSet)
    {
        val["model"] = ModelBase::toJson(m_Model);
    }
    

    return val;
}

void PlayerSkinMetadata::fromJson(const nlohmann::json& val)
{
    if(val.find("model") != val.end())
    {
        setModel(val.at("model"));
    }
    
}


std::string PlayerSkinMetadata::getModel() const
{
    return m_Model;
}
void PlayerSkinMetadata::setModel(std::string const& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}
bool PlayerSkinMetadata::modelIsSet() const
{
    return m_ModelIsSet;
}
void PlayerSkinMetadata::unsetModel()
{
    m_ModelIsSet = false;
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
