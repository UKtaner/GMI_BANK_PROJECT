package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "username")
    public WebElement username_field;

    @FindBy(id = "password")
    public WebElement password_field;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[3]/a")
    public WebElement forgetPassword_btn;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[2]/div[4]/a")
    public WebElement register_btn;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[1]")
    public WebElement cancel_btn;

    @FindBy(xpath = "//*[@id=\"login-page\"]/div/form/div[3]/button[2]")
    public WebElement signIn_btn;

    @FindBy(xpath = "//span[.='My Operations']")
    public WebElement myOperations;

    @FindBy(xpath = "//span[.='Manage Customers']")
    public WebElement manageCustomers;

    @FindBy(xpath = "//span[.='Sign in']")
    public WebElement firstSignIn;

    @FindBy(xpath = "(//a[@href='#'])[2]")
    public WebElement icon;



}
