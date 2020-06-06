package org.openapitools.client.model {

import org.openapitools.client.model.SkinModel;

    [XmlRootNode(name="InlineObject1")]
    public class InlineObject1 {
                [XmlElement(name="model")]
        public var model: SkinModel = NaN;
        /* The URL which Mojang servers will download and apply the skin */
        [XmlElement(name="url")]
        public var url: String = null;

    public function toString(): String {
        var str: String = "InlineObject1: ";
        str += " (model: " + model + ")";
        str += " (url: " + url + ")";
        return str;
    }

}

}
