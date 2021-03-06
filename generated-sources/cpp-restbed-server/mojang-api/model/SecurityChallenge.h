/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * SecurityChallenge.h
 *
 * Binds a question to an answer id, the answer must respect the answer id.
 */

#ifndef SecurityChallenge_H_
#define SecurityChallenge_H_



#include "SecurityQuestion.h"
#include "SecurityAnswerId.h"
#include <memory>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

/// <summary>
/// Binds a question to an answer id, the answer must respect the answer id.
/// </summary>
class  SecurityChallenge
{
public:
    SecurityChallenge();
    virtual ~SecurityChallenge();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// SecurityChallenge members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SecurityQuestion> getQuestion() const;
    void setQuestion(std::shared_ptr<SecurityQuestion> value);
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SecurityAnswerId> getAnswer() const;
    void setAnswer(std::shared_ptr<SecurityAnswerId> value);

protected:
    std::shared_ptr<SecurityQuestion> m_Question;
    std::shared_ptr<SecurityAnswerId> m_Answer;
};

}
}
}
}
}
}
}
}
}

#endif /* SecurityChallenge_H_ */
