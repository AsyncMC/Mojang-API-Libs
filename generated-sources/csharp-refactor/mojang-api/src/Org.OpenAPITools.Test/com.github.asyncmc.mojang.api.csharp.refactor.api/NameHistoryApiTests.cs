/* 
 * Mojang API
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
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.api;
using Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model;

namespace Org.OpenAPITools.Test
{
    /// <summary>
    ///  Class for testing NameHistoryApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class NameHistoryApiTests
    {
        private NameHistoryApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new NameHistoryApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of NameHistoryApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' NameHistoryApi
            //Assert.IsInstanceOfType(typeof(NameHistoryApi), instance, "instance is a NameHistoryApi");
        }

        
        /// <summary>
        /// Test FindUniqueIdsByName
        /// </summary>
        [Test]
        public void FindUniqueIdsByNameTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<string> requestBody = null;
            //var response = instance.FindUniqueIdsByName(requestBody);
            //Assert.IsInstanceOf<List<CurrentPlayerIDs>> (response, "response is List<CurrentPlayerIDs>");
        }
        
        /// <summary>
        /// Test GetNameHistory
        /// </summary>
        [Test]
        public void GetNameHistoryTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string strippedUuid = null;
            //var response = instance.GetNameHistory(strippedUuid);
            //Assert.IsInstanceOf<List<NameChange>> (response, "response is List<NameChange>");
        }
        
        /// <summary>
        /// Test GetUniqueIdByName
        /// </summary>
        [Test]
        public void GetUniqueIdByNameTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //string username = null;
            //long? at = null;
            //var response = instance.GetUniqueIdByName(username, at);
            //Assert.IsInstanceOf<CurrentPlayerIDs> (response, "response is CurrentPlayerIDs");
        }
        
    }

}