package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class SecurityQuestionList implements ListWrapper {
        // This declaration below of _SecurityQuestion_obj_class is to force flash compiler to include this class
        private var _securityQuestion_obj_class: org.openapitools.client.model.SecurityQuestion = null;
        [XmlElements(name="securityQuestion", type="org.openapitools.client.model.SecurityQuestion")]
        public var securityQuestion: Array = new Array();

        public function getList(): Array{
            return securityQuestion;
        }

}

}
