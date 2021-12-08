package gmibank.pages;

import gmibank.utilities.Driver;
import org.jsoup.internal.FieldsAreNonnullByDefault;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserManagementPage {
    public UserManagementPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//body//th[7]")
    public WebElement modifiedDate;

    @FindBy(xpath = "//tr[@id='tt3_user']//td//button")
    public WebElement userActivate;

    @FindBy(xpath = "//tr[@id='tt3_employee']//td//button")
    public WebElement employeeActivate;

    @FindBy(xpath = "//tr[@id='tt3_manager']//td//button")
    public  WebElement managerActivate;

    @FindBy(xpath = "//tr[@id='tt3_admin']//td//button")
    public WebElement adminActivate;

    @FindBy(xpath = "//tr[@id='tt3_admin']//div//a[1]")
    public WebElement adminDetails;

    @FindBy(xpath = "//tr[@id='tt3_manager']//div//a[1]")
    public WebElement managerDetails;

    @FindBy(xpath = "//tr[@id='tt3_employee']//div//a[1]")
    public  WebElement employeeDetails;

    @FindBy(xpath = "//tr[@id='tt3_user']//div//a[1]")
    public  WebElement userDetails;

    @FindBy(xpath = "//tr[@id='tt3_admin']//div//a[2]")
    public WebElement adminEdit;

    @FindBy(xpath = "//tr[@id='tt3_admin']//td[5]")
    public WebElement adminLang;

    @FindBy(xpath = "//tr[@id='tt3_manager']//a[2]")
    public WebElement managerEdit;

    @FindBy(xpath = "//tr[@id='tt3_manager']//td[5]")
    public WebElement managerLang;

    @FindBy(xpath = "//tr[@id='tt3_employee']//a[2]")
    public WebElement employeeEdit;

    @FindBy(xpath = "//tr[@id='tt3_employee']//td[5]")
    public WebElement employeeLang;

    @FindBy(xpath = "//tr[@id='tt3_user']//td[5]")
    public WebElement userLang;

    @FindBy(xpath = "//tr[@id='tt3_user']//a[2]")
    public WebElement useredit;

    @FindBy(xpath = "//tr[@id='tt3_admin']//a[3]")
    public WebElement adminDelete;

    @FindBy(xpath = "//body/div/div/div/div/div/div/button[2]")
    public WebElement Delete;

    @FindBy(xpath = "//tr[@id='tt3_admin']//td[2]")
    public WebElement adminName;

    @FindBy(xpath = "//tr[@id='tt3_manager']//a[3]")
    public WebElement managerDelete;

    @FindBy(xpath = "//tr[@id='tt3_manager']//td[2]")
    public WebElement managerName;

    @FindBy(xpath = "//tr[@id='tt3_employee']//a[3]")
    public WebElement employeeDelete;

    @FindBy(xpath = "//tr[@id='tt3_employee']//td[2]")
    public WebElement employeeName;

    @FindBy(xpath = "//tr[@id='tt3_user']//a[3]")
    public WebElement userDelete;

    @FindBy(xpath = "//tr[@id='tt_3user']//td[2]")
    public WebElement userName;

    @FindBy(xpath = "//h2[@id='user-management-page-heading']//a")
    public WebElement createAnAccount;

    @FindBy(xpath = "//input[@id='login']")
    public WebElement loginInput;

    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement fNameInput;

    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement lNameInput;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailInput;

    @FindBy(xpath = "//select[@id='authorities']")
    public WebElement profileSelect;

    @FindBy(xpath = "//div[@id='app-view-container']//div//div//div//div//div//div//form//button")
    public WebElement saveButton;

}
