/* 
 * Mojang Session API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using NUnit.Framework;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.com.github.asyncmc.mojang.sessions.csharp.refactor.api;
using Org.OpenAPITools.com.github.asyncmc.mojang.sessions.csharp.refactor.model;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing LoginApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class LoginApiTests
    {
        private LoginApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new LoginApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of LoginApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' LoginApi
            //Assert.IsInstanceOfType(typeof(LoginApi), instance, "instance is a LoginApi");
        }

        
        /// <summary>
        /// Test GetPlayerProfile
        /// </summary>
        [Test]
        public void GetPlayerProfileTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string strippedUuid = null;
            //bool? unsigned = null;
            //var response = instance.GetPlayerProfile(strippedUuid, unsigned);
            //Assert.IsInstanceOf<PlayerProfile> (response, "response is PlayerProfile");
        }
        
    }

}
