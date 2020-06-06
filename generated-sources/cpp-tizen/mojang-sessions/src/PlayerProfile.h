/*
 * PlayerProfile.h
 *
 * 
 */

#ifndef _PlayerProfile_H_
#define _PlayerProfile_H_


#include <string>
#include "PlayerProfileProperty.h"
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

class PlayerProfile : public Object {
public:
	/*! \brief Constructor.
	 */
	PlayerProfile();
	PlayerProfile(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlayerProfile();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The player UUID without hyphens
	 */
	std::string getId();

	/*! \brief Set The player UUID without hyphens
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
	 */
	bool getLegacy();

	/*! \brief Set Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
	 */
	void setLegacy(bool  legacy);
	/*! \brief Get An array with all player properties, like skin and cape
	 */
	std::list<PlayerProfileProperty> getProperties();

	/*! \brief Set An array with all player properties, like skin and cape
	 */
	void setProperties(std::list <PlayerProfileProperty> properties);

private:
	std::string id;
	std::string name;
	bool legacy;
	std::list <PlayerProfileProperty>properties;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PlayerProfile_H_ */
