//
// SecurityAnswerId.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** A security question answer id given by Mojang */

public struct SecurityAnswerId: Codable {

    /** A number giver by Mojang to reply a question */
    public var _id: Int

    public init(_id: Int) {
        self._id = _id
    }

    public enum CodingKeys: String, CodingKey { 
        case _id = "id"
    }


}

