using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A profile property, may be signed. The values are encoded by base64 and usually contains a json. The schema for the textures are described at PlayerProfileTexturePropertyValue
  /// </summary>
  [DataContract]
  public class PlayerProfileProperty {
    /// <summary>
    /// The property name
    /// </summary>
    /// <value>The property name</value>
    [DataMember(Name="name", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "name")]
    public string Name { get; set; }

    /// <summary>
    /// The serialized property value in base64.
    /// </summary>
    /// <value>The serialized property value in base64.</value>
    [DataMember(Name="value", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "value")]
    public byte[] Value { get; set; }

    /// <summary>
    /// signed data using Yggdrasil's private key
    /// </summary>
    /// <value>signed data using Yggdrasil's private key</value>
    [DataMember(Name="signature", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "signature")]
    public byte[] Signature { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PlayerProfileProperty {\n");
      sb.Append("  Name: ").Append(Name).Append("\n");
      sb.Append("  Value: ").Append(Value).Append("\n");
      sb.Append("  Signature: ").Append(Signature).Append("\n");
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
