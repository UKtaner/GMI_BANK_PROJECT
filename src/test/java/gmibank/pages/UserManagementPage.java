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

    @FindBy(xpath = "//tr[@id='team3admin']//div//a[1]")
    public WebElement adminDetails;

    @FindBy(xpath = "//tr[@id='team3manager']//div//a[1]")
    public WebElement managerDetails;

    @FindBy(xpath = "//tr[@id='team3employee']//div//a[1]")
    public  WebElement employeeDetails;

    @FindBy(xpath = "//tr[@id='team3user']//div//a[1]")
    public  WebElement userDetails;

    @FindBy(xpath = "//tr[@id='team3admin']//div//a[2]")
    public WebElement adminEdit;

    @FindBy(xpath = "//tr[@id='team3admin']//td[5]")
    public WebElement adminLang;

    @FindBy(xpath = "//tr[@id='team3manager']//a[2]")
    public WebElement managerEdit;

    @FindBy(xpath = "//tr[@id='team3manager']//td[5]")
    public WebElement managerLang;

    @FindBy(xpath = "//tr[@id='team3employee']//a[2]")
    public WebElement employeeEdit;

    @FindBy(xpath = "//tr[@id='team3employee']//td[5]")
    public WebElement employeeLang;

    @FindBy(xpath = "//tr[@id='team3user']//td[5]")
    public WebElement userLang;

    @FindBy(xpath = "//tr[@id='team3user']//a[2]")
    public WebElement useredit;

    @FindBy(xpath = "//body//th[8]")
    public WebElement modifiedBy;

    @FindBy(xpath = "//tr[@id='aaabbbccc']//a[3]")
    public WebElement adminDelete;

    @FindBy(xpath = "//body/div/div/div/div/div/div/button[2]")
    public WebElement Delete;

    @FindBy(xpath = "//tr[@id='aaabbbccc']//td[2]")
    public WebElement adminName;

    @FindBy(xpath = "//tr[@id='aabc966']//a[3]")
    public WebElement managerDelete;

    @FindBy(xpath = "//tr[@id='aabc966']//td[2]")
    public WebElement managerName;

    @FindBy(xpath = "//tr[@id='accountemloyee']//a[3]")
    public WebElement employeeDelete;

    @FindBy(xpath = "//tr[@id='accountemloyee']//td[2]")
    public WebElement employeeName;

    @FindBy(xpath = "//tr[@id='adam_user']//a[3]")
    public WebElement userDelete;

    @FindBy(xpath = "//tr[@id='adam_user']//td[2]")
    public WebElement userName;

}
