package com.gatling.tests.records

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class Login extends Simulation {

	val httpProtocol = http
		.baseUrl("https://opensource-demo.orangehrmlive.com")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())

	val headers_0 = Map(
		"Accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"Cache-Control" -> "max-age=0",
		"DNT" -> "1",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "document",
		"Sec-Fetch-Mode" -> "navigate",
		"Sec-Fetch-Site" -> "same-origin",
		"Sec-Fetch-User" -> "?1",
		"Upgrade-Insecure-Requests" -> "1",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_1 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"Cache-Control" -> "max-age=0",
		"DNT" -> "1",
		"If-None-Match" -> "lJyzdvp9dVw7AABygfsIuOb9dNUb5bV3iXeF0n5J6+s=",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"contentType" -> "application/json",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_4 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-None-Match" -> "6OfKvXfhXT+r9S4zFKMzZPqDCcXxfPqg9ONCBsl7TGc=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_5 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"Cache-Control" -> "no-store, no-cache, must-revalidate, post-check=0, pre-check=0",
		"DNT" -> "1",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_7 = Map(
		"Accept" -> "application/json, text/plain, */*",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_11 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-Modified-Since" -> "Mon, 16 Jan 2023 02:02:00 GMT",
		"If-None-Match" -> "eSWfz0aTMRL2qx3Xp+IS4qMVAXpmiSacwlj2vIk2pmo=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_12 = Map(
		"Accept" -> "application/json",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"Origin" -> "https://opensource-demo.orangehrmlive.com",
		"Sec-Fetch-Dest" -> "empty",
		"Sec-Fetch-Mode" -> "cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_13 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-None-Match" -> "PKYt91djBx4lZuXnl8MZbmZvHlUY+bINcyDMMiahMbc=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_14 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-None-Match" -> "EGLoY66YV3sNs9+0628PM63tKO1k1vSzr0ojsUTOY5U=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_15 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-None-Match" -> "XS6kcumy/ADhfUzk3DW2zNJkpfFTj/j9Oscpsu0eS1Y=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_16 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-None-Match" -> "ECA0owzZBLCTtsVlvoIMX9PEklgQYWi2UHzJDdDVk7M=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")

	val headers_17 = Map(
		"Accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"Accept-Encoding" -> "gzip, deflate, br",
		"Accept-Language" -> "en-US,en;q=0.9,uk;q=0.8",
		"DNT" -> "1",
		"If-None-Match" -> "x9a7tBQumrDC4oPuNRP8X1//Ehqbu0TltKlvsDyUSsc=",
		"Sec-Fetch-Dest" -> "image",
		"Sec-Fetch-Mode" -> "no-cors",
		"Sec-Fetch-Site" -> "same-origin",
		"User-Agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows")



	val scn = scenario("Login")
		.exec(http("request_0")
			.post("/web/index.php/auth/validate")
			.headers(headers_0)
			.formParam("_token", "9bc4c4c96192a6580cba81df01226d66.H91kIbsRsqr5e-Kf-c2Ia8-UofU3IyCFc5c_JBvPyYo.aaRUEPB42NrLK73PgajMKf_lxY8aZRDzSvJ3RnO1gLJHvBQY92HC7KMKjQ")
			.formParam("username", "Admin")
			.formParam("password", "admin123")
			.resources(http("request_1")
			.get("/web/index.php/core/i18n/messages")
			.headers(headers_1),
            http("request_2")
			.get("/web/images/orange.png?1672659722816"),
            http("request_3")
			.get("/web/images/orangehrm-logo.png?1672659722816"),
            http("request_4")
			.get("/web/index.php/pim/viewPhoto/empNumber/7")
			.headers(headers_4),
            http("request_5")
			.get("/web/index.php/api/v2/dashboard/shortcuts")
			.headers(headers_5),
            http("request_6")
			.get("/web/index.php/api/v2/dashboard/employees/leaves?date=2023-04-12")
			.headers(headers_5),
            http("request_7")
			.get("/web/index.php/api/v2/buzz/feed?limit=5&offset=0&sortOrder=DESC&sortField=share.createdAtUtc")
			.headers(headers_7),
            http("request_8")
			.get("/web/index.php/api/v2/dashboard/employees/action-summary")
			.headers(headers_5),
            http("request_9")
			.get("/web/index.php/api/v2/dashboard/employees/time-at-work?timezoneOffset=0&currentDate=2023-04-12&currentTime=13:49")
			.headers(headers_5),
            http("request_10")
			.get("/web/index.php/api/v2/dashboard/employees/subunit")
			.headers(headers_5),
            http("request_11")
			.get("/web/index.php/pim/viewPhoto/empNumber/1")
			.headers(headers_11),
            http("request_12")
			.post("/web/index.php/events/push")
			.headers(headers_12),
            http("request_13")
			.get("/web/index.php/pim/viewPhoto/empNumber/15")
			.headers(headers_13),
            http("request_14")
			.get("/web/index.php/pim/viewPhoto/empNumber/2")
			.headers(headers_14),
            http("request_15")
			.get("/web/index.php/buzz/photo/12")
			.headers(headers_15),
            http("request_16")
			.get("/web/index.php/buzz/photo/11")
			.headers(headers_16),
            http("request_17")
			.get("/web/index.php/pim/viewPhoto/empNumber/22")
			.headers(headers_17),
            http("request_18")
			.get("/web/index.php/api/v2/dashboard/employees/locations")
			.headers(headers_5)))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}