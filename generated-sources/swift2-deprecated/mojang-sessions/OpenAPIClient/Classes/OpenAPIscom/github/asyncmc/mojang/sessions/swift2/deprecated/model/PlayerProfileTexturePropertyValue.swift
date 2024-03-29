//
// PlayerProfileTexturePropertyValue.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** This is obtained by decoding the \&quot;textures\&quot; property */
public class PlayerProfileTexturePropertyValue: JSONEncodable {
    /** UNIX timestamp in milliseconds */
    public var timestamp: Int64?
    /** The player UUID without hyphens */
    public var profileId: String?
    /** The player&#39;s name */
    public var profileName: String?
    /** Only present if unsigned was set to false in the request */
    public var signatureRequired: Bool?
    public var textures: PlayerTexture?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["timestamp"] = self.timestamp?.encodeToJSON()
        nillableDictionary["profileId"] = self.profileId
        nillableDictionary["profileName"] = self.profileName
        nillableDictionary["signatureRequired"] = self.signatureRequired
        nillableDictionary["textures"] = self.textures?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
