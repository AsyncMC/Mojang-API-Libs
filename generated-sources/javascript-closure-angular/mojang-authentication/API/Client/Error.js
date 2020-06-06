goog.provide('API.Client.Error');

/**
 * This is returned when the request fails
 * @record
 */
API.Client.Error = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.error;

/**
 * @type {!string}
 * @export
 */
API.Client.Error.prototype.errorMessage;

