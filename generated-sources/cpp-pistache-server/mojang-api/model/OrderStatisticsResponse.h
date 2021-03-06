/**
* Mojang API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * OrderStatisticsResponse.h
 *
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 */

#ifndef OrderStatisticsResponse_H_
#define OrderStatisticsResponse_H_


#include "ModelBase.h"


namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
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

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// OrderStatisticsResponse members

    /// <summary>
    /// total amount sold
    /// </summary>
    int64_t getTotal() const;
    void setTotal(int64_t const value);
        /// <summary>
    /// total sold in last 24 hours
    /// </summary>
    int64_t getLast24h() const;
    void setLast24h(int64_t const value);
        /// <summary>
    /// decimal average sales per second
    /// </summary>
    double getSaleVelocityPerSeconds() const;
    void setSaleVelocityPerSeconds(double const value);
    
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
}

#endif /* OrderStatisticsResponse_H_ */
