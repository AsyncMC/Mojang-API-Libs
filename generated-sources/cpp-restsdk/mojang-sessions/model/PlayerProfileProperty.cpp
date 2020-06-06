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



#include "PlayerProfileProperty.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace model {

PlayerProfileProperty::PlayerProfileProperty()
{
    m_Name = utility::conversions::to_string_t("");
    m_SignatureIsSet = false;
}

PlayerProfileProperty::~PlayerProfileProperty()
{
}

void PlayerProfileProperty::validate()
{
    // TODO: implement validation
}

web::json::value PlayerProfileProperty::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    val[utility::conversions::to_string_t("value")] = ModelBase::toJson(m_Value);
    if(m_SignatureIsSet)
    {
        val[utility::conversions::to_string_t("signature")] = ModelBase::toJson(m_Signature);
    }

    return val;
}

void PlayerProfileProperty::fromJson(const web::json::value& val)
{
    setName(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("name"))));
    setValue(ModelBase::stringFromJson(val[utility::conversions::to_string_t("value")]));
    if(val.has_field(utility::conversions::to_string_t("signature")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("signature"));
        if(!fieldValue.is_null())
        {
            setSignature(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void PlayerProfileProperty::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("value"), m_Value));
    if(m_SignatureIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("signature"), m_Signature));
            }
}

void PlayerProfileProperty::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    setValue(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("value"))));
    if(multipart->hasContent(utility::conversions::to_string_t("signature")))
    {
        setSignature(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("signature"))));
    }
}

utility::string_t PlayerProfileProperty::getName() const
{
    return m_Name;
}

void PlayerProfileProperty::setName(const utility::string_t& value)
{
    m_Name = value;
    
}

utility::string_t PlayerProfileProperty::getValue() const
{
    return m_Value;
}

void PlayerProfileProperty::setValue(const utility::string_t& value)
{
    m_Value = value;
    
}

utility::string_t PlayerProfileProperty::getSignature() const
{
    return m_Signature;
}

void PlayerProfileProperty::setSignature(const utility::string_t& value)
{
    m_Signature = value;
    m_SignatureIsSet = true;
}

bool PlayerProfileProperty::signatureIsSet() const
{
    return m_SignatureIsSet;
}

void PlayerProfileProperty::unsetSignature()
{
    m_SignatureIsSet = false;
}

}
}
}
}
}
}
}
}
