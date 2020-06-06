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
 * SkinOperationsApi.h
 *
 * 
 */

#ifndef SkinOperationsApi_H_
#define SkinOperationsApi_H_


#include <memory>
#include <corvusoft/restbed/session.hpp>
#include <corvusoft/restbed/resource.hpp>
#include <corvusoft/restbed/service.hpp>

#include "Error.h"
#include "SkinModel.h"
#include <string>

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

class  SkinOperationsApi: public restbed::Service
{
public:
	SkinOperationsApi();
	~SkinOperationsApi();
	void startService(int const& port);
	void stopService();
};


/// <summary>
/// Changes the player skin by URL
/// </summary>
/// <remarks>
/// This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
/// </remarks>
class  SkinOperationsApiUserProfileStripped_uuidSkinResource: public restbed::Resource
{
public:
	SkinOperationsApiUserProfileStripped_uuidSkinResource();
    virtual ~SkinOperationsApiUserProfileStripped_uuidSkinResource();
    void POST_method_handler(const std::shared_ptr<restbed::Session> session);
    void DELETE_method_handler(const std::shared_ptr<restbed::Session> session);
    void PUT_method_handler(const std::shared_ptr<restbed::Session> session);
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

#endif /* SkinOperationsApi_H_ */

