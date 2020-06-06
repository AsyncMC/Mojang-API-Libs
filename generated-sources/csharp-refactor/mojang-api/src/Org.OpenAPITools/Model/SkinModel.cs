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
using System.Linq;
using System.IO;
using System.Text;
using System.Text.RegularExpressions;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Runtime.Serialization;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)
    /// </summary>
    /// <value>Model is an empty string for the default model (like Steve) and \&quot;slim\&quot; for the slim model (like Alex)</value>
    
    [JsonConverter(typeof(StringEnumConverter))]
    
    public enum SkinModel
    {
        /// <summary>
        /// Enum Empty for value: 
        /// </summary>
        [EnumMember(Value = "")]
        Empty = 1,

        /// <summary>
        /// Enum Slim for value: slim
        /// </summary>
        [EnumMember(Value = "slim")]
        Slim = 2

    }

}
