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

/*
 * OrderStatisticsRequest.h
 *
 * The body of the request to get the order statistics
 */

#ifndef OrderStatisticsRequest_H_
#define OrderStatisticsRequest_H_



#include "OrderStatistic.h"
#include <vector>
#include <memory>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

/// <summary>
/// The body of the request to get the order statistics
/// </summary>
class  OrderStatisticsRequest
{
public:
    OrderStatisticsRequest();
    virtual ~OrderStatisticsRequest();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// OrderStatisticsRequest members
    
    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<OrderStatistic>> getMetricKeys() const;
    void setMetricKeys(std::vector<std::shared_ptr<OrderStatistic>> value);

protected:
    std::vector<std::shared_ptr<OrderStatistic>> m_MetricKeys;
};

}
}
}
}
}
}
}
}
}

#endif /* OrderStatisticsRequest_H_ */