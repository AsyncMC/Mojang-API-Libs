package org.openapitools.client.model {

import flash.filesystem.File;
import org.openapitools.client.model.SkinModel;

    [XmlRootNode(name="InlineObject")]
    public class InlineObject {
                [XmlElement(name="model")]
        public var model: SkinModel = NaN;
        /* The skin image in PNG format */
        [XmlElement(name="file")]
        public var file: File = null;

    public function toString(): String {
        var str: String = "InlineObject: ";
        str += " (model: " + model + ")";
        str += " (file: " + file + ")";
        return str;
    }

}

}
