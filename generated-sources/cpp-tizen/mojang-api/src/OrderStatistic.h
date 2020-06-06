/*
 * OrderStatistic.h
 *
 * Valid options to query the order statistics
 */

#ifndef _OrderStatistic_H_
#define _OrderStatistic_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief Valid options to query the order statistics
 *
 *  \ingroup Models
 *
 */

class OrderStatistic : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStatistic();
	OrderStatistic(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStatistic();

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

#endif /* _OrderStatistic_H_ */
