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



#include "AuthenticationRequest.h"

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

AuthenticationRequest::AuthenticationRequest()
{
    m_Username = "";
    m_Password = "";
    
}

AuthenticationRequest::~AuthenticationRequest()
{
}

std::string AuthenticationRequest::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Username", m_Username);
	pt.put("Password", m_Password);
	write_json(ss, pt, false);
	return ss.str();
}

void AuthenticationRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Username = pt.get("Username", "");
	m_Password = pt.get("Password", "");
}

std::string AuthenticationRequest::getUsername() const
{
    return m_Username;
}
void AuthenticationRequest::setUsername(std::string value)
{
    m_Username = value;
}
std::string AuthenticationRequest::getPassword() const
{
    return m_Password;
}
void AuthenticationRequest::setPassword(std::string value)
{
    m_Password = value;
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

