#import "OAIGameProfile.h"

@implementation OAIGameProfile

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"agent": @"agent", @"_id": @"id", @"name": @"name", @"userId": @"userId", @"createdAt": @"createdAt", @"legacyProfile": @"legacyProfile", @"suspended": @"suspended", @"paid": @"paid", @"migrated": @"migrated", @"legacy": @"legacy" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"agent", @"_id", @"name", @"userId", @"createdAt", @"legacyProfile", @"suspended", @"paid", @"migrated", @"legacy"];
  return [optionalProperties containsObject:propertyName];
}

@end
