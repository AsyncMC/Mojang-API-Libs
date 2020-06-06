/**
* Mojang Session API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/

#include "BansApi.h"
#include "Helpers.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace pistache {
namespace server {
namespace api {

using namespace org::openapitools::server::helpers;


BansApi::BansApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
};

void BansApi::init() {
    setupRoutes();
}

void BansApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/blockedservers", Routes::bind(&BansApi::get_blocked_server_hashes_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&BansApi::bans_api_default_handler, this));
}

void BansApi::get_blocked_server_hashes_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {

    try {
      this->get_blocked_server_hashes(response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}

void BansApi::bans_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
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

