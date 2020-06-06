//
// OrderStatisticsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The body of the request to get the order statistics */
public class OrderStatisticsRequest: JSONEncodable {
    public var metricKeys: [OrderStatistic]?

    public init() {}

    // MARK: JSONEncodable
    func encodeToJSON() -> AnyObject {
        var nillableDictionary = [String:AnyObject?]()
        nillableDictionary["metricKeys"] = self.metricKeys?.encodeToJSON()
        let dictionary: [String:AnyObject] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
