/*
 * GameProfile.h
 *
 * 
 */

#ifndef _GameProfile_H_
#define _GameProfile_H_


#include <string>
#include "Object.h"

/** \defgroup Models Data Structures for API
 *  Classes containing all the Data Structures needed for calling/returned by API endpoints
 *
 */

namespace Tizen {
namespace ArtikCloud {


/*! \brief 
 *
 *  \ingroup Models
 *
 */

class GameProfile : public Object {
public:
	/*! \brief Constructor.
	 */
	GameProfile();
	GameProfile(char* str);

	/*! \brief Destructor.
	 */
	virtual ~GameProfile();

	/*! \brief Retrieve a string JSON representation of this class.
	 */
	char* toJson();

	/*! \brief Fills in members of this class from JSON string representing it.
	 */
	void fromJson(char* jsonStr);

	/*! \brief Get 
	 */
	std::string getAgent();

	/*! \brief Set 
	 */
	void setAgent(std::string  agent);
	/*! \brief Get 
	 */
	std::string getId();

	/*! \brief Set 
	 */
	void setId(std::string  id);
	/*! \brief Get 
	 */
	std::string getName();

	/*! \brief Set 
	 */
	void setName(std::string  name);
	/*! \brief Get 
	 */
	std::string getUserId();

	/*! \brief Set 
	 */
	void setUserId(std::string  userId);
	/*! \brief Get Unix timestamp in milliseconds
	 */
	long long getCreatedAt();

	/*! \brief Set Unix timestamp in milliseconds
	 */
	void setCreatedAt(long long  createdAt);
	/*! \brief Get 
	 */
	bool getLegacyProfile();

	/*! \brief Set 
	 */
	void setLegacyProfile(bool  legacyProfile);
	/*! \brief Get 
	 */
	bool getSuspended();

	/*! \brief Set 
	 */
	void setSuspended(bool  suspended);
	/*! \brief Get 
	 */
	bool getPaid();

	/*! \brief Set 
	 */
	void setPaid(bool  paid);
	/*! \brief Get 
	 */
	bool getMigrated();

	/*! \brief Set 
	 */
	void setMigrated(bool  migrated);
	/*! \brief Get 
	 */
	bool getLegacy();

	/*! \brief Set 
	 */
	void setLegacy(bool  legacy);

private:
	std::string agent;
	std::string id;
	std::string name;
	std::string userId;
	long long createdAt;
	bool legacyProfile;
	bool suspended;
	bool paid;
	bool migrated;
	bool legacy;
	void __init();
	void __cleanup();

};
}
}

#endif /* _GameProfile_H_ */
