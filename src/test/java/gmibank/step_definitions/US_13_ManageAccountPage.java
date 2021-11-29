package gmibank.step_definitions;

import gmibank.pages.LoginPage;
import gmibank.pages.ManageAccountPage;
import gmibank.pages.RegistrationPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.KeyDownAction;
//import sun.jvm.hotspot.types.CIntegerField;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Map;


public class US_13_ManageAccountPage {
    ManageAccountPage manageAccountPage = new ManageAccountPage();
    RegistrationPage registrationPage = new RegistrationPage();



    @Given("user Sign in with user credentials")
    public void user_sign_in_with_user_credentials() {

        Driver.getDriver().get("www.gmibank.com");
        ReusableMethods.waitFor(2);
        //ReusableMethods.waitForVisibility(manageAccountPage.newIcon,5);
        manageAccountPage.newIcon.click();
        ReusableMethods.waitFor(2);
        manageAccountPage.signInMenu.click();
        ReusableMethods.waitFor(2);
        manageAccountPage.userName.sendKeys("team3user");
        ReusableMethods.waitFor(2);
        manageAccountPage.passWord.sendKeys("Team3user.");
        ReusableMethods.waitFor(2);
        manageAccountPage.signInButton.click();


    }
    @Given("user click “My Operations” and select “Manage Accounts”")
    public void user_click_my_operations_and_select_manage_accounts() {
        ReusableMethods.waitFor(2);
        manageAccountPage.myOperationsMenu.click();
        ReusableMethods.waitFor(2);
        manageAccountPage.manageAccountsMenu.click();

    }
    @Given("user Click “+Create a new Account” button")
    public void user_click_create_a_new_account_button() {
        ReusableMethods.waitFor(2);
        manageAccountPage.createNewAccountButton.click();

    }
    @When("User should not fill “description” area.")
    public void user_should_not_fill_description_area() {
        manageAccountPage.descriptionBox.click();

    }
    @When("user enter {int} in “Balance” box")
    public void user_enter_in_balance_box(Integer int1) {
        manageAccountPage.balanceBox.clear();
        manageAccountPage.balanceBox.sendKeys("5000");



    }
    @When("User click “Save” button.")
    public void user_click_save_button() {
        manageAccountPage.saveButton.click();

    }
    @Then("user verifies “This field is required.” message should show up under the Description box")
    public void user_verifies_this_field_is_required_message_should_show_up_under_the_description_box() {
        Assert.assertTrue(manageAccountPage.thisFieldRequiredMessageDescription.getText().contains("This field is required."));


    }

    @When("User should fill “description” area.")
    public void user_should_fill_description_area() {
        manageAccountPage.descriptionBox.sendKeys("New Customer");



    }
    @Then("User verifies successfull pop up message on the page")
    public void user_verifies_successfull_pop_up_message_on_the_page() {
        String popUpText= manageAccountPage.successpopUp.getText();
        Assert.assertTrue(popUpText.contains("translation-not-found"));



    }

    @When("user should not enter any value in “Balance” box")
    public void user_should_not_enter_any_value_in_balance_box() {
        manageAccountPage.balanceBox.sendKeys("5000");

    }
    @Then("user verifies “This field is required.” message should show up under the “Balance” box")
    public void user_verifies_this_field_is_required_message_should_show_up_under_the_balance_box() {
        Assert.assertTrue(manageAccountPage.thisFieldRequiredMessageBalance.getText().contains("This field is required."));

    }


    @When("user should enter {int} in “Balance” box")
    public void user_should_enter_in_balance_box(Integer int1) {
        ReusableMethods.waitFor(2);
        Assert.assertEquals(int1,manageAccountPage.balanceBox.getAttribute("value"));


    }


    @When("User select account type as a “SAVING” from “account type” box")
    public void user_select_account_type_as_a_saving_from_account_type_box() {
        ReusableMethods.waitFor(2);
        Select accountType= new Select(manageAccountPage.accountTypeDropdown);
        accountType.selectByIndex(1);
//        manageAccountPage.accountTypeDropdown.click();
//        ReusableMethods.waitFor(2);
//        Actions actions = new Actions(Driver.getDriver());
//        actions.sendKeys(Keys.ARROW_DOWN).perform();


    }



    @When("User select  as “SUSPENDED” from “account status type” box")
    public void user_select_as_suspended_from_account_status_type_box() {
        manageAccountPage.accountStatusTypeDropdown.click();
        ReusableMethods.waitFor(2);
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.ARROW_DOWN).perform();


    }

    @When("User select  as “ACTIVE” from “account status type” box")
    public void user_select_as_active_from_account_status_type_box() {
        ReusableMethods.waitFor(2);
        manageAccountPage.accountStatusTypeDropdown.click();



    }
    @When("user click and select an employee from “Employee”dropdown")
    public void user_click_and_select_an_employee_from_employee_dropdown() {
        manageAccountPage.employeeDropdown.click();

    }


}
