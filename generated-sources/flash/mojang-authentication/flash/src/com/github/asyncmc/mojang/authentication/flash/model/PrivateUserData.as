package com.github.asyncmc.mojang.authentication.flash.model {

import com.github.asyncmc.mojang.authentication.flash.model.GameProfileProperty;
import com.github.asyncmc.mojang.authentication.flash.model.ReducedUserData;

    [XmlRootNode(name="PrivateUserData")]
    public class PrivateUserData {
                [XmlElement(name="id")]
        public var id: String = null;
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
