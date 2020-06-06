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
    /// The body of the request to get the order statistics
    /// </summary>
    [DataContract]
    public partial class OrderStatisticsRequest :  IEquatable<OrderStatisticsRequest>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderStatisticsRequest" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrderStatisticsRequest() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderStatisticsRequest" /> class.
        /// </summary>
        /// <param name="metricKeys">metricKeys (required).</param>
        public OrderStatisticsRequest(List<OrderStatistic> metricKeys = default(List<OrderStatistic>))
        {
            // to ensure "metricKeys" is required (not null)
            if (metricKeys == null)
            {
                throw new InvalidDataException("metricKeys is a required property for OrderStatisticsRequest and cannot be null");
            }
            else
            {
                this.MetricKeys = metricKeys;
            }
        }
        
        /// <summary>
        /// Gets or Sets MetricKeys
        /// </summary>
        [DataMember(Name="metricKeys", EmitDefaultValue=false)]
        public List<OrderStatistic> MetricKeys { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrderStatisticsRequest {\n");
            sb.Append("  MetricKeys: ").Append(MetricKeys).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }
  
        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as OrderStatisticsRequest);
        }

        /// <summary>
        /// Returns true if OrderStatisticsRequest instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderStatisticsRequest to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderStatisticsRequest input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.MetricKeys == input.MetricKeys ||
                    this.MetricKeys != null &&
                    this.MetricKeys.SequenceEqual(input.MetricKeys)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.MetricKeys != null)
                    hashCode = hashCode * 59 + this.MetricKeys.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
