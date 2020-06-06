/*
 * Mojang API
 *
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 * Generated by: https://openapi-generator.tech
 */

using System;
using System.Collections.Generic;
using Microsoft.AspNetCore.Mvc;
using Swashbuckle.AspNetCore.Annotations;
using Swashbuckle.AspNetCore.SwaggerGen;
using Newtonsoft.Json;
using System.ComponentModel.DataAnnotations;
using Org.OpenAPITools.Attributes;
using Org.OpenAPITools.Models;

namespace Org.OpenAPITools.Controllers
{ 
    /// <summary>
    /// 
    /// </summary>
    public class SecurityQuestionAnswerApiController : ControllerBase
    { 
        /// <summary>
        /// Check if security questions are needed
        /// </summary>
        /// <response code="204">No check is needed.</response>
        /// <response code="400">A security check is needed or there is an other issue</response>
        [HttpGet]
        [Route("/user/security/location")]
        [ValidateModelState]
        [SwaggerOperation("CheckSecurityStatus")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "A security check is needed or there is an other issue")]
        public virtual IActionResult CheckSecurityStatus()
        { 
            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));


            throw new NotImplementedException();
        }

        /// <summary>
        /// Get list of questions
        /// </summary>
        /// <response code="200">A list of security questions to be answered</response>
        [HttpGet]
        [Route("/user/security/challenges")]
        [ValidateModelState]
        [SwaggerOperation("ListPendingSecurityQuestions")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<SecurityChallenge>), description: "A list of security questions to be answered")]
        public virtual IActionResult ListPendingSecurityQuestions()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<SecurityChallenge>));

            string exampleJson = null;
            exampleJson = "{\r\n  \"question\" : {\r\n    \"question\" : \"What is your dream job?\",\r\n    \"id\" : 37\r\n  },\r\n  \"answer\" : {\r\n    \"id\" : 593\r\n  }\r\n}";
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<SecurityChallenge>>(exampleJson)
            : default(List<SecurityChallenge>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }

        /// <summary>
        /// Send back the answers
        /// </summary>
        /// <param name="securityAnswer">An array with all the answers</param>
        /// <response code="204">The answers were accepted</response>
        /// <response code="400">At least one answer we not accepted</response>
        [HttpPost]
        [Route("/user/security/location")]
        [ValidateModelState]
        [SwaggerOperation("SendSecurityQuestionAnswers")]
        [SwaggerResponse(statusCode: 400, type: typeof(Error), description: "At least one answer we not accepted")]
        public virtual IActionResult SendSecurityQuestionAnswers([FromBody]List<SecurityAnswer> securityAnswer)
        { 
            //TODO: Uncomment the next line to return response 204 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(204);

            //TODO: Uncomment the next line to return response 400 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(400, default(Error));


            throw new NotImplementedException();
        }
    }
}