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

#include "MiscellaneousApiImpl.h"

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

MiscellaneousApiImpl::MiscellaneousApiImpl(std::shared_ptr<Pistache::Rest::Router> rtr)
    : MiscellaneousApi(rtr)
    { }

void MiscellaneousApiImpl::get_orders_statistics(const OrderStatisticsRequest &orderStatisticsRequest, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
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

