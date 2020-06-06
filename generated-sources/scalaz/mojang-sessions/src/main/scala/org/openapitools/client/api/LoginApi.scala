package org.openapitools.client.api

import argonaut._
import argonaut.EncodeJson._
import argonaut.DecodeJson._

import java.io.File
import java.net.URLEncoder
import java.util.UUID

import org.http4s._
import org.http4s.{EntityDecoder, EntityEncoder}
import org.http4s.argonaut._
import org.http4s.client._
import org.http4s.client.blaze.PooledHttp1Client
import org.http4s.headers._

import org.joda.time.DateTime

import scalaz.concurrent.Task

import HelperCodecs._

object LoginApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getPlayerProfile(host: String, strippedUuid: String, unsigned: Boolean)(implicit unsignedQuery: QueryParam[Boolean]): Task[PlayerProfile] = {
    implicit val returnTypeDecoder: EntityDecoder[PlayerProfile] = jsonOf[PlayerProfile]

    val path = "/session/minecraft/profile/{stripped_uuid}".replaceAll("\\{" + "stripped_uuid" + "\\}",escape(strippedUuid.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("unsigned", Some(unsignedQuery.toParamString(unsigned))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PlayerProfile](req)

    } yield resp
  }
  
}

class HttpServiceLoginApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def getPlayerProfile(strippedUuid: String, unsigned: Boolean)(implicit unsignedQuery: QueryParam[Boolean]): Task[PlayerProfile] = {
    implicit val returnTypeDecoder: EntityDecoder[PlayerProfile] = jsonOf[PlayerProfile]

    val path = "/session/minecraft/profile/{stripped_uuid}".replaceAll("\\{" + "stripped_uuid" + "\\}",escape(strippedUuid.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("unsigned", Some(unsignedQuery.toParamString(unsigned))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[PlayerProfile](req)

    } yield resp
  }
  
}
