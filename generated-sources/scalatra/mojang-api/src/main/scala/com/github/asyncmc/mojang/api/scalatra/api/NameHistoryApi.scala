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


package com.github.asyncmc.mojang.api.scalatra.api

import com.github.asyncmc.mojang.api.scalatra.model.CurrentPlayerIDs
import com.github.asyncmc.mojang.api.scalatra.model.Error
import com.github.asyncmc.mojang.api.scalatra.model.NameChange

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class NameHistoryApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "NameHistoryApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val findUniqueIdsByNameOperation = (apiOperation[List[CurrentPlayerIDs]]("findUniqueIdsByName")
    summary "Find the current UUID of multiple players at once"
    parameters(bodyParam[List[String]]("requestBody").description(""))
  )

  post("/profiles/minecraft", operation(findUniqueIdsByNameOperation)) {
    //println("requestBody: " + requestBody)
  }

  

  val getNameHistoryOperation = (apiOperation[List[NameChange]]("getNameHistory")
    summary "Gets the full player's name history"
    parameters(pathParam[String]("strippedUuid").description(""))
  )

  get("/user/profiles/:stripped_uuid/names", operation(getNameHistoryOperation)) {
    val strippedUuid = params.getOrElse("strippedUuid", halt(400))
    //println("strippedUuid: " + strippedUuid)
  }

  

  val getUniqueIdByNameOperation = (apiOperation[CurrentPlayerIDs]("getUniqueIdByName")
    summary "Find the UUID by name"
    parameters(pathParam[String]("username").description(""), queryParam[Long]("at").description("").optional)
  )

  get("/users/profiles/minecraft/:username", operation(getUniqueIdByNameOperation)) {
    val username = params.getOrElse("username", halt(400))
    //println("username: " + username)
            val at = params.getAs[Long]("at")

    //println("at: " + at)
  }

}
