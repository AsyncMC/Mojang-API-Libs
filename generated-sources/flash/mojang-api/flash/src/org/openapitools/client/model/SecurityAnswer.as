package org.openapitools.client.model {

import org.openapitools.client.model.SecurityAnswerId;

    [XmlRootNode(name="SecurityAnswer")]
    public class SecurityAnswer {
        /* A number giver by Mojang to reply a question */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "SecurityAnswer: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
