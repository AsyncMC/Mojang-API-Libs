package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;

    public class CurrentPlayerIDsList implements ListWrapper {
        // This declaration below of _CurrentPlayerIDs_obj_class is to force flash compiler to include this class
        private var _currentPlayerIDs_obj_class: com.github.asyncmc.mojang.api.flash.model.CurrentPlayerIDs = null;
        [XmlElements(name="currentPlayerIDs", type="com.github.asyncmc.mojang.api.flash.model.CurrentPlayerIDs")]
        public var currentPlayerIDs: Array = new Array();

        public function getList(): Array{
            return currentPlayerIDs;
        }

}

}
