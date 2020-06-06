package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.authentication.flash.model.GameProfileProperty;

    public class ReducedUserDataList implements ListWrapper {
        // This declaration below of _ReducedUserData_obj_class is to force flash compiler to include this class
        private var _reducedUserData_obj_class: com.github.asyncmc.mojang.authentication.flash.model.ReducedUserData = null;
        [XmlElements(name="reducedUserData", type="com.github.asyncmc.mojang.authentication.flash.model.ReducedUserData")]
        public var reducedUserData: Array = new Array();

        public function getList(): Array{
            return reducedUserData;
        }

}

}
