package gmibank.step_definitions;

import gmibank.pages.CustomerAccounts;
import gmibank.pages.UserEditPage;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.Then;

import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import io.cucumber.datatable.DataTable;
import org.openqa.selenium.support.ui.Select;

import java.sql.ResultSet;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.List;

public class US_16_MoneyTransfer {
    CustomerAccounts customerAccounts=new CustomerAccounts();


    @Then("user goes to My Accounts")
    public void user_goes_to_my_accounts() {
customerAccounts.myAccounts.click();

    }
    @Then("checks if has two or more accounts")
    public void checks_if_has_two_or_more_accounts() {
String accountIDFirstRow=customerAccounts.row1Cell1.getText();
String accountIDSecondRow=customerAccounts.row2Cell1.getText();
        String savingType1stRow=customerAccounts.row1Cell2.getText();
        String savingTypes2ndRow=customerAccounts.row2Cell2.getText();

Assert.assertTrue(accountIDFirstRow.contains("2326")||accountIDFirstRow.contains("2327")||accountIDFirstRow.contains("2328")||accountIDFirstRow.contains("2329"));
Assert.assertTrue(accountIDSecondRow.contains("2326")||accountIDSecondRow.contains("2327")||accountIDSecondRow.contains("2328")||accountIDSecondRow.contains("2329"));
Assert.assertTrue(savingType1stRow.contains("SAVING")||savingType1stRow.contains("CHECKING"));
Assert.assertTrue(savingTypes2ndRow.contains("SAVING")||savingTypes2ndRow.contains("CHECKING"));

ReusableMethods.waitFor(2);
    }
    @Then("click on Transfer Money button")
    public void click_on_transfer_money_button() {
        ReusableMethods.waitFor(2);
        customerAccounts.transferMoney.click();
    }
    @Then("from dropdown menu select saving")
    public void from_dropdown_menu_select_saving() {
      customerAccounts.savingDropdownAccount.click();

    }

    @Then("To dropdown box select a saving account")
    public void to_dropdown_box_select_a_saving_account() {

      customerAccounts.sendToAccount.click();


    }

    @Then("send a balance amount")
    public void send_a_balance_amount() {
customerAccounts.balanceSent.sendKeys("999");
ReusableMethods.waitFor(1);
customerAccounts.balanceCent.clear();
ReusableMethods.waitFor(1);
customerAccounts.balanceCent.sendKeys("24");
ReusableMethods.waitFor(2);
    }

    @Then("write description text box")
    public void write_description_text_box() {
customerAccounts.transferDescription.sendKeys("Murat'in Birikimleri Ordan Buraya");
    }

    @Then("click make transfer button")
    public void click_make_transfer_button() {

customerAccounts.makeTransfer.click();
ReusableMethods.waitFor(5);
    }

    @Then("validate the message")
    public void validate_the_message() {


        ReusableMethods.waitForVisibility(customerAccounts.popUpMessage,10);
        String popUp=customerAccounts.popUpMessage.getText();
        ReusableMethods.waitFor(10);
        System.out.println(popUp);
        Assert.assertTrue(popUp.contains("translation-not-found"));


    }

}
