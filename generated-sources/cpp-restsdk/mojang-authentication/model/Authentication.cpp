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



#include "Authentication.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restsdk {
namespace model {

Authentication::Authentication()
{
}

Authentication::~Authentication()
{
}

void Authentication::validate()
{
    // TODO: implement validation
}

web::json::value Authentication::toJson() const
{
    web::json::value val = this->AccessKeys::toJson();


    return val;
}

void Authentication::fromJson(const web::json::value& val)
{
    this->AccessKeys::fromJson(val);

}

void Authentication::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("accessToken"), m_AccessToken));
    if(m_ClientTokenIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("clientToken"), m_ClientToken));
    }
}

void Authentication::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setAccessToken(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("accessToken"))));
    if(multipart->hasContent(utility::conversions::to_string_t("clientToken")))
    {
        setClientToken(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("clientToken"))));
    }
}

}
}
}
}
}
}
}
}

