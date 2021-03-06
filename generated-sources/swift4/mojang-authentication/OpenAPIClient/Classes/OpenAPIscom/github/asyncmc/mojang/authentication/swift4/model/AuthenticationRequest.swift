//
// AuthenticationRequest.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation. */

public struct AuthenticationRequest: Codable {

    /** The Mojang account e-mail or username. Never store it. */
    public var username: String
    /** The Mojang account password, never store it. */
    public var password: String

    public init(username: String, password: String) {
        self.username = username
        self.password = password
    }


}

