/*
 * PlayerProfileProperty.h
 *
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 */

#ifndef _PlayerProfileProperty_H_
#define _PlayerProfileProperty_H_


#include <string>
#include "ByteArray.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 *
 *  \ingroup Models
 *
 */

class PlayerProfileProperty : public Object {
public:
	/*! \brief Constructor.
	 */
	PlayerProfileProperty();
	PlayerProfileProperty(char* str);

	/*! \brief Destructor.
	 */
	virtual ~PlayerProfileProperty();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The property name
	 */
	std::string getName();

	/*! \brief Set The property name
	 */
	void setName(std::string  name);
	/*! \brief Get The serialized property value in base64.
	 */
	ByteArray getValue();

	/*! \brief Set The serialized property value in base64.
	 */
	void setValue(ByteArray  value);
	/*! \brief Get signed data using Yggdrasil's private key
	 */
	ByteArray getSignature();

	/*! \brief Set signed data using Yggdrasil's private key
	 */
	void setSignature(ByteArray  signature);

private:
	std::string name;
	ByteArray value;
	ByteArray signature;
	void __init();
	void __cleanup();

};
}
}

#endif /* _PlayerProfileProperty_H_ */
