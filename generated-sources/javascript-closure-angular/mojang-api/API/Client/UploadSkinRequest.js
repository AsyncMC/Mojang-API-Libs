goog.provide('API.Client.UploadSkinRequest');

/**
 * @record
 */
API.Client.UploadSkinRequest = function() {}

/**
 * @type {!API.Client.SkinModel}
 * @export
 */
API.Client.UploadSkinRequest.prototype.model;

/**
 * The skin image in PNG format
 * @type {!Object}
 * @export
 */
API.Client.UploadSkinRequest.prototype.file;

