/*
 * SecurityChallenge.h
 *
 * Binds a question to an answer id, the answer must respect the answer id.
 */

#ifndef _SecurityChallenge_H_
#define _SecurityChallenge_H_


#include <string>
#include "SecurityAnswerId.h"
#include "SecurityQuestion.h"
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Binds a question to an answer id, the answer must respect the answer id.
 *
 *  \ingroup Models
 *
 */

class SecurityChallenge : public Object {
public:
	/*! \brief Constructor.
	 */
	SecurityChallenge();
	SecurityChallenge(char* str);

	/*! \brief Destructor.
	 */
	virtual ~SecurityChallenge();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	SecurityQuestion getQuestion();

	/*! \brief Set 
	 */
	void setQuestion(SecurityQuestion  question);
	/*! \brief Get 
	 */
	SecurityAnswerId getAnswer();

	/*! \brief Set 
	 */
	void setAnswer(SecurityAnswerId  answer);

private:
	SecurityQuestion question;
	SecurityAnswerId answer;
	void __init();
	void __cleanup();

};
}
}

#endif /* _SecurityChallenge_H_ */
