//
// RefreshResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


open class RefreshResponse: RefreshRequest {


    

    // MARK: JSONEncodable
    override open func encodeToJSON() -> Any {
        var nillableDictionary = super.encodeToJSON() as? [String:Any?] ?? [String:Any?]()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
