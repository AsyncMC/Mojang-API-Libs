goog.provide('API.Client.SessionApiError');

/**
 * An object describing giving a bit of information about the error
 * @record
 */
API.Client.SessionApiError = function() {}

/**
 * A message describing the error
 * @type {!string}
 * @export
 */
API.Client.SessionApiError.prototype.error;

/**
 * The request path
 * @type {!string}
 * @export
 */
API.Client.SessionApiError.prototype.path;

