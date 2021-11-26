package gmibank.step_definitions;

import gmibank.pages.CustomersPage;
import gmibank.pages.EditCustomerPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class ManagingCustomerInfo_step_defs {

    LoginPage loginPage = new LoginPage();
    CustomersPage customersPage = new CustomersPage();
    EditCustomerPage editCustomerPage = new EditCustomerPage();

    @Given("user is on the main page")
    public void user_is_on_the_main_page() {
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));

    }
    @Given("user enters employee username")
    public void user_enters_employee_username() {
        loginPage.icon.click();
        loginPage.firstSignIn.click();
        loginPage.username_field.sendKeys(ConfigReader.getProperty("employee_username"));

    }
    @Given("user enters employee password")
    public void user_enters_employee_password() {
        loginPage.password_field.sendKeys(ConfigReader.getProperty("employee_password"));

    }
//    @When("user clicks on the sign in button")
//    public void user_clicks_on_the_sign_in_button() {
//        loginPage.signIn_btn.click();
//
//    }
    @Then("user goes to My Operations dropdown")
    public void user_goes_to_my_operations_dropdown() {
        ReusableMethods.waitForClickablility(loginPage.myOperations,1).click();

    }
    @Then("clicks on Manage Customers")
    public void clicks_on_manage_customers() {
        loginPage.manageCustomers.click();

    }
    @Then("verify the Customer is displayed")
    public void verify_the_customer_is_displayed() {
        String customerHeader = customersPage.customersHeader.getText();
        Assert.assertEquals( customerHeader, "Customers");

    }
    @Then("close the application")
    public void close_the_application() {
        Driver.closeDriver();

    }
    @When("user clicks on view button")
    public void user_clicks_on_view_button() {
        customersPage.viewButton.click();

    }
    @Then("verify the edit button is displayed")
    public void verify_the_edit_button_is_displayed() {
        boolean view = customersPage.editButton.isDisplayed();
        Assert.assertTrue(view);

    }
    @When("user clicks on edit button")
    public void user_clicks_on_edit_button() {
        customersPage.editButton.click();

    }
    @Then("verify the Create or edit a Customer is displayed")
    public void verify_the_create_or_edit_a_customer_is_displayed() {
        Assert.assertEquals(editCustomerPage.editCustomerHeader.getText(), "Create or edit a Customer");

    }


}
