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
    define(['ApiClient', 'model/Error', 'model/SkinModel'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/Error'), require('../model/SkinModel'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangApi) {
      root.MojangApi = {};
    }
    root.MojangApi.SkinOperationsApi = factory(root.MojangApi.ApiClient, root.MojangApi.Error, root.MojangApi.SkinModel);
  }
}(this, function(ApiClient, Error, SkinModel) {
  'use strict';

  /**
   * SkinOperations service.
   * @module api/SkinOperationsApi
   * @version 2020-06-05
   */

  /**
   * Constructs a new SkinOperationsApi. 
   * @alias module:api/SkinOperationsApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the changePlayerSkin operation.
     * @callback module:api/SkinOperationsApi~changePlayerSkinCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Changes the player skin by URL
     * This will set the skin for the selected profile, but Mojang&#39;s servers will fetch the skin from a URL. This will also work for legacy accounts.
     * @param {String} strippedUuid The player UUID without hyphens
     * @param {String} url The URL which Mojang servers will download and apply the skin
     * @param {Object} opts Optional parameters
     * @param {module:model/SkinModel} opts.model 
     * @param {module:api/SkinOperationsApi~changePlayerSkinCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.changePlayerSkin = function(strippedUuid, url, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'strippedUuid' is set
      if (strippedUuid === undefined || strippedUuid === null) {
        throw new Error("Missing the required parameter 'strippedUuid' when calling changePlayerSkin");
      }

      // verify the required parameter 'url' is set
      if (url === undefined || url === null) {
        throw new Error("Missing the required parameter 'url' when calling changePlayerSkin");
      }


      var pathParams = {
        'stripped_uuid': strippedUuid
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'model': opts['model'],
        'url': url
      };

      var authNames = ['PlayerAccessToken'];
      var contentTypes = ['application/x-www-form-urlencoded'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/user/profile/{stripped_uuid}/skin', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the resetPlayerSkin operation.
     * @callback module:api/SkinOperationsApi~resetPlayerSkinCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Resets the player skin to default
     * @param {String} strippedUuid The player UUID without hyphens
     * @param {module:api/SkinOperationsApi~resetPlayerSkinCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.resetPlayerSkin = function(strippedUuid, callback) {
      var postBody = null;

      // verify the required parameter 'strippedUuid' is set
      if (strippedUuid === undefined || strippedUuid === null) {
        throw new Error("Missing the required parameter 'strippedUuid' when calling resetPlayerSkin");
      }


      var pathParams = {
        'stripped_uuid': strippedUuid
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = ['PlayerAccessToken'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/user/profile/{stripped_uuid}/skin', 'DELETE',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the uploadPlayerSkin operation.
     * @callback module:api/SkinOperationsApi~uploadPlayerSkinCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Changes the player skin by upload
     * This uploads a skin to Mojang&#39;s servers. It also sets the users skin. This works on legacy counts as well.
     * @param {String} strippedUuid The player UUID without hyphens
     * @param {File} file The skin image in PNG format
     * @param {Object} opts Optional parameters
     * @param {module:model/SkinModel} opts.model 
     * @param {module:api/SkinOperationsApi~uploadPlayerSkinCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.uploadPlayerSkin = function(strippedUuid, file, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'strippedUuid' is set
      if (strippedUuid === undefined || strippedUuid === null) {
        throw new Error("Missing the required parameter 'strippedUuid' when calling uploadPlayerSkin");
      }

      // verify the required parameter 'file' is set
      if (file === undefined || file === null) {
        throw new Error("Missing the required parameter 'file' when calling uploadPlayerSkin");
      }


      var pathParams = {
        'stripped_uuid': strippedUuid
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
        'model': opts['model'],
        'file': file
      };

      var authNames = ['PlayerAccessToken'];
      var contentTypes = ['multipart/form-data'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/user/profile/{stripped_uuid}/skin', 'PUT',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
