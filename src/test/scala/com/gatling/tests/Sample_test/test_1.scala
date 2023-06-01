package com.gatling.tests.Sample_test

import io.gatling.http.Predef._
import io.gatling.core.Predef._


class test_1 extends Simulation{

  val httpProtocol =http
    .baseUrl("https://www.automationexercise.com/")
    .acceptLanguageHeader("en-US,en;q=0.5")
    .acceptEncodingHeader("gzip, deflate")
    .userAgentHeader("Mozilla/5.0 (Windows NT 5.1; rv:31.0) Gecko/20100101 Firefox/31.0")

  val scn = scenario("Register several users")


}

