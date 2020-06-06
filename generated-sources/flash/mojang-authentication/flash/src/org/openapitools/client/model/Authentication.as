package org.openapitools.client.model {

import org.openapitools.client.model.AccessKeys;

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
