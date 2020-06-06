/*
 * PlayerProfileTexturePropertyValue.h
 *
 * This is obtained by decoding the \&quot;textures\&quot; property
 */

#ifndef _PlayerProfileTexturePropertyValue_H_
#define _PlayerProfileTexturePropertyValue_H_


#include <string>
#include "PlayerTexture.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief This is obtained by decoding the \"textures\" property
 *
 *  \ingroup Models
 *
 */

class PlayerProfileTexturePropertyValue : public Object {
public:
	/*! \brief Constructor.
	 */
	PlayerProfileTexturePropertyValue();
	PlayerProfileTexturePropertyValue(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlayerProfileTexturePropertyValue();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get UNIX timestamp in milliseconds
	 */
	long long getTimestamp();

	/*! \brief Set UNIX timestamp in milliseconds
	 */
	void setTimestamp(long long  timestamp);
	/*! \brief Get The player UUID without hyphens
	 */
	std::string getProfileId();

	/*! \brief Set The player UUID without hyphens
	 */
	void setProfileId(std::string  profileId);
	/*! \brief Get The player's name
	 */
	std::string getProfileName();

	/*! \brief Set The player's name
	 */
	void setProfileName(std::string  profileName);
	/*! \brief Get Only present if unsigned was set to false in the request
	 */
	bool getSignatureRequired();

	/*! \brief Set Only present if unsigned was set to false in the request
	 */
	void setSignatureRequired(bool  signatureRequired);
	/*! \brief Get 
	 */
	PlayerTexture getTextures();

	/*! \brief Set 
	 */
	void setTextures(PlayerTexture  textures);

private:
	long long timestamp;
	std::string profileId;
	std::string profileName;
	bool signatureRequired;
	PlayerTexture textures;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PlayerProfileTexturePropertyValue_H_ */
