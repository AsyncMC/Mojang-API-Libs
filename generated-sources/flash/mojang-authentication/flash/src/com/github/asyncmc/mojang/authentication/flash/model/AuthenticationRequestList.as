package com.github.asyncmc.mojang.authentication.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.authentication.flash.model.UsernamePassword;

    public class AuthenticationRequestList implements ListWrapper {
        // This declaration below of _AuthenticationRequest_obj_class is to force flash compiler to include this class
        private var _authenticationRequest_obj_class: com.github.asyncmc.mojang.authentication.flash.model.AuthenticationRequest = null;
        [XmlElements(name="authenticationRequest", type="com.github.asyncmc.mojang.authentication.flash.model.AuthenticationRequest")]
        public var authenticationRequest: Array = new Array();

        public function getList(): Array{
            return authenticationRequest;
        }

}

}
