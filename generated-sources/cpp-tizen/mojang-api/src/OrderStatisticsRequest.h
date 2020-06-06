/*
 * OrderStatisticsRequest.h
 *
 * The body of the request to get the order statistics
 */

#ifndef _OrderStatisticsRequest_H_
#define _OrderStatisticsRequest_H_


#include <string>
#include "OrderStatistic.h"
#include <list>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief The body of the request to get the order statistics
 *
 *  \ingroup Models
 *
 */

class OrderStatisticsRequest : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStatisticsRequest();
	OrderStatisticsRequest(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStatisticsRequest();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::list<OrderStatistic> getMetricKeys();

	/*! \brief Set 
	 */
	void setMetricKeys(std::list <OrderStatistic> metricKeys);

private:
	std::list <OrderStatistic>metricKeys;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderStatisticsRequest_H_ */
