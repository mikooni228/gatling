package com.gatling.tests.records

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Orange extends Simulation {

	val httpProtocol = http
		.baseUrl("http://www.gstatic.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9,uk;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive")



	val scn = scenario("Orange")
		.exec(http("request_0")
			.get("/generate_204")
			.headers(headers_0))
		.pause(84)
		.exec(http("request_1")
			.get("/generate_204")
			.headers(headers_0))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}