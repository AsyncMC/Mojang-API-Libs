goog.provide('API.Client.SecurityChallenge');

/**
 * Binds a question to an answer id, the answer must respect the answer id.
 * @record
 */
API.Client.SecurityChallenge = function() {}

/**
 * @type {!API.Client.SecurityQuestion}
 * @export
 */
API.Client.SecurityChallenge.prototype.question;

/**
 * @type {!API.Client.SecurityAnswerId}
 * @export
 */
API.Client.SecurityChallenge.prototype.answer;

