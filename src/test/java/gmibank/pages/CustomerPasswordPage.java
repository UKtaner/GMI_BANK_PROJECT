package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerPasswordPage {

    public CustomerPasswordPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (id = "password-title")
    public WebElement usernameInTitle;

    @FindBy (id = "currentPassword")
    public WebElement currentPassword;

    @FindBy (id = "newPassword")
    public WebElement newPassword;

    @FindBy (id = "confirmPassword")
    public WebElement confirmPassword;

    @FindBy (xpath = "//form[@id='password-form']/button")
    public WebElement saveButton;

    // Same textbox give error when currentpassword entered
    @FindBy (xpath = "//input[@id='newPassword']/following-sibling::div")
    public WebElement passwordInvalidFeedback;

    @FindBy (xpath = "//input[@id='confirmPassword']/following-sibling::div")
    public WebElement confirmPasswordInvalidFeedback;











}