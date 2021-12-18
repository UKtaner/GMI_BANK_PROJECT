package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


import java.net.URL;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.urlEncodingEnabled;

public class US_023_RegistrantAPI_step_defs {


    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token_register");


    @Given("user uses end point {string} to get all customer data")
    public void user_uses_end_point_to_get_all_customer_data(String url) {

        response = given().headers(
                "Authorization",
                "Bearer " + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();
        response.prettyPrint();

    }
    @Given("user should get all register data and deserialize the data to java")
    public void user_should_get_all_register_data_and_deserialize_the_data_to_java() {

    }
    @Given("user saves the register data to correspondent files")
    public void user_saves_the_register_data_to_correspondent_files() {

    }
    @Then("user needs to validate all register api data")
    public void user_needs_to_validate_all_register_api_data() {

    }

}
