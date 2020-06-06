package com.github.asyncmc.mojang.sessions.flash.model {

import org.openapitools.common.ListWrapper;

    public class SessionApiErrorList implements ListWrapper {
        // This declaration below of _SessionApiError_obj_class is to force flash compiler to include this class
        private var _sessionApiError_obj_class: com.github.asyncmc.mojang.sessions.flash.model.SessionApiError = null;
        [XmlElements(name="sessionApiError", type="com.github.asyncmc.mojang.sessions.flash.model.SessionApiError")]
        public var sessionApiError: Array = new Array();

        public function getList(): Array{
            return sessionApiError;
        }

}

}
