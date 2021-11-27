package gmibank.step_definitions;


import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;

import javax.crypto.KeyAgreementSpi;

public class US_001_RegistrationPage_step_defs {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user navigate to webpage")
    public void user_navigate_to_webpage() throws InterruptedException {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }

    @Given("user navigates to menu dropdown and click")
    public void user_navigates_to_menu_dropdown_and_click() throws InterruptedException {
        registrationPage.menuDropDown.click();

    }

    @Given("user select  Register button")
    public void user_select_register_button() {
        registrationPage.registerButton.click();


    }

    @Given("user goes to SSN box and enters number")
    public void user_goes_to_ssn_box_and_enters_number() throws InterruptedException {
        registrationPage.ssnTextBox.click();
        registrationPage.ssnTextBox.sendKeys("123-45-6789");

    }

    @Given("user enters name")
    public void user_enters_name() throws InterruptedException {
        registrationPage.firstNameTextBox.sendKeys("Ali");

    }

    @Then("user should not see any error message at firstname box")
    public void user_should_not_see_any_error_message_at_firstname_box() {
        // Assert.assertTrue();


    }

    @Given("user enters last name")
    public void user_enters_last_name() throws InterruptedException {
        registrationPage.lastNameTextBox.sendKeys("Can");

    }

    @Then("user should not see any error message at lastname box")
    public void user_should_not_see_any_error_message_at_lastname_box() {

    }

    @Given("user enters a valid address")
    public void user_enters_a_valid_address() throws InterruptedException {
        registrationPage.addressTextBox.sendKeys("Mehmet Akif");

    }

    @Then("user should see an error message at address box")
    public void user_should_see_an_error_message_at_address_box() {

    }

    @Given("user enters phone number")
    public void user_enters_phone_number() throws InterruptedException {
        registrationPage.phoneNumberTextBox.sendKeys("000-000-0000");

    }

    @Then("user should see an error message at Phone Number box")
    public void user_should_see_an_error_message_at_phone_number_box() {

    }

    @Given("user enters Username")
    public void user_enters_username() throws InterruptedException {
        registrationPage.userNameTextBox.sendKeys("AliCan");

    }

    @Then("user should see an error message at Username box")
    public void user_should_see_an_error_message_at_username_box() {

    }

    @Given("user enters Email address")
    public void user_enters_email_address() throws InterruptedException {
        registrationPage.emailTextBox.sendKeys("AliCan@gmail.com");
        Thread.sleep(3000);
    }

    @Then("verify user should not see an error message")
    public void verify_user_should_not_see_an_error_message() {

    }
}

