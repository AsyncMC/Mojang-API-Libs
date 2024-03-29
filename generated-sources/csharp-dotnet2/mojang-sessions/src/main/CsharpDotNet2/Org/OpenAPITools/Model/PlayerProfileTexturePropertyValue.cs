using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// This is obtained by decoding the \&quot;textures\&quot; property
  /// </summary>
  [DataContract]
  public class PlayerProfileTexturePropertyValue {
    /// <summary>
    /// UNIX timestamp in milliseconds
    /// </summary>
    /// <value>UNIX timestamp in milliseconds</value>
    [DataMember(Name="timestamp", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "timestamp")]
    public long? Timestamp { get; set; }

    /// <summary>
    /// The player UUID without hyphens
    /// </summary>
    /// <value>The player UUID without hyphens</value>
    [DataMember(Name="profileId", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "profileId")]
    public string ProfileId { get; set; }

    /// <summary>
    /// The player's name
    /// </summary>
    /// <value>The player's name</value>
    [DataMember(Name="profileName", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "profileName")]
    public string ProfileName { get; set; }

    /// <summary>
    /// Only present if unsigned was set to false in the request
    /// </summary>
    /// <value>Only present if unsigned was set to false in the request</value>
    [DataMember(Name="signatureRequired", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "signatureRequired")]
    public bool? SignatureRequired { get; set; }

    /// <summary>
    /// Gets or Sets Textures
    /// </summary>
    [DataMember(Name="textures", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "textures")]
    public PlayerTexture Textures { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class PlayerProfileTexturePropertyValue {\n");
      sb.Append("  Timestamp: ").Append(Timestamp).Append("\n");
      sb.Append("  ProfileId: ").Append(ProfileId).Append("\n");
      sb.Append("  ProfileName: ").Append(ProfileName).Append("\n");
      sb.Append("  SignatureRequired: ").Append(SignatureRequired).Append("\n");
      sb.Append("  Textures: ").Append(Textures).Append("\n");
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
