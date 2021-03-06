#import <Foundation/Foundation.h>
#import "OAIAccessKeys.h"
#import "OAIAuthentication.h"
#import "OAIAuthenticationRequest.h"
#import "OAIError.h"
#import "OAIRefreshRequest.h"
#import "OAIRefreshResponse.h"
#import "OAIUsernamePassword.h"
#import "OAIApi.h"

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



@interface OAIDefaultApi: NSObject <OAIApi>

extern NSString* kOAIDefaultApiErrorDomain;
extern NSInteger kOAIDefaultApiMissingParamErrorCode;

-(instancetype) initWithApiClient:(OAIApiClient *)apiClient NS_DESIGNATED_INITIALIZER;

/// 
/// 
///
/// @param authenticationRequest 
/// 
///  code:200 message:"Successfully authenticated",
///  code:400 message:"Could not authenticate"
///
/// @return OAIAuthentication*
-(NSURLSessionTask*) authenticateWithAuthenticationRequest: (OAIAuthenticationRequest*) authenticationRequest
    completionHandler: (void (^)(OAIAuthentication* output, NSError* error)) handler;


/// 
/// 
///
/// @param accessKeys 
/// 
///  code:204 message:"The token have been invalidated",
///  code:400 message:"Could not invalidate the token"
///
/// @return void
-(NSURLSessionTask*) invalidateWithAccessKeys: (OAIAccessKeys*) accessKeys
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param refreshRequest 
/// 
///  code:200 message:"Session refreshed successfully. Note: The old access token gets invalidated.",
///  code:400 message:"Could not refresh the session"
///
/// @return OAIRefreshResponse*
-(NSURLSessionTask*) refreshWithRefreshRequest: (OAIRefreshRequest*) refreshRequest
    completionHandler: (void (^)(OAIRefreshResponse* output, NSError* error)) handler;


/// 
/// 
///
/// @param usernamePassword 
/// 
///  code:204 message:"All tokens have been invalidated",
///  code:400 message:"Invalid username/password"
///
/// @return void
-(NSURLSessionTask*) siginoutWithUsernamePassword: (OAIUsernamePassword*) usernamePassword
    completionHandler: (void (^)(NSError* error)) handler;


/// 
/// 
///
/// @param accessKeys 
/// 
///  code:204 message:"The token is valid",
///  code:403 message:"The token is not valid"
///
/// @return void
-(NSURLSessionTask*) validateWithAccessKeys: (OAIAccessKeys*) accessKeys
    completionHandler: (void (^)(NSError* error)) handler;



@end
