/**
 * Mojang API
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

#include "MiscellaneousApi.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace restbed {
namespace server {
namespace api {

using namespace com::github::asyncmc::mojang::api::cpp::restbed::server::model;

MiscellaneousApi::MiscellaneousApi() {
	std::shared_ptr<MiscellaneousApiOrdersStatisticsResource> spMiscellaneousApiOrdersStatisticsResource = std::make_shared<MiscellaneousApiOrdersStatisticsResource>();
	this->publish(spMiscellaneousApiOrdersStatisticsResource);
	
}

MiscellaneousApi::~MiscellaneousApi() {}

void MiscellaneousApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("");
	
	this->start(settings);
}

void MiscellaneousApi::stopService() {
	this->stop();
}

MiscellaneousApiOrdersStatisticsResource::MiscellaneousApiOrdersStatisticsResource()
{
	this->set_path("/orders/statistics/");
	this->set_method_handler("POST",
		std::bind(&MiscellaneousApiOrdersStatisticsResource::POST_method_handler, this,
			std::placeholders::_1));
}

MiscellaneousApiOrdersStatisticsResource::~MiscellaneousApiOrdersStatisticsResource()
{
}

void MiscellaneousApiOrdersStatisticsResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

	const auto request = session->get_request();
	// Body params are present, therefore we have to fetch them
	int content_length = request->get_header("Content-Length", 0);
	session->fetch(content_length,
		[ this ]( const std::shared_ptr<restbed::Session> session, const restbed::Bytes & body )
		{

			const auto request = session->get_request();
			std::string requestBody = restbed::String::format("%.*s\n", ( int ) body.size( ), body.data( ));
			/**
			 * Get body params or form params here from the requestBody string
			 */
			
			

			
			// Change the value of this variable to the appropriate response before sending the response
			int status_code = 200;
			
			/**
			 * Process the received information here
			 */
			
			if (status_code == 200) {
				session->close(200, "A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.", { {"Connection", "close"} });
				return;
			}

		});
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
