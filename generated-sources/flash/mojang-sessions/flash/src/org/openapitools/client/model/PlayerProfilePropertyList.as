package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.ByteArray;

    public class PlayerProfilePropertyList implements ListWrapper {
        // This declaration below of _PlayerProfileProperty_obj_class is to force flash compiler to include this class
        private var _playerProfileProperty_obj_class: org.openapitools.client.model.PlayerProfileProperty = null;
        [XmlElements(name="playerProfileProperty", type="org.openapitools.client.model.PlayerProfileProperty")]
        public var playerProfileProperty: Array = new Array();

        public function getList(): Array{
            return playerProfileProperty;
        }

}

}
