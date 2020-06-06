package org.openapitools.client.model {


    [XmlRootNode(name="ProfileId")]
    public class ProfileId {
                [XmlElement(name="id")]
        public var id: String = null;
        /* The player name */
        [XmlElement(name="name")]
        public var name: String = null;

    public function toString(): String {
        var str: String = "ProfileId: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        return str;
    }

}

}
