
package com.github.asyncmc.mojang.api.scala.gatling.model


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
