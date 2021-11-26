package gmibank.step_definitions;

import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class US17_step_defs {
    @Given("admin on home page")
    public void admin_on_home_page(){
        Driver.getDriver().get(ConfigReader.getProperty("url"));
    }

    @And("admin go login page")
    public void admin_go_login_page(){

    }


}
