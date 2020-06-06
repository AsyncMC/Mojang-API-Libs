package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;

    public class ErrorList implements ListWrapper {
        // This declaration below of _Error_obj_class is to force flash compiler to include this class
        private var _error_obj_class: com.github.asyncmc.mojang.api.flash.model.Error = null;
        [XmlElements(name="error", type="com.github.asyncmc.mojang.api.flash.model.Error")]
        public var error: Array = new Array();

        public function getList(): Array{
            return error;
        }

}

}
