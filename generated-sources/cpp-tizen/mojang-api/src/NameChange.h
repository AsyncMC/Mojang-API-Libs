/*
 * NameChange.h
 *
 * A registered name change.
 */

#ifndef _NameChange_H_
#define _NameChange_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A registered name change.
 *
 *  \ingroup Models
 *
 */

class NameChange : public Object {
public:
	/*! \brief Constructor.
	 */
	NameChange();
	NameChange(char* str);

	/*! \brief Destructor.
	 */
	virtual ~NameChange();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The new player name
	 */
	std::string getName();

	/*! \brief Set The new player name
	 */
	void setName(std::string  name);
	/*! \brief Get Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
	 */
	long long getChangedToAt();

	/*! \brief Set Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
	 */
	void setChangedToAt(long long  changedToAt);

private:
	std::string name;
	long long changedToAt;
	void __init();
	void __cleanup();

};
}
}

#endif /* _NameChange_H_ */
