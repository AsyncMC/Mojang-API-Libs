/*
 * PrivateUserData.h
 *
 * 
 */

#ifndef _PrivateUserData_H_
#define _PrivateUserData_H_


#include <string>
#include "GameProfileProperty.h"
#include "ReducedUserData.h"
#include <list>
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

class PrivateUserData : public Object {
public:
	/*! \brief Constructor.
	 */
	PrivateUserData();
	PrivateUserData(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PrivateUserData();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::list<GameProfileProperty> getProperties();

	/*! \brief Set 
	 */
	void setProperties(std::list <GameProfileProperty> properties);

private:
	std::string id;
	std::list <GameProfileProperty>properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PrivateUserData_H_ */
