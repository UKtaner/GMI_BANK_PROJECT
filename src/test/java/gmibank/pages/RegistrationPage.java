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

    //? Register buttonunu sor

    @FindBy(id = "ssn")
    public WebElement ssnBox;

    @FindBy(id = "firstname")
    public WebElement firstNameBox;

    @FindBy(id = "lastname")
    public WebElement lastNameBox;

    @FindBy(xpath = "//input[@name='address']")
    public WebElement addressBox;

    @FindBy(id = "mobilephone")
    public WebElement phoneNumberBox;

    @FindBy(id = "username")
    public WebElement userNameBox;

    @FindBy(id = "email")
    public WebElement emailBox;



}
