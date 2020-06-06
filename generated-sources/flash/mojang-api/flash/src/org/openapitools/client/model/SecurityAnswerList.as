package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SecurityAnswerId;

    public class SecurityAnswerList implements ListWrapper {
        // This declaration below of _SecurityAnswer_obj_class is to force flash compiler to include this class
        private var _securityAnswer_obj_class: org.openapitools.client.model.SecurityAnswer = null;
        [XmlElements(name="securityAnswer", type="org.openapitools.client.model.SecurityAnswer")]
        public var securityAnswer: Array = new Array();

        public function getList(): Array{
            return securityAnswer;
        }

}

}
