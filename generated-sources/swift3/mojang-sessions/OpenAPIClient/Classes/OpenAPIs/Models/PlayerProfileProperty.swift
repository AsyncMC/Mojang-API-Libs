//
// PlayerProfileProperty.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue */
open class PlayerProfileProperty: JSONEncodable {

    /** The property name */
    public var name: String?
    /** The serialized property value in base64. */
    public var value: Data?
    /** signed data using Yggdrasil&#39;s private key */
    public var signature: Data?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["value"] = self.value?.encodeToJSON()
        nillableDictionary["signature"] = self.signature?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}

