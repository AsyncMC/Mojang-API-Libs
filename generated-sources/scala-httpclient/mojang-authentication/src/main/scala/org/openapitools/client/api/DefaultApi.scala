/**
 * Mojang Authentication API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package org.openapitools.client.api

import java.text.SimpleDateFormat

import org.openapitools.client.model.AccessKeys
import org.openapitools.client.model.Authentication
import org.openapitools.client.model.AuthenticationRequest
import org.openapitools.client.model.Error
import org.openapitools.client.model.RefreshRequest
import org.openapitools.client.model.RefreshResponse
import org.openapitools.client.model.UsernamePassword
import org.openapitools.client.{ApiInvoker, ApiException}

import collection.mutable
import com.sun.jersey.multipart.FormDataMultiPart
import com.sun.jersey.multipart.file.FileDataBodyPart
import com.wordnik.swagger.client._
import com.wordnik.swagger.client.ClientResponseReaders.Json4sFormatsReader._
import com.wordnik.swagger.client.RequestWriters.Json4sFormatsWriter._

import java.net.URI
import java.io.File
import java.util.Date
import java.util.TimeZone
import javax.ws.rs.core.MediaType

import scala.concurrent.ExecutionContext.Implicits.global
import scala.concurrent._
import scala.concurrent.duration._
import scala.collection.mutable.HashMap
import scala.util.{Failure, Success, Try}

import org.json4s._

class DefaultApi(
  val defBasePath: String = "https://authserver.mojang.com",
  defApiInvoker: ApiInvoker = ApiInvoker
) {
  private lazy val dateTimeFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  private val dateFormatter = {
    val formatter = new SimpleDateFormat("yyyy-MM-dd")
    formatter.setTimeZone(TimeZone.getTimeZone("UTC"))
    formatter
  }
  implicit val formats = new org.json4s.DefaultFormats {
    override def dateFormatter = dateTimeFormatter
  }
  implicit val stringReader: ClientResponseReader[String] = ClientResponseReaders.StringReader
  implicit val unitReader: ClientResponseReader[Unit] = ClientResponseReaders.UnitReader
  implicit val jvalueReader: ClientResponseReader[JValue] = ClientResponseReaders.JValueReader
  implicit val jsonReader: ClientResponseReader[Nothing] = JsonFormatsReader
  implicit val stringWriter: RequestWriter[String] = RequestWriters.StringWriter
  implicit val jsonWriter: RequestWriter[Nothing] = JsonFormatsWriter

  var basePath: String = defBasePath
  var apiInvoker: ApiInvoker = defApiInvoker

  def addHeader(key: String, value: String): mutable.HashMap[String, String] = {
    apiInvoker.defaultHeaders += key -> value
  }

  val config: SwaggerConfig = SwaggerConfig.forUrl(new URI(defBasePath))
  val client = new RestClient(config)
  val helper = new DefaultApiAsyncHelper(client, config)

  /**
   * 
   * 
   *
   * @param authenticationRequest  
   * @return Authentication
   */
  def authenticate(authenticationRequest: AuthenticationRequest): Option[Authentication] = {
    val await = Try(Await.result(authenticateAsync(authenticationRequest), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * 
   *
   * @param authenticationRequest  
   * @return Future(Authentication)
   */
  def authenticateAsync(authenticationRequest: AuthenticationRequest): Future[Authentication] = {
      helper.authenticate(authenticationRequest)
  }

  /**
   * 
   * 
   *
   * @param accessKeys  
   * @return void
   */
  def invalidate(accessKeys: AccessKeys) = {
    val await = Try(Await.result(invalidateAsync(accessKeys), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * 
   *
   * @param accessKeys  
   * @return Future(void)
   */
  def invalidateAsync(accessKeys: AccessKeys) = {
      helper.invalidate(accessKeys)
  }

  /**
   * 
   * 
   *
   * @param refreshRequest  
   * @return RefreshResponse
   */
  def refresh(refreshRequest: RefreshRequest): Option[RefreshResponse] = {
    val await = Try(Await.result(refreshAsync(refreshRequest), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * 
   *
   * @param refreshRequest  
   * @return Future(RefreshResponse)
   */
  def refreshAsync(refreshRequest: RefreshRequest): Future[RefreshResponse] = {
      helper.refresh(refreshRequest)
  }

  /**
   * 
   * 
   *
   * @param usernamePassword  
   * @return void
   */
  def siginout(usernamePassword: UsernamePassword) = {
    val await = Try(Await.result(siginoutAsync(usernamePassword), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * 
   *
   * @param usernamePassword  
   * @return Future(void)
   */
  def siginoutAsync(usernamePassword: UsernamePassword) = {
      helper.siginout(usernamePassword)
  }

  /**
   * 
   * 
   *
   * @param accessKeys  
   * @return void
   */
  def validate(accessKeys: AccessKeys) = {
    val await = Try(Await.result(validateAsync(accessKeys), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   *  asynchronously
   * 
   *
   * @param accessKeys  
   * @return Future(void)
   */
  def validateAsync(accessKeys: AccessKeys) = {
      helper.validate(accessKeys)
  }

}

class DefaultApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def authenticate(authenticationRequest: AuthenticationRequest)(implicit reader: ClientResponseReader[Authentication], writer: RequestWriter[AuthenticationRequest]): Future[Authentication] = {
    // create path and map variables
    val path = (addFmt("/authenticate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (authenticationRequest == null) throw new Exception("Missing required parameter 'authenticationRequest' when calling DefaultApi->authenticate")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(authenticationRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def invalidate(accessKeys: AccessKeys)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[AccessKeys]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/invalidate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessKeys == null) throw new Exception("Missing required parameter 'accessKeys' when calling DefaultApi->invalidate")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(accessKeys))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def refresh(refreshRequest: RefreshRequest)(implicit reader: ClientResponseReader[RefreshResponse], writer: RequestWriter[RefreshRequest]): Future[RefreshResponse] = {
    // create path and map variables
    val path = (addFmt("/refresh"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (refreshRequest == null) throw new Exception("Missing required parameter 'refreshRequest' when calling DefaultApi->refresh")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(refreshRequest))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def siginout(usernamePassword: UsernamePassword)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[UsernamePassword]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/signout"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (usernamePassword == null) throw new Exception("Missing required parameter 'usernamePassword' when calling DefaultApi->siginout")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(usernamePassword))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def validate(accessKeys: AccessKeys)(implicit reader: ClientResponseReader[Unit], writer: RequestWriter[AccessKeys]): Future[Unit] = {
    // create path and map variables
    val path = (addFmt("/validate"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (accessKeys == null) throw new Exception("Missing required parameter 'accessKeys' when calling DefaultApi->validate")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(accessKeys))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
