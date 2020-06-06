package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SessionApiErrorList implements ListWrapper {
        // This declaration below of _SessionApiError_obj_class is to force flash compiler to include this class
        private var _sessionApiError_obj_class: org.openapitools.client.model.SessionApiError = null;
        [XmlElements(name="sessionApiError", type="org.openapitools.client.model.SessionApiError")]
        public var sessionApiError: Array = new Array();

        public function getList(): Array{
            return sessionApiError;
        }

}

}
