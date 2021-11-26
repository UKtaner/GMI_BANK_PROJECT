package gmibank.step_definitions;

import gmibank.pages.LoginPage;
import gmibank.pages.UserManagementPage;
import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class Admin_can_manage_users_step_defs {
    LoginPage loginPage = new LoginPage();
    UserManagementPage userManagementPage = new UserManagementPage();

    @Given("admin on home page")
    public void admin_on_home_page(){
        Driver.getDriver().get(ConfigReader.getProperty("app_url"));
    }

    @And("admin go login page")
    public void admin_go_login_page(){
        loginPage.icon.click();
        loginPage.firstSignIn.click();
    }

    @And("admin enter the username")
    public void admin_enter_the_username(){
        loginPage.username_field.sendKeys(ConfigReader.getProperty("admin_username"));
    }
    @And("admin enter password")
    public void admin_enter_password(){
        loginPage.password_field.sendKeys(ConfigReader.getProperty("admin_password"));
        loginPage.signIn_btn.click();
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


}
