package gmibank.step_definitions.database_step_defs;

import gmibank.pojos.Country;
import gmibank.pojos.States;
import gmibank.utilities.*;
import gmibank.utilities.ExcelUtil;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class DataBaseStep_Defs {

    List<Object> idlist;
    List<Object> namelist;
    List<Object> countryList;
    List<Object> stateList;
    String userfileName = ConfigReader.getProperty("user_Info");
    String countryfileName = ConfigReader.getProperty("country_Info");
    String statefileName = ConfigReader.getProperty("state_Info");
    String usa_states = ConfigReader.getProperty("usa_states");


    @Given("user creates a connection with db using {string} , {string} and {string}")
    public void user_creates_a_connection_with_db_using_and(String url, String username, String password) {
        DatabaseUtility.createConnection(url, username, password);

    }

    @Given("user sends their query to db and gets related data {string} , columnName  {string} and next {string}")
    public void user_sends_their_query_to_db_and_gets_related_data_column_name_and_next(String query, String columnName, String columnName2) {
      namelist = DatabaseUtility.getColumnData(query, columnName);
      idlist = DatabaseUtility.getColumnData(query, columnName2);
        System.out.println(namelist);
        System.out.println(idlist);


    }
    @Given("user sets DB data into user file")
    public void user_sets_db_data_into_user_file() {
       WriteToTxt.saveAllCustomersComingFromDB(userfileName,namelist);

    }
    @Then("user validates db data using user records")
    public void user_validates_db_data_using_user_records() {
       List<String>user=  ReadTxt.returnAllCustomersSSNs(userfileName);
       List<String>expectedUser=new ArrayList<>();
        expectedUser.add("Anonymous");
        expectedUser.add("tester");

       Assert.assertTrue("The data does not match",user.containsAll(expectedUser));

    }
    @Given("user sends the query to db and reads related country data {string} and {string}")
    public void user_sends_the_query_to_db_and_reads_related_country_data_and(String query, String column_name) {
        countryList= DatabaseUtility.getColumnData(query,column_name);
        System.out.println(countryList);

    }
    @Given("user sets DB data into country file")
    public void user_sets_db_data_into_country_file() {
      WriteToTxt.saveAllCustomersComingFromDB(countryfileName,countryList);


    }
    @Then("user validates db data using country records")
    public void user_validates_db_data_using_country_records() {
        List<String>country=  ReadTxt.returnAllCustomersSSNs(countryfileName);
        System.out.println("Country_List: "+country);
        List<String>expectedCountry=new ArrayList<>();
        expectedCountry.add("Germanyia");
        System.out.println(expectedCountry);
        expectedCountry.add("USA");
        Assert.assertTrue("The data does not match",country.containsAll(expectedCountry));
    }
    @Given("user sends the query to db and reads all USA states data {string} and {string}")
    public void user_sends_the_query_to_db_and_reads_all_usa_states_data_and(String query, String column_name) {
        stateList= DatabaseUtility.getColumnData(query,column_name);
        System.out.println(stateList);
    }
    @Given("user sets DB data into state file")
    public void user_sets_db_data_into_state_file() {
        WriteToTxt.saveAllCustomersComingFromDB(statefileName,stateList);
    }
    @Then("user validates db data using state records")
    public void user_validates_db_data_using_state_records() {
        List<String>state=  ReadTxt.returnAllCustomersSSNs(statefileName);
        System.out.println(state);
        List<String>expectedState=new ArrayList<>();
        expectedState.add("Virginia");
         List<String>usaStateList=  ReadTxt.returnAllCustomersSSNs(usa_states);
        System.out.println("All_USA_STATES = " + usaStateList);
        Assert.assertTrue("The data does not match",usaStateList.containsAll(expectedState));

    }

}

