package gmibank.step_definitions.database_step_defs;

import gmibank.utilities.*;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class DataBaseStep_Defs {
    List <Object>customerSSNIDs;
    String fileName= ConfigReader.getProperty("All_users_Infos");
    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(url,username,password);

    }
    @Given("user sends their query to db and gets related data {string} and {string}")
    public void user_sends_their_query_to_db_and_gets_related_data_and_and_and(String query, String column_name) {
    customerSSNIDs= DatabaseUtility.getColumnData(query,column_name);
        System.out.println(customerSSNIDs);


    }
    @Given("user sets DB data into correspondent files")
    public void user_sets_db_data_into_correspondent_files() {
       WriteToTxt.saveAllCustomersComingFromDB(fileName,customerSSNIDs);

    }
    @Then("user validates db data using records")
    public void user_validates_db_data_using_records() {
       List<String>actualSSNIDs= ReadTxt.returnCustomerSNNList("fileName");
       List<String>expectedSSNIDs=new ArrayList<>();
       expectedSSNIDs.add("");
        expectedSSNIDs.add("");

       Assert.assertTrue("The data does not match",actualSSNIDs.containsAll(expectedSSNIDs));

    }

}

