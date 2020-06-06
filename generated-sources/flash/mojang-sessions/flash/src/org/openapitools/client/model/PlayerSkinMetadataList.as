package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class PlayerSkinMetadataList implements ListWrapper {
        // This declaration below of _PlayerSkinMetadata_obj_class is to force flash compiler to include this class
        private var _playerSkinMetadata_obj_class: org.openapitools.client.model.PlayerSkinMetadata = null;
        [XmlElements(name="playerSkinMetadata", type="org.openapitools.client.model.PlayerSkinMetadata")]
        public var playerSkinMetadata: Array = new Array();

        public function getList(): Array{
            return playerSkinMetadata;
        }

}

}
