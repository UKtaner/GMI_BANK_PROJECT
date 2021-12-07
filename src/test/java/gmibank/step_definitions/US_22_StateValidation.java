package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.response.Response;
import jdk.jfr.ContentType;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_22_StateValidation {
    Response response;
    StatePojo actualData=new StatePojo();
    @Given("User read the state from {string} and extension {string}")
    public void user_read_the_state_from_and_extension(String endpoint, String id) {
        response = given().headers(
                    "Authorization",
                "Bearer " + ConfigReader.getProperty("api_bearer_token"))
                .when()
                .get(endpoint+id);
        response.prettyPrint();
        actualData = response.as(StatePojo.class);
        System.out.println(actualData);
    }
    @Then("User validates the {string}")
    public void user_validates_the(String state) {
        Assert.assertTrue(response.getStatusCode()==200);
        Assert.assertTrue(actualData.getName().equals(state));
    }
}
