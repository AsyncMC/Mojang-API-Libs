//
// Error.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** This is returned when the request fails */
public class Error: JSONEncodable {
    public var error: String?
    public var errorMessage: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["error"] = self.error
        nillableDictionary["errorMessage"] = self.errorMessage
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}