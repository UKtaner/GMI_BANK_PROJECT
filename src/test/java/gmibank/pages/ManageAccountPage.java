package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManageAccountPage {

    public ManageAccountPage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (id="tp-account-description")
    public WebElement descriptionBox;

    @FindBy (id="tp-account-balance")
    public WebElement balanceBox;

    @FindBy (id="tp-account-accountType")
    public WebElement accountTypeDropdown;

    @FindBy (id="tp-account-accountStatusType")
    public WebElement  accountStatusTypeDropdown;

    @FindBy (id="tp-account-employee")
    public WebElement employeeDropdown;

    @FindBy (id="save-entity")
    public WebElement saveButton;

    @FindBy (id="entity-menu")
    public WebElement myOperationsMenu;

    @FindBy (xpath="//*[contains(text(),'Manage Accounts')]")
    public WebElement manageAccountsMenu;

    @FindBy (id="jh-create-entity")
    public WebElement createNewAccountButton;

    @FindBy (xpath="(//*[contains(text(),'This field is required')])[1]")
    public WebElement thisFieldRequiredMessageDescription;

    @FindBy (xpath="(//*[contains(text(),'This field is required')])[2]")
    public WebElement thisFieldRequiredMessageBalance;



}
