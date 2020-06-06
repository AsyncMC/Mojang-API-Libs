package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;

    public class UsernamePasswordList implements ListWrapper {
        // This declaration below of _UsernamePassword_obj_class is to force flash compiler to include this class
        private var _usernamePassword_obj_class: com.github.asyncmc.mojang.authentication.flash.model.UsernamePassword = null;
        [XmlElements(name="usernamePassword", type="com.github.asyncmc.mojang.authentication.flash.model.UsernamePassword")]
        public var usernamePassword: Array = new Array();

        public function getList(): Array{
            return usernamePassword;
        }

}

}
