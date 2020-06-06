goog.provide('API.Client.PlayerProfileProperty');

/**
 * A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
 * @record
 */
API.Client.PlayerProfileProperty = function() {}

/**
 * The property name
 * @type {!string}
 * @export
 */
API.Client.PlayerProfileProperty.prototype.name;

/**
 * The serialized property value in base64.
 * @type {!API.Client.ByteArray}
 * @export
 */
API.Client.PlayerProfileProperty.prototype.value;

/**
 * signed data using Yggdrasil's private key
 * @type {!API.Client.ByteArray}
 * @export
 */
API.Client.PlayerProfileProperty.prototype.signature;

