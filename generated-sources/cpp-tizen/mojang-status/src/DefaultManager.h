#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "ApiStatus.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Default Default
 * \ingroup Operations
 *  @{
 */
class DefaultManager {
public:
	DefaultManager();
	virtual ~DefaultManager();

/*! \brief Checks the Mojang service statuses. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool checkStatusesSync(char * accessToken,
	
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData);

/*! \brief Checks the Mojang service statuses. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool checkStatusesAsync(char * accessToken,
	
	void(* handler)(std::list<std::map>, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://status.mojang.com";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
