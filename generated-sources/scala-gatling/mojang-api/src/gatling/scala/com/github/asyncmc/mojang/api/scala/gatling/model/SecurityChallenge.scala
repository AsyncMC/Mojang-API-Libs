
package com.github.asyncmc.mojang.api.scala.gatling.model


case class SecurityChallenge (
    _question: SecurityQuestion,
    _answer: SecurityAnswerId
)
object SecurityChallenge {
    def toStringBody(var_question: Object, var_answer: Object) =
        s"""
        | {
        | "question":$var_question,"answer":$var_answer
        | }
        """.stripMargin
}
