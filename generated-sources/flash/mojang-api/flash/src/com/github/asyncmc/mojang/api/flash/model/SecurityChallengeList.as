package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.api.flash.model.SecurityAnswerId;
import com.github.asyncmc.mojang.api.flash.model.SecurityQuestion;

    public class SecurityChallengeList implements ListWrapper {
        // This declaration below of _SecurityChallenge_obj_class is to force flash compiler to include this class
        private var _securityChallenge_obj_class: com.github.asyncmc.mojang.api.flash.model.SecurityChallenge = null;
        [XmlElements(name="securityChallenge", type="com.github.asyncmc.mojang.api.flash.model.SecurityChallenge")]
        public var securityChallenge: Array = new Array();

        public function getList(): Array{
            return securityChallenge;
        }

}

}
