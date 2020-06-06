package com.github.asyncmc.mojang.sessions.flash.model {

import org.openapitools.common.ListWrapper;

    public class PlayerTextureURLList implements ListWrapper {
        // This declaration below of _PlayerTextureURL_obj_class is to force flash compiler to include this class
        private var _playerTextureURL_obj_class: com.github.asyncmc.mojang.sessions.flash.model.PlayerTextureURL = null;
        [XmlElements(name="playerTextureURL", type="com.github.asyncmc.mojang.sessions.flash.model.PlayerTextureURL")]
        public var playerTextureURL: Array = new Array();

        public function getList(): Array{
            return playerTextureURL;
        }

}

}
