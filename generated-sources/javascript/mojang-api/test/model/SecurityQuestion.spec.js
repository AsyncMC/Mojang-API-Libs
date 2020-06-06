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
    instance = new MojangApi.SecurityQuestion();
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

  describe('SecurityQuestion', function() {
    it('should create an instance of SecurityQuestion', function() {
      // uncomment below and update the code to test SecurityQuestion
      //var instance = new MojangApi.SecurityQuestion();
      //expect(instance).to.be.a(MojangApi.SecurityQuestion);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new MojangApi.SecurityQuestion();
      //expect(instance).to.be();
    });

    it('should have the property question (base name: "question")', function() {
      // uncomment below and update the code to test the property question
      //var instance = new MojangApi.SecurityQuestion();
      //expect(instance).to.be();
    });

  });

}));