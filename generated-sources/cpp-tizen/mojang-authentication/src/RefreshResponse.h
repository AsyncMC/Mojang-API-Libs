/*
 * RefreshResponse.h
 *
 * 
 */

#ifndef _RefreshResponse_H_
#define _RefreshResponse_H_


#include <string>
#include "RefreshRequest.h"
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

class RefreshResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	RefreshResponse();
	RefreshResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~RefreshResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAccessToken();

	/*! \brief Set 
	 */
	void setAccessToken(std::string  accessToken);
	/*! \brief Get 
	 */
	std::string getClientToken();

	/*! \brief Set 
	 */
	void setClientToken(std::string  clientToken);

private:
	std::string accessToken;
	std::string clientToken;
	void __init();
	void __cleanup();

};
}
}

#endif /* _RefreshResponse_H_ */
