//
// RefreshRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class RefreshRequest: JSONEncodable {
    public var accessToken: String?
    public var clientToken: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["accessToken"] = self.accessToken
        nillableDictionary["clientToken"] = self.clientToken
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}