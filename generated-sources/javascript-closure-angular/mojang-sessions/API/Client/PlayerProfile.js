goog.provide('API.Client.PlayerProfile');

/**
 * @record
 */
API.Client.PlayerProfile = function() {}

/**
 * The player UUID without hyphens
 * @type {!string}
 * @export
 */
API.Client.PlayerProfile.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.PlayerProfile.prototype.name;

/**
 * Will appear in the response if the user has not migrated their minecraft.net account to Mojang.
 * @type {!boolean}
 * @export
 */
API.Client.PlayerProfile.prototype.legacy;

/**
 * An array with all player properties, like skin and cape
 * @type {!Array<!API.Client.PlayerProfileProperty>}
 * @export
 */
API.Client.PlayerProfile.prototype.properties;

