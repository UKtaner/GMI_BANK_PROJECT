package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

public class US_25_Create_Country_step_defs {

    Response response;

    @Given("User get the country list from {string}")
    public void user_get_the_country_list_from(String endpoint) {
        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_bearer_token"))
                .when()
                .get(endpoint);
        response.prettyPrint();
    }




    @Given("user has the {string} for getting the country names list")
    public void user_has_the_for_getting_the_country_names_list(String string) {

    }
    @When("user send a GET request to the API to get the names")
    public void user_send_a_get_request_to_the_api_to_get_the_names() {

    }
    @Then("verifies {string} name is not on the list")
    public void verifies_name_is_not_on_the_list(String string) {

    }
    @Then("content type is JSON")
    public void content_type_is_json() {

    }
    @Then("status code is {int}")
    public void status_code_is(Integer int1) {

    }
}

/*
[
        {
        "id": 24115,
        "name": "China",
        "states": null
        },
        {
        "id": 22347,
        "name": "KENYA",
        "states": null
        }
]
 */

