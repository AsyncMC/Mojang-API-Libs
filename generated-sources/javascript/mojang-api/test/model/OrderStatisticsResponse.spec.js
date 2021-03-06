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
    // AMD.
    define(['expect.js', '../../src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require('../../src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.MojangApi);
  }
}(this, function(expect, MojangApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new MojangApi.OrderStatisticsResponse();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('OrderStatisticsResponse', function() {
    it('should create an instance of OrderStatisticsResponse', function() {
      // uncomment below and update the code to test OrderStatisticsResponse
      //var instance = new MojangApi.OrderStatisticsResponse();
      //expect(instance).to.be.a(MojangApi.OrderStatisticsResponse);
    });

    it('should have the property total (base name: "total")', function() {
      // uncomment below and update the code to test the property total
      //var instance = new MojangApi.OrderStatisticsResponse();
      //expect(instance).to.be();
    });

    it('should have the property last24h (base name: "last24h")', function() {
      // uncomment below and update the code to test the property last24h
      //var instance = new MojangApi.OrderStatisticsResponse();
      //expect(instance).to.be();
    });

    it('should have the property saleVelocityPerSeconds (base name: "saleVelocityPerSeconds")', function() {
      // uncomment below and update the code to test the property saleVelocityPerSeconds
      //var instance = new MojangApi.OrderStatisticsResponse();
      //expect(instance).to.be();
    });

  });

}));
