package gmibank.step_definitions;

import com.github.javafaker.Faker;
import gmibank.pages.CustomersPage;
import gmibank.pages.EditCustomerPage;
import gmibank.pages.LoginPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ManagingCustomerInfo_step_defs {

    LoginPage loginPage = new LoginPage();
    CustomersPage customersPage = new CustomersPage();
    EditCustomerPage editCustomerPage = new EditCustomerPage();
    Faker faker = new Faker();

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

    @Then("user updates all table required fields")
    public void user_updates_all_table_required_fields() {
        editCustomerPage.firstName.clear();
        editCustomerPage.firstName.sendKeys(faker.name().firstName());

        editCustomerPage.lastName.clear();
        editCustomerPage.lastName.sendKeys(faker.name().lastName());

        editCustomerPage.middleName.clear();
        editCustomerPage.middleName.sendKeys(faker.name().nameWithMiddle().substring(0, 1).toUpperCase());

        editCustomerPage.email.clear();
        editCustomerPage.email.sendKeys(faker.internet().emailAddress());

        editCustomerPage.mobileNumber.clear();
        String fakeNumber = faker.number().numberBetween(111, 666) + "-" + faker.number().numberBetween(222, 988) + "-" + faker.number().numberBetween(1000,9999);
        editCustomerPage.mobileNumber.sendKeys(fakeNumber);

        editCustomerPage.phoneNumber.clear();
        String fakeNumber2 = faker.number().numberBetween(111, 666) + "-" + faker.number().numberBetween(222, 988) + "-" + faker.number().numberBetween(1000,9999);
        editCustomerPage.phoneNumber.sendKeys(fakeNumber2);

        editCustomerPage.zipCode.clear();
        editCustomerPage.zipCode.sendKeys(faker.address().zipCode());

        editCustomerPage.address.clear();
        editCustomerPage.address.sendKeys(faker.address().fullAddress());

        editCustomerPage.city.clear();
        editCustomerPage.city.sendKeys(faker.address().city());

        editCustomerPage.ssn.clear();
        editCustomerPage.ssn.sendKeys(faker.idNumber().ssnValid());

        editCustomerPage.createDate.clear();
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(editCustomerPage.createDate, "" + faker.number().numberBetween(11, 28)).perform();
        actions.sendKeys("Aug").perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys("2022").perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys("01").perform();
        actions.sendKeys(Keys.ARROW_RIGHT).perform();
        actions.sendKeys("00").perform();

        Select country = new Select(editCustomerPage.country);
        country.selectByIndex(faker.number().numberBetween(1, 99));

        editCustomerPage.state.clear();
        editCustomerPage.state.sendKeys(faker.address().state());

        Select user = new Select(editCustomerPage.user);
        user.selectByIndex(faker.number().numberBetween(1, 20));

        Select account = new Select(editCustomerPage.account);
        account.selectByIndex((int) faker.number().numberBetween(1, 3));
        ReusableMethods.waitForVisibility(editCustomerPage.account,5).click();

        if(!editCustomerPage.zelleEnrolled.isSelected()){
            editCustomerPage.zelleEnrolled.click();
        }

    }

    @Then("click on save button")
    public void click_on_save_button() {
        editCustomerPage.saveButton.click();

        }

    @Then("verify if updating new Customer Information is possible")
    public void verify_if_updating_new_customer_information_is_possible() {
        ReusableMethods.waitForVisibility(customersPage.customersHeader,5);
        String customerHeader = customersPage.customersHeader.getText();
        Assert.assertEquals( customerHeader, "Customers");

    }

    @When("user clicks on delete button")
    public void user_clicks_on_delete_button() {
        customersPage.deleteButton.click();
    }
    @Then("verifying a pop up message about deletion")
    public void verifying_a_pop_up_message_about_deletion() {

        WebDriverWait waitError = new WebDriverWait(Driver.getDriver(), 20);
        WebElement message = waitError.until(ExpectedConditions.visibilityOf(customersPage.deleteMessage));
        Assert.assertTrue(message.getText().contains("Confirm delete operation"));

    }
    @Then("click on delete button on pop up")
    public void click_on_delete_button_on_pop_up() {
        customersPage.deletePopUp.click();
    }


}
