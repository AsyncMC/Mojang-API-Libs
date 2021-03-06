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
 * UploadSkinRequest.h
 *
 * 
 */

#ifndef UploadSkinRequest_H_
#define UploadSkinRequest_H_


#include "ModelBase.h"

#include "SkinModel.h"
#include <string>

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
/// 
/// </summary>
class  UploadSkinRequest
    : public ModelBase
{
public:
    UploadSkinRequest();
    virtual ~UploadSkinRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// UploadSkinRequest members

    /// <summary>
    /// 
    /// </summary>
    SkinModel getModel() const;
    void setModel(SkinModel const& value);
    bool modelIsSet() const;
    void unsetModel();
    /// <summary>
    /// The skin image in PNG format
    /// </summary>
    std::string getFile() const;
    void setFile(std::string const& value);
    
protected:
    SkinModel m_Model;
    bool m_ModelIsSet;
    std::string m_file;

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

#endif /* UploadSkinRequest_H_ */
