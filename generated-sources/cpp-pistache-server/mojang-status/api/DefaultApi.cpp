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

#include "DefaultApi.h"
#include "Helpers.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace status {
namespace cpp {
namespace pistache {
namespace server {
namespace api {

using namespace org::openapitools::server::helpers;
using namespace com::github::asyncmc::mojang::status::cpp::pistache::server::model;

DefaultApi::DefaultApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
};

void DefaultApi::init() {
    setupRoutes();
}

void DefaultApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/check", Routes::bind(&DefaultApi::check_statuses_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&DefaultApi::default_api_default_handler, this));
}

void DefaultApi::check_statuses_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    try {
      this->check_statuses(response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}

void DefaultApi::default_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    response.send(Pistache::Http::Code::Not_Found, "The requested method does not exist");
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
