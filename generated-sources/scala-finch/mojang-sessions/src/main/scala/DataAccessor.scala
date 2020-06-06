package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import org.openapitools.models._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A String
        */
        def Bans_getBlockedServerHashes(): Either[CommonError,String] = Left(TODO)

        /**
        * 
        * @return A PlayerProfile
        */
        def Login_getPlayerProfile(strippedUuid: String, unsigned: Option[Boolean]): Either[CommonError,PlayerProfile] = Left(TODO)

}