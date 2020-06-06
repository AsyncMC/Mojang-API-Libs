#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Mojang Session API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/





@protocol OAIPlayerProfileProperty
@end

@interface OAIPlayerProfileProperty : OAIObject

/* The property name 
 */
@property(nonatomic) NSString* name;
/* The serialized property value in base64. 
 */
@property(nonatomic) NSData* value;
/* signed data using Yggdrasil's private key [optional]
 */
@property(nonatomic) NSData* signature;

@end