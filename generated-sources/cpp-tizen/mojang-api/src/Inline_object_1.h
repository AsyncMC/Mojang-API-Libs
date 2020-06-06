/*
 * Inline_object_1.h
 *
 * Request Mojang to download a skin from an URL and apply to the player
 */

#ifndef _Inline_object_1_H_
#define _Inline_object_1_H_


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

class Inline_object_1 : public Object {
public:
	/*! \brief Constructor.
	 */
	Inline_object_1();
	Inline_object_1(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Inline_object_1();

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

#endif /* _Inline_object_1_H_ */
