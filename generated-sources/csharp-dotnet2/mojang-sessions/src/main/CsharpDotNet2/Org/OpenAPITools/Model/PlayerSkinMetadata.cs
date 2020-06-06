using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Contains details about the skin
  /// </summary>
  [DataContract]
  public class PlayerSkinMetadata {
    /// <summary>
    /// The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.
    /// </summary>
    /// <value>The player model, currently only \"slim\" (Alex) is valid, for Steve's model this property must be absent.</value>
    [DataMember(Name="model", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "model")]
    public string Model { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PlayerSkinMetadata {\n");
      sb.Append("  Model: ").Append(Model).Append("\n");
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
