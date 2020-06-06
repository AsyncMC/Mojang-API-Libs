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



#include "OrderStatisticsResponse.h"

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

OrderStatisticsResponse::OrderStatisticsResponse()
{
    m_Total = 0L;
    m_Last24h = 0L;
    m_SaleVelocityPerSeconds = 0.0;
    
}

OrderStatisticsResponse::~OrderStatisticsResponse()
{
}

std::string OrderStatisticsResponse::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Total", m_Total);
	pt.put("Last24h", m_Last24h);
	pt.put("SaleVelocityPerSeconds", m_SaleVelocityPerSeconds);
	write_json(ss, pt, false);
	return ss.str();
}

void OrderStatisticsResponse::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Total = pt.get("Total", 0L);
	m_Last24h = pt.get("Last24h", 0L);
	m_SaleVelocityPerSeconds = pt.get("SaleVelocityPerSeconds", 0.0);
}

int64_t OrderStatisticsResponse::getTotal() const
{
    return m_Total;
}
void OrderStatisticsResponse::setTotal(int64_t value)
{
    m_Total = value;
}
int64_t OrderStatisticsResponse::getLast24h() const
{
    return m_Last24h;
}
void OrderStatisticsResponse::setLast24h(int64_t value)
{
    m_Last24h = value;
}
double OrderStatisticsResponse::getSaleVelocityPerSeconds() const
{
    return m_SaleVelocityPerSeconds;
}
void OrderStatisticsResponse::setSaleVelocityPerSeconds(double value)
{
    m_SaleVelocityPerSeconds = value;
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

