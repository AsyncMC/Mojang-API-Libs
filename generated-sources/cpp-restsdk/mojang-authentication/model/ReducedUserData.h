/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ReducedUserData.h
 *
 * 
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_ReducedUserData_H_
#define COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_ReducedUserData_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>
#include <vector>
#include "GameProfileProperty.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restsdk {
namespace model {

/// <summary>
/// 
/// </summary>
class  ReducedUserData
    : public ModelBase
{
public:
    ReducedUserData();
    virtual ~ReducedUserData();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// ReducedUserData members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<GameProfileProperty>>& getProperties();
    bool propertiesIsSet() const;
    void unsetProperties();

    void setProperties(const std::vector<std::shared_ptr<GameProfileProperty>>& value);


protected:
    utility::string_t m_Id;
    bool m_IdIsSet;
    std::vector<std::shared_ptr<GameProfileProperty>> m_Properties;
    bool m_PropertiesIsSet;
};

}
}
}
}
}
}
}
}

#endif /* COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_ReducedUserData_H_ */