//
// OrderStatisticsRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** The body of the request to get the order statistics */

public struct OrderStatisticsRequest: Codable {

    public var metricKeys: [OrderStatistic]

    public init(metricKeys: [OrderStatistic]) {
        self.metricKeys = metricKeys
    }


}

