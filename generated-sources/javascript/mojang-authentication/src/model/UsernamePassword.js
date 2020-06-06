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
    root.MojangAuthenticationApi.UsernamePassword = factory(root.MojangAuthenticationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The UsernamePassword model module.
   * @module model/UsernamePassword
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>UsernamePassword</code>.
   * @alias module:model/UsernamePassword
   * @class
   * @param username {String} The Mojang account e-mail or username. Never store it.
   * @param password {String} The Mojang account password, never store it.
   */
  var exports = function(username, password) {
    var _this = this;

    _this['username'] = username;
    _this['password'] = password;
  };

  /**
   * Constructs a <code>UsernamePassword</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:model/UsernamePassword} obj Optional instance to populate.
   * @return {module:model/UsernamePassword} The populated <code>UsernamePassword</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('username')) {
        obj['username'] = ApiClient.convertToType(data['username'], 'String');
      }
      if (data.hasOwnProperty('password')) {
        obj['password'] = ApiClient.convertToType(data['password'], 'String');
      }
    }
    return obj;
  }

  /**
   * The Mojang account e-mail or username. Never store it.
   * @member {String} username
   */
  exports.prototype['username'] = undefined;
  /**
   * The Mojang account password, never store it.
   * @member {String} password
   */
  exports.prototype['password'] = undefined;



  return exports;
}));


