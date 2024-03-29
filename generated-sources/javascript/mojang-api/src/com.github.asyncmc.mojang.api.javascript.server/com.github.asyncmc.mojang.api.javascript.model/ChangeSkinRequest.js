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
    define(['com.github.asyncmc.mojang.api.javascript.server/ApiClient', 'com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/SkinModel'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('./SkinModel'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangApi) {
      root.MojangApi = {};
    }
    root.MojangApi.ChangeSkinRequest = factory(root.MojangApi.ApiClient, root.MojangApi.SkinModel);
  }
}(this, function(ApiClient, SkinModel) {
  'use strict';



  /**
   * The ChangeSkinRequest model module.
   * @module com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/ChangeSkinRequest
   * @version 2020-06-05
   */

  /**
   * Constructs a new <code>ChangeSkinRequest</code>.
   * Request Mojang to download a skin from an URL and apply to the player
   * @alias module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/ChangeSkinRequest
   * @class
   * @param url {String} The URL which Mojang servers will download and apply the skin
   */
  var exports = function(url) {
    var _this = this;

    _this['url'] = url;
  };

  /**
   * Constructs a <code>ChangeSkinRequest</code> from a plain JavaScript object, optionally creating a new instance.
   * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
   * @param {Object} data The plain JavaScript object bearing properties of interest.
   * @param {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/ChangeSkinRequest} obj Optional instance to populate.
   * @return {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/ChangeSkinRequest} The populated <code>ChangeSkinRequest</code> instance.
   */
  exports.constructFromObject = function(data, obj) {
    if (data) {
      obj = obj || new exports();
      if (data.hasOwnProperty('model')) {
        obj['model'] = SkinModel.constructFromObject(data['model']);
      }
      if (data.hasOwnProperty('url')) {
        obj['url'] = ApiClient.convertToType(data['url'], 'String');
      }
    }
    return obj;
  }

  /**
   * @member {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/SkinModel} model
   */
  exports.prototype['model'] = undefined;
  /**
   * The URL which Mojang servers will download and apply the skin
   * @member {String} url
   */
  exports.prototype['url'] = undefined;



  return exports;
}));


