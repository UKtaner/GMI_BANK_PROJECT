package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UserInfoPage {
    public UserInfoPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement userAccountMenu;

    @FindBy(linkText = "User Info")
    public WebElement userInfoLink;

    @FindBy(id = "firstName")
    public  WebElement firstNameText;

    @FindBy(id = "lastName")
    public  WebElement lastNameText;

    @FindBy(id="email")
    public WebElement emailText;

    @FindBy(id="langKey")
    public WebElement languageText;
    @FindBy(xpath = "//button[@type='submit']")
    public  WebElement saveButton;

    @FindBy(className = "invalid-feedback")
    public WebElement invalidEmailFeedback;

    @FindBy(xpath ="//option[2]")
    public WebElement turkce;

    @FindBy(xpath ="//option[1]")
    public WebElement english;

    @FindBy(xpath = "(//a[@href='#'])[3]")
    public WebElement userIconAfterLogin;
    @FindBy(linkText = "Sign out")
    public WebElement signOut;

}
