//
// Agent.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Identifies the software doing the request */
public class Agent: JSONEncodable {
    public enum Name: String { 
        case Minecraft = "Minecraft"
        case Scrolls = "Scrolls"
    }
    /** The name of the game */
    public var name: Name?
    /** The agent version, usually 1. */
    public var version: Int32?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["name"] = self.name?.rawValue
        nillableDictionary["version"] = self.version?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}