goog.provide('API.Client.ChangeSkinRequest');

/**
 * Request Mojang to download a skin from an URL and apply to the player
 * @record
 */
API.Client.ChangeSkinRequest = function() {}

/**
 * @type {!API.Client.SkinModel}
 * @export
 */
API.Client.ChangeSkinRequest.prototype.model;

/**
 * The URL which Mojang servers will download and apply the skin
 * @type {!string}
 * @export
 */
API.Client.ChangeSkinRequest.prototype.url;

