package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;

    public class PlayerTextureURLList implements ListWrapper {
        // This declaration below of _PlayerTextureURL_obj_class is to force flash compiler to include this class
        private var _playerTextureURL_obj_class: org.openapitools.client.model.PlayerTextureURL = null;
        [XmlElements(name="playerTextureURL", type="org.openapitools.client.model.PlayerTextureURL")]
        public var playerTextureURL: Array = new Array();

        public function getList(): Array{
            return playerTextureURL;
        }

}

}
