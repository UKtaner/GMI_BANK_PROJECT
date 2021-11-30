
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
    @Then("user verify the first name box is not blank")
    public void userVerifyTheFirstNameBoxIsNotBlank() {
        Assert.assertTrue(registrationPage.firstNameTextBox.getAttribute("value").contains("Ali"));
    }

    @Given("user enters last name")
    public void user_enters_last_name() {
        registrationPage.lastNameTextBox.sendKeys("Can"+Keys.ENTER);

    }
    @Then("user verify the last name box is not blank")
    public void userVerifyTheLastNameBoxIsNotBlank() {
        Assert.assertTrue(registrationPage.lastNameTextBox.getAttribute("value").contains("Can"));
    }
    @Given("user enters a valid address")
    public void user_enters_a_valid_address() {
        registrationPage.addressTextBox.sendKeys("Mehmet Akif cad. 26/2"+Keys.ENTER);

    }
    @Then("user verify address text box")
    public void userVerifyAddressTextBox() {
        Assert.assertTrue(registrationPage.addressTextBox.getAttribute("value").contains("Mehmet Akif cad. 26/2"));
    }

    @Given("user enters phone number")
    public void user_enters_phone_number() {
        registrationPage.phoneNumberTextBox.sendKeys("123-456-9999"+Keys.ENTER);

    }
    @Then("user verify the phone number text box")
    public void userVerifyThePhoneNumberTextBox() {
        Assert.assertTrue(registrationPage.phoneNumberTextBox.getAttribute("value").contains("123-456-9999"));
    }

    @Given("user enters Username")
    public void user_enters_username() {
        registrationPage.userNameTextBox.sendKeys("123AliCan");

    }

    @Then("user verify the username text box")
    public void userVerifyTheUsernameTextBox() {
        Assert.assertTrue(registrationPage.userNameTextBox.getAttribute("value").contains("123AliCan"));
    }

    @Given("user enters Email")
    public void user_enters_email() {
        registrationPage.emailTextBox.sendKeys("AliCan@gmail.com"+Keys.ENTER);

    }

    @Then("user verify the email Text box")
    public void userVerifyTheEmailTextBox() {
        Assert.assertTrue(registrationPage.emailTextBox.getAttribute("value").contains("AliCan@gmail.com"));

    }



}