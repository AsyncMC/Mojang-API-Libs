goog.provide('API.Client.OrderStatisticsResponse');

/**
 * A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
 * @record
 */
API.Client.OrderStatisticsResponse = function() {}

/**
 * total amount sold
 * @type {!number}
 * @export
 */
API.Client.OrderStatisticsResponse.prototype.total;

/**
 * total sold in last 24 hours
 * @type {!number}
 * @export
 */
API.Client.OrderStatisticsResponse.prototype.last24h;

/**
 * decimal average sales per second
 * @type {!number}
 * @export
 */
API.Client.OrderStatisticsResponse.prototype.saleVelocityPerSeconds;

