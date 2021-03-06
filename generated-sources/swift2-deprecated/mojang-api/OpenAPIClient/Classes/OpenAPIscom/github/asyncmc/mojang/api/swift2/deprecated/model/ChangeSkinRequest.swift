//
// ChangeSkinRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Request Mojang to download a skin from an URL and apply to the player */
public class ChangeSkinRequest: JSONEncodable {
    public var model: SkinModel?
    /** The URL which Mojang servers will download and apply the skin */
    public var url: String?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["model"] = self.model?.encodeToJSON()
        nillableDictionary["url"] = self.url
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
