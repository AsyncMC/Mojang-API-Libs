using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// The current player, demo and legacy status of a player identified by the id
  /// </summary>
  [DataContract]
  public class CurrentPlayerIDs {
    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    /// <value>The player UUID without hyphens</value>
    [DataMember(Name="id", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "id")]
    public string Id { get; set; }

    /// <summary>
    /// The current name being used by this player
    /// </summary>
    /// <value>The current name being used by this player</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// If account has not been converted
    /// </summary>
    /// <value>If account has not been converted</value>
    [DataMember(Name="legacy", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "legacy")]
    public bool? Legacy { get; set; }

    /// <summary>
    /// If the player has not puchased the game
    /// </summary>
    /// <value>If the player has not puchased the game</value>
    [DataMember(Name="demo", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "demo")]
    public bool? Demo { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
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
    /// Get the JSON string presentation of the object
    /// </summary>
    /// <returns>JSON string presentation of the object</returns>
    public string ToJson() {
      return JsonConvert.SerializeObject(this, Formatting.Indented);
    }

}
}
