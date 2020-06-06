goog.provide('API.Client.PlayerSkinMetadata');

/**
 * Contains details about the skin
 * @record
 */
API.Client.PlayerSkinMetadata = function() {}

/**
 * The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
 * @type {!string}
 * @export
 */
API.Client.PlayerSkinMetadata.prototype.model;

/** @enum {string} */
API.Client.PlayerSkinMetadata.ModelEnum = { 
  slim: 'slim',
}
