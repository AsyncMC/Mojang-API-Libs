//
// SecurityAnswerId.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** A security question answer id given by Mojang */
public class SecurityAnswerId: JSONEncodable {
    /** A number giver by Mojang to reply a question */
    public var id: Int32?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
