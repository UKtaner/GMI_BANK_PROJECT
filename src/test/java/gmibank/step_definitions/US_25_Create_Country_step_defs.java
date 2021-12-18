package gmibank.step_definitions;


import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_25_Create_Country_step_defs {

    Response response;
    String endpoint;

    @Given("user has the endpoint {string} and create {string} {string}")
    public void user_has_the_endpoint_and_create(String url, String country, String name) {
        endpoint = url;

        String requestBody = "{ \"" +   name  +  "\":\""+ country+  "\"}";
//{" name ":"country"}

        response = given().headers(
                "Authorization",
                "Bearer " + ConfigReader.getProperty("api_bearer_token"),
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON)
                .body(requestBody)
                .when().post(url);
        response.prettyPrint();

    }

    @Then("verify {string} has been added to the list, status code {int}")
    public void verify_has_been_added_to_the_list_status_code(String country, int code) {
        int actualcode = response.statusCode();

        Assert.assertTrue(response.asString().contains(country));
        Assert.assertEquals(code,actualcode);
    }
}
