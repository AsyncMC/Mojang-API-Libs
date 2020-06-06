package org.openapitools.client.model {


    [XmlRootNode(name="Agent")]
    public class Agent {
        /* The name of the game */
        [XmlElement(name="name")]
        public var name: String = null;
        /* The agent version, usually 1. */
        [XmlElement(name="version")]
        public var version: Number = 1;

    public function toString(): String {
        var str: String = "Agent: ";
        str += " (name: " + name + ")";
        str += " (version: " + version + ")";
        return str;
    }

}

}
