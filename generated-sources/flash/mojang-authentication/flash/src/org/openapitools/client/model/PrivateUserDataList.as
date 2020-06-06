package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import flash.filesystem.File;
import org.openapitools.client.model.GameProfileProperty;
import org.openapitools.client.model.ReducedUserData;

    public class PrivateUserDataList implements ListWrapper {
        // This declaration below of _PrivateUserData_obj_class is to force flash compiler to include this class
        private var _privateUserData_obj_class: org.openapitools.client.model.PrivateUserData = null;
        [XmlElements(name="privateUserData", type="org.openapitools.client.model.PrivateUserData")]
        public var privateUserData: Array = new Array();

        public function getList(): Array{
            return privateUserData;
        }

}

}
