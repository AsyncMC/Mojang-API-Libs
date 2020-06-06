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
 * SecurityAnswerId.h
 *
 * A security question answer id given by Mojang
 */

#ifndef SecurityAnswerId_H_
#define SecurityAnswerId_H_



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
/// A security question answer id given by Mojang
/// </summary>
class  SecurityAnswerId
{
public:
    SecurityAnswerId();
    virtual ~SecurityAnswerId();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// SecurityAnswerId members
    
    /// <summary>
    /// A number giver by Mojang to reply a question
    /// </summary>
    int32_t getId() const;
    void setId(int32_t value);

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

#endif /* SecurityAnswerId_H_ */
