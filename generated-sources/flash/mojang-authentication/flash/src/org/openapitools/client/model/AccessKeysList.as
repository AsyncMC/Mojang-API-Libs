package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class AccessKeysList implements ListWrapper {
        // This declaration below of _AccessKeys_obj_class is to force flash compiler to include this class
        private var _accessKeys_obj_class: org.openapitools.client.model.AccessKeys = null;
        [XmlElements(name="accessKeys", type="org.openapitools.client.model.AccessKeys")]
        public var accessKeys: Array = new Array();

        public function getList(): Array{
            return accessKeys;
        }

}

}
