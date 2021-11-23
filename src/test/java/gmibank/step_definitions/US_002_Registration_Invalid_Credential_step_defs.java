package gmibank.step_definitions;

import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

public class US_002_Registration_Invalid_Credential_step_defs {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user navigate to webpage")
    public void user_navigate_to_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @Given("user navigates to menu dropdown and click")
    public void user_navigates_to_menu_dropdown_and_click() {
        registrationPage.menuDropDown.click();

    }
    @Given("user selects  Register button")
    public void user_selects_register_button() {
        registrationPage.registerButton.click();

    }
    @Given("user selects to SSN box and be left blank")
    public void user_selects_to_ssn_box_and_be_left_blank() {
        registrationPage.ssnTextBox.click();
        registrationPage.ssnTextBox.sendKeys("");

    }
    @Then("user should see {string} error message")
    public void user_should_see_error_message(String ssnErrorMessage) {
        Assert.assertTrue(registrationPage.ssnErrorMessage.isDisplayed());
            //???
    }
    @Given("user enters invalid SSN that contains character or space")
    public void user_enters_invalid_ssn_that_contains_character_or_space() {
        registrationPage.ssnTextBox.click();
        registrationPage.ssnTextBox.sendKeys("123abc/"+ Keys.ENTER);

    }

    @Then("user  should see error message")
    public void userShouldSeeErrorMessage() {
        Assert.assertTrue(registrationPage.ssnErrorMessage.isDisplayed());

    }
}
