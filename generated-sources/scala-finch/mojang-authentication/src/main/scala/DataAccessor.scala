package org.openapitools

// TODO: properly handle custom imports
import java.io._
import java.util.UUID
import java.time._
import com.twitter.finagle.http.exp.Multipart.{FileUpload, InMemoryFileUpload, OnDiskFileUpload}

import com.github.asyncmc.mojang.authentication.scala.finch.model._

trait DataAccessor {
    // TODO: apiInfo -> apis -> operations = TODO error
    private object TODO extends CommonError("Not implemented") {
        def message = "Not implemented"
    }

        /**
        * 
        * @return A Authentication
        */
        def Default_authenticate(authenticationRequest: AuthenticationRequest): Either[CommonError,Authentication] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Default_invalidate(accessKeys: AccessKeys): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A RefreshResponse
        */
        def Default_refresh(refreshRequest: RefreshRequest): Either[CommonError,RefreshResponse] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Default_siginout(usernamePassword: UsernamePassword): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def Default_validate(accessKeys: AccessKeys): Either[CommonError,Unit] = Left(TODO)

}