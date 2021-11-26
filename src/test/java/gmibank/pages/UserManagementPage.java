package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//th[@id='modified-date-sort']")
    public WebElement modifiedDate;

    @FindBy(xpath = "//tr[@id='team3user']//td//button")
    public WebElement userActivate;

    @FindBy(xpath = "//tr[@id='team3employee']//td//button")
    public WebElement employeeActivate;

    @FindBy(xpath = "//tr[@id='team3manager']//td//button")
    public  WebElement managerActivate;

    @FindBy(xpath = "//tr[@id='fakenameeeeeeeeeeeeeeeeeeeeeeee']//td//button")
    public WebElement adminActivate;



}
