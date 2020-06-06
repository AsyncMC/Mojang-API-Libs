
package org.openapitools.client.model


case class OrderStatisticsRequest (
    _metricKeys: List[OrderStatistic]
)
object OrderStatisticsRequest {
    def toStringBody(var_metricKeys: Object) =
        s"""
        | {
        | "metricKeys":$var_metricKeys
        | }
        """.stripMargin
}
