/**
 * Mojang API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * OpenAPI spec version: 2020-06-05
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package com.github.asyncmc.mojang.api.scala.httpclient.api

import java.text.SimpleDateFormat

import com.github.asyncmc.mojang.api.scala.httpclient.model.CurrentPlayerIDs
import com.github.asyncmc.mojang.api.scala.httpclient.model.Error
import com.github.asyncmc.mojang.api.scala.httpclient.model.NameChange
import com.github.asyncmc.mojang.api.scala.httpclient.server.{ApiInvoker, ApiException}

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

class NameHistoryApi(
  val defBasePath: String = "https://api.mojang.com",
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
  val helper = new NameHistoryApiAsyncHelper(client, config)

  /**
   * Find the current UUID of multiple players at once
   * Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
   *
   * @param requestBody Array with the player names 
   * @return List[CurrentPlayerIDs]
   */
  def findUniqueIdsByName(requestBody: List[String]): Option[List[CurrentPlayerIDs]] = {
    val await = Try(Await.result(findUniqueIdsByNameAsync(requestBody), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find the current UUID of multiple players at once asynchronously
   * Find the current players name, UUID, demo status and migration flag by the current players name. The \&quot;at\&quot; parameter is not supported. Players not found are not returned. If no players are found, an empty array is returned.
   *
   * @param requestBody Array with the player names 
   * @return Future(List[CurrentPlayerIDs])
   */
  def findUniqueIdsByNameAsync(requestBody: List[String]): Future[List[CurrentPlayerIDs]] = {
      helper.findUniqueIdsByName(requestBody)
  }

  /**
   * Gets the full player&#39;s name history
   * 
   *
   * @param strippedUuid The player UUID without hyphens 
   * @return List[NameChange]
   */
  def getNameHistory(strippedUuid: String): Option[List[NameChange]] = {
    val await = Try(Await.result(getNameHistoryAsync(strippedUuid), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Gets the full player&#39;s name history asynchronously
   * 
   *
   * @param strippedUuid The player UUID without hyphens 
   * @return Future(List[NameChange])
   */
  def getNameHistoryAsync(strippedUuid: String): Future[List[NameChange]] = {
      helper.getNameHistory(strippedUuid)
  }

  /**
   * Find the UUID by name
   * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
   *
   * @param username The username in a given time, or in present if \&quot;at\&quot; is not sent 
   * @param at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
   * @return CurrentPlayerIDs
   */
  def getUniqueIdByName(username: String, at: Option[Long] = None): Option[CurrentPlayerIDs] = {
    val await = Try(Await.result(getUniqueIdByNameAsync(username, at), Duration.Inf))
    await match {
      case Success(i) => Some(await.get)
      case Failure(t) => None
    }
  }

  /**
   * Find the UUID by name asynchronously
   * Find the current player name, UUID, demo status and migration flag by the current player name or at a given time.
   *
   * @param username The username in a given time, or in present if \&quot;at\&quot; is not sent 
   * @param at Find the username in a given time, when 0 selects the original name however, it only works if the name was changed at least once, or if the account is legacy. The time is an UNIX timestamp (without milliseconds) (optional)
   * @return Future(CurrentPlayerIDs)
   */
  def getUniqueIdByNameAsync(username: String, at: Option[Long] = None): Future[CurrentPlayerIDs] = {
      helper.getUniqueIdByName(username, at)
  }

}

class NameHistoryApiAsyncHelper(client: TransportClient, config: SwaggerConfig) extends ApiClient(client, config) {

  def findUniqueIdsByName(requestBody: List[String])(implicit reader: ClientResponseReader[List[CurrentPlayerIDs]], writer: RequestWriter[List[String]]): Future[List[CurrentPlayerIDs]] = {
    // create path and map variables
    val path = (addFmt("/profiles/minecraft"))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (requestBody == null) throw new Exception("Missing required parameter 'requestBody' when calling NameHistoryApi->findUniqueIdsByName")

    val resFuture = client.submit("POST", path, queryParams.toMap, headerParams.toMap, writer.write(requestBody))
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getNameHistory(strippedUuid: String)(implicit reader: ClientResponseReader[List[NameChange]]): Future[List[NameChange]] = {
    // create path and map variables
    val path = (addFmt("/user/profiles/{stripped_uuid}/names")
      replaceAll("\\{" + "stripped_uuid" + "\\}", strippedUuid.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (strippedUuid == null) throw new Exception("Missing required parameter 'strippedUuid' when calling NameHistoryApi->getNameHistory")


    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }

  def getUniqueIdByName(username: String,
    at: Option[Long] = None
    )(implicit reader: ClientResponseReader[CurrentPlayerIDs]): Future[CurrentPlayerIDs] = {
    // create path and map variables
    val path = (addFmt("/users/profiles/minecraft/{username}")
      replaceAll("\\{" + "username" + "\\}", username.toString))

    // query params
    val queryParams = new mutable.HashMap[String, String]
    val headerParams = new mutable.HashMap[String, String]

    if (username == null) throw new Exception("Missing required parameter 'username' when calling NameHistoryApi->getUniqueIdByName")

    at match {
      case Some(param) => queryParams += "at" -> param.toString
      case _ => queryParams
    }

    val resFuture = client.submit("GET", path, queryParams.toMap, headerParams.toMap, "")
    resFuture flatMap { resp =>
      process(reader.read(resp))
    }
  }


}
