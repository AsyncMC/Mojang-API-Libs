package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AccessKeys;

    public class RefreshRequestList implements ListWrapper {
        // This declaration below of _RefreshRequest_obj_class is to force flash compiler to include this class
        private var _refreshRequest_obj_class: org.openapitools.client.model.RefreshRequest = null;
        [XmlElements(name="refreshRequest", type="org.openapitools.client.model.RefreshRequest")]
        public var refreshRequest: Array = new Array();

        public function getList(): Array{
            return refreshRequest;
        }

}

}
