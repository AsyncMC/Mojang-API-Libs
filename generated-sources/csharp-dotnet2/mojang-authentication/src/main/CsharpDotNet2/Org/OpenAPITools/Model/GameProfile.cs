using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// 
  /// </summary>
  [DataContract]
  public class GameProfile {
    /// <summary>
    /// Gets or Sets Agent
    /// </summary>
    [DataMember(Name="agent", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "agent")]
    public string Agent { get; set; }

    /// <summary>
    /// Gets or Sets Id
    /// </summary>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// Gets or Sets Name
    /// </summary>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Gets or Sets UserId
    /// </summary>
    [DataMember(Name="userId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "userId")]
    public string UserId { get; set; }

    /// <summary>
    /// Unix timestamp in milliseconds
    /// </summary>
    /// <value>Unix timestamp in milliseconds</value>
    [DataMember(Name="createdAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "createdAt")]
    public long? CreatedAt { get; set; }

    /// <summary>
    /// Gets or Sets LegacyProfile
    /// </summary>
    [DataMember(Name="legacyProfile", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "legacyProfile")]
    public bool? LegacyProfile { get; set; }

    /// <summary>
    /// Gets or Sets Suspended
    /// </summary>
    [DataMember(Name="suspended", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "suspended")]
    public bool? Suspended { get; set; }

    /// <summary>
    /// Gets or Sets Paid
    /// </summary>
    [DataMember(Name="paid", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "paid")]
    public bool? Paid { get; set; }

    /// <summary>
    /// Gets or Sets Migrated
    /// </summary>
    [DataMember(Name="migrated", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "migrated")]
    public bool? Migrated { get; set; }

    /// <summary>
    /// Gets or Sets Legacy
    /// </summary>
    [DataMember(Name="legacy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "legacy")]
    public bool? Legacy { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
