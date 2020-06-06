#import "OAICurrentPlayerIDs.h"

@implementation OAICurrentPlayerIDs

- (instancetype)init {
  self = [super init];
  if (self) {
    // initialize property's default value, if any
    self.legacy = @(NO);
    self.demo = @(NO);
    
  }
  return self;
}


/**
 * Maps json key to property name.
 * This method is used by `JSONModel`.
 */
+ (JSONKeyMapper *)keyMapper {
  return [[JSONKeyMapper alloc] initWithModelToJSONDictionary:@{ @"_id": @"id", @"name": @"name", @"legacy": @"legacy", @"demo": @"demo" }];
}

/**
 * Indicates whether the property with the given name is optional.
 * If `propertyName` is optional, then return `YES`, otherwise return `NO`.
 * This method is used by `JSONModel`.
 */
+ (BOOL)propertyIsOptional:(NSString *)propertyName {

  NSArray *optionalProperties = @[@"legacy", @"demo"];
  return [optionalProperties containsObject:propertyName];
}

@end
