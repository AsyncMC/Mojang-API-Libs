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
    instance = new MojangApi.CurrentPlayerIDs();
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

  describe('CurrentPlayerIDs', function() {
    it('should create an instance of CurrentPlayerIDs', function() {
      // uncomment below and update the code to test CurrentPlayerIDs
      //var instance = new MojangApi.CurrentPlayerIDs();
      //expect(instance).to.be.a(MojangApi.CurrentPlayerIDs);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new MojangApi.CurrentPlayerIDs();
      //expect(instance).to.be();
    });

    it('should have the property name (base name: "name")', function() {
      // uncomment below and update the code to test the property name
      //var instance = new MojangApi.CurrentPlayerIDs();
      //expect(instance).to.be();
    });

    it('should have the property legacy (base name: "legacy")', function() {
      // uncomment below and update the code to test the property legacy
      //var instance = new MojangApi.CurrentPlayerIDs();
      //expect(instance).to.be();
    });

    it('should have the property demo (base name: "demo")', function() {
      // uncomment below and update the code to test the property demo
      //var instance = new MojangApi.CurrentPlayerIDs();
      //expect(instance).to.be();
    });

  });

}));
