package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.UsernamePassword;

    public class AuthenticationRequestList implements ListWrapper {
        // This declaration below of _AuthenticationRequest_obj_class is to force flash compiler to include this class
        private var _authenticationRequest_obj_class: org.openapitools.client.model.AuthenticationRequest = null;
        [XmlElements(name="authenticationRequest", type="org.openapitools.client.model.AuthenticationRequest")]
        public var authenticationRequest: Array = new Array();

        public function getList(): Array{
            return authenticationRequest;
        }

}

}
