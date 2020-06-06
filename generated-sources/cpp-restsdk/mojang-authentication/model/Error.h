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
 * Error.h
 *
 * This is returned when the request fails
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_Error_H_
#define COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_Error_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restsdk {
namespace model {

/// <summary>
/// This is returned when the request fails
/// </summary>
class  Error
    : public ModelBase
{
public:
    Error();
    virtual ~Error();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// Error members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getError() const;
    bool errorIsSet() const;
    void unsetError();

    void setError(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getErrorMessage() const;
    bool errorMessageIsSet() const;
    void unsetErrorMessage();

    void setErrorMessage(const utility::string_t& value);


protected:
    utility::string_t m_Error;
    bool m_ErrorIsSet;
    utility::string_t m_ErrorMessage;
    bool m_ErrorMessageIsSet;
};

}
}
}
}
}
}
}
}

#endif /* COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_Error_H_ */
