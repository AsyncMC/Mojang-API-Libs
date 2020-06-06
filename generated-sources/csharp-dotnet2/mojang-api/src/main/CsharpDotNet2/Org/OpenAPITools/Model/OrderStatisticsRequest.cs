using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// The body of the request to get the order statistics
  /// </summary>
  [DataContract]
  public class OrderStatisticsRequest {
    /// <summary>
    /// Gets or Sets MetricKeys
    /// </summary>
    [DataMember(Name="metricKeys", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "metricKeys")]
    public List<OrderStatistic> MetricKeys { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrderStatisticsRequest {\n");
      sb.Append("  MetricKeys: ").Append(MetricKeys).Append("\n");
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
