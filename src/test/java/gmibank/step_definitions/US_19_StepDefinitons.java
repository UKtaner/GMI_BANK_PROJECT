package gmibank.step_definitions;

import gmibank.pages.LoginPage;
import gmibank.pages.ManagerAccountPage;
import gmibank.utilities.ReusableMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class US_19_StepDefinitons {

    LoginPage loginPage=new LoginPage();
    ManagerAccountPage managerAccountPage=new ManagerAccountPage();



    @And("admin click manage accounts")
    public void adminClickManageAccounts() {
        loginPage.myOperations.click();
        loginPage.managaAccounts.click();
    }


    @And("admin creates a new account")
    public void adminCreatesANewAccount() {
        managerAccountPage.createAccountButton.click();
        ReusableMethods.waitFor(4);

    }

    @And("admin types a des.{string}")
    public void adminTypesADes(String arg0) {
        ReusableMethods.waitForVisibility(managerAccountPage.descriptionBox,5);
        managerAccountPage.descriptionBox.sendKeys(arg0);
    }

    @And("admin types the balance {string}")
    public void adminTypesTheBalance(String arg0) {
        managerAccountPage.balanceBox.sendKeys(arg0);
    }

    @And("admin select an account type {string}")
    public void adminSelectAnAccountType(String arg0) {
        ReusableMethods.selectAnItemFromDropdown(managerAccountPage.accountTypeDropdown,arg0);

    }

    @And("admin select an account status {string}")
    public void adminSelectAnAccountStatus(String arg0) {
        ReusableMethods.selectAnItemFromDropdown(managerAccountPage.accountStatusTypeDropdown,arg0);

    }

    @And("admin select an employee {string}")
    public void adminSelectAnEmployee(String arg0) {
        //ReusableMethods.selectAnItemFromDropdown(managerAccountPage.employeeDropdown,arg0);

    }

    @And("admin save account")
    public void adminSaveAccount() {
        managerAccountPage.saveButton.click();
    }
}
