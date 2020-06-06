#import "OAISkinOperationsApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIError.h"
#import "OAISkinModel.h"


@interface OAISkinOperationsApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAISkinOperationsApi

NSString* kOAISkinOperationsApiErrorDomain = @"OAISkinOperationsApiErrorDomain";
NSInteger kOAISkinOperationsApiMissingParamErrorCode = 234513;

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
/// Changes the player skin by URL
/// This will set the skin for the selected profile, but Mojang's servers will fetch the skin from a URL. This will also work for legacy accounts.
///  @param strippedUuid The player UUID without hyphens 
///
///  @param url The URL which Mojang servers will download and apply the skin 
///
///  @param model  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) changePlayerSkinWithStrippedUuid: (NSString*) strippedUuid
    url: (NSString*) url
    model: (OAISkinModel*) model
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == nil) {
        NSParameterAssert(strippedUuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"strippedUuid"] };
            NSError* error = [NSError errorWithDomain:kOAISkinOperationsApiErrorDomain code:kOAISkinOperationsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'url' is set
    if (url == nil) {
        NSParameterAssert(url);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"url"] };
            NSError* error = [NSError errorWithDomain:kOAISkinOperationsApiErrorDomain code:kOAISkinOperationsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/profile/{stripped_uuid}/skin"];

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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"application/x-www-form-urlencoded"]];

    // Authentication setting
    NSArray *authSettings = @[@"PlayerAccessToken"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (model) {
        formParams[@"model"] = model;
    }
    if (url) {
        formParams[@"url"] = url;
    }

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
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Resets the player skin to default
/// 
///  @param strippedUuid The player UUID without hyphens 
///
///  @returns void
///
-(NSURLSessionTask*) resetPlayerSkinWithStrippedUuid: (NSString*) strippedUuid
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == nil) {
        NSParameterAssert(strippedUuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"strippedUuid"] };
            NSError* error = [NSError errorWithDomain:kOAISkinOperationsApiErrorDomain code:kOAISkinOperationsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/profile/{stripped_uuid}/skin"];

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
    NSArray *authSettings = @[@"PlayerAccessToken"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"DELETE"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}

///
/// Changes the player skin by upload
/// This uploads a skin to Mojang's servers. It also sets the users skin. This works on legacy counts as well.
///  @param strippedUuid The player UUID without hyphens 
///
///  @param file The skin image in PNG format 
///
///  @param model  (optional)
///
///  @returns void
///
-(NSURLSessionTask*) uploadPlayerSkinWithStrippedUuid: (NSString*) strippedUuid
    file: (NSURL*) file
    model: (OAISkinModel*) model
    completionHandler: (void (^)(NSError* error)) handler {
    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == nil) {
        NSParameterAssert(strippedUuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"strippedUuid"] };
            NSError* error = [NSError errorWithDomain:kOAISkinOperationsApiErrorDomain code:kOAISkinOperationsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    // verify the required parameter 'file' is set
    if (file == nil) {
        NSParameterAssert(file);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"file"] };
            NSError* error = [NSError errorWithDomain:kOAISkinOperationsApiErrorDomain code:kOAISkinOperationsApiMissingParamErrorCode userInfo:userInfo];
            handler(error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/user/profile/{stripped_uuid}/skin"];

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
    NSString *requestContentType = [self.apiClient.sanitizer selectHeaderContentType:@[@"multipart/form-data"]];

    // Authentication setting
    NSArray *authSettings = @[@"PlayerAccessToken"];

    id bodyParam = nil;
    NSMutableDictionary *formParams = [[NSMutableDictionary alloc] init];
    NSMutableDictionary *localVarFiles = [[NSMutableDictionary alloc] init];
    if (model) {
        formParams[@"model"] = model;
    }
    localVarFiles[@"file"] = file;

    return [self.apiClient requestWithPath: resourcePath
                                    method: @"PUT"
                                pathParams: pathParams
                               queryParams: queryParams
                                formParams: formParams
                                     files: localVarFiles
                                      body: bodyParam
                              headerParams: headerParams
                              authSettings: authSettings
                        requestContentType: requestContentType
                       responseContentType: responseContentType
                              responseType: nil
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler(error);
                                }
                            }];
}



@end
