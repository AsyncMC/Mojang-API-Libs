package com.github.asyncmc.mojang.sessions.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.sessions.flash.model.PlayerTexture;

    public class PlayerProfileTexturePropertyValueList implements ListWrapper {
        // This declaration below of _PlayerProfileTexturePropertyValue_obj_class is to force flash compiler to include this class
        private var _playerProfileTexturePropertyValue_obj_class: com.github.asyncmc.mojang.sessions.flash.model.PlayerProfileTexturePropertyValue = null;
        [XmlElements(name="playerProfileTexturePropertyValue", type="com.github.asyncmc.mojang.sessions.flash.model.PlayerProfileTexturePropertyValue")]
        public var playerProfileTexturePropertyValue: Array = new Array();

        public function getList(): Array{
            return playerProfileTexturePropertyValue;
        }

}

}
