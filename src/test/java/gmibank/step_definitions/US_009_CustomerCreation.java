package gmibank.step_definitions;
import gmibank.pages.CustomerCreationPageByEmployee;
import gmibank.pages.CustomersPage;
import gmibank.utilities.ConfigReader;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class US_009_CustomerCreation {
    CustomersPage customersPage ;
    CustomerCreationPageByEmployee customerCreationPageByEmployee;
    @Given("user clicks the create a new customer button")
    public void user_clicks_the_create_a_new_customer_button() {
        customersPage = new CustomersPage();
        customersPage.createANewCustomerButton.click();
    }

    @Given("user enters SSN")
    public void user_enters_ssn() {
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
        customerCreationPageByEmployee.ssnTextBox.sendKeys(ConfigReader.getProperty("ssn_text_box"));
    }
    @Given("user clicks Search button")
    public void user_clicks_search_button() {
       customerCreationPageByEmployee.SearchButton.click();
    }
    @Then("verify firstname, lastname, email,phone number, address is not blank")
    public void verify_firstname_lastname_email_phone_number_address_is_not_blank() {
        customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
        String firstname = customerCreationPageByEmployee.firstNameBox.getAttribute("value").trim();
        Assert.assertTrue(firstname.length()>0);

        String lastname = customerCreationPageByEmployee.lastNameBox.getAttribute("value").trim();
        Assert.assertTrue(lastname.length()>0);

        String email = customerCreationPageByEmployee.emailBox.getAttribute("value").trim();
        Assert.assertTrue(email.length()>0);

        String phoneNumber = customerCreationPageByEmployee.mobilePhoneNumber.getAttribute("value").trim();
        Assert.assertTrue(phoneNumber.length()>0);

        String address = customerCreationPageByEmployee.address.getAttribute("value").trim();
        Assert.assertTrue(address.length()>0);
    }
}
