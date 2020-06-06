/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
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

#ifndef ORG_OPENAPITOOLS_CLIENT_MODEL_SecurityChallenge_H_
#define ORG_OPENAPITOOLS_CLIENT_MODEL_SecurityChallenge_H_


#include "../ModelBase.h"

#include "SecurityQuestion.h"
#include "SecurityAnswerId.h"

namespace org {
namespace openapitools {
namespace client {
namespace model {

/// <summary>
/// Binds a question to an answer id, the answer must respect the answer id.
/// </summary>
class  SecurityChallenge
    : public ModelBase
{
public:
    SecurityChallenge();
    virtual ~SecurityChallenge();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// SecurityChallenge members

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SecurityQuestion> getQuestion() const;
    
    void setQuestion(const std::shared_ptr<SecurityQuestion>& value);

    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SecurityAnswerId> getAnswer() const;
    
    void setAnswer(const std::shared_ptr<SecurityAnswerId>& value);


protected:
    std::shared_ptr<SecurityQuestion> m_Question;
        std::shared_ptr<SecurityAnswerId> m_Answer;
    };

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_MODEL_SecurityChallenge_H_ */
