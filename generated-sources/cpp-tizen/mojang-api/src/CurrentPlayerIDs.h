/*
 * CurrentPlayerIDs.h
 *
 * The current player, demo and legacy status of a player identified by the id
 */

#ifndef _CurrentPlayerIDs_H_
#define _CurrentPlayerIDs_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The current player, demo and legacy status of a player identified by the id
 *
 *  \ingroup Models
 *
 */

class CurrentPlayerIDs : public Object {
public:
	/*! \brief Constructor.
	 */
	CurrentPlayerIDs();
	CurrentPlayerIDs(char* str);

	/*! \brief Destructor.
	 */
	virtual ~CurrentPlayerIDs();

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
	/*! \brief Get The current name being used by this player
	 */
	std::string getName();

	/*! \brief Set The current name being used by this player
	 */
	void setName(std::string  name);
	/*! \brief Get If account has not been converted
	 */
	bool getLegacy();

	/*! \brief Set If account has not been converted
	 */
	void setLegacy(bool  legacy);
	/*! \brief Get If the player has not puchased the game
	 */
	bool getDemo();

	/*! \brief Set If the player has not puchased the game
	 */
	void setDemo(bool  demo);

private:
	std::string id;
	std::string name;
	bool legacy;
	bool demo;
	void __init();
	void __cleanup();

};
}
}

#endif /* _CurrentPlayerIDs_H_ */
