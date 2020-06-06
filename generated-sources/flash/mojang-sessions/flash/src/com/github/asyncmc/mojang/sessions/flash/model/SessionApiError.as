package com.github.asyncmc.mojang.sessions.flash.model {


    [XmlRootNode(name="SessionApiError")]
    public class SessionApiError {
        /* A message describing the error */
        [XmlElement(name="error")]
        public var error: String = null;
        /* The request path */
        [XmlElement(name="path")]
        public var path: String = null;

    public function toString(): String {
        var str: String = "SessionApiError: ";
        str += " (error: " + error + ")";
        str += " (path: " + path + ")";
        return str;
    }

}

}
