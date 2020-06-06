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
    /// A registered name change.
    /// </summary>
    [DataContract]
    public partial class NameChange : IEquatable<NameChange>
    { 
        /// <summary>
        /// The new player name
        /// </summary>
        /// <value>The new player name</value>
        [Required]
        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
        /// </summary>
        /// <value>Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.</value>
        [DataMember(Name="changedToAt")]
        public long? ChangedToAt { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class NameChange {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  ChangedToAt: ").Append(ChangedToAt).Append("\n");
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
            return obj.GetType() == GetType() && Equals((NameChange)obj);
        }

        /// <summary>
        /// Returns true if NameChange instances are equal
        /// </summary>
        /// <param name="other">Instance of NameChange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NameChange other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    ChangedToAt == other.ChangedToAt ||
                    ChangedToAt != null &&
                    ChangedToAt.Equals(other.ChangedToAt)
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
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (ChangedToAt != null)
                    hashCode = hashCode * 59 + ChangedToAt.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(NameChange left, NameChange right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(NameChange left, NameChange right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}