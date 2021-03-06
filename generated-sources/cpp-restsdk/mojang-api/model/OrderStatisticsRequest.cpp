/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "OrderStatisticsRequest.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restsdk {
namespace model {

OrderStatisticsRequest::OrderStatisticsRequest()
{
}

OrderStatisticsRequest::~OrderStatisticsRequest()
{
}

void OrderStatisticsRequest::validate()
{
    // TODO: implement validation
}

web::json::value OrderStatisticsRequest::toJson() const
{
    web::json::value val = web::json::value::object();

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_MetricKeys )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        val[utility::conversions::to_string_t("metricKeys")] = web::json::value::array(jsonArray);
    }

    return val;
}

void OrderStatisticsRequest::fromJson(const web::json::value& val)
{
    {
        m_MetricKeys.clear();
        std::vector<web::json::value> jsonArray;
        for( auto& item : val.at(utility::conversions::to_string_t("metricKeys")).as_array() )
        {
            if(item.is_null())
            {
                m_MetricKeys.push_back( std::shared_ptr<OrderStatistic>(nullptr) );
            }
            else
            {
                std::shared_ptr<OrderStatistic> newItem(new OrderStatistic());
                newItem->fromJson(item);
                m_MetricKeys.push_back( newItem );
            }
        }
    }
}

void OrderStatisticsRequest::toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix) const
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        std::vector<web::json::value> jsonArray;
        for( auto& item : m_MetricKeys )
        {
            jsonArray.push_back(ModelBase::toJson(item));
        }
        multipart->add(ModelBase::toHttpContent(namePrefix + utility::conversions::to_string_t("metricKeys"), web::json::value::array(jsonArray), utility::conversions::to_string_t("application/json")));
            }
}

void OrderStatisticsRequest::fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& prefix)
{
    utility::string_t namePrefix = prefix;
    if(namePrefix.size() > 0 && namePrefix.substr(namePrefix.size() - 1) != utility::conversions::to_string_t("."))
    {
        namePrefix += utility::conversions::to_string_t(".");
    }

    {
        m_MetricKeys.clear();

        web::json::value jsonArray = web::json::value::parse(ModelBase::stringFromHttpContent(multipart->getContent(utility::conversions::to_string_t("metricKeys"))));
        for( auto& item : jsonArray.as_array() )
        {
            if(item.is_null())
            {
                m_MetricKeys.push_back( std::shared_ptr<OrderStatistic>(nullptr) );
            }
            else
            {
                std::shared_ptr<OrderStatistic> newItem(new OrderStatistic());
                newItem->fromJson(item);
                m_MetricKeys.push_back( newItem );
            }
        }
    }
}

std::vector<std::shared_ptr<OrderStatistic>>& OrderStatisticsRequest::getMetricKeys()
{
    return m_MetricKeys;
}

void OrderStatisticsRequest::setMetricKeys(const std::vector<std::shared_ptr<OrderStatistic>>& value)
{
    m_MetricKeys = value;
    
}

}
}
}
}
}
}
}
}

