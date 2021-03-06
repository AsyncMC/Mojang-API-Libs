//
// UsernamePassword.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation



public struct UsernamePassword: Codable {

    /** The Mojang account e-mail or username. Never store it. */
    public var username: String
    /** The Mojang account password, never store it. */
    public var password: String

    public init(username: String, password: String) {
        self.username = username
        self.password = password
    }


}

