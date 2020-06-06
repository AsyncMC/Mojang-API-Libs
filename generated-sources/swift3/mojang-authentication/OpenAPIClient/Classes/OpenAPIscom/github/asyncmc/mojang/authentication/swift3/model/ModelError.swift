//
// ModelError.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** This is returned when the request fails */
open class ModelError: JSONEncodable {

    public var error: String?
    public var errorMessage: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["error"] = self.error
        nillableDictionary["errorMessage"] = self.errorMessage

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
