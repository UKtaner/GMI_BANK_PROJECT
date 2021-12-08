package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.*;

public class US_24_Create_new_States_step_defs {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    StatePojo actualData = new StatePojo();



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
                // body(data).
                        post(url).then().contentType(ContentType.JSON).extract().response();
        response.prettyPrint();

        actualData = response.as(StatePojo.class);
        System.out.println(actualData);

    }

        @Then("verify if state is created")
        public void verify_if_state_is_created() {
        Assert.assertTrue(response.getStatusCode()==201);
        Assert.assertEquals("Expected Data doesn't match with actual Data","BC", actualData.getName());

    }

}
