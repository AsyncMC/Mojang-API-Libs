/*
 * SkinModel.h
 *
 * Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
 */

#ifndef _SkinModel_H_
#define _SkinModel_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Model is an empty string for the default model (like Steve) and \"slim\" for the slim model (like Alex)
 *
 *  \ingroup Models
 *
 */

class SkinModel : public Object {
public:
	/*! \brief Constructor.
	 */
	SkinModel();
	SkinModel(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SkinModel();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);


private:
	void __init();
	void __cleanup();

};
}
}

#endif /* _SkinModel_H_ */
