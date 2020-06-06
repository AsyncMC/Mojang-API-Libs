package com.github.asyncmc.mojang.api.scala.finch.api

import java.io._
import org.openapitools._
import com.github.asyncmc.mojang.api.scala.finch.model._
import com.github.asyncmc.mojang.api.scala.finch.model.CurrentPlayerIDs
import com.github.asyncmc.mojang.api.scala.finch.model.Error
import com.github.asyncmc.mojang.api.scala.finch.model.NameChange
import scala.collection.immutable.Seq
import io.finch.circe._
import io.circe.generic.semiauto._
import com.twitter.concurrent.AsyncStream
import com.twitter.finagle.Service
import com.twitter.finagle.Http
import com.twitter.finagle.http.{Request, Response}
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}
import com.twitter.util.Future
import com.twitter.io.Buf
import io.finch._, items._
import java.io.File
import java.time._

object NameHistoryApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        findUniqueIdsByName(da) :+:
        getNameHistory(da) :+:
        getUniqueIdByName(da)


    private def checkError(e: CommonError) = e match {
      case InvalidInput(_) => BadRequest(e)
      case MissingIdentifier(_) => BadRequest(e)
      case RecordNotFound(_) => NotFound(e)
      case _ => InternalServerError(e)
    }

    implicit class StringOps(s: String) {

      import java.time.format.DateTimeFormatter

      lazy val localformatter: DateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd")
      lazy val datetimeformatter: DateTimeFormatter =
      DateTimeFormatter.ofPattern("yyyy-MM-dd'T'HH:mm:ss.SSSZ")

      def toLocalDateTime: LocalDateTime = LocalDateTime.parse(s,localformatter)
      def toZonedDateTime: ZonedDateTime = ZonedDateTime.parse(s, datetimeformatter)

    }

        /**
        * 
        * @return An endpoint representing a Seq[CurrentPlayerIDs]
        */
        private def findUniqueIdsByName(da: DataAccessor): Endpoint[Seq[CurrentPlayerIDs]] =
        post("profiles" :: "minecraft" :: jsonBody[Seq[String]]) { (requestBody: Seq[String]) =>
          da.NameHistory_findUniqueIdsByName(requestBody) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Seq[NameChange]
        */
        private def getNameHistory(da: DataAccessor): Endpoint[Seq[NameChange]] =
        get("user" :: "profiles" :: string :: "names") { (strippedUuid: String) =>
          da.NameHistory_getNameHistory(strippedUuid) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a CurrentPlayerIDs
        */
        private def getUniqueIdByName(da: DataAccessor): Endpoint[CurrentPlayerIDs] =
        get("users" :: "profiles" :: "minecraft" :: string :: paramOption("at").map(_.map(_.toLong))) { (username: String, at: Option[Long]) =>
          da.NameHistory_getUniqueIdByName(username, at) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }


    implicit private def fileUploadToFile(fileUpload: FileUpload) : File = {
      fileUpload match {
        case upload: InMemoryFileUpload =>
          bytesToFile(Buf.ByteArray.Owned.extract(upload.content))
        case upload: OnDiskFileUpload =>
          upload.content
        case _ => null
      }
    }

    private def bytesToFile(input: Array[Byte]): java.io.File = {
      val file = File.createTempFile("tmpNameHistoryApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
