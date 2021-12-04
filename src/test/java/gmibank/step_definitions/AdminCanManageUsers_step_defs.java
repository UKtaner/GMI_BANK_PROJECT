package gmibank.step_definitions;

import com.github.javafaker.Faker;
import gmibank.pages.LoginPage;
import gmibank.pages.UserDetailsPage;
import gmibank.pages.UserEditPage;
import gmibank.pages.UserManagementPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.support.ui.Select;

public class AdminCanManageUsers_step_defs {
    LoginPage loginPage = new LoginPage();
    UserManagementPage userManagementPage = new UserManagementPage();
    UserDetailsPage userDetailsPage = new UserDetailsPage();
    UserEditPage userEditPage =  new UserEditPage();

    @Given("admin on home page")
    public void admin_on_home_page(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @And("admin go login page")
    public void admin_go_login_page(){
        loginPage.icon.click();
        loginPage.firstSignIn.click();
    }

    @And("admin enter the username {string}")
    public void admin_enter_the_username(String string){
        loginPage.username_field.sendKeys(string);
    }
    @And("admin enter password {string}")
    public void admin_enter_password(String string){
        loginPage.password_field.sendKeys(string);
        loginPage.signIn_Btn.click();
    }

    @Then("admin goes user-management page")
    public void admin_goes_user_management_page(){
        loginPage.administration.click();
        loginPage.userManagement.click();
    }

    @Then("admin goes page")
    public void admin_goes_page(){
        userManagementPage.modifiedDate.click();
    }

    @Then("admin activate user")
    public void admin_activate_user(){
        userManagementPage.userActivate.click();
    }

    @Then("admin refresh the page")
    public void admin_refresh_the_page(){
        Driver.getDriver().navigate().refresh();
    }

    @Then("admin check is user activated")
    public  void admin_check_is_user_activated(){
        String expectedResult = "Activated";
        String actualResult = userManagementPage.userActivate.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("admin activate employee")
    public void admin_activate_employee(){
        userManagementPage.employeeActivate.click();
    }

    @Then("admin check is employee activated")
    public void admin_check_is_employee_activated(){
        String expectedResult = "Activated";
        String actualResult = userManagementPage.employeeActivate.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("admin activate manager")
    public void admin_activate_manager(){
        userManagementPage.managerActivate.click();
    }

    @Then("admin check is manager activated")
    public void admin_check_is_manager_activated(){
        String expectedResult = "Activated";
        String actualResult = userManagementPage.managerActivate.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("admin activate admin")
    public  void admin_activate_admin(){
        userManagementPage.adminActivate.click();
    }

    @Then("admin check is admin activated")
    public  void admin_check_is_admin_activated(){
        String expectedResult = "Activated";
        String actualResult = userManagementPage.adminActivate.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Then("admin goes admin details page")
    public void admin_goes_admin_details_page(){
        userManagementPage.adminDetails.click();
    }

    @Then("admin check firstname")
    public  void admin_check_firstname() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.FirstName.getText();
        System.out.println(actualResult);
        String expectedResult = "team";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("admin check lastname")
    public void admin_check_lastname() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.LastName.getText();
        String expectedResult = "3";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("admin check admin profiles")
    public void admin_check_admin_profiles() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.Email.getText();
        String expectedResult = "team3_@team.com";
        Assert.assertEquals(expectedResult, actualResult);

        String actualResultP = userDetailsPage.Profile.getText();
        String expectedResultP = "ROLE_ADMIN";
        Assert.assertEquals(expectedResultP, actualResultP);
    }

    @Then("admin goes manager details page")
    public  void  admin_goes_manager_details_page(){
        userManagementPage.managerDetails.click();
    }

    @Then("admin check manager profiles")
    public void admin_check_manager_profiles() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.Email.getText();
        String expectedResult = "team3____@team.com";
        Assert.assertEquals(expectedResult, actualResult);

        String actualResultP = userDetailsPage.Profile.getText();
        String expectedResultP = "ROLE_MANAGER";
        Assert.assertEquals(expectedResultP, actualResultP);
    }

    @Then("admin goes employee details page")
    public void admin_goes_employee_details_page(){
        userManagementPage.employeeDetails.click();
    }

    @Then("admin check employee profiles")
    public void admin_check_employee_profiles() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.Email.getText();
        String expectedResult = "team3__@team.com";
        Assert.assertEquals(expectedResult, actualResult);

        String actualResultP = userDetailsPage.Profile.getText();
        String expectedResultP = "ROLE_EMPLOYEE";
        Assert.assertEquals(expectedResultP, actualResultP);
    }

    @Then("admin goes user details page")
    public void admin_goes_user_details_page(){
        userManagementPage.userDetails.click();
    }

    @Then("admin check user profiles")
    public void admin_check_user_profiles() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.Email.getText();
        String expectedResult = "team3@team.com";
        Assert.assertEquals(expectedResult, actualResult);

        String actualResultP = userDetailsPage.Profile.getText();
        String expectedResultP = "ROLE_USER";
        Assert.assertEquals(expectedResultP, actualResultP);
    }

    @Then("admin check user firstname")
    public  void admin_check_user_firstname() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.FirstName.getText();
        System.out.println(actualResult);
        String expectedResult = "Ali";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("admin check user lastname")
    public void admin_check_user_lastname() throws InterruptedException {
        Thread.sleep(2000);
        String actualResult = userDetailsPage.LastName.getText();
        String expectedResult = "Can";
        Assert.assertEquals(expectedResult, actualResult);
    }

    @Then("admin goes admin edit page")
    public  void admin_goes_admin_edit_page(){
        userManagementPage.adminEdit.click();
    }

    @Then("admin enter new login value {string}")
    public void admin_enter_new_login_value(String string){
        userEditPage.loginEntry.clear();
        userEditPage.loginEntry.sendKeys(string);
    }

    @Then("admin enter new firstname value {string}")
    public void admin_enter_new_firstname_value(String string){
        userEditPage.firstNameEntry.clear();
        userEditPage.firstNameEntry.sendKeys(string);
    }

    @Then("admin enter new lastname value {string}")
    public  void  admin_enter_new_lastname_value(String string){
        userEditPage.lastNameEntry.clear();
        userEditPage.lastNameEntry.sendKeys(string);
    }

    @Then("admin enter new email value {string}")
    public void admin_enter_new_email_value(String string){
        userEditPage.emailEntry.clear();
        userEditPage.emailEntry.sendKeys(string);
    }

    @Then("admin change language english")
    public void admin_change_language_english(){
        Select LangSelect = new Select(userEditPage.languageSelect);
        LangSelect.selectByValue("en");
    }

    @Then("admin come back page")
    public void admin_come_back_page(){
        userEditPage.saveButton.click();
        Driver.getDriver().navigate().back();
    }

    @Then("admin check admin values")
    public void admin_check_admin_values() throws InterruptedException {
        Thread.sleep(2000);
        String actual = userManagementPage.adminLang.getText();
        String ecpected = "en";
        Assert.assertEquals(actual,ecpected);
    }

    @Then("admin goes manager edit page")
    public void admin_goes_manager_edit_page(){
        userManagementPage.managerEdit.click();
    }

    @Then("admin check manager values")
    public void admin_check_manager_values() throws InterruptedException {
        Thread.sleep(2000);
        String actual = userManagementPage.managerLang.getText();
        String ecpected = "en";
        Assert.assertEquals(actual,ecpected);
    }

    @Then("admin goes employee edit page")
    public void admin_goes_employee_edit_page(){
        userManagementPage.employeeEdit.click();
    }

    @Then("admin check employee values")
    public void admin_check_employee_values() throws InterruptedException {
        Thread.sleep(2000);
        String actual = userManagementPage.employeeLang.getText();
        String ecpected = "en";
        Assert.assertEquals(actual,ecpected);
    }

    @Then("admin goes user edit page")
    public void admin_goes_user_edit_page(){
        userManagementPage.useredit.click();
    }

    @Then("admin check user values")
    public void admin_check_user_values() throws InterruptedException {
        Thread.sleep(2000);
        String actual = userManagementPage.userLang.getText();
        String ecpected = "en";
        Assert.assertEquals(actual,ecpected);
    }

    @Then("admin goes users page")
    public void admin_goes_users_page() throws InterruptedException {
        userManagementPage.modifiedBy.click();
        Thread.sleep(2000);
        userManagementPage.modifiedBy.click();
    }

    @Then("admin select admin delete button")
    public void admin_select_admin_delete_button(){
        userManagementPage.adminDelete.click();
    }

    @Then("admin select delete button again")
    public void admin_select_delete_button_again() throws InterruptedException {
        Thread.sleep(2000);
        userManagementPage.Delete.click();
    }

    @Then("admin check the admin deleted")
    public void admin_check_the_admin_deleted(){
        try{
            userManagementPage.adminName.getText();

            Assert.assertEquals("1","0");
        }catch (Exception e){
            Assert.assertEquals("0","0");
        }
    }

    @Then("admin select manager delete button")
    public void admin_select_manager_delete_button(){
        userManagementPage.managerDelete.click();
    }

    @Then("admin check the manager deleted")
    public void admin_check_the_manager_deleted(){
        try{
            userManagementPage.managerName.getText();

            Assert.assertEquals("1","0");
        }catch (Exception e){
            Assert.assertEquals("0","0");
        }
    }

    @Then("admin select employee delete button")
    public void admin_select_employee_delete_button(){
        userManagementPage.employeeDelete.click();
    }

    @Then("admin check the employee deleted")
    public void admin_check_the_employee_deleted(){
        try{
            userManagementPage.employeeName.getText();

            Assert.assertEquals("1","0");
        }catch (Exception e){
            Assert.assertEquals("0","0");
        }
    }

    @Then("admin select user delete button")
    public void admin_select_user_delete_button(){
        userManagementPage.userDelete.click();
    }

    @Then("admin check the user deleted")
    public void admin_check_the_user_deleted(){
        try{
            userManagementPage.userName.getText();

            Assert.assertEquals("1","0");
        }catch (Exception e){
            Assert.assertEquals("0","0");
        }
    }
}
