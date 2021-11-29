package gmibank.step_definitions;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_003_StepDefinitions {

    RegistrationPage registrationPage = new RegistrationPage();

    @Then("user sends {string}")
    public void userSends(String arg0) {
        registrationPage.newPasswordBox.sendKeys("9876a68");
    }

    @Then("verify bar is orange")
    public void verifyBarIsOrange() {
        Assert.assertTrue(registrationPage.orangePassword.isDisplayed());
    }


    @Then("user send {string}")
    public void userSend(String arg0) {
        registrationPage.newPasswordBox.sendKeys("*98jgjt");

    }


    @Then("verify bar is yellow")
    public void verifyBarIsYellow() {
        Assert.assertTrue(registrationPage.yellowPassword.isDisplayed());

    }

    @Then("verify bar is green")
    public void verifyBarIsGreen() {
        Assert.assertTrue(registrationPage.greenPassword.isDisplayed());
    }

    @Then("user send to {string}")
    public void userSendTo(String arg0) {
        registrationPage.newPasswordBox.sendKeys("9876A68");

    }

    @Then("user sends a {string}")
    public void userSendsA(String arg0) {
        registrationPage.newPasswordBox.sendKeys(arg0);

    }

    @Then("user send the {string}")
    public void userSendThe(String str) {
        registrationPage.newPasswordBox.sendKeys(str);

    }
}

