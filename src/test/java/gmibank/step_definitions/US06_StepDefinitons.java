package gmibank.step_definitions;

import gmibank.pages.LoginPage;
import gmibank.pages.UserInfoPage;
import gmibank.pages.UserManagementPage;
import gmibank.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Map;


public class US06_StepDefinitons {

    LoginPage loginPage = new LoginPage();
    UserInfoPage userInfoPage  = new UserInfoPage();

    @And("user enters user_id and user_password")
    public void userEntersUser_idAndUser_password(DataTable credentials) {
        loginPage.icon.click();
        loginPage.firstSignIn.click();
        List<Map<String,String>> userCredentials= credentials.asMaps(String.class,String.class);
        System.out.println(userCredentials);
        for (Map<String,String> eachCredentials:userCredentials){
            System.out.println(eachCredentials);
            loginPage.username_field.sendKeys(eachCredentials.get("username"));
            loginPage.password_field.sendKeys(eachCredentials.get("password"));
        }
    }


    @Given("User click Sign in button")
    public void user_click_sign_in_button() {
        loginPage.signIn_btn.click();
    }

    @Given("user open account menu")
    public void userOpenAccountMenu() {
        ReusableMethods.waitFor(2);
        userInfoPage.userAccountMenu.click();
    }

    @Given("user click User Info")
    public void user_click_user_ınfo() {
        ReusableMethods.waitFor(2);
        userInfoPage.userInfoLink.click();

    }

    @Then("Verify  the name in the First Name textbox is {string}")
    public void verify_the_name_in_the_first_name_textbox_is(String string) {
        ReusableMethods.waitFor(3);
        Assert.assertEquals(string, userInfoPage.firstNameText.getAttribute("value"));
//        String str=userManagementPage.firstNameText.getAttribute("value");
//        System.out.println(str);
    }

    @Then("Verify  the  last name in the Last Name textbox is   {string}")
    public void verify_the_last_name_in_the_last_name_textbox_is(String string) {
        Assert.assertEquals(string, userInfoPage.lastNameText.getAttribute("value"));
    }

    @Then("Verify  the  email in the Email textbox is  {string}")
    public void verify_the_email_in_the_email_textbox_is(String string) {
        Assert.assertEquals(string, userInfoPage.emailText.getAttribute("value"));
    }

    @Then("Verify  the  selected language is {string}")
    public void verify_the_selected_language_is(String string) {
        Assert.assertTrue(userInfoPage.languageText.getText().contains("English"));
    }

    @Then("Verify languages are available English and Turkish")
    public void verifyLanguagesAreAvailableEnglishAndTurkish() {
        ReusableMethods.waitFor(3);
        ReusableMethods.selectAnItemFromDropdown(userInfoPage.languageText, "Türkçe");
        ReusableMethods.selectAnItemFromDropdown(userInfoPage.languageText, "English");

    }

    @And("Click in the firstname box and type a new firstname")
    public void clickInTheFirstnameBoxAndTypeANewFirstname() {
        userInfoPage.firstNameText.clear();
        userInfoPage.firstNameText.sendKeys("gkcn2");

    }

    @And("user click save in button")
    public void userClickSaveInButton() {
        userInfoPage.saveButton.click();
    }

    @Then("Verify that firstname have been updated")
    public void verifyThatFirstnameHaveBeenUpdated() {
        Assert.assertTrue(userInfoPage.firstNameText.getAttribute("value").contains("gkcn2"));
    }

    @And("Click in the lastname box and type a new lastname")
    public void clickInTheLastnameBoxAndTypeANewLastname() {
        userInfoPage.lastNameText.clear();
        userInfoPage.lastNameText.sendKeys("oz2");
    }

    @Then("Verify that lastname have been updated")
    public void verifyThatLastnameHaveBeenUpdated() {
       Assert.assertTrue(userInfoPage.lastNameText.getAttribute("value").contains("oz2"));

    }

    @And("Click in the email box and type a new email")
    public void clickInTheEmailBoxAndTypeANewEmail() {
        userInfoPage.emailText.clear();
        userInfoPage.emailText.sendKeys("newuser@new.com");
    }

    @Then("verify update by adding  {string} sign and {string} extension to your email")
    public void verifyUpdateByAddingSignAndExtensionToYourEmail(String arg0, String arg1) {
        Assert.assertTrue(userInfoPage.emailText.getAttribute("value").contains(arg0));
        Assert.assertTrue(userInfoPage.emailText.getAttribute("value").contains(arg1));


    }



}
