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
    /// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
    /// </summary>
    [DataContract]
    public partial class OrderStatisticsResponse :  IEquatable<OrderStatisticsResponse>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderStatisticsResponse" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected OrderStatisticsResponse() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="OrderStatisticsResponse" /> class.
        /// </summary>
        /// <param name="total">total amount sold (required).</param>
        /// <param name="last24h">total sold in last 24 hours (required).</param>
        /// <param name="saleVelocityPerSeconds">decimal average sales per second (required).</param>
        public OrderStatisticsResponse(long? total = default(long?), long? last24h = default(long?), double? saleVelocityPerSeconds = default(double?))
        {
            // to ensure "total" is required (not null)
            if (total == null)
            {
                throw new InvalidDataException("total is a required property for OrderStatisticsResponse and cannot be null");
            }
            else
            {
                this.Total = total;
            }
            // to ensure "last24h" is required (not null)
            if (last24h == null)
            {
                throw new InvalidDataException("last24h is a required property for OrderStatisticsResponse and cannot be null");
            }
            else
            {
                this.Last24h = last24h;
            }
            // to ensure "saleVelocityPerSeconds" is required (not null)
            if (saleVelocityPerSeconds == null)
            {
                throw new InvalidDataException("saleVelocityPerSeconds is a required property for OrderStatisticsResponse and cannot be null");
            }
            else
            {
                this.SaleVelocityPerSeconds = saleVelocityPerSeconds;
            }
        }
        
        /// <summary>
        /// total amount sold
        /// </summary>
        /// <value>total amount sold</value>
        [DataMember(Name="total", EmitDefaultValue=false)]
        public long? Total { get; set; }

        /// <summary>
        /// total sold in last 24 hours
        /// </summary>
        /// <value>total sold in last 24 hours</value>
        [DataMember(Name="last24h", EmitDefaultValue=false)]
        public long? Last24h { get; set; }

        /// <summary>
        /// decimal average sales per second
        /// </summary>
        /// <value>decimal average sales per second</value>
        [DataMember(Name="saleVelocityPerSeconds", EmitDefaultValue=false)]
        public double? SaleVelocityPerSeconds { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class OrderStatisticsResponse {\n");
            sb.Append("  Total: ").Append(Total).Append("\n");
            sb.Append("  Last24h: ").Append(Last24h).Append("\n");
            sb.Append("  SaleVelocityPerSeconds: ").Append(SaleVelocityPerSeconds).Append("\n");
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
            return this.Equals(input as OrderStatisticsResponse);
        }

        /// <summary>
        /// Returns true if OrderStatisticsResponse instances are equal
        /// </summary>
        /// <param name="input">Instance of OrderStatisticsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderStatisticsResponse input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Total == input.Total ||
                    (this.Total != null &&
                    this.Total.Equals(input.Total))
                ) && 
                (
                    this.Last24h == input.Last24h ||
                    (this.Last24h != null &&
                    this.Last24h.Equals(input.Last24h))
                ) && 
                (
                    this.SaleVelocityPerSeconds == input.SaleVelocityPerSeconds ||
                    (this.SaleVelocityPerSeconds != null &&
                    this.SaleVelocityPerSeconds.Equals(input.SaleVelocityPerSeconds))
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
                if (this.Total != null)
                    hashCode = hashCode * 59 + this.Total.GetHashCode();
                if (this.Last24h != null)
                    hashCode = hashCode * 59 + this.Last24h.GetHashCode();
                if (this.SaleVelocityPerSeconds != null)
                    hashCode = hashCode * 59 + this.SaleVelocityPerSeconds.GetHashCode();
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
