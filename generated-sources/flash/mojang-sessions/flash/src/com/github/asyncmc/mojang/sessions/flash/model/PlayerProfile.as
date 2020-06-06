package com.github.asyncmc.mojang.sessions.flash.model {

import com.github.asyncmc.mojang.sessions.flash.model.PlayerProfileProperty;

    [XmlRootNode(name="PlayerProfile")]
    public class PlayerProfile {
        /* The player UUID without hyphens */
        [XmlElement(name="id")]
        public var id: String = null;
                [XmlElement(name="name")]
        public var name: String = null;
        /* Will appear in the response if the user has not migrated their minecraft.net account to Mojang. */
        [XmlElement(name="legacy")]
        public var legacy: Boolean = false;
        /* An array with all player properties, like skin and cape */
        // This declaration below of _properties_obj_class is to force flash compiler to include this class
        private var _properties_obj_class: Array = null;
        [XmlElementWrapper(name="properties")]
        [XmlElements(name="properties", type="Array")]
                public var properties: Array = new Array();

    public function toString(): String {
        var str: String = "PlayerProfile: ";
        str += " (id: " + id + ")";
        str += " (name: " + name + ")";
        str += " (legacy: " + legacy + ")";
        str += " (properties: " + properties + ")";
        return str;
    }

}

}
