//
// GameProfile.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class GameProfile: JSONEncodable {

    public var agent: String?
    public var id: String?
    public var name: String?
    public var userId: String?
    /** Unix timestamp in milliseconds */
    public var createdAt: Int64?
    public var legacyProfile: Bool?
    public var suspended: Bool?
    public var paid: Bool?
    public var migrated: Bool?
    public var legacy: Bool?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["agent"] = self.agent
        nillableDictionary["id"] = self.id
        nillableDictionary["name"] = self.name
        nillableDictionary["userId"] = self.userId
        nillableDictionary["createdAt"] = self.createdAt?.encodeToJSON()
        nillableDictionary["legacyProfile"] = self.legacyProfile
        nillableDictionary["suspended"] = self.suspended
        nillableDictionary["paid"] = self.paid
        nillableDictionary["migrated"] = self.migrated
        nillableDictionary["legacy"] = self.legacy

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

