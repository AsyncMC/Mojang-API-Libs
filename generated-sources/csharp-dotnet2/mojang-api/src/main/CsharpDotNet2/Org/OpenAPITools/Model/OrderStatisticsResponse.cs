using System;
using System.Text;
using System.Collections;
using System.Collections.Generic;
using System.Runtime.Serialization;
using Newtonsoft.Json;

namespace Org.OpenAPITools.Model {

  /// <summary>
  /// A json object is returned with the total amount of copies sold, the amount of copies sold in the last 24h and how many sales there are per second.
  /// </summary>
  [DataContract]
  public class OrderStatisticsResponse {
    /// <summary>
    /// total amount sold
    /// </summary>
    /// <value>total amount sold</value>
    [DataMember(Name="total", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "total")]
    public long? Total { get; set; }

    /// <summary>
    /// total sold in last 24 hours
    /// </summary>
    /// <value>total sold in last 24 hours</value>
    [DataMember(Name="last24h", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "last24h")]
    public long? Last24h { get; set; }

    /// <summary>
    /// decimal average sales per second
    /// </summary>
    /// <value>decimal average sales per second</value>
    [DataMember(Name="saleVelocityPerSeconds", EmitDefaultValue=false)]
    [JsonProperty(PropertyName = "saleVelocityPerSeconds")]
    public double? SaleVelocityPerSeconds { get; set; }


    /// <summary>
    /// Get the string presentation of the object
    /// </summary>
    /// <returns>String presentation of the object</returns>
    public override string ToString()  {
      var sb = new StringBuilder();
      sb.Append("class OrderStatisticsResponse {\n");
      sb.Append("  Total: ").Append(Total).Append("\n");
      sb.Append("  Last24h: ").Append(Last24h).Append("\n");
      sb.Append("  SaleVelocityPerSeconds: ").Append(SaleVelocityPerSeconds).Append("\n");
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
