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
 * Inline_object.h
 *
 * 
 */

#ifndef Inline_object_H_
#define Inline_object_H_



#include "SkinModel.h"
#include <string>
#include <memory>

namespace org {
namespace openapitools {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  Inline_object
{
public:
    Inline_object();
    virtual ~Inline_object();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// Inline_object members
    
    /// <summary>
    /// 
    /// </summary>
    std::shared_ptr<SkinModel> getModel() const;
    void setModel(std::shared_ptr<SkinModel> value);
    /// <summary>
    /// The skin image in PNG format
    /// </summary>
    std::string getFile() const;
    void setFile(std::string value);

protected:
    std::shared_ptr<SkinModel> m_Model;
    std::string m_file;
};

}
}
}
}

#endif /* Inline_object_H_ */
