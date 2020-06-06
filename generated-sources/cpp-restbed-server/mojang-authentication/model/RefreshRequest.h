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
 * RefreshRequest.h
 *
 * 
 */

#ifndef RefreshRequest_H_
#define RefreshRequest_H_



#include "AccessKeys.h"
#include <string>
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  RefreshRequest
{
public:
    RefreshRequest();
    virtual ~RefreshRequest();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// RefreshRequest members
    
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

#endif /* RefreshRequest_H_ */
