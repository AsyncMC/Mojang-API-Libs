/**
 * @fileoverview AUTOMATICALLY GENERATED service for API.Client.LoginApi.
 * Do not edit this file by hand or your changes will be lost next time it is
 * generated.
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 * Version: 2020-06-05
 * Generated by: org.openapitools.codegen.languages.JavascriptClosureAngularClientCodegen
 */
goog.provide('API.Client.LoginApi');

goog.require('API.Client.PlayerProfile');
goog.require('API.Client.SessionApiError');

/**
 * @constructor
 * @param {!angular.$http} $http
 * @param {!Object} $httpParamSerializer
 * @param {!angular.$injector} $injector
 * @struct
 */
API.Client.LoginApi = function($http, $httpParamSerializer, $injector) {
  /** @private {!string} */
  this.basePath_ = $injector.has('LoginApiBasePath') ?
                   /** @type {!string} */ ($injector.get('LoginApiBasePath')) :
                   'https://sessionserver.mojang.com';

  /** @private {!Object<string, string>} */
  this.defaultHeaders_ = $injector.has('LoginApiDefaultHeaders') ?
                   /** @type {!Object<string, string>} */ (
                       $injector.get('LoginApiDefaultHeaders')) :
                   {};

  /** @private {!angular.$http} */
  this.http_ = $http;

  /** @package {!Object} */
  this.httpParamSerializer = $injector.get('$httpParamSerializer');
}
API.Client.LoginApi.$inject = ['$http', '$httpParamSerializer', '$injector'];

/**
 * Gets the player&#39;s game profile
 * This will return the player&#39;s username plus any additional information about them (e.g. skins). This has a much stricter rate limit: You can request the same profile once per minute, however you can send as many unique requests as you like.
 * @param {!string} strippedUuid The player UUID without hyphens
 * @param {!boolean=} opt_unsigned When set to false, the signature data are sent
 * @param {!angular.$http.Config=} opt_extraHttpRequestParams Extra HTTP parameters to send.
 * @return {!angular.$q.Promise<!API.Client.PlayerProfile>}
 */
API.Client.LoginApi.prototype.getPlayerProfile = function(strippedUuid, opt_unsigned, opt_extraHttpRequestParams) {
  /** @const {string} */
  var path = this.basePath_ + '/session/minecraft/profile/{stripped_uuid}'
      .replace('{' + 'stripped_uuid' + '}', String(strippedUuid));

  /** @type {!Object} */
  var queryParameters = {};

  /** @type {!Object} */
  var headerParams = angular.extend({}, this.defaultHeaders_);
  // verify required parameter 'strippedUuid' is set
  if (!strippedUuid) {
    throw new Error('Missing required parameter strippedUuid when calling getPlayerProfile');
  }
  if (opt_unsigned !== undefined) {
    queryParameters['unsigned'] = opt_unsigned;
  }

  /** @type {!Object} */
  var httpRequestParams = {
    method: 'GET',
    url: path,
    json: true,
            params: queryParameters,
    headers: headerParams
  };

  if (opt_extraHttpRequestParams) {
    httpRequestParams = angular.extend(httpRequestParams, opt_extraHttpRequestParams);
  }

  return (/** @type {?} */ (this.http_))(httpRequestParams);
}