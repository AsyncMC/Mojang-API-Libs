/**
 * Mojang Authentication API
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

#include "DefaultApi.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

DefaultApi::DefaultApi() {
	std::shared_ptr<DefaultApiAuthenticateResource> spDefaultApiAuthenticateResource = std::make_shared<DefaultApiAuthenticateResource>();
	this->publish(spDefaultApiAuthenticateResource);
	
	std::shared_ptr<DefaultApiInvalidateResource> spDefaultApiInvalidateResource = std::make_shared<DefaultApiInvalidateResource>();
	this->publish(spDefaultApiInvalidateResource);
	
	std::shared_ptr<DefaultApiRefreshResource> spDefaultApiRefreshResource = std::make_shared<DefaultApiRefreshResource>();
	this->publish(spDefaultApiRefreshResource);
	
	std::shared_ptr<DefaultApiSignoutResource> spDefaultApiSignoutResource = std::make_shared<DefaultApiSignoutResource>();
	this->publish(spDefaultApiSignoutResource);
	
	std::shared_ptr<DefaultApiValidateResource> spDefaultApiValidateResource = std::make_shared<DefaultApiValidateResource>();
	this->publish(spDefaultApiValidateResource);
	
}

DefaultApi::~DefaultApi() {}

void DefaultApi::startService(int const& port) {
	std::shared_ptr<restbed::Settings> settings = std::make_shared<restbed::Settings>();
	settings->set_port(port);
	settings->set_root("");
	
	this->start(settings);
}

void DefaultApi::stopService() {
	this->stop();
}

DefaultApiAuthenticateResource::DefaultApiAuthenticateResource()
{
	this->set_path("/authenticate/");
	this->set_method_handler("POST",
		std::bind(&DefaultApiAuthenticateResource::POST_method_handler, this,
			std::placeholders::_1));
}

DefaultApiAuthenticateResource::~DefaultApiAuthenticateResource()
{
}

void DefaultApiAuthenticateResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

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
				session->close(200, "Successfully authenticated", { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, "Could not authenticate", { {"Connection", "close"} });
				return;
			}

		});
}



DefaultApiInvalidateResource::DefaultApiInvalidateResource()
{
	this->set_path("/invalidate/");
	this->set_method_handler("POST",
		std::bind(&DefaultApiInvalidateResource::POST_method_handler, this,
			std::placeholders::_1));
}

DefaultApiInvalidateResource::~DefaultApiInvalidateResource()
{
}

void DefaultApiInvalidateResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

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
			
			if (status_code == 204) {
				session->close(204, "The token have been invalidated", { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, "Could not invalidate the token", { {"Connection", "close"} });
				return;
			}

		});
}



DefaultApiRefreshResource::DefaultApiRefreshResource()
{
	this->set_path("/refresh/");
	this->set_method_handler("POST",
		std::bind(&DefaultApiRefreshResource::POST_method_handler, this,
			std::placeholders::_1));
}

DefaultApiRefreshResource::~DefaultApiRefreshResource()
{
}

void DefaultApiRefreshResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

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
				session->close(200, "Session refreshed successfully. Note: The old access token gets invalidated.", { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, "Could not refresh the session", { {"Connection", "close"} });
				return;
			}

		});
}



DefaultApiSignoutResource::DefaultApiSignoutResource()
{
	this->set_path("/signout/");
	this->set_method_handler("POST",
		std::bind(&DefaultApiSignoutResource::POST_method_handler, this,
			std::placeholders::_1));
}

DefaultApiSignoutResource::~DefaultApiSignoutResource()
{
}

void DefaultApiSignoutResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

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
			
			if (status_code == 204) {
				session->close(204, "All tokens have been invalidated", { {"Connection", "close"} });
				return;
			}
			if (status_code == 400) {
				session->close(400, "Invalid username/password", { {"Connection", "close"} });
				return;
			}

		});
}



DefaultApiValidateResource::DefaultApiValidateResource()
{
	this->set_path("/validate/");
	this->set_method_handler("POST",
		std::bind(&DefaultApiValidateResource::POST_method_handler, this,
			std::placeholders::_1));
}

DefaultApiValidateResource::~DefaultApiValidateResource()
{
}

void DefaultApiValidateResource::POST_method_handler(const std::shared_ptr<restbed::Session> session) {

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
			
			if (status_code == 204) {
				session->close(204, "The token is valid", { {"Connection", "close"} });
				return;
			}
			if (status_code == 403) {
				session->close(403, "The token is not valid", { {"Connection", "close"} });
				return;
			}

		});
}




}
}
}
}

