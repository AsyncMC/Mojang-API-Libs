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

import com.github.asyncmc.mojang.api.scalatra.model.Error
import java.io.File
import com.github.asyncmc.mojang.api.scalatra.model.SkinModel

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class SkinOperationsApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "SkinOperationsApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val changePlayerSkinOperation = (apiOperation[Unit]("changePlayerSkin")
    summary "Changes the player skin by URL"
    parameters(pathParam[String]("strippedUuid").description(""), formParam[String]("url").description(""), formParam[SkinModel]("model").description("").optional)
  )

  post("/user/profile/:stripped_uuid/skin", operation(changePlayerSkinOperation)) {
    val strippedUuid = params.getOrElse("strippedUuid", halt(400))
    //println("strippedUuid: " + strippedUuid)
    //println("url: " + url)
    //println("model: " + model)
  }

  

  val resetPlayerSkinOperation = (apiOperation[Unit]("resetPlayerSkin")
    summary "Resets the player skin to default"
    parameters(pathParam[String]("strippedUuid").description(""))
  )

  delete("/user/profile/:stripped_uuid/skin", operation(resetPlayerSkinOperation)) {
    val strippedUuid = params.getOrElse("strippedUuid", halt(400))
    //println("strippedUuid: " + strippedUuid)
  }

  

  val uploadPlayerSkinOperation = (apiOperation[Unit]("uploadPlayerSkin")
    summary "Changes the player skin by upload"
    parameters(pathParam[String]("strippedUuid").description(""), formParam[File]("file").description(""), formParam[SkinModel]("model").description("").optional)
  )

  put("/user/profile/:stripped_uuid/skin", operation(uploadPlayerSkinOperation)) {
    val strippedUuid = params.getOrElse("strippedUuid", halt(400))
    //println("strippedUuid: " + strippedUuid)
    val file = fileParams("file")
    //println("file: " + file)
    //println("model: " + model)
  }

}
