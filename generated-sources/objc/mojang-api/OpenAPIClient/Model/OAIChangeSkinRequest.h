#import <Foundation/Foundation.h>
#import "OAIObject.h"

/**
* Mojang API
* No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
*
* OpenAPI spec version: 2020-06-05
* 
*
* NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
* https://openapi-generator.tech
* Do not edit the class manually.
*/


#import "OAISkinModel.h"
@protocol OAISkinModel;
@class OAISkinModel;



@protocol OAIChangeSkinRequest
@end

@interface OAIChangeSkinRequest : OAIObject


@property(nonatomic) OAISkinModel* model;
/* The URL which Mojang servers will download and apply the skin 
 */
@property(nonatomic) NSString* url;

@end
