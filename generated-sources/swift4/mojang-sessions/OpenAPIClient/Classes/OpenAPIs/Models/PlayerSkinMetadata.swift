//
// PlayerSkinMetadata.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Contains details about the skin */

public struct PlayerSkinMetadata: Codable {

    public enum Model: String, Codable {
        case slim = "slim"
    }
    /** The player model, currently only \&quot;slim\&quot; (Alex) is valid, for Steve&#39;s model this property must be absent. */
    public var model: Model?

    public init(model: Model?) {
        self.model = model
    }


}

