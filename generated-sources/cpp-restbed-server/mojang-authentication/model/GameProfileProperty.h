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
 * GameProfileProperty.h
 *
 * 
 */

#ifndef GameProfileProperty_H_
#define GameProfileProperty_H_



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
class  GameProfileProperty
{
public:
    GameProfileProperty();
    virtual ~GameProfileProperty();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// GameProfileProperty members
    
    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string value);
    /// <summary>
    /// 
    /// </summary>
    std::string getValue() const;
    void setValue(std::string value);

protected:
    std::string m_Name;
    std::string m_Value;
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

#endif /* GameProfileProperty_H_ */
