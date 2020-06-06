/*
 * SecurityAnswer.h
 *
 * A security question answer given by the player using the id given by Mojang
 */

#ifndef _SecurityAnswer_H_
#define _SecurityAnswer_H_


#include <string>
#include "SecurityAnswerId.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A security question answer given by the player using the id given by Mojang
 *
 *  \ingroup Models
 *
 */

class SecurityAnswer : public Object {
public:
	/*! \brief Constructor.
	 */
	SecurityAnswer();
	SecurityAnswer(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SecurityAnswer();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get A number giver by Mojang to reply a question
	 */
	int getId();

	/*! \brief Set A number giver by Mojang to reply a question
	 */
	void setId(int  id);

private:
	int id;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SecurityAnswer_H_ */
