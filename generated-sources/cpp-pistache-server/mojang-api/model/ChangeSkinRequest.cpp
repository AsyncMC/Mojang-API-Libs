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


#include "ChangeSkinRequest.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

ChangeSkinRequest::ChangeSkinRequest()
{
    m_ModelIsSet = false;
    m_Url = "";
    
}

ChangeSkinRequest::~ChangeSkinRequest()
{
}

void ChangeSkinRequest::validate()
{
    // TODO: implement validation
}

nlohmann::json ChangeSkinRequest::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    if(m_ModelIsSet)
    {
        val["model"] = ModelBase::toJson(m_Model);
    }
    val["url"] = ModelBase::toJson(m_Url);
    

    return val;
}

void ChangeSkinRequest::fromJson(const nlohmann::json& val)
{
    if(val.find("model") != val.end())
    {
        if(!val["model"].is_null())
        {
            SkinModel newItem;
            newItem.fromJson(val["model"]);
            setModel( newItem );
        }
        
    }
    setUrl(val.at("url"));
    
}


SkinModel ChangeSkinRequest::getModel() const
{
    return m_Model;
}
void ChangeSkinRequest::setModel(SkinModel const& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}
bool ChangeSkinRequest::modelIsSet() const
{
    return m_ModelIsSet;
}
void ChangeSkinRequest::unsetModel()
{
    m_ModelIsSet = false;
}
std::string ChangeSkinRequest::getUrl() const
{
    return m_Url;
}
void ChangeSkinRequest::setUrl(std::string const& value)
{
    m_Url = value;
    
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

