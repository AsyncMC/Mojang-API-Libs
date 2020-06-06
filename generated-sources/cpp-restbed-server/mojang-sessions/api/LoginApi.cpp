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


#include <corvusoft/restbed/byte.hpp>
#include <corvusoft/restbed/string.hpp>
#include <corvusoft/restbed/settings.hpp>
#include <corvusoft/restbed/request.hpp>

#include "LoginApi.h"

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

LoginApi::LoginApi() {
	std::shared_ptr<LoginApiSessionMinecraftProfileStripped_uuidResource> spLoginApiSessionMinecraftProfileStripped_uuidResource = std::make_shared<LoginApiSessionMinecraftProfileStripped_uuidResource>();
	this->publish(spLoginApiSessionMinecraftProfileStripped_uuidResource);
	
}

LoginApi::~LoginApi() {}

void LoginApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("");
	
	this->start(settings);
}

void LoginApi::stopService() {
	this->stop();
}

LoginApiSessionMinecraftProfileStripped_uuidResource::LoginApiSessionMinecraftProfileStripped_uuidResource()
{
	this->set_path("/session/minecraft/profile/{stripped_uuid: .*}/");
	this->set_method_handler("GET",
		std::bind(&LoginApiSessionMinecraftProfileStripped_uuidResource::GET_method_handler, this,
			std::placeholders::_1));
}

LoginApiSessionMinecraftProfileStripped_uuidResource::~LoginApiSessionMinecraftProfileStripped_uuidResource()
{
}

void LoginApiSessionMinecraftProfileStripped_uuidResource::GET_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
			
			// Getting the path params
			const std::string strippedUuid = request->get_path_parameter("strippedUuid", "");
			
			// Getting the query params
			const bool _unsigned = request->get_query_parameter("_unsigned", false);

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "The player profile and all properties", { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, "UUID is invalid", { {"Connection", "close"} });
				return;
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
}
