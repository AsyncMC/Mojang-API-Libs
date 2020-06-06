package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;

    public class NameChangeList implements ListWrapper {
        // This declaration below of _NameChange_obj_class is to force flash compiler to include this class
        private var _nameChange_obj_class: com.github.asyncmc.mojang.api.flash.model.NameChange = null;
        [XmlElements(name="nameChange", type="com.github.asyncmc.mojang.api.flash.model.NameChange")]
        public var nameChange: Array = new Array();

        public function getList(): Array{
            return nameChange;
        }

}

}
