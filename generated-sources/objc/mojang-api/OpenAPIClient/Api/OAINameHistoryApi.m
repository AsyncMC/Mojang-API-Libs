#import "OAINameHistoryApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAICurrentPlayerIDs.h"
#import "OAIError.h"
#import "OAINameChange.h"


@interface OAINameHistoryApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAINameHistoryApi

NSString* kOAINameHistoryApiErrorDomain = @"OAINameHistoryApiErrorDomain";
NSInteger kOAINameHistoryApiMissingParamErrorCode = 234513;

@synthesize apiClient = _apiClient;

#pragma mark - Initialize methods

- (instancetype) init {
    return [self initWithApiClient:[OAIApiClient sharedClient]];
}


-(instancetype) initWithApiClient:(OAIApiClient *)apiClient {
    self = [super init];
    if (self) {
        _apiClient = apiClient;
        _mutableDefaultHeaders = [NSMutableDictionary dictionary];
    }
    return self;
}

#pragma mark -

-(NSString*) defaultHeaderForKey:(NSString*)key {
    return self.mutableDefaultHeaders[key];
}

-(void) setDefaultHeaderValue:(NSString*) value forKey:(NSString*)key {
    [self.mutableDefaultHeaders setValue:value forKey:key];
}

-(NSDictionary *)defaultHeaders {
    return self.mutableDefaultHeaders;
}

#pragma mark - Api Methods

///
/// Find the current UUID of multiple players at once
/// Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
///  @param requestBody Array with the player names 
///
///  @returns NSArray<OAICurrentPlayerIDs>*
///
-(NSURLSessionTask*) findUniqueIdsByNameWithRequestBody: (NSArray<NSString*>*) requestBody
    completionHandler: (void (^)(NSArray<OAICurrentPlayerIDs>* output, NSError* error)) handler {
    // verify the required parameter 'requestBody' is set
    if (requestBody == nil) {
        NSParameterAssert(requestBody);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"requestBody"] };
            NSError* error = [NSError errorWithDomain:kOAINameHistoryApiErrorDomain code:kOAINameHistoryApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/profiles/minecraft"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/json"]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    bodyParam = requestBody;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"POST"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<OAICurrentPlayerIDs>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAICurrentPlayerIDs>*)data, error);
                                }
                            }];
}

///
/// Gets the full player's name history
/// 
///  @param strippedUuid The player UUID without hyphens 
///
///  @returns NSArray<OAINameChange>*
///
-(NSURLSessionTask*) getNameHistoryWithStrippedUuid: (NSString*) strippedUuid
    completionHandler: (void (^)(NSArray<OAINameChange>* output, NSError* error)) handler {
    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == nil) {
        NSParameterAssert(strippedUuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"strippedUuid"] };
            NSError* error = [NSError errorWithDomain:kOAINameHistoryApiErrorDomain code:kOAINameHistoryApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/profiles/{stripped_uuid}/names"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (strippedUuid != nil) {
        pathParams[@"stripped_uuid"] = strippedUuid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"NSArray<OAINameChange>*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((NSArray<OAINameChange>*)data, error);
                                }
                            }];
}

///
/// Find the UUID by name
/// Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
///  @param username The username in a given time, or in present if \"at\" is not sent 
///
///  @param at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
///
///  @returns OAICurrentPlayerIDs*
///
-(NSURLSessionTask*) getUniqueIdByNameWithUsername: (NSString*) username
    at: (NSNumber*) at
    completionHandler: (void (^)(OAICurrentPlayerIDs* output, NSError* error)) handler {
    // verify the required parameter 'username' is set
    if (username == nil) {
        NSParameterAssert(username);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"username"] };
            NSError* error = [NSError errorWithDomain:kOAINameHistoryApiErrorDomain code:kOAINameHistoryApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/users/profiles/minecraft/{username}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (username != nil) {
        pathParams[@"username"] = username;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (at != nil) {
        queryParams[@"at"] = at;
    }
    NSMutableDictionary* headerParams = [NSMutableDictionary dictionaryWithDictionary:self.apiClient.configuration.defaultHeaders];
    [headerParams addEntriesFromDictionary:self.defaultHeaders];
    // HTTP header `Accept`
    NSString *acceptHeader = [self.apiClient.sanitizer selectHeaderAccept:@[@"application/json"]];
    if(acceptHeader.length > 0) {
        headerParams[@"Accept"] = acceptHeader;
    }

    // response content type
    NSString *responseContentType = [[acceptHeader componentsSeparatedByString:@", "] firstObject] ?: @"";

    // request content type
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[]];

    // Authentication setting
    NSArray *authSettings = @[];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"GET"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: @"OAICurrentPlayerIDs*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAICurrentPlayerIDs*)data, error);
                                }
                            }];
}



@end
