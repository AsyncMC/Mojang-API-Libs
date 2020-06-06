package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class GameProfilePropertyList implements ListWrapper {
        // This declaration below of _GameProfileProperty_obj_class is to force flash compiler to include this class
        private var _gameProfileProperty_obj_class: org.openapitools.client.model.GameProfileProperty = null;
        [XmlElements(name="gameProfileProperty", type="org.openapitools.client.model.GameProfileProperty")]
        public var gameProfileProperty: Array = new Array();

        public function getList(): Array{
            return gameProfileProperty;
        }

}

}
