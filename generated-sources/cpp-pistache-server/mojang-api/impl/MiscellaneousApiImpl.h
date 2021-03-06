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
* MiscellaneousApiImpl.h
*
* 
*/

#ifndef MISCELLANEOUS_API_IMPL_H_
#define MISCELLANEOUS_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>

#include <MiscellaneousApi.h>

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

class MiscellaneousApiImpl : public com::github::asyncmc::mojang::api::cpp::pistache::server::api::MiscellaneousApi {
public:
    MiscellaneousApiImpl(std::shared_ptr<Pistache::Rest::Router>);
    ~MiscellaneousApiImpl() {}

    void get_orders_statistics(const OrderStatisticsRequest &orderStatisticsRequest, Pistache::Http::ResponseWriter &response);

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



#endif