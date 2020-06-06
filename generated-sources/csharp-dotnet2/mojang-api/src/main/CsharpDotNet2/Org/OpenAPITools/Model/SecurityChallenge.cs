using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// Binds a question to an answer id, the answer must respect the answer id.
  /// </summary>
  [DataContract]
  public class SecurityChallenge {
    /// <summary>
    /// Gets or Sets Question
    /// </summary>
    [DataMember(Name="question", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "question")]
    public SecurityQuestion Question { get; set; }

    /// <summary>
    /// Gets or Sets Answer
    /// </summary>
    [DataMember(Name="answer", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "answer")]
    public SecurityAnswerId Answer { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class SecurityChallenge {\n");
      sb.Append("  Question: ").Append(Question).Append("\n");
      sb.Append("  Answer: ").Append(Answer).Append("\n");
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
