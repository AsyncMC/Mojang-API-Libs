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


#include "SecurityAnswerId.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

SecurityAnswerId::SecurityAnswerId()
{
    m_Id = 0;
    
}

SecurityAnswerId::~SecurityAnswerId()
{
}

void SecurityAnswerId::validate()
{
    // TODO: implement validation
}

nlohmann::json SecurityAnswerId::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    val["id"] = m_Id;
    

    return val;
}

void SecurityAnswerId::fromJson(const nlohmann::json& val)
{
    setId(val.at("id"));
    
}


int32_t SecurityAnswerId::getId() const
{
    return m_Id;
}
void SecurityAnswerId::setId(int32_t const value)
{
    m_Id = value;
    
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

