/**
 * Mojang Authentication API
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
 * Authentication.h
 *
 * 
 */

#ifndef Authentication_H_
#define Authentication_H_



#include "AccessKeys.h"
#include <string>
#include <memory>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Authentication
{
public:
    Authentication();
    virtual ~Authentication();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// Authentication members
    
    /// <summary>
    /// 
    /// </summary>
    std::string getAccessToken() const;
    void setAccessToken(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::string getClientToken() const;
    void setClientToken(std::string value);

protected:
    std::string m_AccessToken;
    std::string m_ClientToken;
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

#endif /* Authentication_H_ */