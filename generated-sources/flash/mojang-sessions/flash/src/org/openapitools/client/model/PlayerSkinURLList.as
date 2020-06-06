package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PlayerTextureURL;

    public class PlayerSkinURLList implements ListWrapper {
        // This declaration below of _PlayerSkinURL_obj_class is to force flash compiler to include this class
        private var _playerSkinURL_obj_class: org.openapitools.client.model.PlayerSkinURL = null;
        [XmlElements(name="playerSkinURL", type="org.openapitools.client.model.PlayerSkinURL")]
        public var playerSkinURL: Array = new Array();

        public function getList(): Array{
            return playerSkinURL;
        }

}

}
