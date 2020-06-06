package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class NameChangeList implements ListWrapper {
        // This declaration below of _NameChange_obj_class is to force flash compiler to include this class
        private var _nameChange_obj_class: org.openapitools.client.model.NameChange = null;
        [XmlElements(name="nameChange", type="org.openapitools.client.model.NameChange")]
        public var nameChange: Array = new Array();

        public function getList(): Array{
            return nameChange;
        }

}

}
