package gmibank.step_definitions;

import gmibank.pojos.States;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import io.restassured.response.Response;

import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_22_StateValidation {
    Response response;
    States actualData=new States();
    @Given("User read the state from {string} and extension {string}")
    public void user_read_the_state_from_and_extension(String endpoint, String id) {
        response = given().headers(
                    "Authorization",
                "Bearer " + ReusableMethods.generateToken())
                .when()
                .get(endpoint+id);
        response.prettyPrint();

        actualData = response.as(States.class);
        System.out.println(actualData);
    }
    @Then("User validates the {string}")
    public void user_validates_the(String state) {
        Assert.assertTrue(response.getStatusCode()==200);
        Assert.assertTrue(actualData.getName().equals(state));
    }
}
