package com.github.asyncmc.mojang.api.flash.model {

import com.github.asyncmc.mojang.api.flash.model.SkinModel;

    [XmlRootNode(name="ChangeSkinRequest")]
    public class ChangeSkinRequest {
                [XmlElement(name="model")]
        public var model: SkinModel = NaN;
        /* The URL which Mojang servers will download and apply the skin */
        [XmlElement(name="url")]
        public var url: String = null;

    public function toString(): String {
        var str: String = "ChangeSkinRequest: ";
        str += " (model: " + model + ")";
        str += " (url: " + url + ")";
        return str;
    }

}

}
