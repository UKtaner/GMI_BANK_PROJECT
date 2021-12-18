package gmibank.step_definitions;

import gmibank.pojos.States;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class US_24_Create_new_States_step_defs {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    States actualData = new States();



    @Given("user sets the response api {string} and create state using {string} and {string}")
    public void user_sets_the_response_api_and_create_state_using_and(String url, String id, String name) {


        response = given().headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when().
                body("{\"countryId\":" + id + ",\"name\":\"" + name + "\"}").
                post(url).
                then().
                contentType(ContentType.JSON).
                extract().response();

        response.prettyPrint();

        actualData = response.as(States.class);
        System.out.println(actualData);

    }

    @Then("verify if {string} is created")
    public void verify_if_is_created(String name) {
        Assert.assertTrue(response.getStatusCode()==201);
        Assert.assertEquals("Expected Data doesn't match with actual Data", name, actualData.getName());

    }

}
