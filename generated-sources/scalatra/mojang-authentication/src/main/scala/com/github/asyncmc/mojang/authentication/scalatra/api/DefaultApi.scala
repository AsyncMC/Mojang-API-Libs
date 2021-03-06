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


package com.github.asyncmc.mojang.authentication.scalatra.api

import com.github.asyncmc.mojang.authentication.scalatra.model.AccessKeys
import com.github.asyncmc.mojang.authentication.scalatra.model.Authentication
import com.github.asyncmc.mojang.authentication.scalatra.model.AuthenticationRequest
import com.github.asyncmc.mojang.authentication.scalatra.model.Error
import com.github.asyncmc.mojang.authentication.scalatra.model.RefreshRequest
import com.github.asyncmc.mojang.authentication.scalatra.model.RefreshResponse
import com.github.asyncmc.mojang.authentication.scalatra.model.UsernamePassword

import java.io.File

import org.scalatra.ScalatraServlet
import org.scalatra.swagger._
import org.json4s._
import org.json4s.JsonDSL._
import org.scalatra.json.{ JValueResult, JacksonJsonSupport }
import org.scalatra.servlet.{ FileUploadSupport, MultipartConfig, SizeConstraintExceededException }

import scala.collection.JavaConverters._

class DefaultApi(implicit val swagger: Swagger) extends ScalatraServlet
  with FileUploadSupport
  with JacksonJsonSupport
  with SwaggerSupport {
  protected implicit val jsonFormats: Formats = DefaultFormats

  protected val applicationDescription: String = "DefaultApi"

  before() {
    contentType = formats("json")
    response.headers += ("Access-Control-Allow-Origin" -> "*")
  }
  

  val authenticateOperation = (apiOperation[Authentication]("authenticate")
    summary ""
    parameters(bodyParam[AuthenticationRequest]("authenticationRequest").description(""))
  )

  post("/authenticate", operation(authenticateOperation)) {
    //println("authenticationRequest: " + authenticationRequest)
  }

  

  val invalidateOperation = (apiOperation[Unit]("invalidate")
    summary ""
    parameters(bodyParam[AccessKeys]("accessKeys").description(""))
  )

  post("/invalidate", operation(invalidateOperation)) {
    //println("accessKeys: " + accessKeys)
  }

  

  val refreshOperation = (apiOperation[RefreshResponse]("refresh")
    summary ""
    parameters(bodyParam[RefreshRequest]("refreshRequest").description(""))
  )

  post("/refresh", operation(refreshOperation)) {
    //println("refreshRequest: " + refreshRequest)
  }

  

  val siginoutOperation = (apiOperation[Unit]("siginout")
    summary ""
    parameters(bodyParam[UsernamePassword]("usernamePassword").description(""))
  )

  post("/signout", operation(siginoutOperation)) {
    //println("usernamePassword: " + usernamePassword)
  }

  

  val validateOperation = (apiOperation[Unit]("validate")
    summary ""
    parameters(bodyParam[AccessKeys]("accessKeys").description(""))
  )

  post("/validate", operation(validateOperation)) {
    //println("accessKeys: " + accessKeys)
  }

}
