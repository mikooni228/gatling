package com.gatling.tests.records

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class LoginEditLogout extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.acceptHeader("image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8")
		.acceptEncodingHeader("gzip, deflate")
		.acceptLanguageHeader("en-US,en;q=0.9,uk;q=0.8")
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_1 = Map(
		"Accept" -> "application/json",
		"Cache-Control" -> "no-cache",
		"If-None-Match" -> "lJyzdvp9dVw7AABygfsIuOb9dNUb5bV3iXeF0n5J6+s=",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"contentType" -> "application/json",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_2 = Map(
		"Cache-Control" -> "no-cache",
		"Pragma" -> "no-cache",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("LoginEditLogout")
		.exec(http("request_0")
			.get("/web/index.php/auth/logout")
			.headers(headers_0)
			.resources(http("request_1")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_1),
            http("request_2")
			.get("/web/dist/img/blob.svg")
			.headers(headers_2),
            http("request_3")
			.get("/web/images/ohrm_branding.png?1672659722816")
			.headers(headers_2)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}