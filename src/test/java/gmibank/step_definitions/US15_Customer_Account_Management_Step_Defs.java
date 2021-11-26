package gmibank.step_definitions;

import gmibank.pages.CustomerAccounts;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US15_Customer_Account_Management_Step_Defs {
LoginPage loginPage = new LoginPage();
CustomerAccounts customerAccounts = new CustomerAccounts();
    @Given("user enters customer username")
    public void user_enters_customer_username() {
        loginPage.icon.click();
        loginPage.firstSignIn.click();
        loginPage.username_field.sendKeys(ConfigReader.getProperty("customer_username"));

    }
    @Given("user enters customer password")
    public void user_enters_customer_password() {
        loginPage.password_field.sendKeys(ConfigReader.getProperty("customer_password"));
    }

    @Given("User goes to my accounts")
    public void user_goes_to_my_accounts() {
    loginPage.myAccounts.click();
    }
    @Then("verify that user can see all account types and balance")
    public void verify_that_user_can_see_all_account_types_and_balance() {
        Assert.assertTrue(customerAccounts.row1Cell1.getText().length()>0);
        Assert.assertTrue(customerAccounts.row1Cell2.getText().length()>0);
    }

    @Given("user open view transaction")
    public void user_open_view_transaction() {
       customerAccounts.firstViewTransactionButton.click();
    }
    @Then("verify that user can see transaction details")
    public void verify_that_user_can_see_transaction_details() {
Assert.assertTrue(customerAccounts.idHeader.isDisplayed());
    }
}
