/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * GameProfile.h
 *
 * 
 */

#ifndef COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_GameProfile_H_
#define COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_GameProfile_H_


#include "../ModelBase.h"

#include <cpprest/details/basic_types.h>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace authentication {
namespace cpp {
namespace restsdk {
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

    web::json::value toJson() const override;
    void fromJson(const web::json::value& json) override;

    void toMultipart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) const override;
    void fromMultiPart(std::shared_ptr<MultipartFormData> multipart, const utility::string_t& namePrefix) override;

    /////////////////////////////////////////////
    /// GameProfile members

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getAgent() const;
    bool agentIsSet() const;
    void unsetAgent();

    void setAgent(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getId() const;
    bool idIsSet() const;
    void unsetId();

    void setId(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getName() const;
    bool nameIsSet() const;
    void unsetName();

    void setName(const utility::string_t& value);

    /// <summary>
    /// 
    /// </summary>
    utility::string_t getUserId() const;
    bool userIdIsSet() const;
    void unsetUserId();

    void setUserId(const utility::string_t& value);

    /// <summary>
    /// Unix timestamp in milliseconds
    /// </summary>
    int64_t getCreatedAt() const;
    bool createdAtIsSet() const;
    void unsetCreatedAt();

    void setCreatedAt(int64_t value);

    /// <summary>
    /// 
    /// </summary>
    bool isLegacyProfile() const;
    bool legacyProfileIsSet() const;
    void unsetLegacyProfile();

    void setLegacyProfile(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isSuspended() const;
    bool suspendedIsSet() const;
    void unsetSuspended();

    void setSuspended(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isPaid() const;
    bool paidIsSet() const;
    void unsetPaid();

    void setPaid(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isMigrated() const;
    bool migratedIsSet() const;
    void unsetMigrated();

    void setMigrated(bool value);

    /// <summary>
    /// 
    /// </summary>
    bool isLegacy() const;
    bool legacyIsSet() const;
    void unsetLegacy();

    void setLegacy(bool value);


protected:
    utility::string_t m_Agent;
    bool m_AgentIsSet;
    utility::string_t m_Id;
    bool m_IdIsSet;
    utility::string_t m_Name;
    bool m_NameIsSet;
    utility::string_t m_UserId;
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

#endif /* COM_GITHUB_ASYNCMC_MOJANG_AUTHENTICATION_CPP_RESTSDK_MODEL_GameProfile_H_ */