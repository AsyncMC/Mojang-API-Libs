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


#include "SecurityChallenge.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

SecurityChallenge::SecurityChallenge()
{
    
}

SecurityChallenge::~SecurityChallenge()
{
}

void SecurityChallenge::validate()
{
    // TODO: implement validation
}

nlohmann::json SecurityChallenge::toJson() const
{
    nlohmann::json val = nlohmann::json::object();

    val["question"] = ModelBase::toJson(m_Question);
    val["answer"] = ModelBase::toJson(m_Answer);
    

    return val;
}

void SecurityChallenge::fromJson(const nlohmann::json& val)
{
    
}


SecurityQuestion SecurityChallenge::getQuestion() const
{
    return m_Question;
}
void SecurityChallenge::setQuestion(SecurityQuestion const& value)
{
    m_Question = value;
    
}
SecurityAnswerId SecurityChallenge::getAnswer() const
{
    return m_Answer;
}
void SecurityChallenge::setAnswer(SecurityAnswerId const& value)
{
    m_Answer = value;
    
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
