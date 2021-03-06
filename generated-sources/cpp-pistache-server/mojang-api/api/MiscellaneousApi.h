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
 * MiscellaneousApi.h
 *
 * 
 */

#ifndef MiscellaneousApi_H_
#define MiscellaneousApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>


#include "OrderStatisticsRequest.h"
#include "OrderStatisticsResponse.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
namespace api {

using namespace com::github::asyncmc::mojang::api::cpp::pistache::server::model;

class  MiscellaneousApi {
public:
    MiscellaneousApi(std::shared_ptr<Pistache::Rest::Router>);
    virtual ~MiscellaneousApi() {}
    void init();

    const std::string base = "";

private:
    void setupRoutes();

    void get_orders_statistics_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void miscellaneous_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// Get statistics on the sales of Minecraft.
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="orderStatisticsRequest">The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/</param>
    virtual void get_orders_statistics(const OrderStatisticsRequest &orderStatisticsRequest, Pistache::Http::ResponseWriter &response) = 0;

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

#endif /* MiscellaneousApi_H_ */

