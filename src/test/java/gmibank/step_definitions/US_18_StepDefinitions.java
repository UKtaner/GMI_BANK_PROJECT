package gmibank.step_definitions;

import gmibank.pages.CustomersPage;
import gmibank.pages.LoginPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class US_18_StepDefinitions {
    LoginPage loginPage = new LoginPage();
    CustomersPage customersPage  = new CustomersPage();

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

    }
}
