/**
 * Mojang Session API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * BansApi.h
 *
 * 
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_API_BansApi_H_
#define COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_API_BansApi_H_


#include "../ApiClient.h"

#include <cpprest/details/basic_types.h>
#include "../ModelBase.h"

#include <boost/optional.hpp>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace restsdk {
namespace api {

using namespace com::github::asyncmc::mojang::sessions::cpp::restsdk::model;



class  BansApi 
{
public:

    explicit BansApi( std::shared_ptr<ApiClient> apiClient );

    virtual ~BansApi();

    /// <summary>
    /// A list of SHA1 hashes of banned servers
    /// </summary>
    /// <remarks>
    /// Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)
    /// </remarks>
    pplx::task<utility::string_t> getBlockedServerHashes(
    );

protected:
    std::shared_ptr<ApiClient> m_ApiClient;
};

}
}
}
}
}
}
}
}

#endif /* COM_GITHUB_ASYNCMC_MOJANG_SESSIONS_CPP_RESTSDK_API_BansApi_H_ */

