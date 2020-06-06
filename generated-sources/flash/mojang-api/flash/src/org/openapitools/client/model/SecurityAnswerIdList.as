package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SecurityAnswerIdList implements ListWrapper {
        // This declaration below of _SecurityAnswerId_obj_class is to force flash compiler to include this class
        private var _securityAnswerId_obj_class: org.openapitools.client.model.SecurityAnswerId = null;
        [XmlElements(name="securityAnswerId", type="org.openapitools.client.model.SecurityAnswerId")]
        public var securityAnswerId: Array = new Array();

        public function getList(): Array{
            return securityAnswerId;
        }

}

}
