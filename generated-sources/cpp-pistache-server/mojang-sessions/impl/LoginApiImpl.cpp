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

#include "LoginApiImpl.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

LoginApiImpl::LoginApiImpl(std::shared_ptr<Pistache::Rest::Router> rtr)
    : LoginApi(rtr)
    { }

void LoginApiImpl::get_player_profile(const std::string &strippedUuid, const Pistache::Optional<bool> &unsigned, Pistache::Http::ResponseWriter &response) {
    response.send(Pistache::Http::Code::Ok, "Do some magic\n");
}

}
}
}
}

