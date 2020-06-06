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

#include "AccessKeys.h"
#include "Authentication.h"
#include "AuthenticationRequest.h"
#include "Error.h"
#include "RefreshRequest.h"
#include "RefreshResponse.h"
#include "UsernamePassword.h"

namespace org {
namespace openapitools {
namespace server {
namespace api {

using namespace org::openapitools::server::model;

class  DefaultApi: public restbed::Service
{
public:
	DefaultApi();
	~DefaultApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiAuthenticateResource: public restbed::Resource
{
public:
	DefaultApiAuthenticateResource();
    virtual ~DefaultApiAuthenticateResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiInvalidateResource: public restbed::Resource
{
public:
	DefaultApiInvalidateResource();
    virtual ~DefaultApiInvalidateResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiRefreshResource: public restbed::Resource
{
public:
	DefaultApiRefreshResource();
    virtual ~DefaultApiRefreshResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiSignoutResource: public restbed::Resource
{
public:
	DefaultApiSignoutResource();
    virtual ~DefaultApiSignoutResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};

/// <summary>
/// 
/// </summary>
/// <remarks>
/// 
/// </remarks>
class  DefaultApiValidateResource: public restbed::Resource
{
public:
	DefaultApiValidateResource();
    virtual ~DefaultApiValidateResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
};


}
}
}
}

#endif /* DefaultApi_H_ */

