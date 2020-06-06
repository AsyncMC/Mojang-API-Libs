goog.provide('API.Client.GameProfile');

/**
 * @record
 */
API.Client.GameProfile = function() {}

/**
 * @type {!string}
 * @export
 */
API.Client.GameProfile.prototype.agent;

/**
 * @type {!string}
 * @export
 */
API.Client.GameProfile.prototype.id;

/**
 * @type {!string}
 * @export
 */
API.Client.GameProfile.prototype.name;

/**
 * @type {!Object}
 * @export
 */
API.Client.GameProfile.prototype.userId;

/**
 * Unix timestamp in milliseconds
 * @type {!number}
 * @export
 */
API.Client.GameProfile.prototype.createdAt;

/**
 * @type {!boolean}
 * @export
 */
API.Client.GameProfile.prototype.legacyProfile;

/**
 * @type {!boolean}
 * @export
 */
API.Client.GameProfile.prototype.suspended;

/**
 * @type {!boolean}
 * @export
 */
API.Client.GameProfile.prototype.paid;

/**
 * @type {!boolean}
 * @export
 */
API.Client.GameProfile.prototype.migrated;

/**
 * @type {!boolean}
 * @export
 */
API.Client.GameProfile.prototype.legacy;

