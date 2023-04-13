package com.gatling.tests.records

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class LoginandAbout extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())
		.doNotTrackHeader("1")
		.userAgentHeader("Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")


	val login = exec(http("request_0")
			.post("/web/index.php/auth/validate")
			.formParam("_token", "7ed4bbe4ebb9cfd752f.ss6G40oEPza5pwpc4hz7-HV4iC1c6Ms8HAumfd9Im8I.2ZbloX18cAPSzlgu1HKSyA0A8WkFpv5yRnuLSaYXzaGE_dOyLm53ferAPg")
			.formParam("username", "Admin")
			.formParam("password", "admin123")
			.resources(http("request_1")
			.get("/web/index.php/core/i18n/messages"),
            http("request_2")
			.get("/web/images/orange.png?1672659722816"),
            http("request_3")
			.get("/web/images/orangehrm-logo.png?1672659722816"),
            http("request_4")
			.get("/web/index.php/pim/viewPhoto/empNumber/7"),
            http("request_5")
			.get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=0&currentDate=2023-04-12&currentTime=13:58"),
            http("request_6")
			.get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc"),
            http("request_7")
			.get("/web/index.php/api/v2/dashboard/shortcuts"),
            http("request_8")
			.get("/web/index.php/api/v2/dashboard/employees/leaves?date=2023-04-12"),
            http("request_9")
			.get("/web/index.php/api/v2/dashboard/employees/subunit"),
            http("request_10")
			.get("/web/index.php/api/v2/dashboard/employees/action-summary"),
            http("request_11")
			.post("/web/index.php/events/push"),
            http("request_12")
			.get("/web/index.php/pim/viewPhoto/empNumber/15"),
            http("request_13")
			.get("/web/index.php/pim/viewPhoto/empNumber/2"),
            http("request_14")
			.get("/web/index.php/api/v2/dashboard/employees/locations"),
            http("request_15")
			.get("/web/index.php/pim/viewPhoto/empNumber/22"),
            http("request_16")
			.get("/web/index.php/buzz/photo/12"),
            http("request_17")
			.get("/web/index.php/buzz/photo/11"),
            http("request_18")
			.get("/web/index.php/pim/viewPhoto/empNumber/1")))
		.pause(3)

		val about = exec(http("request_19")
			.get("/web/index.php/api/v2/core/about"))

	val scn = scenario("LoginandAbout").exec(login, about)

	val users = scenario("Users").exec (login)
	val Admins = scenario("Admins").exec (login, about)

	setUp(users.inject(rampUsers(10)during(10)),
		(Admins.inject(rampUsers(10)during(10)))).protocols(httpProtocol)
}