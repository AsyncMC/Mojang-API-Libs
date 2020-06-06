package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class UsernamePasswordList implements ListWrapper {
        // This declaration below of _UsernamePassword_obj_class is to force flash compiler to include this class
        private var _usernamePassword_obj_class: org.openapitools.client.model.UsernamePassword = null;
        [XmlElements(name="usernamePassword", type="org.openapitools.client.model.UsernamePassword")]
        public var usernamePassword: Array = new Array();

        public function getList(): Array{
            return usernamePassword;
        }

}

}
