goog.provide('API.Client.UsernamePassword');

/**
 * @record
 */
API.Client.UsernamePassword = function() {}

/**
 * The Mojang account e-mail or username. Never store it.
 * @type {!string}
 * @export
 */
API.Client.UsernamePassword.prototype.username;

/**
 * The Mojang account password, never store it.
 * @type {!string}
 * @export
 */
API.Client.UsernamePassword.prototype.password;

