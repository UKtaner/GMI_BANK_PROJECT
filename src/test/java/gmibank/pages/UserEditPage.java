package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class UserEditPage {
    public UserEditPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//input[@id='login']")
    public WebElement loginEntry;

    @FindBy(xpath = "//input[@id='firstName']")
    public  WebElement firstNameEntry;

    @FindBy(xpath = "//input[@id='lastName']")
    public  WebElement lastNameEntry;

    @FindBy(xpath = "//input[@id='email']")
    public  WebElement emailEntry;

    @FindBy(xpath = "//select[@id='langKey']")
    public WebElement languageSelect;

    @FindBy(xpath = "//html//body//div//div//div//div//div//div//div//div//div//div//form//button")
    public WebElement saveButton;


}
