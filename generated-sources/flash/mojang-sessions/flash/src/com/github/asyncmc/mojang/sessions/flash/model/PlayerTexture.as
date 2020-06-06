package com.github.asyncmc.mojang.sessions.flash.model {

import com.github.asyncmc.mojang.sessions.flash.model.PlayerSkinURL;
import com.github.asyncmc.mojang.sessions.flash.model.PlayerTextureURL;

    [XmlRootNode(name="PlayerTexture")]
    public class PlayerTexture {
                [XmlElement(name="SKIN")]
        public var skin: PlayerSkinURL = NaN;
                [XmlElement(name="CAPE")]
        public var cape: PlayerTextureURL = NaN;

    public function toString(): String {
        var str: String = "PlayerTexture: ";
        str += " (skin: " + skin + ")";
        str += " (cape: " + cape + ")";
        return str;
    }

}

}
