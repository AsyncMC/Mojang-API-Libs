package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;

    public class SecurityQuestionList implements ListWrapper {
        // This declaration below of _SecurityQuestion_obj_class is to force flash compiler to include this class
        private var _securityQuestion_obj_class: com.github.asyncmc.mojang.api.flash.model.SecurityQuestion = null;
        [XmlElements(name="securityQuestion", type="com.github.asyncmc.mojang.api.flash.model.SecurityQuestion")]
        public var securityQuestion: Array = new Array();

        public function getList(): Array{
            return securityQuestion;
        }

}

}
