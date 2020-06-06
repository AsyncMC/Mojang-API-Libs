//
// PlayerProfile.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


public class PlayerProfile: JSONEncodable {
    /** The player UUID without hyphens */
    public var id: String?
    public var name: String?
    /** Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
    public var legacy: Bool?
    /** An array with all player properties, like skin and cape */
    public var properties: [PlayerProfileProperty]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["name"] = self.name
        nillableDictionary["legacy"] = self.legacy
        nillableDictionary["properties"] = self.properties?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}