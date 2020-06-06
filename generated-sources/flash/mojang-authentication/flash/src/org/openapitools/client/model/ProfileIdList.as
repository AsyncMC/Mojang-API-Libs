package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class ProfileIdList implements ListWrapper {
        // This declaration below of _ProfileId_obj_class is to force flash compiler to include this class
        private var _profileId_obj_class: org.openapitools.client.model.ProfileId = null;
        [XmlElements(name="profileId", type="org.openapitools.client.model.ProfileId")]
        public var profileId: Array = new Array();

        public function getList(): Array{
            return profileId;
        }

}

}
