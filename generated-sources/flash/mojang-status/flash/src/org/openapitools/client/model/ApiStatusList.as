package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ApiStatusList implements ListWrapper {
        // This declaration below of _ApiStatus_obj_class is to force flash compiler to include this class
        private var _apiStatus_obj_class: org.openapitools.client.model.ApiStatus = null;
        [XmlElements(name="apiStatus", type="org.openapitools.client.model.ApiStatus")]
        public var apiStatus: Array = new Array();

        public function getList(): Array{
            return apiStatus;
        }

}

}
