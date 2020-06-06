//
// ProfileId.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class ProfileId: JSONEncodable {

    public var id: String?
    /** The player name */
    public var name: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["id"] = self.id
        nillableDictionary["name"] = self.name

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
