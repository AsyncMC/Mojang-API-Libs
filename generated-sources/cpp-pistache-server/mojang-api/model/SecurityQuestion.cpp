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


#include "SecurityQuestion.h"

namespace org {
namespace openapitools {
namespace server {
namespace model {

SecurityQuestion::SecurityQuestion()
{
    m_Id = 0;
    m_Question = "";
    
}

SecurityQuestion::~SecurityQuestion()
{
}

void SecurityQuestion::validate()
{
    // TODO: implement validation
}

nlohmann::json SecurityQuestion::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    val["id"] = m_Id;
    val["question"] = ModelBase::toJson(m_Question);
    

    return val;
}

void SecurityQuestion::fromJson(const nlohmann::json& val)
{
    setId(val.at("id"));
    setQuestion(val.at("question"));
    
}


int32_t SecurityQuestion::getId() const
{
    return m_Id;
}
void SecurityQuestion::setId(int32_t const value)
{
    m_Id = value;
    
}
std::string SecurityQuestion::getQuestion() const
{
    return m_Question;
}
void SecurityQuestion::setQuestion(std::string const& value)
{
    m_Question = value;
    
}

}
}
}
}

