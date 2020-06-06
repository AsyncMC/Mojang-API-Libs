
package org.openapitools.client.model


case class OrderStatisticsResponse (
    /* total amount sold */
    _total: Long,
    /* total sold in last 24 hours */
    _last24h: Long,
    /* decimal average sales per second */
    _saleVelocityPerSeconds: Double
)
object OrderStatisticsResponse {
    def toStringBody(var_total: Object, var_last24h: Object, var_saleVelocityPerSeconds: Object) =
        s"""
        | {
        | "total":$var_total,"last24h":$var_last24h,"saleVelocityPerSeconds":$var_saleVelocityPerSeconds
        | }
        """.stripMargin
}
