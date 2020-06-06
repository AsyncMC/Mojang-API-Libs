package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;

    public class AccessKeysList implements ListWrapper {
        // This declaration below of _AccessKeys_obj_class is to force flash compiler to include this class
        private var _accessKeys_obj_class: com.github.asyncmc.mojang.authentication.flash.model.AccessKeys = null;
        [XmlElements(name="accessKeys", type="com.github.asyncmc.mojang.authentication.flash.model.AccessKeys")]
        public var accessKeys: Array = new Array();

        public function getList(): Array{
            return accessKeys;
        }

}

}
