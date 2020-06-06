package com.github.asyncmc.mojang.api.scala.gatling.api

import com.github.asyncmc.mojang.api.scala.gatling.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class SecurityQuestionAnswerApiSimulation extends Simulation {

    def getCurrentDirectory = new File("").getAbsolutePath
    def userDataDirectory = getCurrentDirectory + "/src/gatling/resources/data"

    // basic test setup
    val configName = System.getProperty("testConfig", "baseline")
    val config = ConfigFactory.load(configName).withFallback(ConfigFactory.load("default"))
    val durationSeconds = config.getInt("performance.durationSeconds")
    val rampUpSeconds = config.getInt("performance.rampUpSeconds")
    val rampDownSeconds = config.getInt("performance.rampDownSeconds")
    val authentication = config.getString("performance.authorizationHeader")
    val acceptHeader = config.getString("performance.acceptType")
    val contentTypeHeader = config.getString("performance.contentType")
    val rateMultiplier = config.getDouble("performance.rateMultiplier")
    val instanceMultiplier = config.getDouble("performance.instanceMultiplier")

    // global assertion data
    val globalResponseTimeMinLTE = config.getInt("performance.global.assertions.responseTime.min.lte")
    val globalResponseTimeMinGTE = config.getInt("performance.global.assertions.responseTime.min.gte")
    val globalResponseTimeMaxLTE = config.getInt("performance.global.assertions.responseTime.max.lte")
    val globalResponseTimeMaxGTE = config.getInt("performance.global.assertions.responseTime.max.gte")
    val globalResponseTimeMeanLTE = config.getInt("performance.global.assertions.responseTime.mean.lte")
    val globalResponseTimeMeanGTE = config.getInt("performance.global.assertions.responseTime.mean.gte")
    val globalResponseTimeFailedRequestsPercentLTE = config.getDouble("performance.global.assertions.failedRequests.percent.lte")
    val globalResponseTimeFailedRequestsPercentGTE = config.getDouble("performance.global.assertions.failedRequests.percent.gte")
    val globalResponseTimeSuccessfulRequestsPercentLTE = config.getDouble("performance.global.assertions.successfulRequests.percent.lte")
    val globalResponseTimeSuccessfulRequestsPercentGTE = config.getDouble("performance.global.assertions.successfulRequests.percent.gte")

// Setup http protocol configuration
    val httpConf = http
        .baseURL("https://api.mojang.com")
        .doNotTrackHeader("1")
        .acceptLanguageHeader("en-US,en;q=0.5")
        .acceptEncodingHeader("gzip, deflate")
        .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")
        .acceptHeader(acceptHeader)
        .contentTypeHeader(contentTypeHeader)

    // set authorization header if it has been modified from config
    if(!authentication.equals("~MANUAL_ENTRY")){
        httpConf.authorizationHeader(authentication)
    }

    // Setup all the operations per second for the test to ultimately be generated from configs
    val checkSecurityStatusPerSecond = config.getDouble("performance.operationsPerSecond.checkSecurityStatus") * rateMultiplier * instanceMultiplier
    val listPendingSecurityQuestionsPerSecond = config.getDouble("performance.operationsPerSecond.listPendingSecurityQuestions") * rateMultiplier * instanceMultiplier
    val sendSecurityQuestionAnswersPerSecond = config.getDouble("performance.operationsPerSecond.sendSecurityQuestionAnswers") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders

    // Setup all scenarios

    
    val scncheckSecurityStatus = scenario("checkSecurityStatusSimulation")
        .exec(http("checkSecurityStatus")
        .httpRequest("GET","/user/security/location")
)

    // Run scncheckSecurityStatus with warm up and reach a constant rate for entire duration
    scenarioBuilders += scncheckSecurityStatus.inject(
        rampUsersPerSec(1) to(checkSecurityStatusPerSecond) during(rampUpSeconds),
        constantUsersPerSec(checkSecurityStatusPerSecond) during(durationSeconds),
        rampUsersPerSec(checkSecurityStatusPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnlistPendingSecurityQuestions = scenario("listPendingSecurityQuestionsSimulation")
        .exec(http("listPendingSecurityQuestions")
        .httpRequest("GET","/user/security/challenges")
)

    // Run scnlistPendingSecurityQuestions with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnlistPendingSecurityQuestions.inject(
        rampUsersPerSec(1) to(listPendingSecurityQuestionsPerSecond) during(rampUpSeconds),
        constantUsersPerSec(listPendingSecurityQuestionsPerSecond) during(durationSeconds),
        rampUsersPerSec(listPendingSecurityQuestionsPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsendSecurityQuestionAnswers = scenario("sendSecurityQuestionAnswersSimulation")
        .exec(http("sendSecurityQuestionAnswers")
        .httpRequest("POST","/user/security/location")
)

    // Run scnsendSecurityQuestionAnswers with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsendSecurityQuestionAnswers.inject(
        rampUsersPerSec(1) to(sendSecurityQuestionAnswersPerSecond) during(rampUpSeconds),
        constantUsersPerSec(sendSecurityQuestionAnswersPerSecond) during(durationSeconds),
        rampUsersPerSec(sendSecurityQuestionAnswersPerSecond) to(1) during(rampDownSeconds)
    )

    setUp(
        scenarioBuilders.toList
    ).protocols(httpConf).assertions(
        global.responseTime.min.lte(globalResponseTimeMinLTE),
        global.responseTime.min.gte(globalResponseTimeMinGTE),
        global.responseTime.max.lte(globalResponseTimeMaxLTE),
        global.responseTime.max.gte(globalResponseTimeMaxGTE),
        global.responseTime.mean.lte(globalResponseTimeMeanLTE),
        global.responseTime.mean.gte(globalResponseTimeMeanGTE),
        global.failedRequests.percent.lte(globalResponseTimeFailedRequestsPercentLTE),
        global.failedRequests.percent.gte(globalResponseTimeFailedRequestsPercentGTE),
        global.successfulRequests.percent.lte(globalResponseTimeSuccessfulRequestsPercentLTE),
        global.successfulRequests.percent.gte(globalResponseTimeSuccessfulRequestsPercentGTE)
    )
}
