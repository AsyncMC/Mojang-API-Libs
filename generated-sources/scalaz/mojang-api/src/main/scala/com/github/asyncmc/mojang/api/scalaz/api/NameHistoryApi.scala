package com.github.asyncmc.mojang.api.scalaz.api

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

object NameHistoryApi {

  val client = PooledHttp1Client()

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def findUniqueIdsByName(host: String, requestBody: List[String]): Task[List[CurrentPlayerIDs]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CurrentPlayerIDs]] = jsonOf[List[CurrentPlayerIDs]]

    val path = "/profiles/minecraft"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(requestBody)
      resp          <- client.expect[List[CurrentPlayerIDs]](req)

    } yield resp
  }
  
  def getNameHistory(host: String, strippedUuid: String): Task[List[NameChange]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[NameChange]] = jsonOf[List[NameChange]]

    val path = "/user/profiles/{stripped_uuid}/names".replaceAll("\\{" + "stripped_uuid" + "\\}",escape(strippedUuid.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[NameChange]](req)

    } yield resp
  }
  
  def getUniqueIdByName(host: String, username: String, at: Long)(implicit atQuery: QueryParam[Long]): Task[CurrentPlayerIDs] = {
    implicit val returnTypeDecoder: EntityDecoder[CurrentPlayerIDs] = jsonOf[CurrentPlayerIDs]

    val path = "/users/profiles/minecraft/{username}".replaceAll("\\{" + "username" + "\\}",escape(username.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("at", Some(atQuery.toParamString(at))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(host + path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CurrentPlayerIDs](req)

    } yield resp
  }
  
}

class HttpServiceNameHistoryApi(service: HttpService) {
  val client = Client.fromHttpService(service)

  def escape(value: String): String = URLEncoder.encode(value, "utf-8").replaceAll("\\+", "%20")

  def findUniqueIdsByName(requestBody: List[String]): Task[List[CurrentPlayerIDs]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[CurrentPlayerIDs]] = jsonOf[List[CurrentPlayerIDs]]

    val path = "/profiles/minecraft"
    
    val httpMethod = Method.POST
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType)).withBody(requestBody)
      resp          <- client.expect[List[CurrentPlayerIDs]](req)

    } yield resp
  }
  
  def getNameHistory(strippedUuid: String): Task[List[NameChange]] = {
    implicit val returnTypeDecoder: EntityDecoder[List[NameChange]] = jsonOf[List[NameChange]]

    val path = "/user/profiles/{stripped_uuid}/names".replaceAll("\\{" + "stripped_uuid" + "\\}",escape(strippedUuid.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      )

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[List[NameChange]](req)

    } yield resp
  }
  
  def getUniqueIdByName(username: String, at: Long)(implicit atQuery: QueryParam[Long]): Task[CurrentPlayerIDs] = {
    implicit val returnTypeDecoder: EntityDecoder[CurrentPlayerIDs] = jsonOf[CurrentPlayerIDs]

    val path = "/users/profiles/minecraft/{username}".replaceAll("\\{" + "username" + "\\}",escape(username.toString))
    
    val httpMethod = Method.GET
    val contentType = `Content-Type`(MediaType.`application/json`)
    val headers = Headers(
      )
    val queryParams = Query(
      ("at", Some(atQuery.toParamString(at))))

    for {
      uri           <- Task.fromDisjunction(Uri.fromString(path))
      uriWithParams =  uri.copy(query = queryParams)
      req           =  Request(method = httpMethod, uri = uriWithParams, headers = headers.put(contentType))
      resp          <- client.expect[CurrentPlayerIDs](req)

    } yield resp
  }
  
}
