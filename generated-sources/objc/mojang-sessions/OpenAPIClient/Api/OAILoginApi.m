#import "OAILoginApi.h"
#import "OAIQueryParamCollection.h"
#import "OAIApiClient.h"
#import "OAIPlayerProfile.h"
#import "OAISessionApiError.h"


@interface OAILoginApi ()

@property (nonatomic, strong, readwrite) NSMutableDictionary *mutableDefaultHeaders;

@end

@implementation OAILoginApi

NSString* kOAILoginApiErrorDomain = @"OAILoginApiErrorDomain";
NSInteger kOAILoginApiMissingParamErrorCode = 234513;

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
/// Gets the player's game profile
/// This will return the player's username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
///  @param strippedUuid The player UUID without hyphens 
///
///  @param _unsigned When set to false, the signature data are sent (optional)
///
///  @returns OAIPlayerProfile*
///
-(NSURLSessionTask*) getPlayerProfileWithStrippedUuid: (NSString*) strippedUuid
    _unsigned: (NSNumber*) _unsigned
    completionHandler: (void (^)(OAIPlayerProfile* output, NSError* error)) handler {
    // verify the required parameter 'strippedUuid' is set
    if (strippedUuid == nil) {
        NSParameterAssert(strippedUuid);
        if(handler) {
            NSDictionary * userInfo = @{NSLocalizedDescriptionKey : [NSString stringWithFormat:NSLocalizedString(@"Missing required parameter '%@'", nil),@"strippedUuid"] };
            NSError* error = [NSError errorWithDomain:kOAILoginApiErrorDomain code:kOAILoginApiMissingParamErrorCode userInfo:userInfo];
            handler(nil, error);
        }
        return nil;
    }

    NSMutableString* resourcePath = [NSMutableString stringWithFormat:@"/session/minecraft/profile/{stripped_uuid}"];

    NSMutableDictionary *pathParams = [[NSMutableDictionary alloc] init];
    if (strippedUuid != nil) {
        pathParams[@"stripped_uuid"] = strippedUuid;
    }

    NSMutableDictionary* queryParams = [[NSMutableDictionary alloc] init];
    if (_unsigned != nil) {
        queryParams[@"unsigned"] = [_unsigned isEqual:@(YES)] ? @"true" : @"false";
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
                              responseType: @"OAIPlayerProfile*"
                           completionBlock: ^(id data, NSError *error) {
                                if(handler) {
                                    handler((OAIPlayerProfile*)data, error);
                                }
                            }];
}



@end
