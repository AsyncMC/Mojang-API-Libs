//
// ChangeSkinRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Request Mojang to download a skin from an URL and apply to the player */
open class ChangeSkinRequest: JSONEncodable {

    public var model: SkinModel?
    /** The URL which Mojang servers will download and apply the skin */
    public var url: String?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["model"] = self.model?.encodeToJSON()
        nillableDictionary["url"] = self.url

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
