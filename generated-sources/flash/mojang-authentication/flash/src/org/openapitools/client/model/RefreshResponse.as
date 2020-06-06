package org.openapitools.client.model {

import org.openapitools.client.model.RefreshRequest;

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
