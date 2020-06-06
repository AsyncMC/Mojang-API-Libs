/*
 * ProfileId.h
 *
 * 
 */

#ifndef _ProfileId_H_
#define _ProfileId_H_


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

class ProfileId : public Object {
public:
	/*! \brief Constructor.
	 */
	ProfileId();
	ProfileId(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ProfileId();

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
	/*! \brief Get The player name
	 */
	std::string getName();

	/*! \brief Set The player name
	 */
	void setName(std::string  name);

private:
	std::string id;
	std::string name;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ProfileId_H_ */
