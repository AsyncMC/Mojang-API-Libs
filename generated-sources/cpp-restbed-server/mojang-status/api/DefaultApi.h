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

/*
 * DefaultApi.h
 *
 * 
 */

#ifndef DefaultApi_H_
#define DefaultApi_H_


#include <memory>
#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "ApiStatus.h"

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace status {
namespace cpp {
namespace restbed {
namespace server {
namespace api {

using namespace com::github::asyncmc::mojang::status::cpp::restbed::server::model;

class  DefaultApi: public restbed::Service
{
public:
	DefaultApi();
	~DefaultApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// Checks the Mojang service statuses
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiCheckResource: public restbed::Resource
{
public:
	DefaultApiCheckResource();
    virtual ~DefaultApiCheckResource();
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

#endif /* DefaultApi_H_ */

