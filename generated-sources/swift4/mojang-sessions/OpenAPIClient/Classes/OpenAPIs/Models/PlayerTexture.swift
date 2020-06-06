//
// PlayerTexture.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation


/** Provide links to the player&#39;s skin and cape */

public struct PlayerTexture: Codable {

    public var SKIN: PlayerSkinURL?
    public var CAPE: PlayerTextureURL?

    public init(SKIN: PlayerSkinURL?, CAPE: PlayerTextureURL?) {
        self.SKIN = SKIN
        self.CAPE = CAPE
    }


}

