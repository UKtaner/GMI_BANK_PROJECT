package gmibank.step_definitions;

import com.github.javafaker.Faker;
import gmibank.pages.*;
import gmibank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import java.nio.channels.SelectableChannel;

public class US_18_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    CustomersPage customersPage  = new CustomersPage();
    CustomerDetailsPage customerDetailsPage = new CustomerDetailsPage();
    Faker faker = new Faker();
    CustomerCreationPageByEmployee customerCreationPageByEmployee = new CustomerCreationPageByEmployee();
    EditCustomerPage editCustomerPage = new EditCustomerPage();
    String name = faker.name().firstName();

    @Then("manager goes manager customers page")
    public void manager_goes_manager_customers_page() throws InterruptedException {
        loginPage.myOperations.click();
        loginPage.manageCustomers.click();
        Thread.sleep(2000);
    }

    @Then("manager check sees FirstName")
    public void manager_check_sees_FirstName(){
        try{
            customersPage.firstName.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees LastName")
    public void manager_check_sees_LastName(){
        try{
            customersPage.lastName.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees Middle Initial")
    public void manager_check_sees_Middle_Initial(){
        try{
            customersPage.middleInitial.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees Email")
    public void manager_check_sees_Email(){
        try{
            customersPage.email.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees Mobile Phone Number")
    public void manager_check_sees_Mobile_Phone_Number(){
        try{
            customersPage.mobilePhoneNumber.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees Phone Number")
    public void manager_check_sees_Phone_Number(){
        try{
            customersPage.phoneNumber.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees Address")
    public void manager_check_sees_Address(){
        try{
            customersPage.address.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check sees Create Date")
    public void manager_check_sees_Create_Date(){
        try{
            customersPage.createDate.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

    @Then("manager check all View pages Is there a edit button inside")
    public void manager_check_all_View_pages_Is_there_a_edit_button_inside(){

        for (int i = 1;i <= 20;i++ ){
            String s = "//tr["+i+"]//td[10]//div[1]//a[1]";
            Driver.getDriver().findElement(By.xpath(s)).click();
            try{
                customerDetailsPage.EditButton.getText();
                Assert.assertEquals("0","0");
            }catch (Exception e){
                Assert.assertEquals("1","0");
            }
            customerDetailsPage.BackButton.click();
        }
    }

    @Then("manager check all page Is there a Edit button")
    public void manager_check_all_page_Is_there_a_Edit_button(){
        for (int i = 1;i <= 20;i++ ){
            String s = "//tr["+i+"]//td[10]//div[1]//a[2]";
            try{
                Driver.getDriver().findElement(By.xpath(s)).getText();
                Assert.assertEquals("0","0");
            }catch (Exception e){
                Assert.assertEquals("1","0");
            }
        }
    }

    @Then("manager goes Create customer page customer page")
    public void manager_goes_Create_customer_page_customer_page(){
        customersPage.createANewCustomerButton.click();
    }

    @Then("manager Enter a First Name")
    public void manager_Enter_a_First_Name(){
        customerCreationPageByEmployee.firstNameBox.clear();
        customerCreationPageByEmployee.firstNameBox.sendKeys(name);
    }

    @Then("manager Enter a Last Name")
    public void manager_Enter_a_Last_Name(){
        customerCreationPageByEmployee.lastNameBox.clear();
        customerCreationPageByEmployee.lastNameBox.sendKeys(faker.name().lastName());
    }

    @Then("manager Enter a Middle Initial")
    public void manager_Enter_a_Middle_Initial(){
        customerCreationPageByEmployee.middleNameTextBox.clear();
        customerCreationPageByEmployee.middleNameTextBox.sendKeys(faker.name().nameWithMiddle());
    }

    @Then("manager Enter a Email")
    public void manager_Enter_a_Email(){
        customerCreationPageByEmployee.emailBox.clear();
        customerCreationPageByEmployee.emailBox.sendKeys(faker.internet().emailAddress());
    }

    @Then("manager Enter a Mobile Phone Number")
    public void manager_Enter_a_Mobile_Phone_Number(){
        customerCreationPageByEmployee.mobilePhoneNumber.clear();
        customerCreationPageByEmployee.mobilePhoneNumber.sendKeys("123-123-1212");
    }

    @Then("manager Enter a Phone Number")
    public void manager_Enter_a_Phone_Number(){
        customerCreationPageByEmployee.phoneNumberTextBox.clear();
        customerCreationPageByEmployee.phoneNumberTextBox.sendKeys("098-098-0987");
    }

    @Then("manager Enter a Zip Code")
    public void manager_Enter_a_Zip_Code(){
        customerCreationPageByEmployee.zipCodeTextBox.clear();
        customerCreationPageByEmployee.zipCodeTextBox.sendKeys(faker.address().zipCode());
    }

    @Then("manager Enter a Address")
    public void manager_Enter_a_Address(){
        customerCreationPageByEmployee.addressBox.clear();
        customerCreationPageByEmployee.addressBox.sendKeys(faker.address().secondaryAddress());
    }

    @Then("manager Enter a City")
    public void manager_Enter_a_City(){
        customerCreationPageByEmployee.cityTextBox.clear();
        customerCreationPageByEmployee.cityTextBox.sendKeys(faker.address().city());
    }

    @Then("manager Enter a Ssn")
    public void manager_Enter_a_Ssn(){
        customerCreationPageByEmployee.ssnBox.clear();
        customerCreationPageByEmployee.ssnBox.sendKeys(faker.idNumber().ssnValid());
    }

    @Then("manager Enter a Country")
    public void manager_Enter_a_Country(){
        Select select = new Select(customerCreationPageByEmployee.countryIdDropDown);
        select.selectByValue("24103");
    }

    @Then("manager Enter a State")
    public void manager_Enter_a_State(){
        customerCreationPageByEmployee.stateTextBox.clear();
        customerCreationPageByEmployee.stateTextBox.sendKeys(faker.address().state());
    }

    @Then("manager Enter a User")
    public void manager_Enter_a_User(){
            Select select = new Select(customerCreationPageByEmployee.userIdDropDown);
            select.selectByValue("105351");
    }

    @Then("manager Enter a Account")
    public void manager_Enter_a_Account(){
        Select select = new Select(customerCreationPageByEmployee.accountTypeTextBox);
        select.selectByValue("112600");
    }

    @Then("manager click Zelle Enrolled")
    public void manager_click_Zelle_Enrolled(){
        customerCreationPageByEmployee.zelleEnrolledButton.click();
    }

    @Then("manager click Save button")
    public void manager_click_Save_button(){
        customerCreationPageByEmployee.saveButton.click();
    }

    @Then("manager goes Edit customer page")
    public void manager_goes_Edit_customer_page(){
        customersPage.editBtn.click();
    }

    @Then("manager check the customer info")
    public void manager_check_the_customer_info() throws InterruptedException {
        editCustomerPage.backButton.click();
        Thread.sleep(1000);
        Driver.getDriver().get("https://gmibank.com/tp-customer?page=1&sort=createDate,asc");

        Assert.assertEquals(customersPage.customer.getText(),name);
    }

    @Then("manager click delete button")
    public void manager_click_delete_button(){
        customersPage.createDate.click();
        customersPage.deleteButton.click();
    }

    @Then("manager confirm and click delete again")
    public void manager_confirm_and_click_delete_again() throws InterruptedException {
        Thread.sleep(2000);

        try{
            customersPage.confirmDeleteText.getText();
            Assert.assertEquals("0","0");
        }catch (Exception e){
            Assert.assertEquals("1","0");
        }
    }

}

