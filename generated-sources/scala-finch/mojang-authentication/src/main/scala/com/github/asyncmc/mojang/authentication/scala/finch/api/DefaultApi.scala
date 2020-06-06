package com.github.asyncmc.mojang.authentication.scala.finch.api

import java.io._
import org.openapitools._
import com.github.asyncmc.mojang.authentication.scala.finch.model._
import com.github.asyncmc.mojang.authentication.scala.finch.model.AccessKeys
import com.github.asyncmc.mojang.authentication.scala.finch.model.Authentication
import com.github.asyncmc.mojang.authentication.scala.finch.model.AuthenticationRequest
import com.github.asyncmc.mojang.authentication.scala.finch.model.Error
import com.github.asyncmc.mojang.authentication.scala.finch.model.RefreshRequest
import com.github.asyncmc.mojang.authentication.scala.finch.model.RefreshResponse
import com.github.asyncmc.mojang.authentication.scala.finch.model.UsernamePassword
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

object DefaultApi {
    /**
    * Compiles all service endpoints.
    * @return Bundled compilation of all service endpoints.
    */
    def endpoints(da: DataAccessor) =
        authenticate(da) :+:
        invalidate(da) :+:
        refresh(da) :+:
        siginout(da) :+:
        validate(da)


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
        * @return An endpoint representing a Authentication
        */
        private def authenticate(da: DataAccessor): Endpoint[Authentication] =
        post("authenticate" :: jsonBody[AuthenticationRequest]) { (authenticationRequest: AuthenticationRequest) =>
          da.Default_authenticate(authenticationRequest) match {
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
        private def invalidate(da: DataAccessor): Endpoint[Unit] =
        post("invalidate" :: jsonBody[AccessKeys]) { (accessKeys: AccessKeys) =>
          da.Default_invalidate(accessKeys) match {
            case Left(error) => checkError(error)
            case Right(data) => Ok(data)
          }
        } handle {
          case e: Exception => BadRequest(e)
        }

        /**
        * 
        * @return An endpoint representing a RefreshResponse
        */
        private def refresh(da: DataAccessor): Endpoint[RefreshResponse] =
        post("refresh" :: jsonBody[RefreshRequest]) { (refreshRequest: RefreshRequest) =>
          da.Default_refresh(refreshRequest) match {
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
        private def siginout(da: DataAccessor): Endpoint[Unit] =
        post("signout" :: jsonBody[UsernamePassword]) { (usernamePassword: UsernamePassword) =>
          da.Default_siginout(usernamePassword) match {
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
        private def validate(da: DataAccessor): Endpoint[Unit] =
        post("validate" :: jsonBody[AccessKeys]) { (accessKeys: AccessKeys) =>
          da.Default_validate(accessKeys) match {
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
      val file = File.createTempFile("tmpDefaultApi", null)
      val output = new FileOutputStream(file)
      output.write(input)
      file
    }

    // This assists in params(string) application (which must be Seq[A] in parameter list) when the param is used as a List[A] elsewhere.
    implicit def seqList[A](input: Seq[A]): List[A] = input.toList
}
