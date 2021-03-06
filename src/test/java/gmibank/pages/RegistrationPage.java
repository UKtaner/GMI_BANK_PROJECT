package gmibank.pages;

import gmibank.utilities.ConfigReader;
import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegistrationPage {


    public RegistrationPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(xpath = "(//a[@class='dropdown-toggle nav-link'])[2]")
    public WebElement menuDropDown;

    @FindBy(xpath = "(//a[@class='dropdown-item'])[2]")
    public WebElement registerButton;

    @FindBy(id = "ssn")
    public WebElement ssnTextBox;

    @FindBy(id = "firstname")
    public WebElement firstNameTextBox;

    @FindBy(id = "lastname")
    public WebElement lastNameTextBox;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressTextBox;

    @FindBy(xpath = "//input[@name='mobilephone']")
    public WebElement phoneNumberTextBox;

    @FindBy(id = "username")
    public WebElement userNameTextBox;

    @FindBy(id = "email")
    public WebElement emailTextBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[1]")
    public WebElement ssnErrorMessage;


    @FindBy(id = "firstPassword")
    public WebElement newPasswordBox;

    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement phoneNumberErrorMessage;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[7]")
    public WebElement emailErrorMessage;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[3]")
    public WebElement addressErrorMessage;


    @FindBy(xpath = "(//div[@class='invalid-feedback'])[5]")
    public WebElement usernameErrorMessage;



    @FindBy(id = "register-submit")
    public WebElement getRegisterButton;

    @FindBy(xpath = "//li[@class='point'][2]")
    public WebElement orangePassword;

    @FindBy(xpath = "//li[@class='point'][3]")
    public WebElement yellowPassword;

    @FindBy(xpath = "//li[@class='point'][5]")
    public WebElement greenPassword;

}
