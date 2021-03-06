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
* DefaultApiImpl.h
*
* 
*/

#ifndef DEFAULT_API_IMPL_H_
#define DEFAULT_API_IMPL_H_


#include <pistache/endpoint.h>
#include <pistache/http.h>
#include <pistache/router.h>
#include <memory>

#include <DefaultApi.h>

#include <pistache/optional.h>

#include "ApiStatus.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace status {
namespace cpp {
namespace pistache {
namespace server {
namespace api {

using namespace com::github::asyncmc::mojang::status::cpp::pistache::server::model;

class DefaultApiImpl : public com::github::asyncmc::mojang::status::cpp::pistache::server::api::DefaultApi {
public:
    DefaultApiImpl(std::shared_ptr<Pistache::Rest::Router>);
    ~DefaultApiImpl() {}

    void check_statuses(Pistache::Http::ResponseWriter &response);

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