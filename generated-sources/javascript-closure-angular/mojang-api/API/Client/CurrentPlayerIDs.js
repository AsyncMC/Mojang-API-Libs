goog.provide('API.Client.CurrentPlayerIDs');

/**
 * The current player, demo and legacy status of a player identified by the id
 * @record
 */
API.Client.CurrentPlayerIDs = function() {}

/**
 * The player UUID without hyphens
 * @type {!string}
 * @export
 */
API.Client.CurrentPlayerIDs.prototype.id;

/**
 * The current name being used by this player
 * @type {!string}
 * @export
 */
API.Client.CurrentPlayerIDs.prototype.name;

/**
 * If account has not been converted
 * @type {!boolean}
 * @export
 */
API.Client.CurrentPlayerIDs.prototype.legacy;

/**
 * If the player has not puchased the game
 * @type {!boolean}
 * @export
 */
API.Client.CurrentPlayerIDs.prototype.demo;

