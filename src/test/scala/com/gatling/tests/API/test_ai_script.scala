package com.gatling.tests.API

import io.gatling.core.Predef._
import io.gatling.http.Predef._

import scala.concurrent.duration._
import scala.language.postfixOps
class test_ai_script extends Simulation {

  val baseUrl = "https://example.com"
  val concurrentUsers = 10
  val rampUpDuration = 10
  val testDuration = 120

  val httpProtocol = http
    .baseUrl(baseUrl)
    .acceptHeader("text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
    .doNotTrackHeader("1")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

  val scn = scenario("Load Test Scenario")
    .exec(http("GET /")
      .get("/")
      .check(status.is(200)))

  setUp(
    scn.inject(
      rampUsers(concurrentUsers) during (rampUpDuration seconds),
      constantUsersPerSec(concurrentUsers) during (testDuration seconds)
    )
  ).protocols(httpProtocol)

}
