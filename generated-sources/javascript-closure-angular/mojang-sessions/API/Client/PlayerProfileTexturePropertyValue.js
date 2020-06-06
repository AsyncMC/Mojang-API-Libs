goog.provide('API.Client.PlayerProfileTexturePropertyValue');

/**
 * This is obtained by decoding the \"textures\" property
 * @record
 */
API.Client.PlayerProfileTexturePropertyValue = function() {}

/**
 * UNIX timestamp in milliseconds
 * @type {!number}
 * @export
 */
API.Client.PlayerProfileTexturePropertyValue.prototype.timestamp;

/**
 * The player UUID without hyphens
 * @type {!string}
 * @export
 */
API.Client.PlayerProfileTexturePropertyValue.prototype.profileId;

/**
 * The player's name
 * @type {!string}
 * @export
 */
API.Client.PlayerProfileTexturePropertyValue.prototype.profileName;

/**
 * Only present if unsigned was set to false in the request
 * @type {!boolean}
 * @export
 */
API.Client.PlayerProfileTexturePropertyValue.prototype.signatureRequired;

/**
 * @type {!API.Client.PlayerTexture}
 * @export
 */
API.Client.PlayerProfileTexturePropertyValue.prototype.textures;

