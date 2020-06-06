//
// PlayerTexture.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Provide links to the player&#39;s skin and cape */
public class PlayerTexture: JSONEncodable {
    public var SKIN: PlayerSkinURL?
    public var CAPE: PlayerTextureURL?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["SKIN"] = self.SKIN?.encodeToJSON()
        nillableDictionary["CAPE"] = self.CAPE?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}