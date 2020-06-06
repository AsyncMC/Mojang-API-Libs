/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * LoginApi.h
 *
 * 
 */

#ifndef LoginApi_H_
#define LoginApi_H_


#include <memory>
#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "PlayerProfile.h"
#include "SessionApiError.h"
#include <string>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restbed {
namespace server {
namespace api {

using namespace com::github::asyncmc::mojang::sessions::cpp::restbed::server::model;

class  LoginApi: public restbed::Service
{
public:
	LoginApi();
	~LoginApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// Gets the player&#39;s game profile
/// </summary>
/// <remarks>
/// This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
/// </remarks>
class  LoginApiSessionMinecraftProfileStripped_uuidResource: public restbed::Resource
{
public:
	LoginApiSessionMinecraftProfileStripped_uuidResource();
    virtual ~LoginApiSessionMinecraftProfileStripped_uuidResource();
    void GET_method_handler(const std::shared_ptr<restbed::Session> session);
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

#endif /* LoginApi_H_ */

