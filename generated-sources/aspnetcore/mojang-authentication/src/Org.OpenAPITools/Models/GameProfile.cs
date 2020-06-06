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
    /// 
    /// </summary>
    [DataContract]
    public partial class GameProfile : IEquatable<GameProfile>
    { 
        /// <summary>
        /// Gets or Sets Agent
        /// </summary>
        [DataMember(Name="agent")]
        public string Agent { get; set; }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name="id")]
        public string Id { get; set; }

        /// <summary>
        /// Gets or Sets Name
        /// </summary>
        [DataMember(Name="name")]
        public string Name { get; set; }

        /// <summary>
        /// Gets or Sets UserId
        /// </summary>
        [DataMember(Name="userId")]
        public string UserId { get; set; }

        /// <summary>
        /// Unix timestamp in milliseconds
        /// </summary>
        /// <value>Unix timestamp in milliseconds</value>
        [DataMember(Name="createdAt")]
        public long? CreatedAt { get; set; }

        /// <summary>
        /// Gets or Sets LegacyProfile
        /// </summary>
        [DataMember(Name="legacyProfile")]
        public bool? LegacyProfile { get; set; }

        /// <summary>
        /// Gets or Sets Suspended
        /// </summary>
        [DataMember(Name="suspended")]
        public bool? Suspended { get; set; }

        /// <summary>
        /// Gets or Sets Paid
        /// </summary>
        [DataMember(Name="paid")]
        public bool? Paid { get; set; }

        /// <summary>
        /// Gets or Sets Migrated
        /// </summary>
        [DataMember(Name="migrated")]
        public bool? Migrated { get; set; }

        /// <summary>
        /// Gets or Sets Legacy
        /// </summary>
        [DataMember(Name="legacy")]
        public bool? Legacy { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class GameProfile {\n");
            sb.Append("  Agent: ").Append(Agent).Append("\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  UserId: ").Append(UserId).Append("\n");
            sb.Append("  CreatedAt: ").Append(CreatedAt).Append("\n");
            sb.Append("  LegacyProfile: ").Append(LegacyProfile).Append("\n");
            sb.Append("  Suspended: ").Append(Suspended).Append("\n");
            sb.Append("  Paid: ").Append(Paid).Append("\n");
            sb.Append("  Migrated: ").Append(Migrated).Append("\n");
            sb.Append("  Legacy: ").Append(Legacy).Append("\n");
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
            return obj.GetType() == GetType() && Equals((GameProfile)obj);
        }

        /// <summary>
        /// Returns true if GameProfile instances are equal
        /// </summary>
        /// <param name="other">Instance of GameProfile to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(GameProfile other)
        {
            if (other is null) return false;
            if (ReferenceEquals(this, other)) return true;

            return 
                (
                    Agent == other.Agent ||
                    Agent != null &&
                    Agent.Equals(other.Agent)
                ) && 
                (
                    Id == other.Id ||
                    Id != null &&
                    Id.Equals(other.Id)
                ) && 
                (
                    Name == other.Name ||
                    Name != null &&
                    Name.Equals(other.Name)
                ) && 
                (
                    UserId == other.UserId ||
                    UserId != null &&
                    UserId.Equals(other.UserId)
                ) && 
                (
                    CreatedAt == other.CreatedAt ||
                    CreatedAt != null &&
                    CreatedAt.Equals(other.CreatedAt)
                ) && 
                (
                    LegacyProfile == other.LegacyProfile ||
                    LegacyProfile != null &&
                    LegacyProfile.Equals(other.LegacyProfile)
                ) && 
                (
                    Suspended == other.Suspended ||
                    Suspended != null &&
                    Suspended.Equals(other.Suspended)
                ) && 
                (
                    Paid == other.Paid ||
                    Paid != null &&
                    Paid.Equals(other.Paid)
                ) && 
                (
                    Migrated == other.Migrated ||
                    Migrated != null &&
                    Migrated.Equals(other.Migrated)
                ) && 
                (
                    Legacy == other.Legacy ||
                    Legacy != null &&
                    Legacy.Equals(other.Legacy)
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
                    if (Agent != null)
                    hashCode = hashCode * 59 + Agent.GetHashCode();
                    if (Id != null)
                    hashCode = hashCode * 59 + Id.GetHashCode();
                    if (Name != null)
                    hashCode = hashCode * 59 + Name.GetHashCode();
                    if (UserId != null)
                    hashCode = hashCode * 59 + UserId.GetHashCode();
                    if (CreatedAt != null)
                    hashCode = hashCode * 59 + CreatedAt.GetHashCode();
                    if (LegacyProfile != null)
                    hashCode = hashCode * 59 + LegacyProfile.GetHashCode();
                    if (Suspended != null)
                    hashCode = hashCode * 59 + Suspended.GetHashCode();
                    if (Paid != null)
                    hashCode = hashCode * 59 + Paid.GetHashCode();
                    if (Migrated != null)
                    hashCode = hashCode * 59 + Migrated.GetHashCode();
                    if (Legacy != null)
                    hashCode = hashCode * 59 + Legacy.GetHashCode();
                return hashCode;
            }
        }

        #region Operators
        #pragma warning disable 1591

        public static bool operator ==(GameProfile left, GameProfile right)
        {
            return Equals(left, right);
        }

        public static bool operator !=(GameProfile left, GameProfile right)
        {
            return !Equals(left, right);
        }

        #pragma warning restore 1591
        #endregion Operators
    }
}
