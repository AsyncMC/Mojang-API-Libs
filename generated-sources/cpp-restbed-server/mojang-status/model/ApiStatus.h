/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI-Generator 3.3.4.
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

/*
 * ApiStatus.h
 *
 * The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
 */

#ifndef ApiStatus_H_
#define ApiStatus_H_



#include <memory>

namespace com {
namespace github {
namespace asyncmc {
namespace mojang {
namespace status {
namespace cpp {
namespace restbed {
namespace server {
namespace model {

/// <summary>
/// The status of a Mojang services. Possible values are green (no issues), yellow (some issues), red (service unavailable).
/// </summary>
class  ApiStatus
{
public:
    ApiStatus();
    virtual ~ApiStatus();
    
    std::string toJsonString();
    void fromJsonString(std::string const& jsonString);

    /////////////////////////////////////////////
    /// ApiStatus members
    

protected:
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

#endif /* ApiStatus_H_ */
