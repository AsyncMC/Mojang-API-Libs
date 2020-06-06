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
        * @return A OrderStatisticsResponse
        */
        def Miscellaneous_getOrdersStatistics(orderStatisticsRequest: OrderStatisticsRequest): Either[CommonError,OrderStatisticsResponse] = Left(TODO)

        /**
        * 
        * @return A Seq[CurrentPlayerIDs]
        */
        def NameHistory_findUniqueIdsByName(requestBody: Seq[String]): Either[CommonError,Seq[CurrentPlayerIDs]] = Left(TODO)

        /**
        * 
        * @return A Seq[NameChange]
        */
        def NameHistory_getNameHistory(strippedUuid: String): Either[CommonError,Seq[NameChange]] = Left(TODO)

        /**
        * 
        * @return A CurrentPlayerIDs
        */
        def NameHistory_getUniqueIdByName(username: String, at: Option[Long]): Either[CommonError,CurrentPlayerIDs] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def SecurityQuestionAnswer_checkSecurityStatus(): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Seq[SecurityChallenge]
        */
        def SecurityQuestionAnswer_listPendingSecurityQuestions(): Either[CommonError,Seq[SecurityChallenge]] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def SecurityQuestionAnswer_sendSecurityQuestionAnswers(securityAnswer: Seq[SecurityAnswer]): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def SkinOperations_changePlayerSkin(strippedUuid: String, url: String, model: SkinModel): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def SkinOperations_resetPlayerSkin(strippedUuid: String): Either[CommonError,Unit] = Left(TODO)

        /**
        * 
        * @return A Unit
        */
        def SkinOperations_uploadPlayerSkin(strippedUuid: String, file: FileUpload, model: SkinModel): Either[CommonError,Unit] = Left(TODO)

}