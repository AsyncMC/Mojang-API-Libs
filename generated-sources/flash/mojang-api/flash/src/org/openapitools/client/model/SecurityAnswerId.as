package org.openapitools.client.model {


    [XmlRootNode(name="SecurityAnswerId")]
    public class SecurityAnswerId {
        /* A number giver by Mojang to reply a question */
        [XmlElement(name="id")]
        public var id: Number = 0;

    public function toString(): String {
        var str: String = "SecurityAnswerId: ";
        str += " (id: " + id + ")";
        return str;
    }

}

}
