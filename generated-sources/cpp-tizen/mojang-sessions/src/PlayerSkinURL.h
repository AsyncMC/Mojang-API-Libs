/*
 * PlayerSkinURL.h
 *
 * Wraps the URL to the texture and configures the player&#39;s model
 */

#ifndef _PlayerSkinURL_H_
#define _PlayerSkinURL_H_


#include <string>
#include "PlayerTextureURL.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Wraps the URL to the texture and configures the player's model
 *
 *  \ingroup Models
 *
 */

class PlayerSkinURL : public Object {
public:
	/*! \brief Constructor.
	 */
	PlayerSkinURL();
	PlayerSkinURL(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlayerSkinURL();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The URL to the texture, must be in Mojang's domains.
	 */
	std::string getUrl();

	/*! \brief Set The URL to the texture, must be in Mojang's domains.
	 */
	void setUrl(std::string  url);

private:
	std::string url;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PlayerSkinURL_H_ */
