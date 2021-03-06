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

#include "LoginApi.h"
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
using namespace com::github::asyncmc::mojang::sessions::cpp::pistache::server::model;

LoginApi::LoginApi(std::shared_ptr<Pistache::Rest::Router> rtr) { 
    router = rtr;
};

void LoginApi::init() {
    setupRoutes();
}

void LoginApi::setupRoutes() {
    using namespace Pistache::Rest;

    Routes::Get(*router, base + "/session/minecraft/profile/:stripped_uuid", Routes::bind(&LoginApi::get_player_profile_handler, this));

    // Default handler, called when a route is not found
    router->addCustomHandler(Routes::bind(&LoginApi::login_api_default_handler, this));
}

void LoginApi::get_player_profile_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
    // Getting the path params
    auto strippedUuid = request.param(":strippedUuid").as<std::string>();
    
    // Getting the query params
    auto unsignedQuery = request.query().get("unsigned");
    Pistache::Optional<bool> unsigned;
    if(!unsignedQuery.isEmpty()){
        bool value;
        if(fromStringValue(unsignedQuery.get(), value)){
            unsigned = Pistache::Some(value);
        }
    }
    
    try {
      this->get_player_profile(strippedUuid, unsigned, response);
    } catch (std::runtime_error & e) {
      //send a 400 error
      response.send(Pistache::Http::Code::Bad_Request, e.what());
      return;
    }

}

void LoginApi::login_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response) {
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

