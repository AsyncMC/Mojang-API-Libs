//
// ModelError.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** This is returned when the request fails */

public struct ModelError: Codable {

    public var error: String?
    public var errorMessage: String?

    public init(error: String?, errorMessage: String?) {
        self.error = error
        self.errorMessage = errorMessage
    }


}

