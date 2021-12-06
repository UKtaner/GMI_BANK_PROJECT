package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;

import static io.restassured.RestAssured.*;

public class US_24_Create_new_States_step_defs {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    StatePojo [] states;

    @Given("the url is {string}")
    public void the_url_is(String url) {
        response = given().headers(
                "Authorization",
                "Bearer " + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON
        ).when().get(url).then().contentType(ContentType.JSON).extract().response();

    }
    @Given("the user can create new state data")
    public void the_user_can_create_new_state_data() {

        ObjectMapper objectMapper = new ObjectMapper();
//        states = objectMapper.



    }
    @Given("all state data will be saved to file")
    public void all_state_data_will_be_saved_to_file() {

    }
    @Then("verify all state data newly created")
    public void verify_all_state_data_newly_created() {

    }





//    String emptyStateName;
//
//    emptyStateName + = cus[i].getState.name());
}
