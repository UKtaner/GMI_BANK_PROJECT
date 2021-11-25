package gmibank.step_definitions;

import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class US_002_Registration_Invalid_Credential_step_defs {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user goes the GMI-bank webpage")
    public void user_goes_the_gmi_bank_webpage() {
      Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }
    @Given("user goes to menu dropdown and click")
    public void user_goes_to_menu_dropdown_and_click() {
        registrationPage.menuDropDown.click();

    }
    @Given("user clicks  Register button")
    public void user_clicks_register_button() {
        registrationPage.registerButton.click();

    }
    @Given("user selects to SSN box and be left blank")
    public void user_selects_to_ssn_box_and_be_left_blank() {
        registrationPage.ssnTextBox.click();
        registrationPage.ssnTextBox.sendKeys(""+Keys.ENTER);

    }
    @Then("user should see {string} error message")
    public void user_should_see_error_message(String ssnTextBoxErrorMessage) {
        registrationPage.ssnErrorMessage.isDisplayed();

    }
    @Given("user enters invalid SSN that contains character or space")
    public void user_enters_invalid_ssn_that_contains_character_or_space() {
        registrationPage.ssnTextBox.click();
        registrationPage.ssnTextBox.sendKeys("123abc/"+Keys.ENTER);

    }
    @When("user enters Phone Number that contains character or space")
    public void user_enters_phone_number_that_contains_character_or_space() {
        registrationPage.phoneNumberTextBox.click();
        registrationPage.phoneNumberTextBox.sendKeys("076abc/"+Keys.ENTER);

    }
    @Then("user should be able to see {string} error message")
    public void user_should_be_able_to_see_error_message(String phoneNumberErrorMessage) {
        registrationPage.phoneNumberErrorMessage.isDisplayed();


    }
    @When("user enters email without {string} and {string}")
    public void user_enters_email_without_and(String tag, String point) {
        registrationPage.emailTextBox.click();
        registrationPage.emailTextBox.sendKeys("flowercom"+Keys.ENTER);

    }
    @Then("user should see  {string} this error message.")
    public void user_should_see_this_error_message(String emailTextBoxErrorMessage) {
        registrationPage.emailErrorMessage.isDisplayed();

    }

    }
