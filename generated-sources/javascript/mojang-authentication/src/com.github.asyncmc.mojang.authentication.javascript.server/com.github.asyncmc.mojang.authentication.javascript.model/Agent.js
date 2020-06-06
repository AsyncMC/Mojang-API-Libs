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
    root.MojangAuthenticationApi.Agent = factory(root.MojangAuthenticationApi.ApiClient);
  }
}(this, function(ApiClient) {
  'use strict';



  /**
   * The Agent model module.
   * @module com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Agent
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>Agent</code>.
   * Identifies the software doing the request
   * @alias module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Agent
   * @class
   */
  var exports = function() {
    var _this = this;

  };

  /**
   * Constructs a <code>Agent</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Agent} obj Optional instance to populate.
   * @return {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Agent} The populated <code>Agent</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('name')) {
        obj['name'] = ApiClient.convertToType(data['name'], 'String');
      }
      if (data.hasOwnProperty('version')) {
        obj['version'] = ApiClient.convertToType(data['version'], 'Number');
      }
    }
    return obj;
  }

  /**
   * The name of the game
   * @member {module:com.github.asyncmc.mojang.authentication.javascript.server/com.github.asyncmc.mojang.authentication.javascript.model/Agent.NameEnum} name
   * @default 'Minecraft'
   */
  exports.prototype['name'] = 'Minecraft';
  /**
   * The agent version, usually 1.
   * @member {Number} version
   * @default 1
   */
  exports.prototype['version'] = 1;


  /**
   * Allowed values for the <code>name</code> property.
   * @enum {String}
   * @readonly
   */
  exports.NameEnum = {
    /**
     * value: "Minecraft"
     * @const
     */
    "Minecraft": "Minecraft",
    /**
     * value: "Scrolls"
     * @const
     */
    "Scrolls": "Scrolls"  };


  return exports;
}));


