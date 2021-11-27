package gmibank.step_definitions;

import gmibank.pages.LoginPage;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginPage_step_defs {


    LoginPage loginPage = new LoginPage();

    @Given("user clicks on sign in button")
    public void user_clicks_on_sign_in_button() {
        loginPage.icon.click();
        loginPage.firstSignIn.click();

    }

    @Given("user enters user id {string}")
    public void user_enters_user_id(String string) {
        loginPage.username_field.sendKeys(string);
    }

    @Given("user enters user password {string}")
    public void user_enters_user_password(String string) {
        loginPage.password_field.sendKeys(string);
    }

    @When("user clicks on the Sign in button")
    public void user_clicks_on_the_sign_in_button() {
        loginPage.signIn_Btn.click();
    }

    @Then("user goes to user login page")
    public void user_goes_to_user_login_page() {
        Assert.assertTrue(loginPage.loginId.getText().contains("Ali Can"));
    }

    @Then("close the connection")
    public void close_the_connection() {
        Driver.closeDriver();
    }


    @Then("user clicks on the Cancel button")
    public void userClicksOnTheCancelButton() {
        loginPage.cancelButton.click();
    }

    @Then("user see error message")
    public void userSeeErrorMessage() {
        ReusableMethods.waitFor(3);
        System.out.println(loginPage.errorMessage.getText());
        Assert.assertEquals(loginPage.errorMessage.getText(), "Failed to sign in!");

    }

    @When("user clicks on {string} button")
    public void userClicksOnButton(String arg0) {
        loginPage.forgetPassword_btn.click();
        loginPage.forgetPassword_btn.click();

    }

    @Then("user enter a valid email")
    public void userEnterAValidEmail() {
        loginPage.resetEmail.sendKeys("seriktuba084@gmail.com");


    }

    @When("user clicks {string} button")
    public void userClicksButton(String arg0) {
        loginPage.resetPassword.click();
    }

    @When("user click on {string} button")
    public void userClickOnButton(String arg0) {
        loginPage.register_btn.click();
        loginPage.register_btn.click();


    }

    @Then("user navigate to registration page")
    public void userNavigateToRegistrationPage() {
        System.out.println(loginPage.registrationVerifyText.getText());
        Assert.assertEquals(loginPage.registrationVerifyText.getText(), "Registration");

    }
}

