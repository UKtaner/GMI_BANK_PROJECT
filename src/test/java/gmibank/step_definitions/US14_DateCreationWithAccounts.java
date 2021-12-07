package gmibank.step_definitions;

import com.github.javafaker.Faker;
import gmibank.pages.CustomerAccounts;
import gmibank.pages.CustomerCreationPageByEmployee;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.ReusableMethods;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;



public class US14_DateCreationWithAccounts {

CustomerAccounts customerAccounts=new CustomerAccounts();
CustomerCreationPageByEmployee customerCreationPageByEmployee=new CustomerCreationPageByEmployee();
    @Then("user is logged-in as an employee with valid credentials")
    public void user_is_logged_in_as_an_employee_with_valid_credentials(DataTable credentials) {
        LoginPage loginPage=new LoginPage();
        loginPage.firstLoginButton.click();
        ReusableMethods.waitFor(1);
        loginPage.firstSignIn.click();
        ReusableMethods.waitFor(1);
        List<Map<String,String>> userCredentials= credentials.asMaps(String.class,String.class);
        System.out.println(userCredentials);
        for (Map<String,String> eachCredentials:userCredentials){
            ReusableMethods.waitFor(1);
            System.out.println(eachCredentials);
            loginPage.username_field.sendKeys(eachCredentials.get("username"));
            loginPage.password_field.sendKeys(eachCredentials.get("password"));
            ReusableMethods.waitFor(1);
            loginPage.signIn_Btn.click();
        }

    }
    @Then("user clicks to Manage Accounts button")
    public void user_clicks_to_manage_accounts_button() {
        ReusableMethods.waitFor(1);
customerCreationPageByEmployee.manageAccounts.click();
    }
    @Then("user clicks Create a new Account button")
    public void user_clicks_create_a_new_account_button() {
        ReusableMethods.waitFor(1);
        customerCreationPageByEmployee.createAccount.click();
    }
   @Then("user enter {string} in description and {string} in the balance")
    public void user_enter_in_description_and_in_the_balance(String string, String string2) {
       ReusableMethods.waitFor(1);
string="TASARRUF HESABI MDRKY";
string2="1855";
      customerCreationPageByEmployee.descriptionBox.sendKeys(string);
customerCreationPageByEmployee.balanceBox.sendKeys(string2);
    }
    @Then("user enter earlier date in Create Date box")
    public void user_enter_earlier_date_in_create_date_box() {

        ReusableMethods.waitFor(1);
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime earlierDate = LocalDateTime.now().minusDays(15);
        String formattedDate=currentDate.format(earlierDate);
        System.out.println(formattedDate);

        ReusableMethods.waitFor(3);
customerCreationPageByEmployee.createDateTextBox.sendKeys(formattedDate);

        ReusableMethods.waitFor(3);


    }
    @Then("user enter later date in End Date box")
    public void user_enter_later_date_in_end_date_box() {

        ReusableMethods.waitFor(1);
        DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime laterDate = LocalDateTime.now().plusDays(15);
        String formattedDate=currentDate.format(laterDate);
        System.out.println(formattedDate);

        ReusableMethods.waitFor(1);
        customerCreationPageByEmployee.closedDate.sendKeys(formattedDate);

        ReusableMethods.waitFor(1);
    }
    @Then("user enter save button")
    public void user_enter_save_button() {

        customerCreationPageByEmployee.saveButton.click();
    }
    @Then("verifies if new account created")
    public void verifies_if_new_account_created() {
        ReusableMethods.waitFor(1);
        customerAccounts.selectID.click();

        ReusableMethods.waitFor(1);
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Description"));
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Balance"));
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Account Type"));
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Account Status Type"));
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Create Date"));
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Closed Date"));
Assert.assertTrue(customerCreationPageByEmployee.accountSuccess.getText().contains("Employee"));
        ReusableMethods.waitFor(5);


    }

    @Then("user selects Manage Accounts")
    public void user_selects_manage_accounts() {
customerCreationPageByEmployee.manageAccounts.click();
    }

    @Then("User create Date as month day year hour and minute and click Enter")
    public void user_create_date_as_month_day_year_hour_and_minute_and_click_enter() {

   String date=LocalDate.now().toString();
        customerCreationPageByEmployee.createDateTextBox.sendKeys(date);
        System.out.println(date);
    }

    @Then("verify date  month day year format")
    public void verify_date_month_day_year_format() {
        ReusableMethods.waitForVisibility(customerCreationPageByEmployee.createDateTextBox,5);
        String dateText=customerCreationPageByEmployee.timeOccurence.getAttribute("value");
        ReusableMethods.waitFor(1);
        System.out.println("dateText = " + dateText);
        Assert.assertTrue(customerCreationPageByEmployee.timeOccurence.isDisplayed());
    }

