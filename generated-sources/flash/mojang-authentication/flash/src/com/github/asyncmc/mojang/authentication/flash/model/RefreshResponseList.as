package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.authentication.flash.model.RefreshRequest;

    public class RefreshResponseList implements ListWrapper {
        // This declaration below of _RefreshResponse_obj_class is to force flash compiler to include this class
        private var _refreshResponse_obj_class: com.github.asyncmc.mojang.authentication.flash.model.RefreshResponse = null;
        [XmlElements(name="refreshResponse", type="com.github.asyncmc.mojang.authentication.flash.model.RefreshResponse")]
        public var refreshResponse: Array = new Array();

        public function getList(): Array{
            return refreshResponse;
        }

}

}
