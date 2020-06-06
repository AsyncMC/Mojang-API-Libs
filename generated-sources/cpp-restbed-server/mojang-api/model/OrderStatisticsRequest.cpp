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



#include "OrderStatisticsRequest.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace org {
namespace openapitools {
namespace server {
namespace model {

OrderStatisticsRequest::OrderStatisticsRequest()
{
    
}

OrderStatisticsRequest::~OrderStatisticsRequest()
{
}

std::string OrderStatisticsRequest::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	write_json(ss, pt, false);
	return ss.str();
}

void OrderStatisticsRequest::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
}

std::vector<std::shared_ptr<OrderStatistic>> OrderStatisticsRequest::getMetricKeys() const
{
    return m_MetricKeys;
}
void OrderStatisticsRequest::setMetricKeys(std::vector<std::shared_ptr<OrderStatistic>> value)
{
    m_MetricKeys = value;
}

}
}
}
}

