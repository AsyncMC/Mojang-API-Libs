/*
 * ApiStatus.h
 *
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 */

#ifndef _ApiStatus_H_
#define _ApiStatus_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 *
 *  \ingroup Models
 *
 */

class ApiStatus : public Object {
public:
	/*! \brief Constructor.
	 */
	ApiStatus();
	ApiStatus(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ApiStatus();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _ApiStatus_H_ */
