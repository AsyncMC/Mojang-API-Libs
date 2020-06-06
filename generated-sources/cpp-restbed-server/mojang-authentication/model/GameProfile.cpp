/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */



#include "GameProfile.h"

#include <string>
#include <sstream>
#include <boost/property_tree/ptree.hpp>
#include <boost/property_tree/json_parser.hpp>

using boost::property_tree::ptree;
using boost::property_tree::read_json;
using boost::property_tree::write_json;

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

GameProfile::GameProfile()
{
    m_Agent = "";
    m_Id = "";
    m_Name = "";
    m_UserId = "";
    m_CreatedAt = 0L;
    m_LegacyProfile = false;
    m_Suspended = false;
    m_Paid = false;
    m_Migrated = false;
    m_Legacy = false;
    
}

GameProfile::~GameProfile()
{
}

std::string GameProfile::toJsonString()
{
	std::stringstream ss;
	ptree pt;
	pt.put("Agent", m_Agent);
	pt.put("Id", m_Id);
	pt.put("Name", m_Name);
	pt.put("UserId", m_UserId);
	pt.put("CreatedAt", m_CreatedAt);
	pt.put("LegacyProfile", m_LegacyProfile);
	pt.put("Suspended", m_Suspended);
	pt.put("Paid", m_Paid);
	pt.put("Migrated", m_Migrated);
	pt.put("Legacy", m_Legacy);
	write_json(ss, pt, false);
	return ss.str();
}

void GameProfile::fromJsonString(std::string const& jsonString)
{
	std::stringstream ss(jsonString);
	ptree pt;
	read_json(ss,pt);
	m_Agent = pt.get("Agent", "");
	m_Id = pt.get("Id", "");
	m_Name = pt.get("Name", "");
	m_UserId = pt.get("UserId", "");
	m_CreatedAt = pt.get("CreatedAt", 0L);
	m_LegacyProfile = pt.get("LegacyProfile", false);
	m_Suspended = pt.get("Suspended", false);
	m_Paid = pt.get("Paid", false);
	m_Migrated = pt.get("Migrated", false);
	m_Legacy = pt.get("Legacy", false);
}

std::string GameProfile::getAgent() const
{
    return m_Agent;
}
void GameProfile::setAgent(std::string value)
{
    m_Agent = value;
}
std::string GameProfile::getId() const
{
    return m_Id;
}
void GameProfile::setId(std::string value)
{
    m_Id = value;
}
std::string GameProfile::getName() const
{
    return m_Name;
}
void GameProfile::setName(std::string value)
{
    m_Name = value;
}
std::string GameProfile::getUserId() const
{
    return m_UserId;
}
void GameProfile::setUserId(std::string value)
{
    m_UserId = value;
}
int64_t GameProfile::getCreatedAt() const
{
    return m_CreatedAt;
}
void GameProfile::setCreatedAt(int64_t value)
{
    m_CreatedAt = value;
}
bool GameProfile::isLegacyProfile() const
{
    return m_LegacyProfile;
}
void GameProfile::setLegacyProfile(bool value)
{
    m_LegacyProfile = value;
}
bool GameProfile::isSuspended() const
{
    return m_Suspended;
}
void GameProfile::setSuspended(bool value)
{
    m_Suspended = value;
}
bool GameProfile::isPaid() const
{
    return m_Paid;
}
void GameProfile::setPaid(bool value)
{
    m_Paid = value;
}
bool GameProfile::isMigrated() const
{
    return m_Migrated;
}
void GameProfile::setMigrated(bool value)
{
    m_Migrated = value;
}
bool GameProfile::isLegacy() const
{
    return m_Legacy;
}
void GameProfile::setLegacy(bool value)
{
    m_Legacy = value;
}

}
}
}
}
}
}
}
}
}

