/*
 * ChangeSkinRequest.h
 *
 * Request Mojang to download a skin from an URL and apply to the player
 */

#ifndef _ChangeSkinRequest_H_
#define _ChangeSkinRequest_H_


#include <string>
#include "SkinModel.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Request Mojang to download a skin from an URL and apply to the player
 *
 *  \ingroup Models
 *
 */

class ChangeSkinRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	ChangeSkinRequest();
	ChangeSkinRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~ChangeSkinRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	SkinModel getModel();

	/*! \brief Set 
	 */
	void setModel(SkinModel  model);
	/*! \brief Get The URL which Mojang servers will download and apply the skin
	 */
	std::string getUrl();

	/*! \brief Set The URL which Mojang servers will download and apply the skin
	 */
	void setUrl(std::string  url);

private:
	SkinModel model;
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _ChangeSkinRequest_H_ */
