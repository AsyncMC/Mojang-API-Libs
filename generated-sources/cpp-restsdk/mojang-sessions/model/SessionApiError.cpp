/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "SessionApiError.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace model {

SessionApiError::SessionApiError()
{
    m_Error = utility::conversions::to_string_t("");
    m_ErrorIsSet = false;
    m_Path = utility::conversions::to_string_t("");
    m_PathIsSet = false;
}

SessionApiError::~SessionApiError()
{
}

void SessionApiError::validate()
{
    // TODO: implement validation
}

web::json::value SessionApiError::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_ErrorIsSet)
    {
        val[utility::conversions::to_string_t("error")] = ModelBase::toJson(m_Error);
    }
    if(m_PathIsSet)
    {
        val[utility::conversions::to_string_t("path")] = ModelBase::toJson(m_Path);
    }

    return val;
}

void SessionApiError::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("error")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("error"));
        if(!fieldValue.is_null())
        {
            setError(ModelBase::stringFromJson(fieldValue));
        }
    }
    if(val.has_field(utility::conversions::to_string_t("path")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("path"));
        if(!fieldValue.is_null())
        {
            setPath(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void SessionApiError::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_ErrorIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("error"), m_Error));
    }
    if(m_PathIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("path"), m_Path));
    }
}

void SessionApiError::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("error")))
    {
        setError(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("error"))));
    }
    if(multipart->hasContent(utility::conversions::to_string_t("path")))
    {
        setPath(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("path"))));
    }
}

utility::string_t SessionApiError::getError() const
{
    return m_Error;
}

void SessionApiError::setError(const utility::string_t& value)
{
    m_Error = value;
    m_ErrorIsSet = true;
}

bool SessionApiError::errorIsSet() const
{
    return m_ErrorIsSet;
}

void SessionApiError::unsetError()
{
    m_ErrorIsSet = false;
}

utility::string_t SessionApiError::getPath() const
{
    return m_Path;
}

void SessionApiError::setPath(const utility::string_t& value)
{
    m_Path = value;
    m_PathIsSet = true;
}

bool SessionApiError::pathIsSet() const
{
    return m_PathIsSet;
}

void SessionApiError::unsetPath()
{
    m_PathIsSet = false;
}

}
}
}
}
}
}
}
}

