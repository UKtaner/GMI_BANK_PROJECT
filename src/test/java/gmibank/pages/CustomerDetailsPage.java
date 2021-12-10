package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CustomerDetailsPage {
    public CustomerDetailsPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@class='btn btn-primary']")
    public WebElement EditButton;

    @FindBy(xpath = "//a[@class='btn btn-info']")
    public WebElement BackButton;
}
