package org.openapitools.client.model {

import org.openapitools.client.model.PlayerTexture;

    [XmlRootNode(name="PlayerProfileTexturePropertyValue")]
    public class PlayerProfileTexturePropertyValue {
        /* UNIX timestamp in milliseconds */
        [XmlElement(name="timestamp")]
        public var timestamp: Number = 0;
        /* The player UUID without hyphens */
        [XmlElement(name="profileId")]
        public var profileId: String = null;
        /* The player&#39;s name */
        [XmlElement(name="profileName")]
        public var profileName: String = null;
        /* Only present if unsigned was set to false in the request */
        [XmlElement(name="signatureRequired")]
        public var signatureRequired: Boolean = false;
                [XmlElement(name="textures")]
        public var textures: PlayerTexture = NaN;

    public function toString(): String {
        var str: String = "PlayerProfileTexturePropertyValue: ";
        str += " (timestamp: " + timestamp + ")";
        str += " (profileId: " + profileId + ")";
        str += " (profileName: " + profileName + ")";
        str += " (signatureRequired: " + signatureRequired + ")";
        str += " (textures: " + textures + ")";
        return str;
    }

}

}
