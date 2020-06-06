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
/*
 * BansApi.h
 *
 * 
 */

#ifndef BansApi_H_
#define BansApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>
#include "json.hpp"

#include <string>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace sessions {
namespace cpp {
namespace pistache {
namespace server {
namespace api {



class  BansApi {
public:
    BansApi(std::shared_ptr<Pistache::Rest::Router>);
    virtual ~BansApi() {}
    void init();

    const std::string base = "";

private:
    void setupRoutes();

    void get_blocked_server_hashes_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void bans_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// A list of SHA1 hashes of banned servers
    /// </summary>
    /// <remarks>
    /// Returns a list of SHA1 hashes used to check server addresses against when the client tries to connect. Clients check the lowercase name, using the ISO-8859-1 charset, against this list. They will also attempt to check subdomains, replacing each level with a *. Specifically, it splits based off of the . in the domain, goes through each section removing one at a time. For instance, for mc.example.com, it would try mc.example.com, *.example.com, and *.com. With IP addresses (verified by having 4 split sections, with each section being a valid integer between 0 and 255, inclusive) substitution starts from the end, so for 192.168.0.1, it would try 192.168.0.1, 192.168.0.*, 192.168.*, and 192.*. This check is done by the bootstrap class in netty. The default netty class is overridden by one in the com.mojang:netty dependency loaded by the launcher. This allows it to affect any version that used netty (1.7+)
    /// </remarks>
    virtual void get_blocked_server_hashes(Pistache::Http::ResponseWriter &response) = 0;

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

#endif /* BansApi_H_ */
