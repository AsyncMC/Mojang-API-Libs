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



#include "Error.h"

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

Error::Error()
{
    m_Error = "";
    m_ErrorMessage = "";
    
}

Error::~Error()
{
}

std::string Error::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Error", m_Error);
	pt.put("ErrorMessage", m_ErrorMessage);
	write_json(ss, pt, false);
	return ss.str();
}

void Error::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Error = pt.get("Error", "");
	m_ErrorMessage = pt.get("ErrorMessage", "");
}

std::string Error::getError() const
{
    return m_Error;
}
void Error::setError(std::string value)
{
    m_Error = value;
}
std::string Error::getErrorMessage() const
{
    return m_ErrorMessage;
}
void Error::setErrorMessage(std::string value)
{
    m_ErrorMessage = value;
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
