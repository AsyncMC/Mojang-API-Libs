goog.provide('API.Client.AuthenticationRequest');

/**
 * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
 * @record
 */
API.Client.AuthenticationRequest = function() {}

/**
 * The Mojang account e-mail or username. Never store it.
 * @type {!string}
 * @export
 */
API.Client.AuthenticationRequest.prototype.username;

/**
 * The Mojang account password, never store it.
 * @type {!string}
 * @export
 */
API.Client.AuthenticationRequest.prototype.password;

