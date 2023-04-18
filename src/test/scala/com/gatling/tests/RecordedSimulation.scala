package com.gatling.tests

import scala.concurrent.duration._

import io.gatling.core.Predef._
import io.gatling.http.Predef._
import io.gatling.jdbc.Predef._

class RecordedSimulation extends Simulation {

	val httpProtocol = http
		.baseUrl("https://b.6sc.co")
		.inferHtmlResources(BlackList(""".*\.js""", """.*\.css""", """.*\.gif""", """.*\.jpeg""", """.*\.jpg""", """.*\.ico""", """.*\.woff""", """.*\.woff2""", """.*\.(t|o)tf""", """.*\.png""", """.*detectportal\.firefox\.com.*"""), WhiteList())

	val headers_0 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "document",
		"sec-fetch-mode" -> "navigate",
		"sec-fetch-site" -> "cross-site",
		"sec-fetch-user" -> "?1",
		"upgrade-insecure-requests" -> "1",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_1 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"origin" -> "https://stackoverflow.co",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_2 = Map(
		"accept" -> "text/html,application/xhtml+xml,application/xml;q=0.9,image/avif,image/webp,image/apng,*/*;q=0.8,application/signed-exchange;v=b3;q=0.7",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"purpose" -> "prefetch",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_6 = Map(
		"accept" -> "application/json",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"origin" -> "https://stackoverflow.co",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_7 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-origin",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_11 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "script",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_15 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_17 = Map(
		"accept" -> "*/*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"content-type" -> "text/plain;charset=UTF-8",
		"dnt" -> "1",
		"origin" -> "https://stackoverflow.co",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_19 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36",
		"x-client-data" -> "CKO1yQEIk7bJAQimtskBCMS2yQEIqZ3KAQi3kssBCJahywEIhaDNAQi9os0B")

	val headers_22 = Map(
		"accept" -> "*",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"origin" -> "https://stackoverflow.co",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "empty",
		"sec-fetch-mode" -> "cors",
		"sec-fetch-site" -> "cross-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

	val headers_25 = Map(
		"accept" -> "image/avif,image/webp,image/apng,image/svg+xml,image/*,*/*;q=0.8",
		"accept-encoding" -> "gzip, deflate, br",
		"accept-language" -> "en-US,en;q=0.9,uk;q=0.8",
		"dnt" -> "1",
		"sec-ch-ua" -> """Chromium";v="112", "Google Chrome";v="112", "Not:A-Brand";v="99""",
		"sec-ch-ua-mobile" -> "?0",
		"sec-ch-ua-platform" -> "Windows",
		"sec-fetch-dest" -> "image",
		"sec-fetch-mode" -> "no-cors",
		"sec-fetch-site" -> "same-site",
		"user-agent" -> "Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/112.0.0.0 Safari/537.36")

    val uri01 = "https://c.6sc.co"
    val uri02 = "https://wt-lib-v5-6.webtrends-optimize.workers.dev"
    val uri04 = "https://t.co/i/adsct"
    val uri05 = "https://px.ads.linkedin.com/collect"
    val uri06 = "https://cdn.cookielaw.org"
    val uri07 = "https://ots.webtrends-optimize.com/ots/ots/js-5.0/2350641"
    val uri08 = "https://cdn.stackoverflow.co/images/jo7n4k8s/production"
    val uri09 = "https://jo7n4k8s.api.sanity.io/v2021-10-21/data/query/production"
    val uri10 = "https://www.googleadservices.com/pagead/conversion/961466557"
    val uri11 = "https://stackoverflow.co"
    val uri12 = "https://googleads.g.doubleclick.net/pagead/viewthroughconversion/961466557"
    val uri13 = "https://cdn.linkedin.oribi.io/partner/19337/domain/stackoverflow.co/token"
    val uri14 = "https://ipv6.6sc.co"
    val uri15 = "https://www.google.com/pagead/1p-conversion/961466557"
    val uri16 = "https://geolocation.onetrust.com/cookieconsentpub/v1/geo/location"

	val scn = scenario("RecordedSimulation")
		.exec(http("request_0")
			.get(uri11 + "/teams")
			.headers(headers_0)
			.resources(http("request_1")
			.get(uri06 + "/consent/d06435e0-17fb-4659-9a14-1930a6e0be80/d06435e0-17fb-4659-9a14-1930a6e0be80.json")
			.headers(headers_1),
            http("request_2")
			.get(uri11 + "/public/product/audience.2681f3a8.svg")
			.headers(headers_2),
            http("request_3")
			.get(uri11 + "/public/product/talent.55376662.svg")
			.headers(headers_2),
            http("request_4")
			.get(uri11 + "/public/product/bg-dot.77e7df33.svg")
			.headers(headers_2),
            http("request_5")
			.get(uri11 + "/public/product/bg-dot.77e7df33.svg"),
            http("request_6")
			.get(uri16)
			.headers(headers_6),
            http("request_7")
			.get(uri11 + "/img/product/teams/bg-bit-dark.svg")
			.headers(headers_7),
            http("request_8")
			.get(uri11 + "/img/product/teams/bg-bit-orange.svg")
			.headers(headers_7),
            http("request_9")
			.get(uri11 + "/img/product/teams/bg-bit-light.svg")
			.headers(headers_7),
            http("request_10")
			.get(uri11 + "/img/product/teams/teams-integrations-spot.svg")
			.headers(headers_7),
            http("request_11")
			.get(uri02 + "/")
			.headers(headers_11),
            http("request_12")
			.get(uri11 + "/img/product/teams/teams-footer-cta.svg")
			.headers(headers_7),
            http("request_13")
			.get(uri01 + "/")
			.headers(headers_1),
            http("request_14")
			.get(uri06 + "/consent/d06435e0-17fb-4659-9a14-1930a6e0be80/3ff0d893-dd61-4a62-9775-34d7ac25774b/en.json")
			.headers(headers_1),
            http("request_15")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=null&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=a_pageload&q=%7B%22pageLoadTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A28%20GMT%22%2C%22settings%22%3A%22%5B%7B%5C%22name%5C%22%3A%5C%22enableEventTracking%5C%22%2C%5C%22value%5C%22%3A%5C%22true%5C%22%2C%5C%22dateTime%5C%22%3A%5C%22Tue%2C%2018%20Apr%202023%2014%3A10%3A28%20GMT%5C%22%2C%5C%22timeSincePageLoad%5C%22%3A%5C%220%5C%22%7D%2C%7B%5C%22name%5C%22%3A%5C%22setToken%5C%22%2C%5C%22value%5C%22%3A%5C%227e42ecdcd598d8c96281bc6eb0940428%5C%22%2C%5C%22dateTime%5C%22%3A%5C%22Tue%2C%2018%20Apr%202023%2014%3A10%3A28%20GMT%5C%22%2C%5C%22timeSincePageLoad%5C%22%3A%5C%220%5C%22%7D%2C%7B%5C%22name%5C%22%3A%5C%22setEndpoint%5C%22%2C%5C%22value%5C%22%3A%5C%22b.6sc.co%5C%22%2C%5C%22dateTime%5C%22%3A%5C%22Tue%2C%2018%20Apr%202023%2014%3A10%3A28%20GMT%5C%22%2C%5C%22timeSincePageLoad%5C%22%3A%5C%220%5C%22%7D%5D%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_16")
			.get(uri14 + "/")
			.headers(headers_1),
            http("request_17")
			.post(uri07 + "/")
			.headers(headers_17)
			.body(RawFileBody("com/gatling/tests/recordedsimulation/0017_request.txt")),
            http("request_18")
			.get(uri04 + "?p_id=Twitter&p_user_id=0&txn_id=o3b90&events=%5B%5B%22pageview%22%2Cnull%5D%5D&tw_sale_amount=0&tw_order_quantity=0&type=image&version=1.1.0")
			.headers(headers_15),
            http("request_19")
			.get(uri10 + "/?guid=ON&script=0&random=49494452359976&url=https://stackoverflow.co/teams/")
			.headers(headers_19),
            http("request_20")
			.get(uri06 + "/scripttemplates/6.37.0/assets/otFloatingRoundedCorner.json")
			.headers(headers_1),
            http("request_21")
			.get(uri09 + "?query=%20%0A%20%20*%5B_type%20%3D%3D%20%22customer%22%20%26%26%20product%5B%5D-%3Eslug.current%20match%20%22teams%22%20%26%26%20carousel%20%3D%3D%20true%5D%20%7B%0A%20%20%20%20_id%2C%0A%20%20%20%20name%2C%0A%20%20%20%20image%0A%20%20%7D%0A")
			.headers(headers_6),
            http("request_22")
			.get(uri13)
			.headers(headers_22),
            http("request_23")
			.get(uri12 + "/?guid=ON&script=0&random=1999201728&url=https://stackoverflow.co/teams/&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&ocp_id=1KQ-ZODcKJfE7_UP9saAkA0&sscte=1&crd=KAE")
			.headers(headers_19),
            http("request_24")
			.get(uri05 + "?v=2&fmt=js&pid=19337&time=1681827029281&url=https%3A%2F%2Fstackoverflow.co%2Fteams%2F")
			.headers(headers_15),
            http("request_25")
			.get(uri08 + "/acdc9477bbb591618777d6464cb7412fcdb3edc1-165x41.svg?auto=format")
			.headers(headers_25),
            http("request_26")
			.get(uri08 + "/83a2ce7a80f20c5b78c941d5acf57624548691dd-217x40.svg?auto=format")
			.headers(headers_25),
            http("request_27")
			.get(uri08 + "/87f6a35b5b34b08e293d965b8aca21f4b1a4f885-123x28.svg?auto=format")
			.headers(headers_25),
            http("request_28")
			.get(uri08 + "/7795d036597430c7825f03a40b35ab53b92c39b3-102x55.svg?auto=format")
			.headers(headers_25),
            http("request_29")
			.get(uri08 + "/d4733a934a5104ac45c14d108cd37b425afdddf4-220x44.svg?auto=format")
			.headers(headers_25),
            http("request_30")
			.get(uri08 + "/0b8428147651a934888f818b26db3044daa62f20-139x43.svg?auto=format")
			.headers(headers_25),
            http("request_31")
			.get(uri08 + "/6b3daf9ee3910d99348126c9fe4435909c18cd39-151x66.svg?auto=format")
			.headers(headers_25),
            http("request_32")
			.get(uri08 + "/b90ff39d33a71c10861c70f5feab093cafb5d230-155x47.svg?auto=format")
			.headers(headers_25),
            http("request_33")
			.get(uri15 + "/?guid=ON&script=0&random=1999201728&url=https://stackoverflow.co/teams/&ctc_id=CAIVAgAAAB0CAAAA&ct_cookie_present=false&sscte=1&crd=KAE&is_vtc=1&ocp_id=1KQ-ZODcKJfE7_UP9saAkA0&cid=CAQSKQBygQiDmBQ28jRAwSIl1vqsCP0M6zZ-1SmytLnPsc1VFTndYrIfgLa4&random=2155372407")
			.headers(headers_19),
            http("request_34")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A29%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A28%20GMT%22%2C%22timeSpent%22%3A%221091%22%2C%22totalTimeSpent%22%3A%221091%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_35")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A30%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A29%20GMT%22%2C%22timeSpent%22%3A%221011%22%2C%22totalTimeSpent%22%3A%222102%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_36")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A31%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A30%20GMT%22%2C%22timeSpent%22%3A%221006%22%2C%22totalTimeSpent%22%3A%223108%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_37")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A32%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A31%20GMT%22%2C%22timeSpent%22%3A%221006%22%2C%22totalTimeSpent%22%3A%224114%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_38")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A33%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A32%20GMT%22%2C%22timeSpent%22%3A%221004%22%2C%22totalTimeSpent%22%3A%225118%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_39")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A34%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A33%20GMT%22%2C%22timeSpent%22%3A%221001%22%2C%22totalTimeSpent%22%3A%226119%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_40")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A35%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A34%20GMT%22%2C%22timeSpent%22%3A%221011%22%2C%22totalTimeSpent%22%3A%227130%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_41")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A36%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A35%20GMT%22%2C%22timeSpent%22%3A%221004%22%2C%22totalTimeSpent%22%3A%228134%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_42")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A37%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A36%20GMT%22%2C%22timeSpent%22%3A%221004%22%2C%22totalTimeSpent%22%3A%229138%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15),
            http("request_43")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A38%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A37%20GMT%22%2C%22timeSpent%22%3A%221008%22%2C%22totalTimeSpent%22%3A%2210146%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15)))
		.pause(2)
		.exec(http("request_44")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A41%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A38%20GMT%22%2C%22timeSpent%22%3A%223004%22%2C%22totalTimeSpent%22%3A%2213150%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15))
		.pause(2)
		.exec(http("request_45")
			.get("/v1/beacon/img.gif?token=7e42ecdcd598d8c96281bc6eb0940428&svisitor=14645e68cb2b000059419b63f801000078b34700&visitor=2e77a847-5cda-48bf-8193-5c39fc585bfb&session=a24be6c6-2940-4acf-8186-0aefda3a22e7&event=active_time_track&q=%7B%22currentTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A44%20GMT%22%2C%22lastTrackTime%22%3A%22Tue%2C%2018%20Apr%202023%2014%3A10%3A41%20GMT%22%2C%22timeSpent%22%3A%223016%22%2C%22totalTimeSpent%22%3A%2216166%22%7D&isIframe=false&m=%7B%22description%22%3A%22Stack%20Overflow%20for%20Teams%20is%20a%20secure%20knowledge%20sharing%20platform%20trusted%20by%20the%20world%E2%80%99s%20largest%20community%20of%20developers%20and%20technologists.%20We%20boost%20team%20productivity%20and%20collaboration%20through%20a%20centralized%20knowledge%20base%20and%20easy%20to%20use%2C%20familiar%20platform.%22%2C%22keywords%22%3A%22%22%2C%22title%22%3A%22Trusted%20Knowledge%20Sharing%20Platform%20for%20Technologists%3A%20Stack%20Overflow%20for%20Teams%20-%20Stack%20Overflow%22%7D&cb=&r=https%3A%2F%2Fstackoverflow.com%2F&thirdParty=%7B%7D&v2=1&pageURL=https%3A%2F%2Fstackoverflow.co%2Fteams%2F&pageViewId=c144c1b9-d6dc-4ec4-8dfd-d8daae71660d")
			.headers(headers_15))

	setUp(scn.inject(atOnceUsers(1))).protocols(httpProtocol)
}