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
 * Inline_object_1.h
 *
 * Request Mojang to download a skin from an URL and apply to the player
 */

#ifndef Inline_object_1_H_
#define Inline_object_1_H_



#include "SkinModel.h"
#include <string>
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Request Mojang to download a skin from an URL and apply to the player
/// </summary>
class  Inline_object_1
{
public:
    Inline_object_1();
    virtual ~Inline_object_1();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// Inline_object_1 members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SkinModel> getModel() const;
    void setModel(std::shared_ptr<SkinModel> value);
    /// <summary>
    /// The URL which Mojang servers will download and apply the skin
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string value);

protected:
    std::shared_ptr<SkinModel> m_Model;
    std::string m_Url;
};

}
}
}
}

#endif /* Inline_object_1_H_ */
