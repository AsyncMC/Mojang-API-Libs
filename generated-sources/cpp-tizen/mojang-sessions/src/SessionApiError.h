/*
 * SessionApiError.h
 *
 * An object describing giving a bit of information about the error
 */

#ifndef _SessionApiError_H_
#define _SessionApiError_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief An object describing giving a bit of information about the error
 *
 *  \ingroup Models
 *
 */

class SessionApiError : public Object {
public:
	/*! \brief Constructor.
	 */
	SessionApiError();
	SessionApiError(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SessionApiError();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A message describing the error
	 */
	std::string getError();

	/*! \brief Set A message describing the error
	 */
	void setError(std::string  error);
	/*! \brief Get The request path
	 */
	std::string getPath();

	/*! \brief Set The request path
	 */
	void setPath(std::string  path);

private:
	std::string error;
	std::string path;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SessionApiError_H_ */
