package com.github.asyncmc.mojang.sessions.flash.model {

import com.github.asyncmc.mojang.sessions.flash.model.PlayerTextureURL;

    [XmlRootNode(name="PlayerSkinURL")]
    public class PlayerSkinURL {
        /* The URL to the texture, must be in Mojang&#39;s domains. */
        [XmlElement(name="url")]
        public var url: String = null;

    public function toString(): String {
        var str: String = "PlayerSkinURL: ";
        str += " (url: " + url + ")";
        return str;
    }

}

}
