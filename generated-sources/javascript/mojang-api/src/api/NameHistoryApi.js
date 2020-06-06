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
    define(['ApiClient', 'model/CurrentPlayerIDs', 'model/Error', 'model/NameChange'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/CurrentPlayerIDs'), require('../model/Error'), require('../model/NameChange'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangApi) {
      root.MojangApi = {};
    }
    root.MojangApi.NameHistoryApi = factory(root.MojangApi.ApiClient, root.MojangApi.CurrentPlayerIDs, root.MojangApi.Error, root.MojangApi.NameChange);
  }
}(this, function(ApiClient, CurrentPlayerIDs, Error, NameChange) {
  'use strict';

  /**
   * NameHistory service.
   * @module api/NameHistoryApi
   * @version 2020-06-05
   */

  /**
   * Constructs a new NameHistoryApi. 
   * @alias module:api/NameHistoryApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the findUniqueIdsByName operation.
     * @callback module:api/NameHistoryApi~findUniqueIdsByNameCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/CurrentPlayerIDs>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Find the current UUID of multiple players at once
     * Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
     * @param {Array.<String>} requestBody Array with the player names
     * @param {module:api/NameHistoryApi~findUniqueIdsByNameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/CurrentPlayerIDs>}
     */
    this.findUniqueIdsByName = function(requestBody, callback) {
      var postBody = requestBody;

      // verify the required parameter 'requestBody' is set
      if (requestBody === undefined || requestBody === null) {
        throw new Error("Missing the required parameter 'requestBody' when calling findUniqueIdsByName");
      }


      var pathParams = {
      };
      var queryParams = {
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = [CurrentPlayerIDs];

      return this.apiClient.callApi(
        '/profiles/minecraft', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getNameHistory operation.
     * @callback module:api/NameHistoryApi~getNameHistoryCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/NameChange>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Gets the full player&#39;s name history
     * @param {String} strippedUuid The player UUID without hyphens
     * @param {module:api/NameHistoryApi~getNameHistoryCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/NameChange>}
     */
    this.getNameHistory = function(strippedUuid, callback) {
      var postBody = null;

      // verify the required parameter 'strippedUuid' is set
      if (strippedUuid === undefined || strippedUuid === null) {
        throw new Error("Missing the required parameter 'strippedUuid' when calling getNameHistory");
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

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [NameChange];

      return this.apiClient.callApi(
        '/user/profiles/{stripped_uuid}/names', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the getUniqueIdByName operation.
     * @callback module:api/NameHistoryApi~getUniqueIdByNameCallback
     * @param {String} error Error message, if any.
     * @param {module:model/CurrentPlayerIDs} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Find the UUID by name
     * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
     * @param {String} username The username in a given time, or in present if \&quot;at\&quot; is not sent
     * @param {Object} opts Optional parameters
     * @param {Number} opts.at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds)
     * @param {module:api/NameHistoryApi~getUniqueIdByNameCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/CurrentPlayerIDs}
     */
    this.getUniqueIdByName = function(username, opts, callback) {
      opts = opts || {};
      var postBody = null;

      // verify the required parameter 'username' is set
      if (username === undefined || username === null) {
        throw new Error("Missing the required parameter 'username' when calling getUniqueIdByName");
      }


      var pathParams = {
        'username': username
      };
      var queryParams = {
        'at': opts['at'],
      };
      var collectionQueryParams = {
      };
      var headerParams = {
      };
      var formParams = {
      };

      var authNames = [];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = CurrentPlayerIDs;

      return this.apiClient.callApi(
        '/users/profiles/minecraft/{username}', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
