/*
 * Agent.h
 *
 * Identifies the software doing the request
 */

#ifndef _Agent_H_
#define _Agent_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Identifies the software doing the request
 *
 *  \ingroup Models
 *
 */

class Agent : public Object {
public:
	/*! \brief Constructor.
	 */
	Agent();
	Agent(char* str);

	/*! \brief Destructor.
	 */
	virtual ~Agent();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get The name of the game
	 */
	std::string getName();

	/*! \brief Set The name of the game
	 */
	void setName(std::string  name);
	/*! \brief Get The agent version, usually 1.
	 */
	int getVersion();

	/*! \brief Set The agent version, usually 1.
	 */
	void setVersion(int  version);

private:
	std::string name;
	int version;
	void __init();
	void __cleanup();

};
}
}

#endif /* _Agent_H_ */
