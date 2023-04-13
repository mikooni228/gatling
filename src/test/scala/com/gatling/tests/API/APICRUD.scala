package com.gatling.tests.API

import io.gatling.core.Predef._
import io.gatling.http.Predef._

class APICRUD extends Simulation{

  //protocol
  val httpProtocol =http
    .baseUrl("https://reqres.in/api")

  //scenario

  val createUserScn = scenario("Create User")
    .exec(
      http("Create User Request")
        .post("/users")
        .header("content-type", "applications/json")
        .asJson
        .body(RawFileBody("data/user_data.json"))
        .check(
          status is 201,
          jsonPath("$.name") is "morpheus"
        )
    )
    .pause("2")

  val updateUserScn = scenario("Update User Put")
    .exec(
      http("Update User Request Put")
        .put("/users/2")
        .body(RawFileBody("data/user_data.json")).asJson
        .check(
          status is 200,
          jsonPath("$.name") is "morpheus"
        )
    )
    .pause("1")

  val updateUserScn1 = scenario("Update User Patch")
    .exec(
      http("Update User Request Patch")
        .patch("/users/2")
        .body(RawFileBody("data/user_data.json")).asJson
        .check(
          status is 201,
          jsonPath("$.job") is "leader"
        )
    )
    .pause("2")

  val deleteUserScn = scenario("Delete User")
    .exec(
      http("Delete User Request")
        .delete("/users/2")
        .check(status is 204)
    )
  //setup
  setUp(
    createUserScn.inject(rampUsers(15).during(10)),
    updateUserScn.inject(rampUsers(9).during(4)),
    updateUserScn1.inject(rampUsers(11).during(6)),
    deleteUserScn.inject(rampUsers(20).during(13))
  ).protocols(httpProtocol)


}