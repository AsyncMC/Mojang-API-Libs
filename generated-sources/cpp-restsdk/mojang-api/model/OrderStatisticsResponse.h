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
 * OrderStatisticsResponse.h
 *
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_API_CPP_RESTSDK_MODEL_OrderStatisticsResponse_H_
#define COM_GITHUB_ASYNCMC_MOJANG_API_CPP_RESTSDK_MODEL_OrderStatisticsResponse_H_


#include "../ModelBase.h"


namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restsdk {
namespace model {

/// <summary>
/// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
/// </summary>
class  OrderStatisticsResponse
    : public ModelBase
{
public:
    OrderStatisticsResponse();
    virtual ~OrderStatisticsResponse();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// OrderStatisticsResponse members

    /// <summary>
    /// total amount sold
    /// </summary>
    int64_t getTotal() const;
    
    void setTotal(int64_t value);

    /// <summary>
    /// total sold in last 24 hours
    /// </summary>
    int64_t getLast24h() const;
    
    void setLast24h(int64_t value);

    /// <summary>
    /// decimal average sales per second
    /// </summary>
    double getSaleVelocityPerSeconds() const;
    
    void setSaleVelocityPerSeconds(double value);


protected:
    int64_t m_Total;
        int64_t m_Last24h;
        double m_SaleVelocityPerSeconds;
    };

}
}
}
}
}
}
}
}

#endif /* COM_GITHUB_ASYNCMC_MOJANG_API_CPP_RESTSDK_MODEL_OrderStatisticsResponse_H_ */