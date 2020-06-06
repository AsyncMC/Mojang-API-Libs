package org.openapitools.client.model {

import org.openapitools.client.model.UsernamePassword;

    [XmlRootNode(name="AuthenticationRequest")]
    public class AuthenticationRequest {
        /* The Mojang account e-mail or username. Never store it. */
        [XmlElement(name="username")]
        public var username: String = null;
        /* The Mojang account password, never store it. */
        [XmlElement(name="password")]
        public var password: String = null;

    public function toString(): String {
        var str: String = "AuthenticationRequest: ";
        str += " (username: " + username + ")";
        str += " (password: " + password + ")";
        return str;
    }

}

}
