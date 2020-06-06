/*
 * AuthenticationRequest.h
 *
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 */

#ifndef _AuthenticationRequest_H_
#define _AuthenticationRequest_H_


#include <string>
#include "UsernamePassword.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 *
 *  \ingroup Models
 *
 */

class AuthenticationRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	AuthenticationRequest();
	AuthenticationRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~AuthenticationRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The Mojang account e-mail or username. Never store it.
	 */
	std::string getUsername();

	/*! \brief Set The Mojang account e-mail or username. Never store it.
	 */
	void setUsername(std::string  username);
	/*! \brief Get The Mojang account password, never store it.
	 */
	std::string getPassword();

	/*! \brief Set The Mojang account password, never store it.
	 */
	void setPassword(std::string  password);

private:
	std::string username;
	std::string password;
	void __init();
	void __cleanup();

};
}
}

#endif /* _AuthenticationRequest_H_ */
