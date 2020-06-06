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



#include "AuthenticationRequest.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restsdk {
namespace model {

AuthenticationRequest::AuthenticationRequest()
{
}

AuthenticationRequest::~AuthenticationRequest()
{
}

void AuthenticationRequest::validate()
{
    // TODO: implement validation
}

web::json::value AuthenticationRequest::toJson() const
{
    web::json::value val = this->UsernamePassword::toJson();


    return val;
}

void AuthenticationRequest::fromJson(const web::json::value& val)
{
    this->UsernamePassword::fromJson(val);

}

void AuthenticationRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("username"), m_Username));
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("password"), m_Password));
}

void AuthenticationRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setUsername(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("username"))));
    setPassword(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("password"))));
}

}
}
}
}
}
}
}
}

