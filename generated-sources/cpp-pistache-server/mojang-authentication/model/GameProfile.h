/**
* Mojang Authentication API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/
/*
 * GameProfile.h
 *
 * 
 */

#ifndef GameProfile_H_
#define GameProfile_H_


#include "ModelBase.h"

#include <string>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace pistache {
namespace server {
namespace model {

/// <summary>
/// 
/// </summary>
class  GameProfile
    : public ModelBase
{
public:
    GameProfile();
    virtual ~GameProfile();

    /////////////////////////////////////////////
    /// ModelBase overrides

    void validate() override;

    nlohmann::json toJson() const override;
    void fromJson(const nlohmann::json& json) override;

    /////////////////////////////////////////////
    /// GameProfile members

    /// <summary>
    /// 
    /// </summary>
    std::string getAgent() const;
    void setAgent(std::string const& value);
    bool agentIsSet() const;
    void unsetAgent();
    /// <summary>
    /// 
    /// </summary>
    std::string getId() const;
    void setId(std::string const& value);
    bool idIsSet() const;
    void unsetId();
    /// <summary>
    /// 
    /// </summary>
    std::string getName() const;
    void setName(std::string const& value);
    bool nameIsSet() const;
    void unsetName();
    /// <summary>
    /// 
    /// </summary>
    std::string getUserId() const;
    void setUserId(std::string const& value);
    bool userIdIsSet() const;
    void unsetUserId();
    /// <summary>
    /// Unix timestamp in milliseconds
    /// </summary>
    int64_t getCreatedAt() const;
    void setCreatedAt(int64_t const value);
    bool createdAtIsSet() const;
    void unsetCreatedAt();
    /// <summary>
    /// 
    /// </summary>
    bool isLegacyProfile() const;
    void setLegacyProfile(bool const value);
    bool legacyProfileIsSet() const;
    void unsetLegacyProfile();
    /// <summary>
    /// 
    /// </summary>
    bool isSuspended() const;
    void setSuspended(bool const value);
    bool suspendedIsSet() const;
    void unsetSuspended();
    /// <summary>
    /// 
    /// </summary>
    bool isPaid() const;
    void setPaid(bool const value);
    bool paidIsSet() const;
    void unsetPaid();
    /// <summary>
    /// 
    /// </summary>
    bool isMigrated() const;
    void setMigrated(bool const value);
    bool migratedIsSet() const;
    void unsetMigrated();
    /// <summary>
    /// 
    /// </summary>
    bool isLegacy() const;
    void setLegacy(bool const value);
    bool legacyIsSet() const;
    void unsetLegacy();

protected:
    std::string m_Agent;
    bool m_AgentIsSet;
    std::string m_Id;
    bool m_IdIsSet;
    std::string m_Name;
    bool m_NameIsSet;
    std::string m_UserId;
    bool m_UserIdIsSet;
    int64_t m_CreatedAt;
    bool m_CreatedAtIsSet;
    bool m_LegacyProfile;
    bool m_LegacyProfileIsSet;
    bool m_Suspended;
    bool m_SuspendedIsSet;
    bool m_Paid;
    bool m_PaidIsSet;
    bool m_Migrated;
    bool m_MigratedIsSet;
    bool m_Legacy;
    bool m_LegacyIsSet;
};

}
}
}
}
}
}
}
}
}

#endif /* GameProfile_H_ */
