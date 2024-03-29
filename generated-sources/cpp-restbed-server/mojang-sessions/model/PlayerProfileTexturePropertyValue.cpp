/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "PlayerProfileTexturePropertyValue.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

PlayerProfileTexturePropertyValue::PlayerProfileTexturePropertyValue()
{
    m_Timestamp = 0L;
    m_ProfileId = "";
    m_ProfileName = "";
    m_SignatureRequired = false;
    
}

PlayerProfileTexturePropertyValue::~PlayerProfileTexturePropertyValue()
{
}

std::string PlayerProfileTexturePropertyValue::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Timestamp", m_Timestamp);
	pt.put("ProfileId", m_ProfileId);
	pt.put("ProfileName", m_ProfileName);
	pt.put("SignatureRequired", m_SignatureRequired);
	write_json(ss, pt, false);
	return ss.str();
}

void PlayerProfileTexturePropertyValue::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Timestamp = pt.get("Timestamp", 0L);
	m_ProfileId = pt.get("ProfileId", "");
	m_ProfileName = pt.get("ProfileName", "");
	m_SignatureRequired = pt.get("SignatureRequired", false);
}

int64_t PlayerProfileTexturePropertyValue::getTimestamp() const
{
    return m_Timestamp;
}
void PlayerProfileTexturePropertyValue::setTimestamp(int64_t value)
{
    m_Timestamp = value;
}
std::string PlayerProfileTexturePropertyValue::getProfileId() const
{
    return m_ProfileId;
}
void PlayerProfileTexturePropertyValue::setProfileId(std::string value)
{
    m_ProfileId = value;
}
std::string PlayerProfileTexturePropertyValue::getProfileName() const
{
    return m_ProfileName;
}
void PlayerProfileTexturePropertyValue::setProfileName(std::string value)
{
    m_ProfileName = value;
}
bool PlayerProfileTexturePropertyValue::isSignatureRequired() const
{
    return m_SignatureRequired;
}
void PlayerProfileTexturePropertyValue::setSignatureRequired(bool value)
{
    m_SignatureRequired = value;
}
std::shared_ptr<PlayerTexture> PlayerProfileTexturePropertyValue::getTextures() const
{
    return m_Textures;
}
void PlayerProfileTexturePropertyValue::setTextures(std::shared_ptr<PlayerTexture> value)
{
    m_Textures = value;
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

