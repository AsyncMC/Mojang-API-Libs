package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;

    public class GameProfilePropertyList implements ListWrapper {
        // This declaration below of _GameProfileProperty_obj_class is to force flash compiler to include this class
        private var _gameProfileProperty_obj_class: com.github.asyncmc.mojang.authentication.flash.model.GameProfileProperty = null;
        [XmlElements(name="gameProfileProperty", type="com.github.asyncmc.mojang.authentication.flash.model.GameProfileProperty")]
        public var gameProfileProperty: Array = new Array();

        public function getList(): Array{
            return gameProfileProperty;
        }

}

}
