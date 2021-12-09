package gmibank.step_definitions;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import gmibank.pojos.Customer9;
import gmibank.utilities.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;
import static io.restassured.RestAssured.given;


public class CustomerApiSteps {

Response response;
String bearerToken = ConfigReader.getProperty("api_bearer_token");

Customer9[] customers;

    @Given("user uses api end point {string} to get all customer data")
    public void user_uses_api_end_point_to_get_all_customer_data(String url) {

        response = given().headers(
                "Authorization",
                "Bearer" + bearerToken,
                "Content-Type",
                ContentType.JSON,
                "Accept",
                ContentType.JSON).
                when()
                .get(url)
                .then()
                .contentType(ContentType.JSON)
                .extract()
                .response();

        response.prettyPrint();





    }


    @Given("user should get all customer data and deserialized the data to java")
    public void user_should_get_all_customer_data_and_deserialized_the_data_to_java() throws JsonProcessingException {

      ObjectMapper obj = new ObjectMapper();
        customers = obj.readValue(response.asString(),Customer9[].class);
//        System.out.println(customers[1].getFirstName());
//        System.out.println(customers[1].getLastName());
//        System.out.println(customers[1].getCountry());
//
//        for(int i=0; i< customers.length; i++){
//           System.out.println(customers[i].getSsn());
//            if(customers[i].getCountry() !=null){
//                System.out.println(customers[i].getCountry().getName());

//                if(customers[i].getUser() !=null){
//                    System.out.println(customers[i].getUser().getFirstName);
//                }
            }
       // }


   // }
    @Given("user saves the customer data to correspondent files")
    public void user_saves_the_customer_data_to_correspondent_files() {

    }
    @Then("user needs to validate all customer api data")
    public void user_needs_to_validate_all_customer_api_data() {
        List<String> expectedSsnIds = new ArrayList<>();

    }

}
