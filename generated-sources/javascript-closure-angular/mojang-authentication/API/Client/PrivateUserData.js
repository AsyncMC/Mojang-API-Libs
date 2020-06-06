goog.provide('API.Client.PrivateUserData');

/**
 * @record
 */
API.Client.PrivateUserData = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.PrivateUserData.prototype.id;

/**
 * @type {!Array<!API.Client.GameProfileProperty>}
 * @export
 */
API.Client.PrivateUserData.prototype.properties;

