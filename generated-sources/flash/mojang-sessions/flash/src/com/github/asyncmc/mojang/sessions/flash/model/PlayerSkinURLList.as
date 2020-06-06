package com.github.asyncmc.mojang.sessions.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.sessions.flash.model.PlayerTextureURL;

    public class PlayerSkinURLList implements ListWrapper {
        // This declaration below of _PlayerSkinURL_obj_class is to force flash compiler to include this class
        private var _playerSkinURL_obj_class: com.github.asyncmc.mojang.sessions.flash.model.PlayerSkinURL = null;
        [XmlElements(name="playerSkinURL", type="com.github.asyncmc.mojang.sessions.flash.model.PlayerSkinURL")]
        public var playerSkinURL: Array = new Array();

        public function getList(): Array{
            return playerSkinURL;
        }

}

}
