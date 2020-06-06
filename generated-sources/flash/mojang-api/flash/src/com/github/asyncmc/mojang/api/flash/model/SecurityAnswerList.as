package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.api.flash.model.SecurityAnswerId;

    public class SecurityAnswerList implements ListWrapper {
        // This declaration below of _SecurityAnswer_obj_class is to force flash compiler to include this class
        private var _securityAnswer_obj_class: com.github.asyncmc.mojang.api.flash.model.SecurityAnswer = null;
        [XmlElements(name="securityAnswer", type="com.github.asyncmc.mojang.api.flash.model.SecurityAnswer")]
        public var securityAnswer: Array = new Array();

        public function getList(): Array{
            return securityAnswer;
        }

}

}
