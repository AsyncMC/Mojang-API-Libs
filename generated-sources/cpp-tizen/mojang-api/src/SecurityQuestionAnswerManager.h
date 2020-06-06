#ifndef _SecurityQuestionAnswerManager_H_
#define _SecurityQuestionAnswerManager_H_

#include <string>
#include <cstring>
#include <list>
#include <glib.h>
#include "Error.h"
#include "SecurityAnswer.h"
#include "SecurityChallenge.h"
#include <list>
#include "Error.h"

/** \defgroup Operations API Endpoints
 *  Classes containing all the functions for calling API endpoints
 *
 */

namespace Tizen{
namespace ArtikCloud {
/** \addtogroup SecurityQuestionAnswer SecurityQuestionAnswer
 * \ingroup Operations
 *  @{
 */
class SecurityQuestionAnswerManager {
public:
	SecurityQuestionAnswerManager();
	virtual ~SecurityQuestionAnswerManager();

/*! \brief Check if security questions are needed. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool checkSecurityStatusSync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Check if security questions are needed. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool checkSecurityStatusAsync(char * accessToken,
	
	
	void(* handler)(Error, void* ) , void* userData);


/*! \brief Get list of questions. *Synchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listPendingSecurityQuestionsSync(char * accessToken,
	
	void(* handler)(std::list<SecurityChallenge>, Error, void* )
	, void* userData);

/*! \brief Get list of questions. *Asynchronous*
 *
 * 
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool listPendingSecurityQuestionsAsync(char * accessToken,
	
	void(* handler)(std::list<SecurityChallenge>, Error, void* )
	, void* userData);


/*! \brief Send back the answers. *Synchronous*
 *
 * 
 * \param securityAnswer An array with all the answers *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sendSecurityQuestionAnswersSync(char * accessToken,
	std::list<std::list> securityAnswer, 
	
	void(* handler)(Error, void* ) , void* userData);

/*! \brief Send back the answers. *Asynchronous*
 *
 * 
 * \param securityAnswer An array with all the answers *Required*
 * \param handler The callback function to be invoked on completion. *Required*
 * \param accessToken The Authorization token. *Required*
 * \param userData The user data to be passed to the callback function.
 */
bool sendSecurityQuestionAnswersAsync(char * accessToken,
	std::list<std::list> securityAnswer, 
	
	void(* handler)(Error, void* ) , void* userData);



	static std::string getBasePath()
	{
		return "https://api.mojang.com";
	}
};
/** @}*/

}
}
#endif /* SecurityQuestionAnswerManager_H_ */
