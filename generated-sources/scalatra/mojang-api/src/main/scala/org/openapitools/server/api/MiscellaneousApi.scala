/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package org.openapitools.server.api

import org.openapitools.server.model.OrderStatisticsRequest
import org.openapitools.server.model.OrderStatisticsResponse

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class MiscellaneousApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "MiscellaneousApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val getOrdersStatisticsOperation = (apiOperation[OrderStatisticsResponse]("getOrdersStatistics")
    summary "Get statistics on the sales of Minecraft."
    parameters(bodyParam[OrderStatisticsRequest]("orderStatisticsRequest").description(""))
  )

  post("/orders/statistics", operation(getOrdersStatisticsOperation)) {
    //println("orderStatisticsRequest: " + orderStatisticsRequest)
  }

}
