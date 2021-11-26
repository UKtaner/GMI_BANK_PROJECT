
package gmibank.step_definitions;


import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Keys;





public class US_001_RegistrationPage_step_defs {

    RegistrationPage registrationPage = new RegistrationPage();

    @Given("user goes to webpage")
    public void user_goes_to_webpage() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @Given("user navigates to menu dropdown and click")
    public void user_navigates_to_menu_dropdown_and_click() {
        registrationPage.menuDropDown.click();

    }
    @Given("user select  Register button")
    public void user_select_register_button() {
        registrationPage.registerButton.click();

    }
    @Given("user goes to SSN text box and enters SSN number")
    public void user_goes_to_ssn_text_box_and_enters_ssn_number() {
        registrationPage.ssnTextBox.click();
        registrationPage.ssnTextBox.sendKeys("123-45-6789");

    }
    @Given("user enters first name")
    public void user_enters_first_name() {
        registrationPage.firstNameTextBox.sendKeys("Ali"+Keys.ENTER);

    }
    @Then("user should not see any error message at firstname box")
    public void user_should_not_see_any_error_message_at_firstname_box() {

    }
    @Given("user enters last name")
    public void user_enters_last_name() {
        registrationPage.lastNameTextBox.sendKeys("Can"+Keys.ENTER);

    }
    @Then("user should not see any error message at lastname box")
    public void user_should_not_see_any_error_message_at_lastname_box() {

    }
    @Given("user enters a valid address")
    public void user_enters_a_valid_address() {
        registrationPage.addressTextBox.sendKeys("Mehmet Akif"+Keys.ENTER);

    }
    @Then("user should see an error message at address box")
    public void user_should_see_an_error_message_at_address_box() {
        registrationPage.addressErrorMessage.isDisplayed();

    }
    @Given("user enters phone number")
    public void user_enters_phone_number() {
        registrationPage.phoneNumberTextBox.sendKeys("000-000-0000"+Keys.ENTER);

    }
    @Then("user should see an error message at Phone Number box")
    public void user_should_see_an_error_message_at_phone_number_box() {
        registrationPage.phoneNumberErrorMessage.isDisplayed();

    }
    @Given("user enters Username")
    public void user_enters_username() {
        registrationPage.userNameTextBox.sendKeys("AliCan");

    }
    @Then("user should see an error message at Username box")
    public void user_should_see_an_error_message_at_username_box() {
        Assert.assertTrue(registrationPage.usernameErrorMessage.isDisplayed());

    }
    @Given("user enters Email")
    public void user_enters_email() {
        registrationPage.emailTextBox.sendKeys("AliCan@gmail.com"+Keys.ENTER);

    }
    @Then("user should not see an error message")
    public void user_should_not_see_an_error_message() {

    }

}
