//
// CurrentPlayerIDs.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The current player, demo and legacy status of a player identified by the id */
public class CurrentPlayerIDs: JSONEncodable {
    /** The player UUID without hyphens */
    public var id: String?
    /** The current name being used by this player */
    public var name: String?
    /** If account has not been converted */
    public var legacy: Bool?
    /** If the player has not puchased the game */
    public var demo: Bool?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["name"] = self.name
        nillableDictionary["legacy"] = self.legacy
        nillableDictionary["demo"] = self.demo
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
