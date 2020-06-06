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



#include "PlayerProfile.h"

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

PlayerProfile::PlayerProfile()
{
    m_Id = "";
    m_Name = "";
    m_Legacy = false;
    
}

PlayerProfile::~PlayerProfile()
{
}

std::string PlayerProfile::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Id", m_Id);
	pt.put("Name", m_Name);
	pt.put("Legacy", m_Legacy);
	write_json(ss, pt, false);
	return ss.str();
}

void PlayerProfile::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Id = pt.get("Id", "");
	m_Name = pt.get("Name", "");
	m_Legacy = pt.get("Legacy", false);
}

std::string PlayerProfile::getId() const
{
    return m_Id;
}
void PlayerProfile::setId(std::string value)
{
    m_Id = value;
}
std::string PlayerProfile::getName() const
{
    return m_Name;
}
void PlayerProfile::setName(std::string value)
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
}
std::vector<std::shared_ptr<PlayerProfileProperty>> PlayerProfile::getProperties() const
{
    return m_Properties;
}
void PlayerProfile::setProperties(std::vector<std::shared_ptr<PlayerProfileProperty>> value)
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
}

