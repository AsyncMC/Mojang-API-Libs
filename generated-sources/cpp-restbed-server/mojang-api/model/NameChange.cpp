/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "NameChange.h"

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
namespace api {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

NameChange::NameChange()
{
    m_Name = "";
    m_ChangedToAt = 0L;
    
}

NameChange::~NameChange()
{
}

std::string NameChange::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Name", m_Name);
	pt.put("ChangedToAt", m_ChangedToAt);
	write_json(ss, pt, false);
	return ss.str();
}

void NameChange::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Name = pt.get("Name", "");
	m_ChangedToAt = pt.get("ChangedToAt", 0L);
}

std::string NameChange::getName() const
{
    return m_Name;
}
void NameChange::setName(std::string value)
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

