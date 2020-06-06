package org.openapitools.client.model {

import flash.filesystem.File;
import org.openapitools.client.model.GameProfileProperty;
import org.openapitools.client.model.ReducedUserData;

    [XmlRootNode(name="PrivateUserData")]
    public class PrivateUserData {
                [XmlElement(name="id")]
        public var id: File = null;
                // This declaration below of _properties_obj_class is to force flash compiler to include this class
        private var _properties_obj_class: Array = null;
        [XmlElementWrapper(name="properties")]
        [XmlElements(name="properties", type="Array")]
                public var properties: Array = new Array();

    public function toString(): String {
        var str: String = "PrivateUserData: ";
        str += " (id: " + id + ")";
        str += " (properties: " + properties + ")";
        return str;
    }

}

}
