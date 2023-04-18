package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class re1 extends Simulation {

	val httpProtocol = http
		.baseUrl("http://www.gstatic.com")
		.inferHtmlResources()
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9,uk;q=0.8")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36 Edg/112.0.1722.48")

	val headers_0 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_1 = Map(
		"Accept-Language" -> "en-US,en;q=0.9",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Proxy-Connection" -> "keep-alive",
		"Sec-Mesh-Client-Arch" -> "x86_64",
		"Sec-Mesh-Client-Edge-Channel" -> "stable",
		"Sec-Mesh-Client-Edge-Version" -> "112.0.1722.48",
		"Sec-Mesh-Client-OS" -> "Windows",
		"Sec-Mesh-Client-OS-Version" -> "10.0.19044",
		"Sec-Mesh-Client-WebView" -> "0")

    val uri1 = "http://edge-http.microsoft.com/captiveportal/generate_204"

	val scn = scenario("re1")
		.exec(http("request_0")
			.get("/generate_204")
			.headers(headers_0))
		.pause(24)
		.exec(http("request_1")
			.get(uri1)
			.headers(headers_1))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}