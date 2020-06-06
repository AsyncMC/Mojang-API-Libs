package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class CurrentPlayerIDsList implements ListWrapper {
        // This declaration below of _CurrentPlayerIDs_obj_class is to force flash compiler to include this class
        private var _currentPlayerIDs_obj_class: org.openapitools.client.model.CurrentPlayerIDs = null;
        [XmlElements(name="currentPlayerIDs", type="org.openapitools.client.model.CurrentPlayerIDs")]
        public var currentPlayerIDs: Array = new Array();

        public function getList(): Array{
            return currentPlayerIDs;
        }

}

}
