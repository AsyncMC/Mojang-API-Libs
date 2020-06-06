package org.openapitools.client.model {

import org.openapitools.common.ListWrapper;
import flash.filesystem.File;

    public class GameProfileList implements ListWrapper {
        // This declaration below of _GameProfile_obj_class is to force flash compiler to include this class
        private var _gameProfile_obj_class: org.openapitools.client.model.GameProfile = null;
        [XmlElements(name="gameProfile", type="org.openapitools.client.model.GameProfile")]
        public var gameProfile: Array = new Array();

        public function getList(): Array{
            return gameProfile;
        }

}

}
