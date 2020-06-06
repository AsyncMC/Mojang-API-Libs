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

namespace Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.refactor.model
{
    /// <summary>
    /// The current player, demo and legacy status of a player identified by the id
    /// </summary>
    [DataContract]
    public partial class CurrentPlayerIDs :  IEquatable<CurrentPlayerIDs>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="CurrentPlayerIDs" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected CurrentPlayerIDs() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="CurrentPlayerIDs" /> class.
        /// </summary>
        /// <param name="id">The player UUID without hyphens (required).</param>
        /// <param name="name">The current name being used by this player (required).</param>
        /// <param name="legacy">If account has not been converted (default to false).</param>
        /// <param name="demo">If the player has not puchased the game (default to false).</param>
        public CurrentPlayerIDs(string id = default(string), string name = default(string), bool? legacy = false, bool? demo = false)
        {
            // to ensure "id" is required (not null)
            if (id == null)
            {
                throw new InvalidDataException("id is a required property for CurrentPlayerIDs and cannot be null");
            }
            else
            {
                this.Id = id;
            }
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for CurrentPlayerIDs and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            // use default value if no "legacy" provided
            if (legacy == null)
            {
                this.Legacy = false;
            }
            else
            {
                this.Legacy = legacy;
            }
            // use default value if no "demo" provided
            if (demo == null)
            {
                this.Demo = false;
            }
            else
            {
                this.Demo = demo;
            }
        }
        
        /// <summary>
        /// The player UUID without hyphens
        /// </summary>
        /// <value>The player UUID without hyphens</value>
        [DataMember(Name="id", EmitDefaultValue=false)]
        public string Id { get; set; }

        /// <summary>
        /// The current name being used by this player
        /// </summary>
        /// <value>The current name being used by this player</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// If account has not been converted
        /// </summary>
        /// <value>If account has not been converted</value>
        [DataMember(Name="legacy", EmitDefaultValue=false)]
        public bool? Legacy { get; set; }

        /// <summary>
        /// If the player has not puchased the game
        /// </summary>
        /// <value>If the player has not puchased the game</value>
        [DataMember(Name="demo", EmitDefaultValue=false)]
        public bool? Demo { get; set; }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class CurrentPlayerIDs {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  Name: ").Append(Name).Append("\n");
            sb.Append("  Legacy: ").Append(Legacy).Append("\n");
            sb.Append("  Demo: ").Append(Demo).Append("\n");
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
            return this.Equals(input as CurrentPlayerIDs);
        }

        /// <summary>
        /// Returns true if CurrentPlayerIDs instances are equal
        /// </summary>
        /// <param name="input">Instance of CurrentPlayerIDs to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(CurrentPlayerIDs input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.Legacy == input.Legacy ||
                    (this.Legacy != null &&
                    this.Legacy.Equals(input.Legacy))
                ) && 
                (
                    this.Demo == input.Demo ||
                    (this.Demo != null &&
                    this.Demo.Equals(input.Demo))
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
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.Legacy != null)
                    hashCode = hashCode * 59 + this.Legacy.GetHashCode();
                if (this.Demo != null)
                    hashCode = hashCode * 59 + this.Demo.GetHashCode();
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
