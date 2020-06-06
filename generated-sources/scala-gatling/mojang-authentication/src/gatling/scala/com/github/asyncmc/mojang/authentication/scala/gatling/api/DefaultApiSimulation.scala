package com.github.asyncmc.mojang.authentication.scala.gatling.api

import com.github.asyncmc.mojang.authentication.scala.gatling.model._
import com.typesafe.config.ConfigFactory

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.core.structure.PopulationBuilder

import java.io.File

import scala.collection.mutable

class DefaultApiSimulation extends Simulation {

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
        .baseURL("https://authserver.mojang.com")
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
    val authenticatePerSecond = config.getDouble("performance.operationsPerSecond.authenticate") * rateMultiplier * instanceMultiplier
    val invalidatePerSecond = config.getDouble("performance.operationsPerSecond.invalidate") * rateMultiplier * instanceMultiplier
    val refreshPerSecond = config.getDouble("performance.operationsPerSecond.refresh") * rateMultiplier * instanceMultiplier
    val siginoutPerSecond = config.getDouble("performance.operationsPerSecond.siginout") * rateMultiplier * instanceMultiplier
    val validatePerSecond = config.getDouble("performance.operationsPerSecond.validate") * rateMultiplier * instanceMultiplier

    val scenarioBuilders: mutable.MutableList[PopulationBuilder] = new mutable.MutableList[PopulationBuilder]()

    // Set up CSV feeders

    // Setup all scenarios

    
    val scnauthenticate = scenario("authenticateSimulation")
        .exec(http("authenticate")
        .httpRequest("POST","/authenticate")
)

    // Run scnauthenticate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnauthenticate.inject(
        rampUsersPerSec(1) to(authenticatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(authenticatePerSecond) during(durationSeconds),
        rampUsersPerSec(authenticatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scninvalidate = scenario("invalidateSimulation")
        .exec(http("invalidate")
        .httpRequest("POST","/invalidate")
)

    // Run scninvalidate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scninvalidate.inject(
        rampUsersPerSec(1) to(invalidatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(invalidatePerSecond) during(durationSeconds),
        rampUsersPerSec(invalidatePerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnrefresh = scenario("refreshSimulation")
        .exec(http("refresh")
        .httpRequest("POST","/refresh")
)

    // Run scnrefresh with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnrefresh.inject(
        rampUsersPerSec(1) to(refreshPerSecond) during(rampUpSeconds),
        constantUsersPerSec(refreshPerSecond) during(durationSeconds),
        rampUsersPerSec(refreshPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnsiginout = scenario("siginoutSimulation")
        .exec(http("siginout")
        .httpRequest("POST","/signout")
)

    // Run scnsiginout with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnsiginout.inject(
        rampUsersPerSec(1) to(siginoutPerSecond) during(rampUpSeconds),
        constantUsersPerSec(siginoutPerSecond) during(durationSeconds),
        rampUsersPerSec(siginoutPerSecond) to(1) during(rampDownSeconds)
    )

    
    val scnvalidate = scenario("validateSimulation")
        .exec(http("validate")
        .httpRequest("POST","/validate")
)

    // Run scnvalidate with warm up and reach a constant rate for entire duration
    scenarioBuilders += scnvalidate.inject(
        rampUsersPerSec(1) to(validatePerSecond) during(rampUpSeconds),
        constantUsersPerSec(validatePerSecond) during(durationSeconds),
        rampUsersPerSec(validatePerSecond) to(1) during(rampDownSeconds)
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
