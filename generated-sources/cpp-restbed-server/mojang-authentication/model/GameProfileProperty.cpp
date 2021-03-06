/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "GameProfileProperty.h"

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
namespace authentication {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

GameProfileProperty::GameProfileProperty()
{
    m_Name = "";
    m_Value = "";
    
}

GameProfileProperty::~GameProfileProperty()
{
}

std::string GameProfileProperty::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Name", m_Name);
	pt.put("Value", m_Value);
	write_json(ss, pt, false);
	return ss.str();
}

void GameProfileProperty::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Name = pt.get("Name", "");
	m_Value = pt.get("Value", "");
}

std::string GameProfileProperty::getName() const
{
    return m_Name;
}
void GameProfileProperty::setName(std::string value)
{
    m_Name = value;
}
std::string GameProfileProperty::getValue() const
{
    return m_Value;
}
void GameProfileProperty::setValue(std::string value)
{
    m_Value = value;
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

