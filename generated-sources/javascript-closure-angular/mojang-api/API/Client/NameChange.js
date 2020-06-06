goog.provide('API.Client.NameChange');

/**
 * A registered name change.
 * @record
 */
API.Client.NameChange = function() {}

/**
 * The new player name
 * @type {!string}
 * @export
 */
API.Client.NameChange.prototype.name;

/**
 * Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
 * @type {!number}
 * @export
 */
API.Client.NameChange.prototype.changedToAt;

