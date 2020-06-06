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
    define(['ApiClient', 'model/AccessKeys', 'model/Authentication', 'model/AuthenticationRequest', 'model/Error', 'model/RefreshRequest', 'model/RefreshResponse', 'model/UsernamePassword'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../model/AccessKeys'), require('../model/Authentication'), require('../model/AuthenticationRequest'), require('../model/Error'), require('../model/RefreshRequest'), require('../model/RefreshResponse'), require('../model/UsernamePassword'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangAuthenticationApi) {
      root.MojangAuthenticationApi = {};
    }
    root.MojangAuthenticationApi.DefaultApi = factory(root.MojangAuthenticationApi.ApiClient, root.MojangAuthenticationApi.AccessKeys, root.MojangAuthenticationApi.Authentication, root.MojangAuthenticationApi.AuthenticationRequest, root.MojangAuthenticationApi.Error, root.MojangAuthenticationApi.RefreshRequest, root.MojangAuthenticationApi.RefreshResponse, root.MojangAuthenticationApi.UsernamePassword);
  }
}(this, function(ApiClient, AccessKeys, Authentication, AuthenticationRequest, Error, RefreshRequest, RefreshResponse, UsernamePassword) {
  'use strict';

  /**
   * Default service.
   * @module api/DefaultApi
   * @version 2020-06-05
   */

  /**
   * Constructs a new DefaultApi. 
   * @alias module:api/DefaultApi
   * @class
   * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the authenticate operation.
     * @callback module:api/DefaultApi~authenticateCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Authentication} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/AuthenticationRequest} authenticationRequest 
     * @param {module:api/DefaultApi~authenticateCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Authentication}
     */
    this.authenticate = function(authenticationRequest, callback) {
      var postBody = authenticationRequest;

      // verify the required parameter 'authenticationRequest' is set
      if (authenticationRequest === undefined || authenticationRequest === null) {
        throw new Error("Missing the required parameter 'authenticationRequest' when calling authenticate");
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
      var returnType = Authentication;

      return this.apiClient.callApi(
        '/authenticate', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the invalidate operation.
     * @callback module:api/DefaultApi~invalidateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/AccessKeys} accessKeys 
     * @param {module:api/DefaultApi~invalidateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.invalidate = function(accessKeys, callback) {
      var postBody = accessKeys;

      // verify the required parameter 'accessKeys' is set
      if (accessKeys === undefined || accessKeys === null) {
        throw new Error("Missing the required parameter 'accessKeys' when calling invalidate");
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
      var returnType = null;

      return this.apiClient.callApi(
        '/invalidate', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the refresh operation.
     * @callback module:api/DefaultApi~refreshCallback
     * @param {String} error Error message, if any.
     * @param {module:model/RefreshResponse} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/RefreshRequest} refreshRequest 
     * @param {module:api/DefaultApi~refreshCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/RefreshResponse}
     */
    this.refresh = function(refreshRequest, callback) {
      var postBody = refreshRequest;

      // verify the required parameter 'refreshRequest' is set
      if (refreshRequest === undefined || refreshRequest === null) {
        throw new Error("Missing the required parameter 'refreshRequest' when calling refresh");
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
      var returnType = RefreshResponse;

      return this.apiClient.callApi(
        '/refresh', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the siginout operation.
     * @callback module:api/DefaultApi~siginoutCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/UsernamePassword} usernamePassword 
     * @param {module:api/DefaultApi~siginoutCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.siginout = function(usernamePassword, callback) {
      var postBody = usernamePassword;

      // verify the required parameter 'usernamePassword' is set
      if (usernamePassword === undefined || usernamePassword === null) {
        throw new Error("Missing the required parameter 'usernamePassword' when calling siginout");
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
      var returnType = null;

      return this.apiClient.callApi(
        '/signout', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the validate operation.
     * @callback module:api/DefaultApi~validateCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:model/AccessKeys} accessKeys 
     * @param {module:api/DefaultApi~validateCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.validate = function(accessKeys, callback) {
      var postBody = accessKeys;

      // verify the required parameter 'accessKeys' is set
      if (accessKeys === undefined || accessKeys === null) {
        throw new Error("Missing the required parameter 'accessKeys' when calling validate");
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
      var returnType = null;

      return this.apiClient.callApi(
        '/validate', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
