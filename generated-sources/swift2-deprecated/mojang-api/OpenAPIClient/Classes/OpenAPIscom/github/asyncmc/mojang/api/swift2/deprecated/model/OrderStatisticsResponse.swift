//
// OrderStatisticsResponse.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second. */
public class OrderStatisticsResponse: JSONEncodable {
    /** total amount sold */
    public var total: Int64?
    /** total sold in last 24 hours */
    public var last24h: Int64?
    /** decimal average sales per second */
    public var saleVelocityPerSeconds: Double?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["total"] = self.total?.encodeToJSON()
        nillableDictionary["last24h"] = self.last24h?.encodeToJSON()
        nillableDictionary["saleVelocityPerSeconds"] = self.saleVelocityPerSeconds
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}