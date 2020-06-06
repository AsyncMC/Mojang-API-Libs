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
    public class DefaultApiController : ControllerBase
    { 
        /// <summary>
        /// Checks the Mojang service statuses
        /// </summary>
        /// <response code="200">An array with service status key/pairs</response>
        [HttpGet]
        [Route("/check")]
        [ValidateModelState]
        [SwaggerOperation("CheckStatuses")]
        [SwaggerResponse(statusCode: 200, type: typeof(List<Dictionary<string, ApiStatus>>), description: "An array with service status key/pairs")]
        public virtual IActionResult CheckStatuses()
        { 
            //TODO: Uncomment the next line to return response 200 or use other options such as return this.NotFound(), return this.BadRequest(..), ...
            // return StatusCode(200, default(List<Dictionary<string, ApiStatus>>));

            string exampleJson = null;
            
            var example = exampleJson != null
            ? JsonConvert.DeserializeObject<List<Dictionary<string, ApiStatus>>>(exampleJson)
            : default(List<Dictionary<string, ApiStatus>>);
            //TODO: Change the data returned
            return new ObjectResult(example);
        }
    }
}