package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PlayerSkinURL;
import org.openapitools.client.model.PlayerTextureURL;

    public class PlayerTextureList implements ListWrapper {
        // This declaration below of _PlayerTexture_obj_class is to force flash compiler to include this class
        private var _playerTexture_obj_class: org.openapitools.client.model.PlayerTexture = null;
        [XmlElements(name="playerTexture", type="org.openapitools.client.model.PlayerTexture")]
        public var playerTexture: Array = new Array();

        public function getList(): Array{
            return playerTexture;
        }

}

}
