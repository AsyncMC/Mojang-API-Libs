#ifndef _SkinOperationsManager_H_
#define _SkinOperationsManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "SkinModel.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup SkinOperations SkinOperations
 * \ingroup Operations
 *  @{
 */
class SkinOperationsManager {
public:
	SkinOperationsManager();
	virtual ~SkinOperationsManager();

/*! \brief Changes the player skin by URL. *Synchronous*
 *
 * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param url The URL which Mojang servers will download and apply the skin *Required*
 * \param model 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool changePlayerSkinSync(char * accessToken,
	std::string strippedUuid, std::string url, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Changes the player skin by URL. *Asynchronous*
 *
 * This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param url The URL which Mojang servers will download and apply the skin *Required*
 * \param model 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool changePlayerSkinAsync(char * accessToken,
	std::string strippedUuid, std::string url, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Resets the player skin to default. *Synchronous*
 *
 * 
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool resetPlayerSkinSync(char * accessToken,
	std::string strippedUuid, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Resets the player skin to default. *Asynchronous*
 *
 * 
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool resetPlayerSkinAsync(char * accessToken,
	std::string strippedUuid, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Changes the player skin by upload. *Synchronous*
 *
 * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param file The skin image in PNG format *Required*
 * \param model 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uploadPlayerSkinSync(char * accessToken,
	std::string strippedUuid, std::string file, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Changes the player skin by upload. *Asynchronous*
 *
 * This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
 * \param strippedUuid The player UUID without hyphens *Required*
 * \param file The skin image in PNG format *Required*
 * \param model 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool uploadPlayerSkinAsync(char * accessToken,
	std::string strippedUuid, std::string file, SkinModel model, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.mojang.com";
	}
};
/** @}*/

}
}
#endif /* SkinOperationsManager_H_ */
