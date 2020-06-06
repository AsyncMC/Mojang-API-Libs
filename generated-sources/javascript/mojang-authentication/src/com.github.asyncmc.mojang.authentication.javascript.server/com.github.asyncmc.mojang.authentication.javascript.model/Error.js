/**
 * Mojang Authentication API
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
    define(['com.github.asyncmc.mojang.authentication.javascript.server/ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangAuthenticationApi) {
      root.MojangAuthenticationApi = {};
    }
    root.MojangAuthenticationApi.Error = factory(root.MojangAuthenticationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The Error model module.
   * @module com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Error
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>Error</code>.
   * This is returned when the request fails
   * @alias module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Error
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>Error</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Error} obj Optional instance to populate.
   * @return {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Error} The populated <code>Error</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('error')) {
        obj['error'] = ApiClient.convertToType(data['error'], 'String');
      }
      if (data.hasOwnProperty('errorMessage')) {
        obj['errorMessage'] = ApiClient.convertToType(data['errorMessage'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} error
   */
  exports.prototype['error'] = undefined;
  /**
   * @member {String} errorMessage
   */
  exports.prototype['errorMessage'] = undefined;



  return exports;
}));

