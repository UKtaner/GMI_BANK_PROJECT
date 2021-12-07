package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "login-item")
    public WebElement loginButton;

    @FindBy(id = "username")
    public WebElement username_field;

    @FindBy(id = "password")
    public WebElement password_field;

    @FindBy(xpath = "//button[@type='submit']")
    public WebElement signIn_Btn;

    @FindBy(xpath = "//*[.='Ali Can']")
    public WebElement loginId;

    @FindBy(xpath = "//*[.='Failed to sign in!']")
    public WebElement errorMessage;

    @FindBy(xpath = "//span[contains(text(),'Cancel')]")
    public WebElement cancelButton;

    @FindBy(linkText = "Did you forget your password?")
    public WebElement forgetPassword_btn;

    @FindBy(id = "email")
    public WebElement resetEmail;

    @FindBy(xpath = "//span[contains(text(),'Reset password')]")
    public WebElement resetPassword;


    @FindBy(xpath = "//span[contains(text(),'Register a new account')]")
    public WebElement register_btn;

    @FindBy(id = "register-title")
    public WebElement registrationVerifyText;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomers;



    @FindBy(xpath = "//body/div[@id='root']/div/div/div[@id='app-header']/nav/div/ul[@id='header-tabs']/li[@id='account-menu']/a[1]")
    public WebElement userMenu;

    @FindBy(xpath = "//li[@id='account-menu']//a[3]")
    public WebElement singOut;


    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement firstSignIn;

    @FindBy(xpath = "(//a[@href='#'])[2]")
    public WebElement icon;

    @FindBy(xpath = "//li[@id='admin-menu']//a[@class='dropdown-toggle nav-link']")
    public WebElement administration;

    @FindBy(xpath = "//div[@class='dropdown-menu dropdown-menu-right show']//a[1]")
    public WebElement userManagement;

    @FindBy(xpath = "//span[.='Manage Accounts']")//Gokcen
    public WebElement managaAccounts;


    //Osman
    @FindBy(linkText = "My Accounts")
    public WebElement myAccounts;


}


