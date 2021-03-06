/**
* Mojang API
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
 * NameHistoryApi.h
 *
 * 
 */

#ifndef NameHistoryApi_H_
#define NameHistoryApi_H_


#include <pistache/http.h>
#include <pistache/router.h>
#include <pistache/http_headers.h>
#include <pistache/optional.h>


#include "CurrentPlayerIDs.h"
#include "Error.h"
#include "NameChange.h"
#include <string>
#include <vector>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace api {
namespace cpp {
namespace pistache {
namespace server {
namespace api {

using namespace com::github::asyncmc::mojang::api::cpp::pistache::server::model;

class  NameHistoryApi {
public:
    NameHistoryApi(std::shared_ptr<Pistache::Rest::Router>);
    virtual ~NameHistoryApi() {}
    void init();

    const std::string base = "";

private:
    void setupRoutes();

    void find_unique_ids_by_name_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_name_history_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void get_unique_id_by_name_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);
    void name_history_api_default_handler(const Pistache::Rest::Request &request, Pistache::Http::ResponseWriter response);

    std::shared_ptr<Pistache::Rest::Router> router;

    /// <summary>
    /// Find the current UUID of multiple players at once
    /// </summary>
    /// <remarks>
    /// Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
    /// </remarks>
    /// <param name="stdString">Array with the player names</param>
    virtual void find_unique_ids_by_name(const std::vector<std::string> &stdString, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// Gets the full player&#39;s name history
    /// </summary>
    /// <remarks>
    /// 
    /// </remarks>
    /// <param name="strippedUuid">The player UUID without hyphens</param>
    virtual void get_name_history(const std::string &strippedUuid, Pistache::Http::ResponseWriter &response) = 0;

    /// <summary>
    /// Find the UUID by name
    /// </summary>
    /// <remarks>
    /// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
    /// </remarks>
    /// <param name="username">The username in a given time, or in present if \&quot;at\&quot; is not sent</param>
    /// <param name="at">Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional, default to 0L)</param>
    virtual void get_unique_id_by_name(const std::string &username, const Pistache::Optional<int64_t> &at, Pistache::Http::ResponseWriter &response) = 0;

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

#endif /* NameHistoryApi_H_ */

