package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.RefreshRequest;

    public class RefreshResponseList implements ListWrapper {
        // This declaration below of _RefreshResponse_obj_class is to force flash compiler to include this class
        private var _refreshResponse_obj_class: org.openapitools.client.model.RefreshResponse = null;
        [XmlElements(name="refreshResponse", type="org.openapitools.client.model.RefreshResponse")]
        public var refreshResponse: Array = new Array();

        public function getList(): Array{
            return refreshResponse;
        }

}

}
