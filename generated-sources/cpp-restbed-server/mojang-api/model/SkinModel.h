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
 * SkinModel.h
 *
 * Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
 */

#ifndef SkinModel_H_
#define SkinModel_H_



#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
/// </summary>
class  SkinModel
{
public:
    SkinModel();
    virtual ~SkinModel();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// SkinModel members
    

protected:
};

}
}
}
}

#endif /* SkinModel_H_ */
