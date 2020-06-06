/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 *
 * OpenAPI Generator version: 3.3.4
 *
 * Do not edit the class manually.
 *
 */

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD. Register as an anonymous module.
    define(['com.github.asyncmc.mojang.api.javascript.server/ApiClient', 'com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatistic'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./OrderStatistic'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangApi) {
      root.MojangApi = {};
    }
    root.MojangApi.OrderStatisticsRequest = factory(root.MojangApi.ApiClient, root.MojangApi.OrderStatistic);
  }
}(this, function(ApiClient, OrderStatistic) {
  'use strict';



  /**
   * The OrderStatisticsRequest model module.
   * @module com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatisticsRequest
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>OrderStatisticsRequest</code>.
   * The body of the request to get the order statistics
   * @alias module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatisticsRequest
   * @class
   * @param metricKeys {Array.<module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatistic>} 
   */
  var exports = function(metricKeys) {
    var _this = this;

    _this['metricKeys'] = metricKeys;
  };

  /**
   * Constructs a <code>OrderStatisticsRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatisticsRequest} obj Optional instance to populate.
   * @return {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatisticsRequest} The populated <code>OrderStatisticsRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('metricKeys')) {
        obj['metricKeys'] = ApiClient.convertToType(data['metricKeys'], [OrderStatistic]);
      }
    }
    return obj;
  }

  /**
   * @member {Array.<module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/OrderStatistic>} metricKeys
   */
  exports.prototype['metricKeys'] = undefined;



  return exports;
}));


