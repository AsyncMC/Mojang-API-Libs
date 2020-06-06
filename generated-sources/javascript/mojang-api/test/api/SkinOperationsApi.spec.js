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
    instance = new MojangApi.SkinOperationsApi();
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

  describe('SkinOperationsApi', function() {
    describe('changePlayerSkin', function() {
      it('should call changePlayerSkin successfully', function(done) {
        //uncomment below and update the code to test changePlayerSkin
        //instance.changePlayerSkin(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('resetPlayerSkin', function() {
      it('should call resetPlayerSkin successfully', function(done) {
        //uncomment below and update the code to test resetPlayerSkin
        //instance.resetPlayerSkin(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
    describe('uploadPlayerSkin', function() {
      it('should call uploadPlayerSkin successfully', function(done) {
        //uncomment below and update the code to test uploadPlayerSkin
        //instance.uploadPlayerSkin(function(error) {
        //  if (error) throw error;
        //expect().to.be();
        //});
        done();
      });
    });
  });

}));
