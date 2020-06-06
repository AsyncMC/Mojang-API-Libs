package org.openapitools.client.model {

import flash.filesystem.File;
import org.openapitools.client.model.GameProfileProperty;

    [XmlRootNode(name="ReducedUserData")]
    public class ReducedUserData {
                [XmlElement(name="id")]
        public var id: File = null;
                // This declaration below of _properties_obj_class is to force flash compiler to include this class
        private var _properties_obj_class: Array = null;
        [XmlElementWrapper(name="properties")]
        [XmlElements(name="properties", type="Array")]
                public var properties: Array = new Array();

    public function toString(): String {
        var str: String = "ReducedUserData: ";
        str += " (id: " + id + ")";
        str += " (properties: " + properties + ")";
        return str;
    }

}

}
