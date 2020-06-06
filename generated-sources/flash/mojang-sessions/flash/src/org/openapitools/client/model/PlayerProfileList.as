package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import org.openapitools.client.model.PlayerProfileProperty;

    public class PlayerProfileList implements ListWrapper {
        // This declaration below of _PlayerProfile_obj_class is to force flash compiler to include this class
        private var _playerProfile_obj_class: org.openapitools.client.model.PlayerProfile = null;
        [XmlElements(name="playerProfile", type="org.openapitools.client.model.PlayerProfile")]
        public var playerProfile: Array = new Array();

        public function getList(): Array{
            return playerProfile;
        }

}

}
