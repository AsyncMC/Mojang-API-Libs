package com.github.asyncmc.mojang.authentication.flash.model {

import com.github.asyncmc.mojang.authentication.flash.model.RefreshRequest;

    [XmlRootNode(name="RefreshResponse")]
    public class RefreshResponse {
                [XmlElement(name="accessToken")]
        public var accessToken: String = null;
                [XmlElement(name="clientToken")]
        public var clientToken: String = null;

    public function toString(): String {
        var str: String = "RefreshResponse: ";
        str += " (accessToken: " + accessToken + ")";
        str += " (clientToken: " + clientToken + ")";
        return str;
    }

}

}
