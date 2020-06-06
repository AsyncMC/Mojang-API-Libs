package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;

    public class GameProfileList implements ListWrapper {
        // This declaration below of _GameProfile_obj_class is to force flash compiler to include this class
        private var _gameProfile_obj_class: com.github.asyncmc.mojang.authentication.flash.model.GameProfile = null;
        [XmlElements(name="gameProfile", type="com.github.asyncmc.mojang.authentication.flash.model.GameProfile")]
        public var gameProfile: Array = new Array();

        public function getList(): Array{
            return gameProfile;
        }

}

}
