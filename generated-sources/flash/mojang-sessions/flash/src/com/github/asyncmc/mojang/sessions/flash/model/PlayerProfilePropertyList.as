package com.github.asyncmc.mojang.sessions.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.sessions.flash.model.ByteArray;

    public class PlayerProfilePropertyList implements ListWrapper {
        // This declaration below of _PlayerProfileProperty_obj_class is to force flash compiler to include this class
        private var _playerProfileProperty_obj_class: com.github.asyncmc.mojang.sessions.flash.model.PlayerProfileProperty = null;
        [XmlElements(name="playerProfileProperty", type="com.github.asyncmc.mojang.sessions.flash.model.PlayerProfileProperty")]
        public var playerProfileProperty: Array = new Array();

        public function getList(): Array{
            return playerProfileProperty;
        }

}

}
