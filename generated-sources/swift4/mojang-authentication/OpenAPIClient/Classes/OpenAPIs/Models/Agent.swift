//
// Agent.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Identifies the software doing the request */

public struct Agent: Codable {

    public enum Name: String, Codable {
        case minecraft = "Minecraft"
        case scrolls = "Scrolls"
    }
    /** The name of the game */
    public var name: Name? = .Minecraft
    /** The agent version, usually 1. */
    public var version: Int? = 1

    public init(name: Name?, version: Int?) {
        self.name = name
        self.version = version
    }


}

