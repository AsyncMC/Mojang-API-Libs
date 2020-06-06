/*
 * PlayerTexture.h
 *
 * Provide links to the player&#39;s skin and cape
 */

#ifndef _PlayerTexture_H_
#define _PlayerTexture_H_


#include <string>
#include "PlayerSkinURL.h"
#include "PlayerTextureURL.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Provide links to the player's skin and cape
 *
 *  \ingroup Models
 *
 */

class PlayerTexture : public Object {
public:
	/*! \brief Constructor.
	 */
	PlayerTexture();
	PlayerTexture(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlayerTexture();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	PlayerSkinURL getSKIN();

	/*! \brief Set 
	 */
	void setSKIN(PlayerSkinURL  sKIN);
	/*! \brief Get 
	 */
	PlayerTextureURL getCAPE();

	/*! \brief Set 
	 */
	void setCAPE(PlayerTextureURL  cAPE);

private:
	PlayerSkinURL sKIN;
	PlayerTextureURL cAPE;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PlayerTexture_H_ */
