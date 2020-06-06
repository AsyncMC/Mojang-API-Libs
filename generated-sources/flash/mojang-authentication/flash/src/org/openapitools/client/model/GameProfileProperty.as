package org.openapitools.client.model {


    [XmlRootNode(name="GameProfileProperty")]
    public class GameProfileProperty {
                [XmlElement(name="name")]
        public var name: String = null;
                [XmlElement(name="value")]
        public var value: String = null;

    public function toString(): String {
        var str: String = "GameProfileProperty: ";
        str += " (name: " + name + ")";
        str += " (value: " + value + ")";
        return str;
    }

}

}
