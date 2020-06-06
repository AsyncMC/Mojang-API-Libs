package com.github.asyncmc.mojang.api.scala.finch.api

import java.io._
import org.openapitools._
import com.github.asyncmc.mojang.api.scala.finch.model._
import com.github.asyncmc.mojang.api.scala.finch.model.Error
import java.io.File
import com.github.asyncmc.mojang.api.scala.finch.model.SkinModel
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

object SkinOperationsApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        changePlayerSkin(da) :+:
        resetPlayerSkin(da) :+:
        uploadPlayerSkin(da)


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
        * @return An endpoint representing a Unit
        */
        private def changePlayerSkin(da: DataAccessor): Endpoint[Unit] =
        post("user" :: "profile" :: string :: "skin" :: string) { (strippedUuid: String, url: String, model: SkinModel) =>
          da.SkinOperations_changePlayerSkin(strippedUuid, url, model) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def resetPlayerSkin(da: DataAccessor): Endpoint[Unit] =
        delete("user" :: "profile" :: string :: "skin") { (strippedUuid: String) =>
          da.SkinOperations_resetPlayerSkin(strippedUuid) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a Unit
        */
        private def uploadPlayerSkin(da: DataAccessor): Endpoint[Unit] =
        put("user" :: "profile" :: string :: "skin" :: fileUpload("file")) { (strippedUuid: String, file: FileUpload, model: SkinModel) =>
          da.SkinOperations_uploadPlayerSkin(strippedUuid, file, model) match {
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
      val file = File.createTempFile("tmpSkinOperationsApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
