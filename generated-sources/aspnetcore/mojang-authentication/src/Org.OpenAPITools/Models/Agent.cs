/*
 * Mojang Authentication API
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
    /// Identifies the software doing the request
    /// </summary>
    [DataContract]
    public partial class Agent : IEquatable<Agent>
    { 
        /// <summary>
        /// The name of the game
        /// </summary>
        /// <value>The name of the game</value>
        [JsonConverter(typeof(Newtonsoft.Json.Converters.StringEnumConverter))]
        public enum NameEnum
        {
            
            /// <summary>
            /// Enum MinecraftEnum for Minecraft
            /// </summary>
            [EnumMember(Value = "Minecraft")]
            MinecraftEnum = 1,
            
            /// <summary>
            /// Enum ScrollsEnum for Scrolls
            /// </summary>
            [EnumMember(Value = "Scrolls")]
            ScrollsEnum = 2
        }

        /// <summary>
        /// The name of the game
        /// </summary>
        /// <value>The name of the game</value>
        [DataMember(Name="name")]
        public NameEnum? Name { get; set; }

        /// <summary>
        /// The agent version, usually 1.
        /// </summary>
        /// <value>The agent version, usually 1.</value>
        [DataMember(Name="version")]
        public int? Version { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Agent {\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Version: ").Append(Version).Append("\n");
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
            return obj.GetType() == GetType() && Equals((Agent)obj);
        }

        /// <summary>
        /// Returns true if Agent instances are equal
        /// </summary>
        /// <param name="other">Instance of Agent to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Agent other)
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
                    Version == other.Version ||
                    Version != null &&
                    Version.Equals(other.Version)
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
                    if (Version != null)
                    hashCode = hashCode * 59 + Version.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(Agent left, Agent right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(Agent left, Agent right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}