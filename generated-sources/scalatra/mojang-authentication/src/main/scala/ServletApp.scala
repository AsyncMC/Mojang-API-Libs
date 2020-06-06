/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * Contact: team@openapitools.org
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 */


package com.github.asyncmc.mojang.authentication.scalatra.server.app

import org.scalatra.swagger.{ ApiInfo, SwaggerWithAuth, Swagger }
import org.scalatra.swagger.{ JacksonSwaggerBase, Swagger }
import org.scalatra.ScalatraServlet
import org.json4s.{ DefaultFormats, Formats }

class ResourcesApp(implicit protected val swagger: OpenAPIApp)
  extends ScalatraServlet with JacksonSwaggerBase {
  before() {
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
}

class OpenAPIApp extends Swagger(apiInfo = OpenAPIInfo.apiInfo, apiVersion = "1.0", swaggerVersion = Swagger.SpecVersion)

object OpenAPIInfo {
  val apiInfo = ApiInfo(
    """Mojang Authentication API""",
    """No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)""",
    """http://org.openapitools""",
    """team@openapitools.org""",
    """All rights reserved""",
    """http://apache.org/licenses/LICENSE-2.0.html""")
}
