//
// PrivateUserData.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class PrivateUserData: JSONEncodable {
    public var id: NSURL?
    public var properties: [GameProfileProperty]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        nillableDictionary["properties"] = self.properties?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
