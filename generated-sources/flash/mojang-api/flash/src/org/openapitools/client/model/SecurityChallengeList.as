package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.SecurityAnswerId;
import org.openapitools.client.model.SecurityQuestion;

    public class SecurityChallengeList implements ListWrapper {
        // This declaration below of _SecurityChallenge_obj_class is to force flash compiler to include this class
        private var _securityChallenge_obj_class: org.openapitools.client.model.SecurityChallenge = null;
        [XmlElements(name="securityChallenge", type="org.openapitools.client.model.SecurityChallenge")]
        public var securityChallenge: Array = new Array();

        public function getList(): Array{
            return securityChallenge;
        }

}

}