    @Then("user enters a valid SSN number in SSNBox")
    public void user_enters_a_valid_ssn_number_in_ssn_box() {
String SSN="354-65-2374";
customerCreationPageByEmployee.ssnTextBox.sendKeys(SSN);

    }

    @Then("user clicks Search")
    public void user_clicks_search() {
customerCreationPageByEmployee.SearchButton.click();
ReusableMethods.waitForVisibility(customerCreationPageByEmployee.customerFirstName,2);
    }

    @Then("verifies if the boxes are blank or not")
    public void verifies_if_the_boxes_are_blank_or_not() {
//FirstNameEmpty
ReusableMethods.waitFor(2);
String firstName=customerCreationPageByEmployee.customerFirstName.getAttribute("value");
ReusableMethods.waitFor(2);
Assert.assertFalse(firstName.isEmpty());

//LastName Box Empty
String lastName=customerCreationPageByEmployee.customerLastName.getAttribute("value");
ReusableMethods.waitFor(1);
Assert.assertFalse(lastName.isEmpty());

//Email
String email=customerCreationPageByEmployee.emailBox.getAttribute("value");
ReusableMethods.waitForVisibility(customerCreationPageByEmployee.emailBox,2) ;
Assert.assertFalse(email.isEmpty());

//Mobile Phone Number
String mobilePhone=customerCreationPageByEmployee.emailBox.getAttribute("value");
ReusableMethods.waitForVisibility(customerCreationPageByEmployee.mobilePhoneNumber,2) ;
Assert.assertFalse(mobilePhone.isEmpty());
//PhoneNumber
String phoneNumber=customerCreationPageByEmployee.phoneNumberTextBox.getAttribute("value");
ReusableMethods.waitForVisibility(customerCreationPageByEmployee.phoneNumberTextBox,2) ;

        if (phoneNumber.isEmpty()) {
            System.out.println("THIS FIELD MUST BE FILLED");

        }
        else {

        }
        ReusableMethods.waitFor(10);
    }

    @Then("user select an account by ID")
    public void user_select_an_account_by_id() {
customerAccounts.selectID.click();



    }

    @Then("verifies if this is an account")
    public void verifies_if_this_is_an_account() {
        ReusableMethods.waitForVisibility(customerAccounts.accountID,2) ;

        String accountID=customerAccounts.accountID.getText().trim();
Assert.assertFalse(accountID.isEmpty());
        ReusableMethods.waitForVisibility(customerAccounts.description,1) ;
        String description=customerAccounts.description.getText().trim();
        Assert.assertFalse(description.isEmpty());
        ReusableMethods.waitForVisibility(customerAccounts.balance,1) ;
        String balance=customerAccounts.balance.getText().trim();
        Assert.assertFalse(balance.isEmpty());
        ReusableMethods.waitForVisibility(customerAccounts.accounType,2) ;
        String accountType=customerAccounts.accounType.getText().trim();
        Assert.assertFalse(accountType.isEmpty());

        ReusableMethods.waitForVisibility(customerAccounts.accounType,2) ;
        String accountStatus=customerAccounts.accountStatus.getText().trim();
        Assert.assertEquals(accountStatus,"ACTIVE");

        String createDate=customerAccounts.accountCreateDate.getText().trim();
        Assert.assertFalse(createDate.isEmpty());

    }

    @Then("user select a customer by ID")
    public void user_select_a_customer_by_id() {
        ReusableMethods.waitFor(2);
String customerID=customerAccounts.customerID.getText().trim();
customerAccounts.customerID.click();

    }

    @Then("user clicks edit button on customer page")
    public void user_clicks_edit_button_on_customer_page() {
        ReusableMethods.waitFor(1);
customerAccounts.editButton.click();
    }

    @Then("User clicks Zelle Enrolled button and save button")
    public void user_clicks_zelle_enrolled_button_and_save_button() {
        ReusableMethods.waitFor(1);
String zelleEnrolled=customerAccounts.zelleEnrolled.getAttribute("value");


if (zelleEnrolled=="false"){
    customerAccounts.zelleEnrolled.click();
        }

customerAccounts.saveCustomer.click();
    }

    @Then("user checks Zelle Enrolled changed")
    public void user_checks_zelle_enrolled_changed() {
        String zelleEnrolled=customerAccounts.zelleEnrolled.getAttribute("value");


    }



}
