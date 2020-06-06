using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Provide links to the player&#39;s skin and cape
  /// </summary>
  [DataContract]
  public class PlayerTexture {
    /// <summary>
    /// Gets or Sets SKIN
    /// </summary>
    [DataMember(Name="SKIN", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "SKIN")]
    public PlayerSkinURL SKIN { get; set; }

    /// <summary>
    /// Gets or Sets CAPE
    /// </summary>
    [DataMember(Name="CAPE", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "CAPE")]
    public PlayerTextureURL CAPE { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PlayerTexture {\n");
      sb.Append("  SKIN: ").Append(SKIN).Append("\n");
      sb.Append("  CAPE: ").Append(CAPE).Append("\n");
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
