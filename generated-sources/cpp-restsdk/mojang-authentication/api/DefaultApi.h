/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
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

#ifndef ORG_OPENAPITOOLS_CLIENT_API_DefaultApi_H_
#define ORG_OPENAPITOOLS_CLIENT_API_DefaultApi_H_


#include "../ApiClient.h"

#include "AccessKeys.h"
#include "Authentication.h"
#include "AuthenticationRequest.h"
#include "Error.h"
#include "RefreshRequest.h"
#include "RefreshResponse.h"
#include "UsernamePassword.h"


#include <boost/optional.hpp>

namespace org {
namespace openapitools {
namespace client {
namespace api {

using namespace org::openapitools::client::model;



class  DefaultApi 
{
public:

    explicit DefaultApi( std::shared_ptr<ApiClient> apiClient );

    virtual ~DefaultApi();

    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="authenticationRequest"></param>
    pplx::task<std::shared_ptr<Authentication>> authenticate(
        std::shared_ptr<AuthenticationRequest> authenticationRequest
    );
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="accessKeys"></param>
    pplx::task<void> invalidate(
        std::shared_ptr<AccessKeys> accessKeys
    );
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="refreshRequest"></param>
    pplx::task<std::shared_ptr<RefreshResponse>> refresh(
        std::shared_ptr<RefreshRequest> refreshRequest
    );
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="usernamePassword"></param>
    pplx::task<void> siginout(
        std::shared_ptr<UsernamePassword> usernamePassword
    );
    /// <summary>
    /// 
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="accessKeys"></param>
    pplx::task<void> validate(
        std::shared_ptr<AccessKeys> accessKeys
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}

#endif /* ORG_OPENAPITOOLS_CLIENT_API_DefaultApi_H_ */

