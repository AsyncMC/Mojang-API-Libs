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



#include "PlayerSkinMetadata.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace model {

PlayerSkinMetadata::PlayerSkinMetadata()
{
    m_Model = utility::conversions::to_string_t("");
    m_ModelIsSet = false;
}

PlayerSkinMetadata::~PlayerSkinMetadata()
{
}

void PlayerSkinMetadata::validate()
{
    // TODO: implement validation
}

web::json::value PlayerSkinMetadata::toJson() const
{
    web::json::value val = web::json::value::object();

    if(m_ModelIsSet)
    {
        val[utility::conversions::to_string_t("model")] = ModelBase::toJson(m_Model);
    }

    return val;
}

void PlayerSkinMetadata::fromJson(const web::json::value& val)
{
    if(val.has_field(utility::conversions::to_string_t("model")))
    {
        const web::json::value& fieldValue = val.at(utility::conversions::to_string_t("model"));
        if(!fieldValue.is_null())
        {
            setModel(ModelBase::stringFromJson(fieldValue));
        }
    }
}

void PlayerSkinMetadata::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(m_ModelIsSet)
    {
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("model"), m_Model));
    }
}

void PlayerSkinMetadata::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    if(multipart->hasContent(utility::conversions::to_string_t("model")))
    {
        setModel(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("model"))));
    }
}

utility::string_t PlayerSkinMetadata::getModel() const
{
    return m_Model;
}

void PlayerSkinMetadata::setModel(const utility::string_t& value)
{
    m_Model = value;
    m_ModelIsSet = true;
}

bool PlayerSkinMetadata::modelIsSet() const
{
    return m_ModelIsSet;
}

void PlayerSkinMetadata::unsetModel()
{
    m_ModelIsSet = false;
}

}
}
}
}
}
}
}
}

