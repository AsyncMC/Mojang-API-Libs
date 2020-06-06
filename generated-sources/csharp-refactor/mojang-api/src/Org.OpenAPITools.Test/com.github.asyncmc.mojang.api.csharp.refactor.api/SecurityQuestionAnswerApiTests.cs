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
    ///  Class for testing SecurityQuestionAnswerApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    [TestFixture]
    public class SecurityQuestionAnswerApiTests
    {
        private SecurityQuestionAnswerApi instance;

        /// <summary>
        /// Setup before each unit test
        /// </summary>
        [SetUp]
        public void Init()
        {
            instance = new SecurityQuestionAnswerApi();
        }

        /// <summary>
        /// Clean up after each unit test
        /// </summary>
        [TearDown]
        public void Cleanup()
        {

        }

        /// <summary>
        /// Test an instance of SecurityQuestionAnswerApi
        /// </summary>
        [Test]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsInstanceOfType' SecurityQuestionAnswerApi
            //Assert.IsInstanceOfType(typeof(SecurityQuestionAnswerApi), instance, "instance is a SecurityQuestionAnswerApi");
        }

        
        /// <summary>
        /// Test CheckSecurityStatus
        /// </summary>
        [Test]
        public void CheckSecurityStatusTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //instance.CheckSecurityStatus();
            
        }
        
        /// <summary>
        /// Test ListPendingSecurityQuestions
        /// </summary>
        [Test]
        public void ListPendingSecurityQuestionsTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //var response = instance.ListPendingSecurityQuestions();
            //Assert.IsInstanceOf<List<SecurityChallenge>> (response, "response is List<SecurityChallenge>");
        }
        
        /// <summary>
        /// Test SendSecurityQuestionAnswers
        /// </summary>
        [Test]
        public void SendSecurityQuestionAnswersTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //List<SecurityAnswer> securityAnswer = null;
            //instance.SendSecurityQuestionAnswers(securityAnswer);
            
        }
        
    }

}
