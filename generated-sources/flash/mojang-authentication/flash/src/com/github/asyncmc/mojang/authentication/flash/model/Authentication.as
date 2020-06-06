package com.github.asyncmc.mojang.authentication.flash.model {

import com.github.asyncmc.mojang.authentication.flash.model.AccessKeys;

    [XmlRootNode(name="Authentication")]
    public class Authentication {
                [XmlElement(name="accessToken")]
        public var accessToken: String = null;
                [XmlElement(name="clientToken")]
        public var clientToken: String = null;

    public function toString(): String {
        var str: String = "Authentication: ";
        str += " (accessToken: " + accessToken + ")";
        str += " (clientToken: " + clientToken + ")";
        return str;
    }

}

}
