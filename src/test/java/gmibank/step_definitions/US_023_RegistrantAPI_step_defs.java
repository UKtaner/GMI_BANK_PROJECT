package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;
import org.junit.Assert;


import java.net.URL;
import java.util.List;
import java.util.Map;

import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.urlEncodingEnabled;

public class US_023_RegistrantAPI_step_defs {


    List<Map<String,Object>> allApplicants;
    Response response;
    JsonPath json;
    @Given("Given  user go to api end point registrations {string}")
    public void given_user_go_to_api_end_point_registrations(String endpoint) {
        response=given().accept(ContentType.JSON)
                .auth()
                .oauth2(ConfigReader.getProperty("api_bearer_token_registrant"))
                .when()
                .get(endpoint);

    }
    @Given("user get all registrations data and De-Serialization the data to java")
    public void user_get_all_registrations_data_and_de_serialization_the_data_to_java() {
        json=response.jsonPath();
        allApplicants=json.getList("$");
        System.out.println(allApplicants.get(0));

    }
    @Then("user validates {int}.th registrations info")
    public void user_validates_th_registrations_info(Integer int1) {
        String expectedData="345-342-3423";
        Assert.assertEquals(expectedData,allApplicants.get(0).get("mobilePhoneNumber"));
        System.out.println(allApplicants.get(0).get("mobilePhoneNumber"));
    }
}
