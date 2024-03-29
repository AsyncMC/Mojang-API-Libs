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



#include "PlayerProfile.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace model {

PlayerProfile::PlayerProfile()
{
    m_Id = utility::conversions::to_string_t("");
    m_Name = utility::conversions::to_string_t("");
    m_Legacy = false;
    m_LegacyIsSet = false;
}

PlayerProfile::~PlayerProfile()
{
}

void PlayerProfile::validate()
{
    // TODO: implement validation
}

web::json::value PlayerProfile::toJson() const
{
    web::json::value val = web::json::value::object();

    val[utility::conversions::to_string_t("id")] = ModelBase::toJson(m_Id);
    val[utility::conversions::to_string_t("name")] = ModelBase::toJson(m_Name);
    if(m_LegacyIsSet)
    {
        val[utility::conversions::to_string_t("legacy")] = ModelBase::toJson(m_Legacy);
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Properties )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[utility::conversions::to_string_t("properties")] = web::json::value::array(jsonArray);
    }

    return val;
}

void PlayerProfile::fromJson(const web::json::value& val)
{
    setId(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("id"))));
    setName(ModelBase::stringFromJson(val.at(utility::conversions::to_string_t("name"))));
    if(val.has_field(utility::conversions::to_string_t("legacy")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("legacy"));
        if(!fieldValue.is_null())
        {
            setLegacy(ModelBase::boolFromJson(fieldValue));
        }
    }
    {
        m_Properties.clear();
        std::vector<web::json::value> jsonArray;
        for( auto& item : val.at(utility::conversions::to_string_t("properties")).as_array() )
        {
            if(item.is_null())
            {
                m_Properties.push_back( std::shared_ptr<PlayerProfileProperty>(nullptr) );
            }
            else
            {
                std::shared_ptr<PlayerProfileProperty> newItem(new PlayerProfileProperty());
                newItem->fromJson(item);
                m_Properties.push_back( newItem );
            }
        }
    }
}

void PlayerProfile::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("id"), m_Id));
    multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("name"), m_Name));
    if(m_LegacyIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("legacy"), m_Legacy));
    }
    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_Properties )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("properties"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
            }
}

void PlayerProfile::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    setId(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("id"))));
    setName(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("name"))));
    if(multipart->hasContent(utility::conversions::to_string_t("legacy")))
    {
        setLegacy(ModelBase::boolFromHttpContent(multipart->getContent(utility::conversions::to_string_t("legacy"))));
    }
    {
        m_Properties.clear();

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("properties"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_Properties.push_back( std::shared_ptr<PlayerProfileProperty>(nullptr) );
            }
            else
            {
                std::shared_ptr<PlayerProfileProperty> newItem(new PlayerProfileProperty());
                newItem->fromJson(item);
                m_Properties.push_back( newItem );
            }
        }
    }
}

utility::string_t PlayerProfile::getId() const
{
    return m_Id;
}

void PlayerProfile::setId(const utility::string_t& value)
{
    m_Id = value;
    
}

utility::string_t PlayerProfile::getName() const
{
    return m_Name;
}

void PlayerProfile::setName(const utility::string_t& value)
{
    m_Name = value;
    
}

bool PlayerProfile::isLegacy() const
{
    return m_Legacy;
}

void PlayerProfile::setLegacy(bool value)
{
    m_Legacy = value;
    m_LegacyIsSet = true;
}

bool PlayerProfile::legacyIsSet() const
{
    return m_LegacyIsSet;
}

void PlayerProfile::unsetLegacy()
{
    m_LegacyIsSet = false;
}

std::vector<std::shared_ptr<PlayerProfileProperty>>& PlayerProfile::getProperties()
{
    return m_Properties;
}

void PlayerProfile::setProperties(const std::vector<std::shared_ptr<PlayerProfileProperty>>& value)
{
    m_Properties = value;
    
}

}
}
}
}
}
}
}
}

