#ifndef _LoginManager_H_
#define _LoginManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "PlayerProfile.h"
#include "SessionApiError.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Login Login
 * \ingroup Operations
 *  @{
 */
class LoginManager {
public:
	LoginManager();
	virtual ~LoginManager();

/*! \brief Gets the player's game profile. *Synchronous*
 *
 * This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param _unsigned When set to false, the signature data are sent
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPlayerProfileSync(char * accessToken,
	std::string strippedUuid, bool _unsigned, 
	void(* handler)(PlayerProfile, Error, void* )
	, void* userData);

/*! \brief Gets the player's game profile. *Asynchronous*
 *
 * This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param _unsigned When set to false, the signature data are sent
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getPlayerProfileAsync(char * accessToken,
	std::string strippedUuid, bool _unsigned, 
	void(* handler)(PlayerProfile, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://sessionserver.mojang.com";
	}
};
/** @}*/

}
}
#endif /* LoginManager_H_ */
