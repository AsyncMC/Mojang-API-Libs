package org.openapitools.client.model {


    [XmlRootNode(name="NameChange")]
    public class NameChange {
        /* The new player name */
        [XmlElement(name="name")]
        public var name: String = null;
        /* Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry. */
        [XmlElement(name="changedToAt")]
        public var changedToAt: Number = 0;

    public function toString(): String {
        var str: String = "NameChange: ";
        str += " (name: " + name + ")";
        str += " (changedToAt: " + changedToAt + ")";
        return str;
    }

}

}
