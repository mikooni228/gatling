//Define an optional package to hold the Scala class
package com.gatling.tests.API

//required imports
import io.gatling.core.Predef._
import io.gatling.http.Predef._

//class declaration
class APICRUD extends Simulation{

  //define protocol
  val httpProtocol =http
    .baseUrl("https://reqres.in/api")

  //scenario

  val createUserScn = scenario("Create User") //defined the scenario
    .exec( //method is used to execute an action
      http("Create User Request")
        .post("/users") //http method
        .header("content-type", "applications/json") //header configuration
        .asJson
        .body(RawFileBody("data/user_data.json")) //path to file with data

        //another variant of body

        // .body(StringBody(
        //          """
        //            |{"name":"bob","job":"painter"}
        //          """.stripMargin)).asJson)

        .check(
          status is 201, // check the status code
          jsonPath("$.name") is "morpheus" //check the value in json body
        )
    )
    .pause("2") // pause to simulate the real user behavior

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
    // Injects a given number of users distributed evenly on a time window of a given duration.
  ).protocols(httpProtocol)


}