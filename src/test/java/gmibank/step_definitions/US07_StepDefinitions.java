package gmibank.step_definitions;

import gmibank.pages.LoginPage;
import gmibank.pages.UserInfoPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import java.util.ArrayList;
import java.util.List;

public class US07_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    UserInfoPage userInfoPage = new UserInfoPage();

    @Given("Click in the email box and type a new email not adding @ sign and . extension to your email")
    public void clickInTheEmailBoxAndTypeANewEmailNotAddingSignAndExtensionToYourEmail() {
        userInfoPage.emailText.clear();
        userInfoPage.emailText.sendKeys("newusernewcom");
    }

    @Then("verify that user account can not update with invalid email address")
    public void verify_that_user_account_can_not_update_with_invalid_email_address() {
        ReusableMethods.waitFor(3);
        userInfoPage.invalidEmailFeedback.isDisplayed();
        System.out.println(userInfoPage.invalidEmailFeedback.getText());

    }

    @And("User provide valid username")
    public void userProvideValidUsername() {
        loginPage.icon.click();
        loginPage.firstSignIn.click();

        loginPage.username_field.sendKeys(ConfigReader.getProperty("user_username"));

    }

    @And("User provide valid password")
    public void userProvideValidPassword() {
        loginPage.password_field.sendKeys(ConfigReader.getProperty("user_password"));
    }

    @And("user give an option language dropdown")
    public void userGiveAnOptionLanguageDropdown() {
        ReusableMethods.waitFor(3);
        ReusableMethods.selectAnItemFromDropdown(userInfoPage.languageText, "Türkçe");
    }

    @Then("verify that there is no option other than English and Turkish")
    public void verifyThatThereIsNoOptionOtherThanEnglishAndTurkish() {
        List<String> actualList = new ArrayList<>();
        actualList.add(0, userInfoPage.english.getText());
        actualList.add(1, userInfoPage.turkce.getText());
        System.out.println(actualList);
        List<String> expectedList = new ArrayList<>();
        expectedList.add(0, "English");
        expectedList.add(1, "Türkçe");
        System.out.println(expectedList);
        Assert.assertEquals(expectedList, actualList);

    }

    @Then("user Sign out")
    public void userSignOut() {
        userInfoPage.userIconAfterLogin.click();
        userInfoPage.signOut.click();
    }
}
