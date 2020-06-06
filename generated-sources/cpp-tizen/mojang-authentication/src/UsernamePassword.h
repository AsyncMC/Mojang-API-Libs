/*
 * UsernamePassword.h
 *
 * 
 */

#ifndef _UsernamePassword_H_
#define _UsernamePassword_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class UsernamePassword : public Object {
public:
	/*! \brief Constructor.
	 */
	UsernamePassword();
	UsernamePassword(char* str);

	/*! \brief Destructor.
	 */
	virtual ~UsernamePassword();

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

#endif /* _UsernamePassword_H_ */
