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



#include "Agent.h"

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

Agent::Agent()
{
    m_Name = "Minecraft";
    m_Version = 1;
    
}

Agent::~Agent()
{
}

std::string Agent::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Name", m_Name);
	pt.put("Version", m_Version);
	write_json(ss, pt, false);
	return ss.str();
}

void Agent::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Name = pt.get("Name", "Minecraft");
	m_Version = pt.get("Version", 1);
}

std::string Agent::getName() const
{
    return m_Name;
}
void Agent::setName(std::string value)
{
    m_Name = value;
}
int32_t Agent::getVersion() const
{
    return m_Version;
}
void Agent::setVersion(int32_t value)
{
    m_Version = value;
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

