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
/*
 * SecurityAnswer.h
 *
 * A security question answer given by the player using the id given by Mojang
 */

#ifndef SecurityAnswer_H_
#define SecurityAnswer_H_


#include "ModelBase.h"

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

/// <summary>
/// A security question answer given by the player using the id given by Mojang
/// </summary>
class  SecurityAnswer
    : public ModelBase
{
public:
    SecurityAnswer();
    virtual ~SecurityAnswer();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// SecurityAnswer members

    /// <summary>
    /// A number giver by Mojang to reply a question
    /// </summary>
    int32_t getId() const;
    void setId(int32_t const value);
    
protected:
    int32_t m_Id;

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

#endif /* SecurityAnswer_H_ */
