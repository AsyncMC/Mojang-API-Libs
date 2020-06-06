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
    define(['ApiClient'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangAuthenticationApi) {
      root.MojangAuthenticationApi = {};
    }
    root.MojangAuthenticationApi.AccessKeys = factory(root.MojangAuthenticationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The AccessKeys model module.
   * @module model/AccessKeys
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>AccessKeys</code>.
   * @alias module:model/AccessKeys
   * @class
   * @param accessToken {String} 
   */
  var exports = function(accessToken) {
    var _this = this;

    _this['accessToken'] = accessToken;
  };

  /**
   * Constructs a <code>AccessKeys</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/AccessKeys} obj Optional instance to populate.
   * @return {module:model/AccessKeys} The populated <code>AccessKeys</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('accessToken')) {
        obj['accessToken'] = ApiClient.convertToType(data['accessToken'], 'String');
      }
      if (data.hasOwnProperty('clientToken')) {
        obj['clientToken'] = ApiClient.convertToType(data['clientToken'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {String} accessToken
   */
  exports.prototype['accessToken'] = undefined;
  /**
   * @member {String} clientToken
   */
  exports.prototype['clientToken'] = undefined;



  return exports;
}));


