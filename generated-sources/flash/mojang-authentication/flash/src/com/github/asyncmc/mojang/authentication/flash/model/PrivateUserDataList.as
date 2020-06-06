package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.authentication.flash.model.GameProfileProperty;
import com.github.asyncmc.mojang.authentication.flash.model.ReducedUserData;

    public class PrivateUserDataList implements ListWrapper {
        // This declaration below of _PrivateUserData_obj_class is to force flash compiler to include this class
        private var _privateUserData_obj_class: com.github.asyncmc.mojang.authentication.flash.model.PrivateUserData = null;
        [XmlElements(name="privateUserData", type="com.github.asyncmc.mojang.authentication.flash.model.PrivateUserData")]
        public var privateUserData: Array = new Array();

        public function getList(): Array{
            return privateUserData;
        }

}

}
