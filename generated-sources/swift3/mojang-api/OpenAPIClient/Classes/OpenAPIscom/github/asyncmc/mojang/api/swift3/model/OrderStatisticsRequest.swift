//
// OrderStatisticsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The body of the request to get the order statistics */
open class OrderStatisticsRequest: JSONEncodable {

    public var metricKeys: [OrderStatistic]?

    public init() {}

    // MARK: JSONEncodable
    open func encodeToJSON() -> Any {
        var nillableDictionary = [String:Any?]()
        nillableDictionary["metricKeys"] = self.metricKeys?.encodeToJSON()

        let dictionary: [String:Any] = APIHelper.rejectNil(nillableDictionary) ?? [:]
        return dictionary
    }
}
