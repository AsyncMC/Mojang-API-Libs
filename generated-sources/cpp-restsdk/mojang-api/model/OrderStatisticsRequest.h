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

/*
 * OrderStatisticsRequest.h
 *
 * The body of the request to get the order statistics
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_API_CPP_RESTSDK_MODEL_OrderStatisticsRequest_H_
#define COM_GITHUB_ASYNCMC_MOJANG_API_CPP_RESTSDK_MODEL_OrderStatisticsRequest_H_


#include "../ModelBase.h"

#include "OrderStatistic.h"
#include <vector>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restsdk {
namespace model {

/// <summary>
/// The body of the request to get the order statistics
/// </summary>
class  OrderStatisticsRequest
    : public ModelBase
{
public:
    OrderStatisticsRequest();
    virtual ~OrderStatisticsRequest();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrderStatisticsRequest members

    /// <summary>
    /// 
    /// </summary>
    std::vector<std::shared_ptr<OrderStatistic>>& getMetricKeys();
    
    void setMetricKeys(const std::vector<std::shared_ptr<OrderStatistic>>& value);


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

#endif /* COM_GITHUB_ASYNCMC_MOJANG_API_CPP_RESTSDK_MODEL_OrderStatisticsRequest_H_ */
