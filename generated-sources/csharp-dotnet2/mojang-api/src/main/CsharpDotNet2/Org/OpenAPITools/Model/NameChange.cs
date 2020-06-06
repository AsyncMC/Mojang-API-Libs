using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A registered name change.
  /// </summary>
  [DataContract]
  public class NameChange {
    /// <summary>
    /// The new player name
    /// </summary>
    /// <value>The new player name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.
    /// </summary>
    /// <value>Time which the name was changed in UNIX Timestamp without milliseconds. Usually absent for the first entry.</value>
    [DataMember(Name="changedToAt", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "changedToAt")]
    public long? ChangedToAt { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class NameChange {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  ChangedToAt: ").Append(ChangedToAt).Append("\n");
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
