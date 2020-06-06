goog.provide('API.Client.OrderStatisticsRequest');

/**
 * The body of the request to get the order statistics
 * @record
 */
API.Client.OrderStatisticsRequest = function() {}

/**
 * @type {!Array<!API.Client.OrderStatistic>}
 * @export
 */
API.Client.OrderStatisticsRequest.prototype.metricKeys;

