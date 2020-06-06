/*
 * PlayerSkinMetadata.h
 *
 * Contains details about the skin
 */

#ifndef _PlayerSkinMetadata_H_
#define _PlayerSkinMetadata_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Contains details about the skin
 *
 *  \ingroup Models
 *
 */

class PlayerSkinMetadata : public Object {
public:
	/*! \brief Constructor.
	 */
	PlayerSkinMetadata();
	PlayerSkinMetadata(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlayerSkinMetadata();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
	 */
	std::string getModel();

	/*! \brief Set The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
	 */
	void setModel(std::string  model);

private:
	std::string model;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PlayerSkinMetadata_H_ */
