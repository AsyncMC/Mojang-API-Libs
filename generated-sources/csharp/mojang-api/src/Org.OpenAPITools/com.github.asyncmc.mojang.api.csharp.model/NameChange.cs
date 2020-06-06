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

namespace Org.OpenAPITools.com.github.asyncmc.mojang.api.csharp.model
{
    /// <summary>
    /// A registered name change.
    /// </summary>
    [DataContract]
    public partial class NameChange :  IEquatable<NameChange>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="NameChange" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected NameChange() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="NameChange" /> class.
        /// </summary>
        /// <param name="name">The new player name (required).</param>
        /// <param name="changedToAt">Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry..</param>
        public NameChange(string name = default(string), long? changedToAt = default(long?))
        {
            // to ensure "name" is required (not null)
            if (name == null)
            {
                throw new InvalidDataException("name is a required property for NameChange and cannot be null");
            }
            else
            {
                this.Name = name;
            }
            this.ChangedToAt = changedToAt;
        }
        
        /// <summary>
        /// The new player name
        /// </summary>
        /// <value>The new player name</value>
        [DataMember(Name="name", EmitDefaultValue=false)]
        public string Name { get; set; }

        /// <summary>
        /// Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
        /// </summary>
        /// <value>Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.</value>
        [DataMember(Name="changedToAt", EmitDefaultValue=false)]
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
            return this.Equals(input as NameChange);
        }

        /// <summary>
        /// Returns true if NameChange instances are equal
        /// </summary>
        /// <param name="input">Instance of NameChange to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(NameChange input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Name == input.Name ||
                    (this.Name != null &&
                    this.Name.Equals(input.Name))
                ) && 
                (
                    this.ChangedToAt == input.ChangedToAt ||
                    (this.ChangedToAt != null &&
                    this.ChangedToAt.Equals(input.ChangedToAt))
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
                if (this.Name != null)
                    hashCode = hashCode * 59 + this.Name.GetHashCode();
                if (this.ChangedToAt != null)
                    hashCode = hashCode * 59 + this.ChangedToAt.GetHashCode();
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