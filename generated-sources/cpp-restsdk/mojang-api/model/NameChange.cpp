/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "NameChange.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restsdk {
namespace model {

NameChange::NameChange()
{
    m_Name = utility::conversions::to_string_t("");
    m_ChangedToAt = 0L;
    m_ChangedToAtIsSet = false;
}

NameChange::~NameChange()
{
}

void NameChange::validate()
{
    // TODO: implement validation
}

web::json::value NameChange::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    if(m_ChangedToAtIsSet)
    {
        val[utility::conversions::to_string_t("changedToAt")] = ModelBase::toJson(m_ChangedToAt);
    }

    return val;
}

void NameChange::fromJson(const web::json::value& val)
{
    setName(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("name"))));
    if(val.has_field(utility::conversions::to_string_t("changedToAt")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("changedToAt"));
        if(!fieldValue.is_null())
        {
            setChangedToAt(ModelBase::int64_tFromJson(fieldValue));
        }
    }
}

void NameChange::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    if(m_ChangedToAtIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("changedToAt"), m_ChangedToAt));
    }
}

void NameChange::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    if(multipart->hasContent(utility::conversions::to_string_t("changedToAt")))
    {
        setChangedToAt(ModelBase::int64_tFromHttpContent(multipart->getContent(utility::conversions::to_string_t("changedToAt"))));
    }
}

utility::string_t NameChange::getName() const
{
    return m_Name;
}

void NameChange::setName(const utility::string_t& value)
{
    m_Name = value;
    
}

int64_t NameChange::getChangedToAt() const
{
    return m_ChangedToAt;
}

void NameChange::setChangedToAt(int64_t value)
{
    m_ChangedToAt = value;
    m_ChangedToAtIsSet = true;
}

bool NameChange::changedToAtIsSet() const
{
    return m_ChangedToAtIsSet;
}

void NameChange::unsetChangedToAt()
{
    m_ChangedToAtIsSet = false;
}

}
}
}
}
}
}
}
}
