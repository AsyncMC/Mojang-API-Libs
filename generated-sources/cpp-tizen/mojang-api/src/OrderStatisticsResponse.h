/*
 * OrderStatisticsResponse.h
 *
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 */

#ifndef _OrderStatisticsResponse_H_
#define _OrderStatisticsResponse_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 *
 *  \ingroup Models
 *
 */

class OrderStatisticsResponse : public Object {
public:
	/*! \brief Constructor.
	 */
	OrderStatisticsResponse();
	OrderStatisticsResponse(char* str);

	/*! \brief Destructor.
	 */
	virtual ~OrderStatisticsResponse();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get total amount sold
	 */
	long long getTotal();

	/*! \brief Set total amount sold
	 */
	void setTotal(long long  total);
	/*! \brief Get total sold in last 24 hours
	 */
	long long getLast24h();

	/*! \brief Set total sold in last 24 hours
	 */
	void setLast24h(long long  last24h);
	/*! \brief Get decimal average sales per second
	 */
	double getSaleVelocityPerSeconds();

	/*! \brief Set decimal average sales per second
	 */
	void setSaleVelocityPerSeconds(double  saleVelocityPerSeconds);

private:
	long long total;
	long long last24h;
	double saleVelocityPerSeconds;
	void __init();
	void __cleanup();

};
}
}

#endif /* _OrderStatisticsResponse_H_ */
