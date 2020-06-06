#ifndef _NameHistoryManager_H_
#define _NameHistoryManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "CurrentPlayerIDs.h"
#include "Error.h"
#include "NameChange.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup NameHistory NameHistory
 * \ingroup Operations
 *  @{
 */
class NameHistoryManager {
public:
	NameHistoryManager();
	virtual ~NameHistoryManager();

/*! \brief Find the current UUID of multiple players at once. *Synchronous*
 *
 * Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
 * \param requestBody Array with the player names *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool findUniqueIdsByNameSync(char * accessToken,
	std::list<std::list> requestBody, 
	void(* handler)(std::list<CurrentPlayerIDs>, Error, void* )
	, void* userData);

/*! \brief Find the current UUID of multiple players at once. *Asynchronous*
 *
 * Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
 * \param requestBody Array with the player names *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool findUniqueIdsByNameAsync(char * accessToken,
	std::list<std::list> requestBody, 
	void(* handler)(std::list<CurrentPlayerIDs>, Error, void* )
	, void* userData);


/*! \brief Gets the full player's name history. *Synchronous*
 *
 * 
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getNameHistorySync(char * accessToken,
	std::string strippedUuid, 
	void(* handler)(std::list<NameChange>, Error, void* )
	, void* userData);

/*! \brief Gets the full player's name history. *Asynchronous*
 *
 * 
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getNameHistoryAsync(char * accessToken,
	std::string strippedUuid, 
	void(* handler)(std::list<NameChange>, Error, void* )
	, void* userData);


/*! \brief Find the UUID by name. *Synchronous*
 *
 * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
 * \param username The username in a given time, or in present if \"at\" is not sent *Required*
 * \param at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUniqueIdByNameSync(char * accessToken,
	std::string username, long long at, 
	void(* handler)(CurrentPlayerIDs, Error, void* )
	, void* userData);

/*! \brief Find the UUID by name. *Asynchronous*
 *
 * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
 * \param username The username in a given time, or in present if \"at\" is not sent *Required*
 * \param at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getUniqueIdByNameAsync(char * accessToken,
	std::string username, long long at, 
	void(* handler)(CurrentPlayerIDs, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.mojang.com";
	}
};
/** @}*/

}
}
#endif /* NameHistoryManager_H_ */
