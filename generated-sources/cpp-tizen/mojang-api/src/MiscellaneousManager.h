#ifndef _MiscellaneousManager_H_
#define _MiscellaneousManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "OrderStatisticsRequest.h"
#include "OrderStatisticsResponse.h"
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup Miscellaneous Miscellaneous
 * \ingroup Operations
 *  @{
 */
class MiscellaneousManager {
public:
	MiscellaneousManager();
	virtual ~MiscellaneousManager();

/*! \brief Get statistics on the sales of Minecraft.. *Synchronous*
 *
 * 
 * \param orderStatisticsRequest The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrdersStatisticsSync(char * accessToken,
	OrderStatisticsRequest orderStatisticsRequest, 
	void(* handler)(OrderStatisticsResponse, Error, void* )
	, void* userData);

/*! \brief Get statistics on the sales of Minecraft.. *Asynchronous*
 *
 * 
 * \param orderStatisticsRequest The payload is a json list of options under the metricKeys key. You will receive a single object corresponding to the sum of sales of the requested type(s). You must request at least one type of sale. Below is the default list used by https://minecraft.net/en/stats/ *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool getOrdersStatisticsAsync(char * accessToken,
	OrderStatisticsRequest orderStatisticsRequest, 
	void(* handler)(OrderStatisticsResponse, Error, void* )
	, void* userData);



	static std::string getBasePath()
	{
		return "https://api.mojang.com";
	}
};
/** @}*/

}
}
#endif /* MiscellaneousManager_H_ */
