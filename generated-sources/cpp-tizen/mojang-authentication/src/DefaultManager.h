#ifndef _DefaultManager_H_
#define _DefaultManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "AccessKeys.h"
#include "Authentication.h"
#include "AuthenticationRequest.h"
#include "Error.h"
#include "RefreshRequest.h"
#include "RefreshResponse.h"
#include "UsernamePassword.h"
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

/*! \brief . *Synchronous*
 *
 * 
 * \param authenticationRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authenticateSync(char * accessToken,
	AuthenticationRequest authenticationRequest, 
	void(* handler)(Authentication, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param authenticationRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool authenticateAsync(char * accessToken,
	AuthenticationRequest authenticationRequest, 
	void(* handler)(Authentication, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param accessKeys  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool invalidateSync(char * accessToken,
	AccessKeys accessKeys, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param accessKeys  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool invalidateAsync(char * accessToken,
	AccessKeys accessKeys, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param refreshRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool refreshSync(char * accessToken,
	RefreshRequest refreshRequest, 
	void(* handler)(RefreshResponse, Error, void* )
	, void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param refreshRequest  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool refreshAsync(char * accessToken,
	RefreshRequest refreshRequest, 
	void(* handler)(RefreshResponse, Error, void* )
	, void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param usernamePassword  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool siginoutSync(char * accessToken,
	UsernamePassword usernamePassword, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param usernamePassword  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool siginoutAsync(char * accessToken,
	UsernamePassword usernamePassword, 
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief . *Synchronous*
 *
 * 
 * \param accessKeys  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool validateSync(char * accessToken,
	AccessKeys accessKeys, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief . *Asynchronous*
 *
 * 
 * \param accessKeys  *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool validateAsync(char * accessToken,
	AccessKeys accessKeys, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://authserver.mojang.com";
	}
};
/** @}*/

}
}
#endif /* DefaultManager_H_ */
