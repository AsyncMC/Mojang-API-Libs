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
    root.MojangAuthenticationApi.GameProfileProperty = factory(root.MojangAuthenticationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The GameProfileProperty model module.
   * @module com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/GameProfileProperty
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>GameProfileProperty</code>.
   * @alias module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/GameProfileProperty
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>GameProfileProperty</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/GameProfileProperty} obj Optional instance to populate.
   * @return {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/GameProfileProperty} The populated <code>GameProfileProperty</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('value')) {
        obj['value'] = ApiClient.convertToType(data['value'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} name
   */
  exports.prototype['name'] = undefined;
  /**
   * @member {String} value
   */
  exports.prototype['value'] = undefined;



  return exports;
}));


