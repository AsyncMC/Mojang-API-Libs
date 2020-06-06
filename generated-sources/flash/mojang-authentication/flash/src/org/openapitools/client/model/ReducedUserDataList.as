package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import flash.filesystem.File;
import org.openapitools.client.model.GameProfileProperty;

    public class ReducedUserDataList implements ListWrapper {
        // This declaration below of _ReducedUserData_obj_class is to force flash compiler to include this class
        private var _reducedUserData_obj_class: org.openapitools.client.model.ReducedUserData = null;
        [XmlElements(name="reducedUserData", type="org.openapitools.client.model.ReducedUserData")]
        public var reducedUserData: Array = new Array();

        public function getList(): Array{
            return reducedUserData;
        }

}

}
