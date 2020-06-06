package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.AccessKeys;

    public class AuthenticationList implements ListWrapper {
        // This declaration below of _Authentication_obj_class is to force flash compiler to include this class
        private var _authentication_obj_class: org.openapitools.client.model.Authentication = null;
        [XmlElements(name="authentication", type="org.openapitools.client.model.Authentication")]
        public var authentication: Array = new Array();

        public function getList(): Array{
            return authentication;
        }

}

}
