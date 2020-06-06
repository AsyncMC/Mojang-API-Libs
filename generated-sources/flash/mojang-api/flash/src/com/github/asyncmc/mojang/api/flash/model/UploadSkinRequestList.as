package com.github.asyncmc.mojang.api.flash.model {

import org.openapitools.common.ListWrapper;
import com.github.asyncmc.mojang.api.flash.model.SkinModel;
import flash.filesystem.File;

    public class UploadSkinRequestList implements ListWrapper {
        // This declaration below of _UploadSkinRequest_obj_class is to force flash compiler to include this class
        private var _uploadSkinRequest_obj_class: com.github.asyncmc.mojang.api.flash.model.UploadSkinRequest = null;
        [XmlElements(name="uploadSkinRequest", type="com.github.asyncmc.mojang.api.flash.model.UploadSkinRequest")]
        public var uploadSkinRequest: Array = new Array();

        public function getList(): Array{
            return uploadSkinRequest;
        }

}

}
