//
// NameHistoryAPI.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation
import Alamofire


open class NameHistoryAPI: APIBase {
    /**
     Find the current UUID of multiple players at once
     - parameter requestBody: (body) Array with the player names 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func findUniqueIdsByName(requestBody: [String], completion: @escaping ((_ data: [CurrentPlayerIDs]?, _ error: ErrorResponse?) -> Void)) {
        findUniqueIdsByNameWithRequestBuilder(requestBody: requestBody).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Find the current UUID of multiple players at once
     - POST /profiles/minecraft
     - Find the current players name, UUID, demo status and migration flag by the current players name. The \"at\" parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
     - parameter requestBody: (body) Array with the player names 
     - returns: RequestBuilder<[CurrentPlayerIDs]> 
     */
    open class func findUniqueIdsByNameWithRequestBuilder(requestBody: [String]) -> RequestBuilder<[CurrentPlayerIDs]> {
        let path = "/profiles/minecraft"
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters = requestBody.encodeToJSON()

        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[CurrentPlayerIDs]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "POST", URLString: (url?.string ?? URLString), parameters: parameters, isBody: true)
    }

    /**
     Gets the full player's name history
     - parameter strippedUuid: (path) The player UUID without hyphens 
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getNameHistory(strippedUuid: String, completion: @escaping ((_ data: [NameChange]?, _ error: ErrorResponse?) -> Void)) {
        getNameHistoryWithRequestBuilder(strippedUuid: strippedUuid).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Gets the full player's name history
     - GET /user/profiles/{stripped_uuid}/names
     - parameter strippedUuid: (path) The player UUID without hyphens 
     - returns: RequestBuilder<[NameChange]> 
     */
    open class func getNameHistoryWithRequestBuilder(strippedUuid: String) -> RequestBuilder<[NameChange]> {
        var path = "/user/profiles/{stripped_uuid}/names"
        let strippedUuidPreEscape = "\(strippedUuid)"
        let strippedUuidPostEscape = strippedUuidPreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{stripped_uuid}", with: strippedUuidPostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        let url = URLComponents(string: URLString)

        let requestBuilder: RequestBuilder<[NameChange]>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

    /**
     Find the UUID by name
     - parameter username: (path) The username in a given time, or in present if \&quot;at\&quot; is not sent 
     - parameter at: (query) Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     - parameter completion: completion handler to receive the data and the error objects
     */
    open class func getUniqueIdByName(username: String, at: Int64? = nil, completion: @escaping ((_ data: CurrentPlayerIDs?, _ error: ErrorResponse?) -> Void)) {
        getUniqueIdByNameWithRequestBuilder(username: username, at: at).execute { (response, error) -> Void in
            completion(response?.body, error)
        }
    }


    /**
     Find the UUID by name
     - GET /users/profiles/minecraft/{username}
     - Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
     - parameter username: (path) The username in a given time, or in present if \&quot;at\&quot; is not sent 
     - parameter at: (query) Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
     - returns: RequestBuilder<CurrentPlayerIDs> 
     */
    open class func getUniqueIdByNameWithRequestBuilder(username: String, at: Int64? = nil) -> RequestBuilder<CurrentPlayerIDs> {
        var path = "/users/profiles/minecraft/{username}"
        let usernamePreEscape = "\(username)"
        let usernamePostEscape = usernamePreEscape.addingPercentEncoding(withAllowedCharacters: .urlPathAllowed) ?? ""
        path = path.replacingOccurrences(of: "{username}", with: usernamePostEscape, options: .literal, range: nil)
        let URLString = OpenAPIClientAPI.basePath + path
        let parameters: [String:Any]? = nil
        
        var url = URLComponents(string: URLString)
        url?.queryItems = APIHelper.mapValuesToQueryItems(values:[
            "at": at?.encodeToJSON()
        ])

        let requestBuilder: RequestBuilder<CurrentPlayerIDs>.Type = OpenAPIClientAPI.requestBuilderFactory.getBuilder()

        return requestBuilder.init(method: "GET", URLString: (url?.string ?? URLString), parameters: parameters, isBody: false)
    }

}
