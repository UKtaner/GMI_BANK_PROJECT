package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerAccountPage {

    public ManagerAccountPage() {
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

    @FindBy(id="jh-create-entity")//Gokcen
    public WebElement createAccountButton;

}
