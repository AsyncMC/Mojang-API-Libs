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
using System.Linq;
using System.Text;
using System.Collections.Generic;
using System.ComponentModel.DataAnnotations;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Models
{ 
    /// <summary>
    /// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
    /// </summary>
    [DataContract]
    public partial class OrderStatisticsResponse : IEquatable<OrderStatisticsResponse>
    { 
        /// <summary>
        /// total amount sold
        /// </summary>
        /// <value>total amount sold</value>
        [Required]
        [DataMember(Name="total")]
        public long? Total { get; set; }

        /// <summary>
        /// total sold in last 24 hours
        /// </summary>
        /// <value>total sold in last 24 hours</value>
        [Required]
        [DataMember(Name="last24h")]
        public long? Last24h { get; set; }

        /// <summary>
        /// decimal average sales per second
        /// </summary>
        /// <value>decimal average sales per second</value>
        [Required]
        [DataMember(Name="saleVelocityPerSeconds")]
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
        public string ToJson()
        {
            return JsonConvert.SerializeObject(this, Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="obj">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object obj)
        {
            if (obj is null) return false;
            if (ReferenceEquals(this, obj)) return true;
            return obj.GetType() == GetType() && Equals((OrderStatisticsResponse)obj);
        }

        /// <summary>
        /// Returns true if OrderStatisticsResponse instances are equal
        /// </summary>
        /// <param name="other">Instance of OrderStatisticsResponse to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(OrderStatisticsResponse other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Total == other.Total ||
                    Total != null &&
                    Total.Equals(other.Total)
                ) && 
                (
                    Last24h == other.Last24h ||
                    Last24h != null &&
                    Last24h.Equals(other.Last24h)
                ) && 
                (
                    SaleVelocityPerSeconds == other.SaleVelocityPerSeconds ||
                    SaleVelocityPerSeconds != null &&
                    SaleVelocityPerSeconds.Equals(other.SaleVelocityPerSeconds)
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
                var hashCode = 41;
                // Suitable nullity checks etc, of course :)
                    if (Total != null)
                    hashCode = hashCode * 59 + Total.GetHashCode();
                    if (Last24h != null)
                    hashCode = hashCode * 59 + Last24h.GetHashCode();
                    if (SaleVelocityPerSeconds != null)
                    hashCode = hashCode * 59 + SaleVelocityPerSeconds.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(OrderStatisticsResponse left, OrderStatisticsResponse right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(OrderStatisticsResponse left, OrderStatisticsResponse right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
