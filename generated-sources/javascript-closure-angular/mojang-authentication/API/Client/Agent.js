goog.provide('API.Client.Agent');

/**
 * Identifies the software doing the request
 * @record
 */
API.Client.Agent = function() {}

/**
 * The name of the game
 * @type {!string}
 * @export
 */
API.Client.Agent.prototype.name;

/**
 * The agent version, usually 1.
 * @type {!number}
 * @export
 */
API.Client.Agent.prototype.version;

/** @enum {string} */
API.Client.Agent.NameEnum = { 
  Minecraft: 'Minecraft',
  Scrolls: 'Scrolls',
}
