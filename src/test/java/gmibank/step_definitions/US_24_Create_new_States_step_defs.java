package gmibank.step_definitions;

import gmibank.pojos.StatePojo;
import gmibank.pojos.StateResponsePojo;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.JsonUtil;
import io.cucumber.java.en.*;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.codehaus.jackson.map.ObjectMapper;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static io.restassured.RestAssured.*;

public class US_24_Create_new_States_step_defs {

    Response response;
    String bearerToken = ConfigReader.getProperty("api_bearer_token");
    StatePojo [] states;

//    @Given("the url is {string}")
//    public void the_url_is(String url) {
//        response = given().headers(
//                "Authorization",
//                "Bearer " + bearerToken,
//                "Content-Type",
//                ContentType.JSON,
//                "Accept",
//                ContentType.JSON
//        ).when().get(url).then().contentType(ContentType.JSON).extract().response();
//        response.prettyPrint();
//
//    }
//    @Given("the user can create new state data")
//    public void the_user_can_create_new_state_data() throws Exception {
//
//        ObjectMapper objectMapper = new ObjectMapper();
//        states = objectMapper.readValue(response.asString(),StatePojo[].class);
//        System.out.println(states[1].getName());
//        for(int i=0;i< states.length;i++){
//            if(states[i].getName() ==null){
//                states[i].setName("GloryTeam3");
//                System.out.println(states[i].getName());
//
//
//            }
//
//        }
//
////        StatePojo statePojo=new StatePojo("GloryTeam3",null);
////        System.out.println(statePojo);
////        StateResponsePojo stateResponsePojo= JsonUtil.convertJsonToJava(response.asString(), StateResponsePojo.class);
////
////        System.out.println(stateResponsePojo);
////        Integer stateId=stateResponsePojo.getId();
////        System.out.println(stateId);
//
//
//
//
//
//    }
//    @Given("all state data will be saved to file")
//    public void all_state_data_will_be_saved_to_file() {
//
//    }
//    @Then("verify all state data newly created")
//    public void verify_all_state_data_newly_created() {
//
//    }

    @Given("user sets the response api {string} and create state using {string} and {string}")
    public void user_sets_the_response_api_and_create_state_using_and(String url, String id, String name) {
//
//        Map<String,String>data=new HashMap<>();
//        data.put(id,name);

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

    }

    @Given("user sets the response api {string} and update country using {string} and {string}")
    public void user_sets_the_response_api_and_update_country_using_and(String url, String id, String name) {

        response = given().headers(
                        "Authorization",
                        "Bearer " + bearerToken,
                        "Content-Type",
                        ContentType.JSON,
                        "Accept",
                        ContentType.JSON).when().
                        body("{\"id\":"+id+",\"name\":\""+name+"\"}").
                        put(url).then().contentType(ContentType.JSON).extract().response();


    }
}
