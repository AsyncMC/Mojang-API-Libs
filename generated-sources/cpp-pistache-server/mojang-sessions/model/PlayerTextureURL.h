/**
* Mojang Session API
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
 * PlayerTextureURL.h
 *
 * Wraps the URL to the texture
 */

#ifndef PlayerTextureURL_H_
#define PlayerTextureURL_H_


#include "ModelBase.h"

#include <string>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

/// <summary>
/// Wraps the URL to the texture
/// </summary>
class  PlayerTextureURL
    : public ModelBase
{
public:
    PlayerTextureURL();
    virtual ~PlayerTextureURL();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// PlayerTextureURL members

    /// <summary>
    /// The URL to the texture, must be in Mojang&#39;s domains.
    /// </summary>
    std::string getUrl() const;
    void setUrl(std::string const& value);
    
protected:
    std::string m_Url;

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

#endif /* PlayerTextureURL_H_ */
