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



#include "RefreshRequest.h"

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

RefreshRequest::RefreshRequest()
{
    m_AccessToken = "";
    m_ClientToken = "";
    
}

RefreshRequest::~RefreshRequest()
{
}

std::string RefreshRequest::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("AccessToken", m_AccessToken);
	pt.put("ClientToken", m_ClientToken);
	write_json(ss, pt, false);
	return ss.str();
}

void RefreshRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_AccessToken = pt.get("AccessToken", "");
	m_ClientToken = pt.get("ClientToken", "");
}

std::string RefreshRequest::getAccessToken() const
{
    return m_AccessToken;
}
void RefreshRequest::setAccessToken(std::string value)
{
    m_AccessToken = value;
}
std::string RefreshRequest::getClientToken() const
{
    return m_ClientToken;
}
void RefreshRequest::setClientToken(std::string value)
{
    m_ClientToken = value;
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
