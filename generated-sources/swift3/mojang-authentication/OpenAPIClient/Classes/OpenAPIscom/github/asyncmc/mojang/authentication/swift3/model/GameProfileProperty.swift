//
// GameProfileProperty.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class GameProfileProperty: JSONEncodable {

    public var name: String?
    public var value: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["name"] = self.name
        nillableDictionary["value"] = self.value

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
