package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PlayerTexture;

    public class PlayerProfileTexturePropertyValueList implements ListWrapper {
        // This declaration below of _PlayerProfileTexturePropertyValue_obj_class is to force flash compiler to include this class
        private var _playerProfileTexturePropertyValue_obj_class: org.openapitools.client.model.PlayerProfileTexturePropertyValue = null;
        [XmlElements(name="playerProfileTexturePropertyValue", type="org.openapitools.client.model.PlayerProfileTexturePropertyValue")]
        public var playerProfileTexturePropertyValue: Array = new Array();

        public function getList(): Array{
            return playerProfileTexturePropertyValue;
        }

}

}
