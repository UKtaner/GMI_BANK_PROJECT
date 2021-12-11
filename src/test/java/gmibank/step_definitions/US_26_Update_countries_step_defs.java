package gmibank.step_definitions;

import gmibank.pojos.Country;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.Assert;

import static io.restassured.RestAssured.given;

public class US_26_Update_countries_step_defs {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    Country actualData = new Country();


    @Given("user sets the response api {string} and update country using {string} and {string}")
    public void user_sets_the_response_api_and_update_country_using_and(String url, String id, String name) {

        response = given().headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).
                when().
                body("{\"id\":" + id + ",\"name\":\"" + name + "\"}").
                put(url).then().contentType(ContentType.JSON).extract().response();
        response.prettyPrint();

//        Map<String, Object> actualData = response.as(HashMap.class);
        actualData = response.as(Country.class);
        System.out.println(actualData);

    }

    @Then("verify if country {string} is updated")
    public void verify_if_country_is_updated(String name) {
//        Assert.assertTrue(actualData.getName().equals(name));
        Assert.assertEquals("Expected Data doesn't match with actual Data","USA", actualData.getName());


    }

}
