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
    define(['com.github.asyncmc.mojang.api.javascript.server/ApiClient', 'com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/Error', 'com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/SecurityAnswer', 'com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/SecurityChallenge'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    module.exports = factory(require('../ApiClient'), require('../com.github.asyncmc.mojang.api.javascript.model/Error'), require('../com.github.asyncmc.mojang.api.javascript.model/SecurityAnswer'), require('../com.github.asyncmc.mojang.api.javascript.model/SecurityChallenge'));
  } else {
    // Browser globals (root is window)
    if (!root.MojangApi) {
      root.MojangApi = {};
    }
    root.MojangApi.SecurityQuestionAnswerApi = factory(root.MojangApi.ApiClient, root.MojangApi.Error, root.MojangApi.SecurityAnswer, root.MojangApi.SecurityChallenge);
  }
}(this, function(ApiClient, Error, SecurityAnswer, SecurityChallenge) {
  'use strict';

  /**
   * SecurityQuestionAnswer service.
   * @module com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi
   * @version 2020-06-05
   */

  /**
   * Constructs a new SecurityQuestionAnswerApi. 
   * @alias module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi
   * @class
   * @param {module:com.github.asyncmc.mojang.api.javascript.server/ApiClient} [apiClient] Optional API client implementation to use,
   * default to {@link module:com.github.asyncmc.mojang.api.javascript.server/ApiClient#instance} if unspecified.
   */
  var exports = function(apiClient) {
    this.apiClient = apiClient || ApiClient.instance;


    /**
     * Callback function to receive the result of the checkSecurityStatus operation.
     * @callback module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi~checkSecurityStatusCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Check if security questions are needed
     * @param {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi~checkSecurityStatusCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.checkSecurityStatus = function(callback) {
      var postBody = null;


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

      var authNames = ['PlayerAccessToken'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/user/security/location', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the listPendingSecurityQuestions operation.
     * @callback module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi~listPendingSecurityQuestionsCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/SecurityChallenge>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Get list of questions
     * @param {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi~listPendingSecurityQuestionsCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.model/SecurityChallenge>}
     */
    this.listPendingSecurityQuestions = function(callback) {
      var postBody = null;


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

      var authNames = ['PlayerAccessToken'];
      var contentTypes = [];
      var accepts = ['application/json'];
      var returnType = [SecurityChallenge];

      return this.apiClient.callApi(
        '/user/security/challenges', 'GET',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }

    /**
     * Callback function to receive the result of the sendSecurityQuestionAnswers operation.
     * @callback module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi~sendSecurityQuestionAnswersCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * Send back the answers
     * @param {Array.<SecurityAnswer>} securityAnswer An array with all the answers
     * @param {module:com.github.asyncmc.mojang.api.javascript.server/com.github.asyncmc.mojang.api.javascript.api/SecurityQuestionAnswerApi~sendSecurityQuestionAnswersCallback} callback The callback function, accepting three arguments: error, data, response
     */
    this.sendSecurityQuestionAnswers = function(securityAnswer, callback) {
      var postBody = securityAnswer;

      // verify the required parameter 'securityAnswer' is set
      if (securityAnswer === undefined || securityAnswer === null) {
        throw new Error("Missing the required parameter 'securityAnswer' when calling sendSecurityQuestionAnswers");
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

      var authNames = ['PlayerAccessToken'];
      var contentTypes = ['application/json'];
      var accepts = ['application/json'];
      var returnType = null;

      return this.apiClient.callApi(
        '/user/security/location', 'POST',
        pathParams, queryParams, collectionQueryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, callback
      );
    }
  };

  return exports;
}));
