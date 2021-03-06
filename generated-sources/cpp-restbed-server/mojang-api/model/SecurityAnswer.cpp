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



#include "SecurityAnswer.h"

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

SecurityAnswer::SecurityAnswer()
{
    m_Id = 0;
    
}

SecurityAnswer::~SecurityAnswer()
{
}

std::string SecurityAnswer::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Id", m_Id);
	write_json(ss, pt, false);
	return ss.str();
}

void SecurityAnswer::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Id = pt.get("Id", 0);
}

int32_t SecurityAnswer::getId() const
{
    return m_Id;
}
void SecurityAnswer::setId(int32_t value)
{
    m_Id = value;
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

