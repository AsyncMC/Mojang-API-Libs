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
 * PrivateUserData.h
 *
 * 
 */

#ifndef PrivateUserData_H_
#define PrivateUserData_H_



#include <string>
#include "ReducedUserData.h"
#include <vector>
#include "GameProfileProperty.h"
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
class  PrivateUserData
{
public:
    PrivateUserData();
    virtual ~PrivateUserData();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// PrivateUserData members
    
    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<GameProfileProperty>> getProperties() const;
    void setProperties(std::vector<std::shared_ptr<GameProfileProperty>> value);

protected:
    std::string m_Id;
    std::vector<std::shared_ptr<GameProfileProperty>> m_Properties;
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

#endif /* PrivateUserData_H_ */