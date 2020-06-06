goog.provide('API.Client.inline_object_1');

/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @record
 */
API.Client.InlineObject1 = function() {}

/**
 * @type {!API.Client.SkinModel}
 * @export
 */
API.Client.InlineObject1.prototype.model;

/**
 * The URL which Mojang servers will download and apply the skin
 * @type {!string}
 * @export
 */
API.Client.InlineObject1.prototype.url;

