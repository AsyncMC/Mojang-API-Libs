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
    define(['com.github.asyncmc.mojang.authentication.javascript.server/ApiClient', 'com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/UsernamePassword'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./UsernamePassword'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangAuthenticationApi) {
      root.MojangAuthenticationApi = {};
    }
    root.MojangAuthenticationApi.AuthenticationRequest = factory(root.MojangAuthenticationApi.ApiClient, root.MojangAuthenticationApi.UsernamePassword);
  }
}(this, function(ApiClient, UsernamePassword) {
  'use strict';



  /**
   * The AuthenticationRequest model module.
   * @module com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/AuthenticationRequest
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>AuthenticationRequest</code>.
   * Request body needed to authenticate the player using the username/e-mail and password. Use with care. This is a risky operation.
   * @alias module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/AuthenticationRequest
   * @class
   * @extends module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/UsernamePassword
   * @implements module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/UsernamePassword
   * @param username {} The Mojang account e-mail or username. Never store it.
   * @param password {} The Mojang account password, never store it.
   */
  var exports = function(username, password) {
    var _this = this;

    UsernamePassword.call(_this, username, password);
  };

  /**
   * Constructs a <code>AuthenticationRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/AuthenticationRequest} obj Optional instance to populate.
   * @return {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/AuthenticationRequest} The populated <code>AuthenticationRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      UsernamePassword.constructFromObject(data, obj);
    }
    return obj;
  }

  exports.prototype = Object.create(UsernamePassword.prototype);
  exports.prototype.constructor = exports;


  // Implement UsernamePassword interface:
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


